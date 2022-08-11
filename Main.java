import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for(int sayi=2;sayi<=100;sayi++)
        {
            boolean remind=true;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    remind = false;
                    break;
                }
            }

            if(remind==true)
            {
                System.out.print(sayi+"\n");
            }
        }

    }
}