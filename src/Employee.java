public class Employee extends Person{
    private String company;
    Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
    @Override
    public String toString(){
       return "("+getName()+","+" "+getAge()+","+" "+company+")";
    }
    @Override
    public String work(){
        return "Manager";
    }

    public static void main(String[] args) {
        Person p = new Person("Test", 3);
        System.out.println(p);
        p.setAge(5);
        p.setName("Vasya");
        System.out.println(p);
        System.out.println(p.work());
        Employee e = new Employee("1", 2, "3");
        System.out.println(e);
        System.out.println(e.work());
    }
}