package practice09;

import java.util.HashSet;
import java.util.Set;

public class Klass {
    private int number;
    private Person leader;
    private Set<Person> members;

    public Klass(){}

    public Klass(int num){
        number = num;
        members = new HashSet<>();
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
        if (members.contains(leader))
            this.leader = leader;
        else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student){
        members.add(student);
    }
}