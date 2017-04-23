package JavaBasic.Module2;

/*
Дано два числа, вернуть истину если одно из них равняется “10” или их сумма равняется “10”.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true


public static boolean makes10(int a, int b) {

}
 */
public class Task9r {

    public static void main(String[] args) {
        makes10(9, 10);
        makes10(9, 9);
        makes10(1, 9);
    }
    public static boolean makes10(int a, int b) {
        if(((a==10) || (b==10))||(a+b==10))
            return true;

        else
            return false;
    }

}