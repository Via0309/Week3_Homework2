package practice08;

public class Person {
    private String name;
    private int age;

    public Person(){
        name = "";
        age = 0;
    }

    public Person(int item, String name, int age){
        this.name = name;
        this.age = age;
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
}
