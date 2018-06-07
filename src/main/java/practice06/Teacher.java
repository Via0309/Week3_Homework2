package practice06;

public class Teacher extends Person{
    private int kclass;

    public Teacher(){}

    public Teacher(String name, int age){
        super(name, age);
        this.kclass = 0;
    }
    public Teacher(String name, int age, int kclass){
        super(name,age);
        this.kclass = kclass;
    }

    public int getKlass() {
        return kclass;
    }

    @Override
    public String introduce() {
        String intro = super.introduce();
        if (0 == kclass)
            return intro + " I am a Teacher. I teach No Class.";
        else
            return intro + " I am a Teacher. I teach Class " + kclass + ".";
    }
}
