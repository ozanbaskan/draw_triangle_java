import java.util.Scanner;

    public class Triangle {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int input;
            System.out.print("Enter a number for your diamond's length: ");
            input = s.nextInt();
            int number = input;
            for (int i = number - 1; i >= 0; i--)
            {
                for (int j = 0; j < number - i - 1; j++)
                {
                    System.out.print(" ");
                }
                for (int k = 0; k < i * 2 + 1; k++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }

        }



    }


