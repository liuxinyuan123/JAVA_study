/*
素数和（5分）
        题目内容：

        我们认为2是第一个素数，3是第二个素数，5是第三个素数，依次类推。

        现在，给定两个整数n和m，0<n<=m<=200，你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。

        注意，是第n个素数到第m个素数之间的所有的素数，并不是n和m之间的所有的素数。



        输入格式:

        两个整数，第一个表示n，第二个表示m。



        输出格式：

        一个整数，表示第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。



        输入样例：

        2 4



        输出样例：

        15

        时间限制：500ms内存限制：32000kb

*/


import java.util.Scanner;

public class test_4_1 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int count_small ;
            int count_big ;
            int count =0;//这是第count个质数
            int sum = 0;//这是加和
            int i ;//这是整数

            if (b > a)
            {
                count_big = b;
                count_small = a;
            }
            else
            {
                count_big = a;
                count_small = b;
            }

            for ( i = 2;  count <count_big ; i= i +1)
            {
                int isPrime = 1;
                for (int s = 2; s<i ; s = s +1)
                {
                    if ( i %s == 0 )
                    {
                        isPrime = 0;
                        break;
                    }
                }
                if ( isPrime == 1)
                {
                    count = count + 1;
                    if ( count <= count_big && count >= count_small)
                    {
//                System.out.print(i + " ");
                        sum = sum + i;

                    }
                }
            }

//        System.out.println();

            System.out.println(sum);
        }
}
