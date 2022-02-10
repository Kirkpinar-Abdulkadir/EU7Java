package assignments.OOPConcepts.Question_8;

public class Value {
    int val;

    public static void main(String[] args) {
        Value vl = new Value();
        System.out.println(vl.val);
    }

    public Value() {
    }

    public Value(int val) {
        this.val = val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public boolean wasModified(){
        return true;
    }

    public int getVal(){
        return getVal();
    }
}
