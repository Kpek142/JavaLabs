import java.util.Iterator;
import java.util.NoSuchElementException;

public class PrimesGenerator implements Iterable<Integer> {

    private final int numberOfPrimes;

    public PrimesGenerator(int numberOfPrimes) {
        this.numberOfPrimes = numberOfPrimes;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PrimeIterator();
    }

    private class PrimeIterator implements Iterator<Integer> {
        
        private int count = 0;
        private int currentNumber = 1;

        @Override
        public boolean hasNext() {
            return count < numberOfPrimes;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Больше простых чисел для генерации нет.");
            }

            while (true) {
                currentNumber++;
                if (isPrime(currentNumber)) {
                    count++;
                    return currentNumber;
                }
            }
        }

        private boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            
            return true;
        }
    }
}