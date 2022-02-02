package assignments.OOPConcepts.Question_7;

public class GasTank {
    double amount = 0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double arg){
        amount+=arg;
        if(amount>capacity){
            amount=capacity;
        }
    }

    public void useGas(double arg){
        amount-=arg;
        if(amount<0){
            amount=0;
        }
    }

    public boolean isEmpty(){
        if(amount<0.1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(amount>capacity-0.1){
            return true;
        }else{
            return false;
        }
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        double difference = capacity-amount;
        amount=capacity;
        return difference;

    }
}
