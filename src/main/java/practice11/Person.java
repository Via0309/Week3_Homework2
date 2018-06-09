package practice11;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(){
        name = "";
        age = 0;
    }

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is " + name + ". I am " + age + " years old.";
    }

    public boolean equals(Person person){
        return (age == person.getAge()) && (name.equals(person.getName()));
    }

    public void hasKnown(Person leader, int number) {
        String str = "I am " + name + ". I know " + leader.name + " become Leader of Class " + number + ".";
        System.out.print("I am " + name + ". I know " + leader.name + " become Leader of Class " + number + ".");
    }
}