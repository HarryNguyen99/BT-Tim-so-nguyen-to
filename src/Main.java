public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrime = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrime = new OptimizedPrimeFactorization();

        Thread thread1 = new Thread(lazyPrime);
        Thread thread2 = new Thread(optimizedPrime);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        thread2.start();
    }
}
