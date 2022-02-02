package assignments.OOPConcepts.Question_3;

public class Db {
    private String data;
    private int yint;

    public static void main(String[] args) {
        Db db = new Db();
        db.inserData("aaa",123);
        System.out.println(db.getData());
        System.out.println(db.getYint());
        db.setData("zzz");
        db.setYint(200);
        System.out.println(db.getData());
        System.out.println(db.getYint());
    }

    public void inserData(String str,int num){
        this.setData(str);
        this.setYint(num);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
