package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        calculateETOrdered(12, 13);
        long endTime = System.nanoTime() - startTime;

        System.out.println("Duración: " + (endTime) + " ns");

    }

    public static <E> long calculateETOrdered(int repetitions, int n) {

        long startTime = System.nanoTime();

        int num = 6;
        int cont = 0;
        int mod;
        for (int i = 1; i < num/2; i++) {

            mod = num % i;

            if (mod == 0) {
                cont = i + cont;
            }
        }

        if (cont == num) {
            System.out.println("Es un numero perfecto" + " " + cont);
        } else {
            System.out.println("No es un numero perfecto" + " " + cont);
        }

        long endTime = System.nanoTime();

        return (endTime - startTime);

    }

}
