package practice09;

public class Student extends Person{
    private Klass kclass;

    public Student(int item, String name, int age, Klass kclass){
        super(item, name,age);
        this.kclass = kclass;
    }

    public Klass getKlass() {
        return kclass;
    }

    @Override
    public String introduce() {
        String intro = super.introduce();
        if ((this.getKlass().getLeader() == null) || (!this.equals(this.kclass.getLeader())))
            return intro + " I am a Student. I am at Class " + kclass.getNumber() + ".";
        else
            return intro + " I am a Student. I am Leader of Class " + kclass.getNumber() + ".";
    }
}
