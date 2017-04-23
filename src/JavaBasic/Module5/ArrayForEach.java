package JavaBasic.Module5;

/**
Наприклад вивести елементи масиву можна таким чином.
 */
public class ArrayForEach {
    public static void main(String[] args) {
        int a[] = {1, 5, 6, 1, 3};//створюємо масив і заповнюємо його числами

        for (int element : a){//for (type var : arr) { //тіло циклу }

            System.out.println(element);
        }
    }
}

