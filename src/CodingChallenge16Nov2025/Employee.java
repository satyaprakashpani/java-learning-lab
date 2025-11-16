package CodingChallenge16Nov2025;

public class Employee {


    private int id ;
    private String name;
    private  double salary;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }




    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("John Doe");
        emp1.setId(1);
        emp1.setSalary(50000.0);

        System.out.println("Employee Id : "+emp1.getId()+", Employee Name : "+emp1.name+", Employee Salary :"+ emp1.getSalary());
    }

}
