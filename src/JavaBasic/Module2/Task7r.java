package JavaBasic.Module2;

/*
 Дано “int n”, вернуть абсолютную разницу между “n” и “21”, но вернуть удвоенную абсолютную разницу если n больше 21.
 diff21(19) → 2 ; diff21(-2) → 23
 diff21(10) → 11; diff21(50) → 58
 diff21(21) → 0
 public static int diff21(int n) {
 }
 */
public class Task7r {
    public static void main(String[] args) {

        diff21(19); diff21(-2);
        diff21(10); diff21(50);
        diff21(21);}


    public static int diff21(int n) {

        if(n>21)
            return((n-21)*2);
        else
            return(21-n);

    }

}
