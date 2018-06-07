package practice07;

public class Klass {
    private int number;

    public Klass(){}

    public Klass(int num){
        number = num;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class " + number;
    }
}
