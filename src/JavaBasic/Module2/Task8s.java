package JavaBasic.Module2;

/*
У нас есть громкий говорящий попугай. У нас есть параметр “hour” в диапазоне между 0..23, которое обозначает текущий час. Мы в замешательстве когда попугай разговаривает, когда время до 7, и после 20.
parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
public static boolean parrotTrouble(boolean talking, int hour) {
}
 */
public class Task8s {
    public static void main(String[] args) {
        parrotTrouble(true, 6);
        parrotTrouble(true, 7);
        parrotTrouble(false, 6);}

    public static void parrotTrouble(boolean talking, int hour) {

        if(talking == true && (hour<7||hour>20))
        System.out.println("Папуга розмовляє до 7 або після 20. Ми хвилюємося.");

        else
        System.out.println("Папуга не розмовляє до 7 після 20. Ми не хвилюємося.");
    }
    }

