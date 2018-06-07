package practice07;

public class Teacher extends Person{
    private Klass kclass;

    public Teacher(String name, int age){
        super(name, age);
    }
    public Teacher(String name, int age, Klass kclass){
        super(name,age);
        this.kclass = kclass;
    }

    public Klass getKlass() {
        return kclass;
    }

    @Override
    public String introduce() {
        String intro = super.introduce();
        if (null == kclass)
            return intro + " I am a Teacher. I teach No Class.";
        else
            return intro + " I am a Teacher. I teach Class " + kclass.getNumber() + ".";
    }

    public String introduceWith(Student student){
        if (student.getKlass().getNumber() == this.kclass.getNumber())
            return "My name is " + this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I teach " + student.getName() + ".";
        else
            return "My name is " + this.getName() +". I am " + this.getAge() + " years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }
}
