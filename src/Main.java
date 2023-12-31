import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        FinancialCalculations calculations = new FinancialCalculations(employees);
        employees[0] = new Employee("Иванов И.И", 10000, 1);
        employees[1] = new Employee("Смирнов С.С", 60000, 5);
        employees[2] = new Employee("Романова А.А", 90000, 5);
        employees[3] = new Employee("Суворов К.А", 90000, 5);
        employees[4] = new Employee("Кириллов С.Д", 30000, 2);
        employees[5] = new Employee("Суворов Д.Д", 77000, 4);
        employees[6] = new Employee("Иванова М.М", 75000, 4);
        employees[7] = new Employee("Разгонюк А.Д", 30000, 5);
        employees[8] = new Employee("Неверова М.Д", 7000, 1);
        employees[9] = new Employee("Полищук Д.Ж", 100_000, 3);
        calculations.infoEmployee();
        System.out.println("-----------------");
        calculations.sumSalary();
        System.out.println("-----------------");
        calculations.findMinSalary();
        System.out.println("-----------------");
        calculations.findMaxSalary();
        System.out.println("-----------------");
        calculations.findAverageSalary();
        System.out.println("-----------------");
        calculations.fio();
        System.out.println("-----------------");
        //Повышенная сложность.
        calculations.indexTheSalary(100);
        System.out.println("-----------------");
        calculations.findMinSalaryInDepartment(1);
        System.out.println("-----------------");
        calculations.findMaxSalaryInDepartment(1);
        System.out.println("-----------------");
        calculations.indexTheSalaryDepartment(10, 1);
        System.out.println("-----------------");
        calculations.getEmployeesDep(1);
        System.out.println("-----------------");
        calculations.lessThanANumber(15000);
        System.out.println("-----------------");
        calculations.moreThanANumber(30000);













    }


}
