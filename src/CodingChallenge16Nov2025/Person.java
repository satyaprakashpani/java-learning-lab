package CodingChallenge16Nov2025;

public class Person {

    Person (String Name, int age){
        this.name=Name;
        this.age=age;
    }
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    public static void main(String[] args) {
        Person p1 = new Person("John",25);
        Person p2 = new Person("Alice",30);
        System.out.println("Name : "+p1.getName()+", Age : "+p1.getAge());
        System.out.println("Name : "+p2.getName()+", Age : "+p2.getAge());
    }


}
