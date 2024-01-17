package Task_1.SRP_solution;

import java.sql.Date;

// Класс бухгалтера наследуется от служащего
public class Accountant extends Employee{
    
    // Конструктор
    public Accountant(String name, Date dob, int baseSalary) {
        super(name, dob, baseSalary);
    }

    // Метод для подсчета чистой зарплаты
    public int calculateNetSalary(Employee employee) {
        int baseSalary = employee.getBaseSalary();
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}

