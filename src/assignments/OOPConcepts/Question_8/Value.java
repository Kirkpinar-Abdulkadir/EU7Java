package assignments.OOPConcepts.Question_8;

public class Value {
    int param;

    public static void main(String[] args) {
        Value val = new Value();
        System.out.println(val.param);
    }

    public Value() {
    }

    public Value(int param) {
        this.param = param;
    }

    public void setVal(int param) {
        this.param = param;
    }

    public boolean wasModified(){
        return true;
    }

    public int getVal(){
        return getVal();
    }
}
