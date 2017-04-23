package JavaBasic.Module4;

/*
 Дано целое число. Если число чётное, то к нему прибавить 2, а если нечётное, то 1.  Не использовать условие "если" (if).
 */
/*public class Task1 {
    public static void main(String[] args) {
        int a = 4;
        if(a%2==0)
            System.out.println(a+2);
        else
            System.out.println(a+1);
    }
}*/

public class Task1 {
    public static void main(String[] args) {
        int a=5;
        int b = a%2;

                switch(b) {
                       case 0:
                                 System.out.println(a+2);
                                 break;
                    default:
                                         System.out.println(a+1);
                                         break;
                     }
    }
}
