package JavaBasic.Module2;

/*
В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
public class Task2 {
    public static void main(String[] args) {
        int n = 23;
        System.out.println("Сума цифр числа n "+(n/10+n%10));
    }

}
