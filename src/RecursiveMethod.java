public class RecursiveMethod {
    public static void main(String[] args) {
//        System.out.println(factorialLoop(5));
//        System.out.println(factorialRecursive(5));

        int bil = 9;
        for (int i = 1; i <=bil ; i++) {
            System.out.println(fibonacchi(i));
        }

//        fibonacchi(9);
    }

    //    Method Perulangan Biasa
    static int factorialLoop(int value) {
        var result = 1;

        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    //    Method Rekursiv
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    //    rekursif fibonacchi
    static int fibonacchi(int value) {
        int fibo;
        if (value == 0) {
            return 0;
        } else if (value == 1) {
            return 1;
        } else {
            fibo = fibonacchi(value - 1) + fibonacchi(value - 2);
            return fibo;
        }

    }
}
