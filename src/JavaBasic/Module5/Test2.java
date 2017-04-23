package JavaBasic.Module5;



import java.io.BufferedReader;
        import java.io.InputStreamReader;

    public class Test2

    {
        public static void main(String[] args)   throws Exception
        {

            //Напишите тут ваш код
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            System.out.println("Я буду зарабатывать $" + n + " в час");
        }
    }

