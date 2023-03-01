public class Person {
    private int age;
    private String name;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "(" + name + "," + " " + age+")";
    }
    public String work(){
        return "None";
    }
}