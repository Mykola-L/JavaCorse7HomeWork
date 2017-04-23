package JavaBasic.Module2;

/*
Дано два целочисленных значения, вернуть их сумму. Но если они одинаковы, тогда вернуть удвоенную сумму данных чисел.
sum(1, 2) → 3
sum(3, 2) → 5
sum(2, 2) → 8


public static int sum(int a, int b) {
}

 */


public class Task6r {
    public static void main(String[] args) {
        sum(1,2);
        sum(3,2);
        sum(2,2);}
    public static int sum(int a, int b) {
        //public static void sum(int a, int b) {

        //return a+b;
        //int c = a+b;

        if (a == b)

        return((a+b)*2);

        else

        return(a+b);

    }}
