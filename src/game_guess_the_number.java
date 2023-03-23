import java.util.Scanner;

public class game_guess_the_number {
    public static void main(String[] args) {

        int number  = (int) (Math.random()*100 + 1);

        int a;
        int count = 0;
        Scanner in = new Scanner(System.in);


        do{
            a = in.nextInt();
            count = count + 1;
            if (a > number)
            {
                System.out.println("big");
            }
            else if (a == number) {
                System.out.println("the number you input is right");
            }
            else {
                System.out.println("small");
            }
        }while (a != number);

        System.out.println("the times you tried is " + count);
    }
}
