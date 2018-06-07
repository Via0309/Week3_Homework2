package practice10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Klass {
    private int number;
    private Person leader;
    private Set<Integer> members;

    public Klass(){}

    public Klass(int num){
        number = num;
        members = new TreeSet<>();
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
        if (members.contains(leader.getId()))
            this.leader = leader;
        else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student){
        members.add(student.getId());
    }

    public boolean isIn(Student student){
        if (student.getKlass().getNumber() == number)
            return true;
        return false;
    }
}
