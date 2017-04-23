package JavaBasic.Module2;

/*
В переменной n хранится натуральное трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
public class Task4 {
    public static void main(String[] args) {
        //int n = 123;
        //int n = 624;
        int n = 913;
        System.out.println("Сума цифр числа n "+(n/100+(n%100)/10+n%10));
    }

}