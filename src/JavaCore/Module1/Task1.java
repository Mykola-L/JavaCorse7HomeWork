package JavaCore.Module1;

/*
 ДЗ 01.1
 Создать консольное приложение, которое запрашивает имя пользователя. После ввода имени выводит строку: Hello, <введённое имя>
 Пример:
 Enter Your name:
 Eugene
 Hello, Eugene
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {


    public static void main(String[] args) throws Exception {
        System.out.println("Enter Your name:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();


        System.out.println("Hello, "+ name);
    }}