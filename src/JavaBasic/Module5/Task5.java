package JavaBasic.Module5;

//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5 {


        public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());


            System.out.println("Число введене користувачем з клавіатури: "+ n);

            if(n==0){//
            System.out.print("Факториал натурального числа: "+ n);}
            else if
                    (n==1)
        {System.out.print("Факториал натурального числа: "+ n);}
            else if (n<0)
            {System.out.print("Введене число < 0");}
            else{
        int multiply=1; //- переніс в цикл. Сюда будем накапливать результат. multiply - множити
        for (int j = 1; j <= n; j=j+1) {//3!=1*2*3=6.  5!=1*2*3*4*5=120.
            multiply = multiply*(j+1);
        }
        System.out.println(multiply);}
    }}

