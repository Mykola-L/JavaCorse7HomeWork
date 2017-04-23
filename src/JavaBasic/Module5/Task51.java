package JavaBasic.Module5;

/**
 * Created by andrey on 17.04.2017.
 */
public class Task51 {
    public static void main(String[] args) {


        //int i =0;
        //int i =1;
        int i =100;

        if(i==0){//
            System.out.print("Факториал натурального числа: "+ i);}
        else if
                (i==1)
        {System.out.print("Факториал натурального числа: "+ i);}
        else{



            int multiply=1; //- переніс в цикл. Сюда будем накапливать результат. multiply - множити
            for (int j = 1; j < i; j=j+1) {//3!=1*2*3=6.  5!=1*2*3*4*5=120.
                multiply = multiply*(j+1);
            }
            System.out.println(multiply);}
    }
}
   /* Факторіали деяких чисел
   0! = 1
1! = 1
2! = 1·2 = 2
3! = 1·2·3 = 6
4! = 1·2·3·4 = 24
5! = 1·2·3·4·5 = 120
6! = 1·2·3·4·5·6 = 720
7! = 1·2·3·4·5·6·7 = 5040
8! = 1·2·3·4·5·6·7·8 = 40320
9! = 1·2·3·4·5·6·7·8·9 = 362880
10! =1·2·3·4·5·6·7·8·9·10 = 3628800
    */
