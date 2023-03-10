import java.util.Scanner;

public class test_2_1 {
    public static void main(String[] args) {

        /* time form

        BJT:  a_B, b_B, c_B, d_B
        UTC: a_U, b_U, c_U, d_U
        b_U = b_B - 8

         */

        int BJT;
        int UTC;

        int a_B;
        int b_B;
        int c_B;
        int d_B;

        Scanner in = new Scanner(System.in);
        BJT = in.nextInt();

        a_B = BJT /1000;
        //catch the first number of BJT

        b_B = (BJT - (a_B * 1000)) / 100;
        //catch the second number of BJT

        c_B = (BJT - (a_B * 1000) - (b_B * 100)) / 10;
        //catch the third number of BTJ

        d_B = (BJT - (a_B * 1000) - (b_B * 100) - (c_B * 10));
        //catch the forth number of BTJ

        int ab_B;
        ab_B = a_B*10 + b_B;
        //The result is the first and second numbers of BJT

//        System.out.println("a_B=" + a_B);
//        System.out.println("b_B=" + b_B);
//        System.out.println("c_B=" + c_B);
//        System.out.println("d_B=" + d_B);
//        System.out.println("ab_B=" + ab_B);

        int a_U = a_B;
        //catch the first number of UTC

        int b_U = b_B;
        //catch the second number of UTC

        int c_U = c_B;
        //catch the third number of UTC

        int d_U = d_B;
        //catch the forth number of UTC

        int ab_U = a_U*10 + b_U;
        //The result is the first and second numbers of UTC

        ab_U = ab_B;

//        System.out.println();
//        System.out.println("a_U=" + a_U);
//        System.out.println("b_U=" + b_U);
//        System.out.println("c_U=" + c_U);
//        System.out.println("d_U=" + d_U);
//        System.out.println("ab_U=" + ab_U);

        ab_U = ab_B -8;
        //transform BTJ to UTC

        if (ab_U <0){
            ab_U = ab_U +24;
        }

        UTC = ab_U * 100 + c_U*10 + d_U;
        System.out.println(UTC);

    }
}
