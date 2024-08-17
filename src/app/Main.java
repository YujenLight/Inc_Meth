package app;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Іван Іванов", "Інженер", "ivanov@example.com", "+380501234567", 35);

        // Виводимо дані про співробітника
        System.out.println("ПІБ: " + employee.getFullName());
        System.out.println("Посада: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Телефон: " + employee.getPhone());
        System.out.println("Вік: " + employee.getAge());

        Car car = new Car();
        car.start();
    }
}


