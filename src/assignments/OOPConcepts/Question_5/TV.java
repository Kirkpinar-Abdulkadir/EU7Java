package assignments.OOPConcepts.Question_5;

public class TV {
    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public void channelUp(){
        if(channel==120){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else {
            channel++;
        }
    }

    public void channelDown(){
        if(channel==1){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else {
            channel--;
        }
    }

    public void volumeUp(){
        if(isOn() && channel<=6){
            volumeLevel++;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void volumeDown(){
        if(isOn() && channel>=2){
            volumeLevel--;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public boolean isOn(){
        if(on){
            return true;
        }else {
            return false;
        }
    }

    public void turnOn(){
        if(isOn()){
            System.out.println("TV is already ON");
        } else {
            on = true;
        }
    }

    public void turnOff(){
        if(!isOn()){
            System.out.println("TV is already OFF");
        } else {
            on = false;
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
