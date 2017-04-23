package JavaBasic.Module5;

//Задачу не розв’язав. Знайшов рішення в інтернеті, розумію його.
//Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.

public class Task9 {



        public static void main(String[] args) {
            int n = 11;
            int a = 1, b = 1;
            System.out.print(a + " " + b);
            int fib = 2, i = 2;
            while (i < n) {
                fib = a + b;
                a = b;
                b = fib;
                System.out.print(" " + fib);
                i++;
            }
        }
    }
