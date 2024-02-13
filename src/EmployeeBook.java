

public class EmployeeBook {

    private Employee[] employees;

    private int size;

    public int getSize() {
        return size;
    }


    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
        size = employees.length;

    }


    public void addEmployee(String name, int salary, int dep) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, штат полон");
        } else {
            Employee newContact = new Employee(name, salary, dep);
            employees[size++] = newContact;
            upDateIds();
        }
    }


    public void removeEmployee(String contactNick) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(contactNick)) {
                System.out.println(employees[i].getName() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                upDateIds();
                break;
            }
        }
    }

    public void upDateIds() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                employees[i].setId(i + 1);


        }
    }


    public void findEmployee(String name) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getName().equals(name)) {

                    System.out.println(employees[i]);

                    return;
                }
            }
        }
        System.out.println(name + " не найден");

    }

    public void changeTheSalary(String Name, int newSalary, int newDep) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getName().equals(Name)) {
                    employees[i].setSalary(newSalary);
                    employees[i].setDepartment(newDep);

                    return;
                }
            }
        }
        System.out.println(Name + " не найден");
    }

    public void getEmployeeDep(int dep) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == dep) {
                    System.out.println("Id-" + employees[i].getId() + " " + employees[i].getName() + " " + employees[i].getDepartment() + " отдел");
                }
            }
        }
    }


}
