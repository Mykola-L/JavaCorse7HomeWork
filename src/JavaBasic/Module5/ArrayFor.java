package JavaBasic.Module5;

import com.sun.org.apache.xpath.internal.SourceTree;

/*
В наступному прикладі створюється масив і послідовно виводяться його елементи.
 */
public class ArrayFor {
    public static void main(String[] args) {
        int a[] = {1, 5, 6, 1, 3};//створюємо масив і заповнюємо його числами
        int size = a.length;
        System.out.println("Елементи масиву:");
        for (int j = 0; j < size; j++){
            System.out.println("a[" + j + "]=" + a[j]);
        }
    }
}
