package practice11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Klass {
    private int number;
    private Person leader;
    private Set<Integer> members;
    private Person teacher;

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

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void assignLeader(Person leader) {
        if (members.contains(leader.getId())) {
            this.leader = leader;
            if (teacher != null)
                teacher.hasKnown(leader, number);
        }else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student){
        members.add(student.getId());
        if (teacher != null) {
            String str = "I am " + teacher.getName() + ". I know " + student.getName() + " has joined Class " + number + ".\n";

            System.out.print("I am " + teacher.getName() + ". I know " + student.getName() + " has joined Class " + number + ".");
        }
    }

    public boolean isIn(Student student){
        if (student.getKlass().getNumber() == number)
            return true;
        return false;
    }
}
