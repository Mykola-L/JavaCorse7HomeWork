package JavaBasic.Module5;

/*
Создайте программу, выводящую на экран все четырехзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 */
public class Task1 {
    public static void main(String[] args) {

        for (int i = 1_000; i<10_000; i=i+3){
            //System.out.println(i);
            System.out.print(i+" ");
        }
    }
}