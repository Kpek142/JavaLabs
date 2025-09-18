public class Sum {
    public static void main(String[] args) {
        double sum = 0.0;
        int n = 2;
        double term;

        while (true) {
            term = 1.0 / (n * n + n - 2);

            if (term < 1e-6) {
                break;
            }

            sum += term;
            n++;
        }

        System.out.println("Сумма ряда: " + sum);
    }
}