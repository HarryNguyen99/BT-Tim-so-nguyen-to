public class LazyPrimeFactorization extends Thread {

    private boolean primeNumberCheck(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        boolean primeNumber;
        for (int i = 2; i < 50; i++) {
            primeNumber = primeNumberCheck(i);
            if (primeNumber) {
                System.out.println(i + "\t");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Lazy Prime execution time: " + (endTime - startTime)
                + " milliseconds"+"\n-------------");
    }

}
