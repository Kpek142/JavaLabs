import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimesGeneratorTest {

    public static void main(String[] args) {
        final int N = 20;

        PrimesGenerator primesGenerator = new PrimesGenerator(N);

        List<Integer> primesList = new ArrayList<>();
        for (Integer prime : primesGenerator) {
            primesList.add(prime);
        }

        System.out.println("Первые " + N + " простых чисел в прямом порядке:");
        System.out.println(primesList);
        System.out.println("Первые " + N + " простых чисел в обратном порядке:");

        Collections.reverse(primesList);
        System.out.println(primesList);
    }
}