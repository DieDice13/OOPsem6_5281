package Task_5.DIP_solution;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Запуск автомобиля...");
        this.engine.start();
        System.out.println("Автомобиль успешно запущен!");
    }
}
