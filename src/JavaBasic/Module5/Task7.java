package JavaBasic.Module5;

//Проверьте, входит ли введенное пользователем с клавиатуры натуральное число в диапазон [-10; 10].

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task7 {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
if ((n>=(-10))&&(n<=10))

{System.out.println("Натуральне число введене користувачем з клавіатури: "+ n+" входить в діапазон [-10; 10].");}
        else
{System.out.println("Натуральне число введене користувачем з клавіатури: "+ n+" не входить в діапазон [-10; 10].");}


    }}