package JavaBasic.Module2;

/*
Переменная “weekend” истинна если сейчас выходной и переменная “vacation” истина если мы в отпуске. Мы высыпаемся если сейчас не выходной, либо мы в отпуске. Вернуть истинно, если мы высыпаемся:
 sleepIn(false, false) -> true
 sleepIn(true, false) -> false
 sleepIn(false, true) -> true


 public static boolean sleepIn(boolean weekday, boolean vacation) {

 }
 */
public class Task5r {
    public static void main(String[] args) {
        sleepIn(false, false);
        sleepIn(true, false);
        sleepIn(false, true);
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false || vacation == true)
            return true;

        else
            return false;
    }


}

