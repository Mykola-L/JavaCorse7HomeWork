package JavaBasic.Module4;

/*
 Генерируется случайное число от 1 - 12. Выведите на экран (только)название месяца соответствующему номеру.
 switch (month){
 case 0: sout(“January”); break;
 case 1: sout(“Febrary”);break;
 ….
 }
 */
public class Task22 {

    public static void main(String[] args) {
        int a = 0; // Начальное значение диапазона - "от"
        int b = 12; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        System.out.println("1-ое случайное число: " + random_number1);


       // int month = 5;

        switch(random_number1){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febrary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("Aprile");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Avgust");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            //case 12:
            default:
                System.out.println("December");
                break;


        }

    }}
