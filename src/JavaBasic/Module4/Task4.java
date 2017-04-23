package JavaBasic.Module4;

/*
Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
Примеры работы программы:
В числе 208 наибольшая цифра 8
В числе 774 наибольшая цифра 7
В числе 613 наибольшая цифра 6
 */
public class Task4 {
    public static void main(String[] args) {
        int a = 100; // Начальное значение диапазона - "от"
        int b = 899; // Конечное значение диапазона - "до". Коли ставлю 999 інколи виводить число 1075 до 1100.

        int random_number = a + (int) (Math.random() * b); // Генерация 1-го числа

        int a1 = random_number/100;//613=6
        int b1 = (random_number%100)/10;//613=1
        int c = random_number%100%10;//613=3
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c);
       // System.out.println(random_number);

        if(a1<=b1 && c<=b1)

            System.out.println("В числі "+ random_number + " найбільша цифра "+b1);
        else if
                (b1<=a1 && c<=a1)
            System.out.println("В числі "+ random_number + " найбільша цифра "+a1);
        else
            System.out.println("В числі "+ random_number + " найбільша цифра "+c);
    }}
