public class FinancialCalculations {
    private static Employee[] employees;


    public FinancialCalculations(Employee[] employees) {
        this.employees = employees;
    }


    public void findMinSalary() {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < result.getSalary()) {
                result = employee;
            }
        }
        System.out.println("Мин. зарплата " + result.getSalary());



    }

    public void findMaxSalary() {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > result.getSalary()) {
                result = employee;
            }
        }
        System.out.println("Макс. зарплата " + result.getSalary());



    }


    public void sumSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + sum);



    }

    public void  findAverageSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Средняя зарплата " + sum / employees.length);



    }

    public String infoEmployee() {
        int i;
        for (i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        return employees.toString();
    }

    public void fio() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }



    }

   public void indexTheSalary(int percent) {
        int currentSalary = 0;
        for (Employee employee : employees) {
            {
                employee.setSalary((int) (employee.getSalary() * (percent / 100f + 1)));
                currentSalary = employee.getSalary();

            }
            System.out.println("Повышенная зарплата " + currentSalary);
        }



    }


    public void findMinSalaryInDepartment(int d) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != d) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                result = employee;
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Мин. зарплата по отделу " + minSalary);



    }


    public void findMaxSalaryInDepartment(int m) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != m) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                result = employee;
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Макс. зарплата  по отделу " + maxSalary);



    }


    public void findAverageSalaryToDepartment(int dep) {
        float sum = 0;
        int memberCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == dep) {
                sum += employee.getSalary();
                memberCount++;
            }
        }
        System.out.println("Средняя зарплата по отделу " + sum / memberCount);


    }

    Employee[] indexTheSalaryDepartment(int percent, int department) {
        int currentSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {

                employee.setSalary((int) (employee.getSalary() * (percent / 100f + 1)));
                currentSalary = employee.getSalary();
                System.out.println("Индексированная  зарплата по отделу " + employee.getName() + " " + currentSalary);
            }


        }
        return employees;


    }

    public void getEmployeesDep(int dep) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == dep) {
                System.out.println("Id-" + employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public void lessThanANumber(int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println(employee.getSalary());
            }

        }


    }

    public void moreThanANumber(int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                System.out.println(employee.getSalary());
            }

        }


    }


}







