package assignments.OOPConcepts.Question_12;

public class CameraPhone extends Phone{

    int imageSize;
    int memorySize;

    public static void main(String[] args) {
        CameraPhone cp = new CameraPhone(220,100);
        System.out.println(cp.numPictures());

    }

    public CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures(){
        return (memorySize*1000)/imageSize;
    }
}
