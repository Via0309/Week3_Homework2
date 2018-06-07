package practice02;

public class Student extends Person{
    private int kclass;

    public Student(){}

    public Student(String name, int age, int kclass){
        super(name,age);
        this.kclass = kclass;
    }

    public int getKlass() {
        return kclass;
    }

    @Override
    public String introduce() {
        return "I am a Student. I am at Class " + kclass + ".";
    }
}
