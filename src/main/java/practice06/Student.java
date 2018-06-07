package practice06;

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
        String intro = super.introduce();
        return intro + " I am a Student. I am at Class " + kclass + ".";
    }
}
