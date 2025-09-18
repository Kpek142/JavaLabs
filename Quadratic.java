public class Quadratic {
    public static void main(String[] args) {
        double a = 1;
        double b = 3;
        double c = 2;

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Первый корень: " + x1 + "\nВторой корень: " + x2);
        }
        
        else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Один корень: " + x);
        }

        else {
            System.out.println("Нет вещественных корней");
        }
    }
}