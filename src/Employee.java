public class Employee {
    private Employee[] employees;
    private String name;

    private int salary;
    private int department;
    private static int counter;


    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.id = ++counter;
        this.salary = salary;
        this.department = department;
    }


    public String toString() {
        return "ID-" + id + " Ф.И.О-" + name + " зарплата-" + salary + " отдел-" + department;
    }
}
