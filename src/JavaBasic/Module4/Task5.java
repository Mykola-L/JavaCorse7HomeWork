package JavaBasic.Module4;

/*
В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа. Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.
Числа в переменных a, b и c: 3, 9, -1
Возрастающая последовательность: -1, 3, 9
Числа в переменных a, b и c: 2, 4, 3
Возрастающая последовательность: 2, 3, 4
Числа в переменных a, b и c: 7, 0, -5
Возрастающая последовательность: -5, 0, 7
 */
public class Task5 {
    public static void main(String[] args) {


    int a = 3;
    int b = 9;
    int c = -1;

   // int a1, b1, c1;
   /* if((a<=b)&&(a<=c))
        a = a1;
    else if
            ((b<=a)&&(b<=c))
        b = a1;
    else if
            ((c<=a)&&(c<=b))
    c = a1;*/
   if (a<b&&b<c&&a<c)
            System.out.println(a +", "+b +", "+c);
    else if (b<a&&a<c&&b<c)
            System.out.println(b +", "+a +", "+c);
    else if (a<c&&c<b&&a<b)
            System.out.println(a +", "+c +", "+b);
    else if (b<c&&c<a&&b<a)
            System.out.println(b +", "+c +", "+a);
    else if (c<b&&b<a&&c<a)
            System.out.println(c +", "+b +", "+a);
    else
            System.out.println(c +", "+a +", "+b);






}}
