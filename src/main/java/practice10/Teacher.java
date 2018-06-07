package practice10;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Teacher extends Person{
    private Set<Klass> classes;

    public Teacher(int id, String name, int age){
        super(id, name, age);
        this.classes = new TreeSet<>();
    }
    public Teacher(int id, String name, int age, Set<Klass> kclass){
        super(id, name,age);
        this.classes = kclass;
    }


    @Override
    public String introduce() {
        String intro = super.introduce();
        if (0 == classes.size())
            return intro + " I am a Teacher. I teach No Class.";
        else{
            String classestr = "";
            for (Klass item : classes)
                classestr = classestr + item.getNumber() + ", ";
            return intro + " I am a Teacher. I teach Class " + classestr.substring(0,classestr.length()-2) + ".";
        }
    }

    public String introduceWith(Student student){
        if (isTeaching(student))
            return "My name is " + this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        else
            return "My name is " + this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching (Student student){
        for (Klass klass : classes){
            if (klass.isIn(student))
                return true;
        }
        return false;
    }

    public Set<Klass> getClasses() {
        return classes;
    }
}
