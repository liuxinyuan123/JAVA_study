/*
念整数（5分）
        题目内容：

        你的程序要读入一个整数，范围是[-100000,100000]。然后，用汉语拼音将这个整数的每一位输出出来。

        如输入1234，则输出：

        yi er san si

        注意，每个字的拼音之间有一个空格，但是最后的字后面没有空格。当遇到负数时，在输出的开头加上“fu”，如-2341输出为：

        fu er san si yi



        输入格式:

        一个整数，范围是[-100000,100000]。



        输出格式：

        表示这个整数的每一位数字的汉语拼音，每一位数字的拼音之间以空格分隔，末尾没有空格。



        输入样例：

        -30



        输出样例：

        fu san ling

        时间限制：500ms内存限制：32000kb
*/

import java.util.Scanner;

import static java.lang.Math.pow;

public class test_4_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();//输入整数
        int remainder;//各位数
        int calc;//number的复制
        int count = 0;//有count位数
        String a = "";

        calc = number;
        if (calc ==0)
        {
            count =1;
        }
        else {
            while (calc != 0)
            {
                calc = calc / 10;
                count = count + 1;
            }//获取count的值
        }
        for (int i = count; i >0; i = i-1)
        {
            if (number < 0) {
                number = number * (-1);
                System.out.print("fu ");
            }
            int mode = (int) pow(10, i -1);
            remainder =  number / mode;//remainder是想要的数字
            number = number -remainder * mode;
//            System.out.print("number = " +number + " ; remainder = " + remainder );
//            System.out.println();

            if (i != count) {
                System.out.print(" ");
            }
            switch (remainder) {
                case 0 -> a = "ling";
                case 1 -> a = "yi";
                case 2 -> a = "er";
                case 3 -> a = "san";
                case 4 -> a = "si";
                case 5 -> a = "wu";
                case 6 -> a = "liu";
                case 7 -> a = "qi";
                case 8 -> a = "ba";
                case 9 -> a = "jiu";
            }

            System.out.print(a);
        }

    }
}
