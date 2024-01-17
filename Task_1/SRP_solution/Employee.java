package Task_1.SRP_solution;
import java.sql.Date;

// Класс служащего
public class Employee {
    // Поля
    private String name; // Имя 
    private Date dob; // Дата рождения
    private int baseSalary; // Базовый оклад

    // Конструктор
    /**
     * @param name
     * @param dob
     * @param baseSalary
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    // Метод возвращающий данные служашего
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    // Метод возвращающий базовый оклад
    public int getBaseSalary() {
        return baseSalary;
    }
}
