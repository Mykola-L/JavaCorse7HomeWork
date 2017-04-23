package JavaBasic.Module5;

/**
 Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class Task4 {
    public static void main(String[] args) {

        //for (int i = 2; i<(55*2+1); i=i*2){
           // System.out.print(i+" ");
            int a = 2;
            for (int i = 1; i <= 20; i++) {
                System.out.print(a + " ");
                a=a*2;
            }
        }
    }
