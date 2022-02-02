package day44_oopreview.callcenter;

public class CallCenter {
    public static void main(String[] args) {

        WhatsApp wa = new WhatsApp();
        wa.launch();
        wa.allOSCompatible=true;
        wa.isFree=true;
        wa.name="whats app";
        wa.call("Abdul");
        wa.sendMessage("Thank you..");
        wa.videoCall();
        wa.accept();
        System.out.println(wa.APP_TYPE);

        VoiceCallable.decline();
        System.out.println(VoiceCallable.CAN_CALL);

        System.out.println("-------------------------------------");

        VoiceCallable obj = new WhatsApp();
        //obj.launch(); because --> reference type decides method and there is no launch method in VoiceCallable.
        ((MessagingApp) obj).launch(); //casting
        ((WhatsApp) obj).launch();

        ((MessagingApp) obj).allOSCompatible = false;

        obj.call("Mr Tom"); //do not need to cast

        ((WhatsApp) obj).videoCall();

        ((VideoCallable) obj).videoCall(); //WhatsApp implements VideoCallable


    }
}
