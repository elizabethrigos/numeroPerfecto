package javaapplication2;


public class JavaApplication2 {

    
    public static void main(String[] args) {
        
        long startTime = System.nanoTime();
        calculateETOrdered(12, 13);
        long endTime = System.nanoTime() - startTime;

        System.out.println("Duración: " + (endTime * (1e-6)) + " ms");
        
        
        
        
       
    }

    public static <E> long calculateETOrdered(int repetitions, int n) {
        
        long startTime = System.nanoTime();
         
        int m = 1000;
        
        int matriz [][] = new int [m][m];
        
        for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
        
        long endTime = System.nanoTime();

        return (endTime - startTime);
        
    }
    
}
