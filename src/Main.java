import java.util.Arrays;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов И.И", 10000, 1),
                new Employee("Смирнов С.С", 60000, 5),
                new Employee("Романова А.А", 90000, 5),
                new Employee("Суворов К.А", 90000, 5),
                new Employee("Кириллов С.Д", 30000, 2),
                new Employee("Суворов Д.Д", 77000, 4),
                new Employee("Иванова М.М", 75000, 4),
                new Employee("Разгонюк А.Д", 30000, 5),
                new Employee("Неверова М.Д", 7000, 1),
                new Employee("Полищук Д.Ж", 100_000, 3)};
        FinancialCalculations calculations = new FinancialCalculations(employees);
        EmployeeBook modificationOfData = new EmployeeBook(employees);
        // Полная информация о сотрудинках
        calculations.infoEmployee();
        System.out.println("-----------------");
        //Сумма затрат на зарплаты
        calculations.sumSalary();
        System.out.println("-----------------");
        //Минимальная зарплата
        calculations.findMinSalary();
        System.out.println("-----------------");
        //Максимальная зарплата
        calculations.findMaxSalary();
        System.out.println("-----------------");
        //Средняя зарплата
        calculations.findAverageSalary();
        System.out.println("-----------------");
        //Ф.И.О сотрудников
        calculations.fio();
        System.out.println("-----------------");
        //Повышенная сложность.
        //Повышение зарплаты на процент
        calculations.indexTheSalary(0);
        System.out.println("-----------------");
        //Мин. зарплата в отделе
        calculations.findMinSalaryInDepartment(5);
        System.out.println("-----------------");
        //Макс. зарплата в отделе
        calculations.findMaxSalaryInDepartment(1);
        System.out.println("-----------------");
        //Затраты на отдел
        calculations.findSalaryToDepartmen(5);
        System.out.println("-----------------");
        //Средняя зарплата по отделу
        calculations.findAverageSalaryToDepartment(1);
        System.out.println("-----------------");
        //Индексация зарплаты отдела
        calculations.indexTheSalaryDepartment(10, 5);
        System.out.println("-----------------");
        //Персонал отдела
        calculations.getEmployeesDep(1);
        System.out.println("-----------------");
        //Зарплата меньше числа
        calculations.lessThanANumber(15000);
        System.out.println("-----------------");
        //Зарплата больше числа
        calculations.moreThanANumber(30000);
        System.out.println("-----------------");
        //Удаление сотрудников
        modificationOfData.removeEmployee("Неверова М.Д");
        modificationOfData.removeEmployee("Иванов И.И");
        System.out.println("-----------------");
        calculations.fio();
        System.out.println("-----------------");
        //Новый сотрудник
        modificationOfData.addEmployee("Новый сотрудник", 25500, 5);
        System.out.println("-----------------");
        System.out.println(modificationOfData.getSize());
        //calculations.fio();
        modificationOfData.findEmployee("Разгонюк А.Д");
        System.out.println("-----------------");
        calculations.fio();
        System.out.println("-----------------");
        modificationOfData.changeTheSalary("Полищук Д.Ж", 50000, 3);
        System.out.println("-----------------");
        calculations.fio();
        System.out.println("-----------------");
        calculations.infoEmployee();
        //Вывод всех сотрудников нужного отдела
        modificationOfData.getEmployeeDep(5);


    }


}
