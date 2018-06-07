package practice08;

public class Klass {
    private int number;
    private Person leader;

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

    public Person getLeader() {
        return leader;
    }

    public void assignLeader(Person leader) {
        this.leader = leader;
    }
}
