package Task_3.ICP_solution;

interface Shape {
    double area();
}


interface SolidShape {
    double volume();
}


class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}


class Cube implements Shape, SolidShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * Math.pow(edge, 2);
    }

    @Override
    public double volume() {
        return Math.pow(edge, 3);
    }
}


public class App {
    public static void main(String[] args) {
        // Создаем экземпляр класса Circle
        Circle circle = new Circle(10);
        
        // Создаем экземпляр класса Cube
        Cube cube = new Cube(10);
        
        // Вызываем метод area() для circle
        double circleArea = circle.area();
        System.out.println("Площадь круга: " + circleArea);
        
        // Вызываем метод area() и volume() для cube
        double cubeArea = cube.area();
        double cubeVolume = cube.volume();
        System.out.println("Площадь куба: " + cubeArea);
        System.out.println("Объем куба: " + cubeVolume);
    }
}

