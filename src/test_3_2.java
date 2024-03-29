/*
2数字特征值（5分）

题目内容：
对数字求特征值是常用的编码算法，奇偶特征是一种简单的特征值。
对于一个整数，从个位开始对每一位数字编号，个位是1号，十位是2号，以此类推。
这个整数在第n位上的数字记作x，如果x和n的奇偶性相同，则记下一个1，否则记下一个0。
按照整数的顺序把对应位的表示奇偶性的0和1都记录下来，就形成了一个二进制数字。
比如，对于342315，这个二进制数字就是001101。

这里的计算可以用下面的表格来表示：

数字                 3      4      2      3      1      5
数位                 6      5      4     3      2      1
数字奇偶       奇    偶    偶    奇    奇    奇
数位奇偶       偶    奇    偶    奇    偶    奇
奇偶一致        0      0      1      1      0      1
二进制位值    32    16     8     4      2      1

    按照二进制位值将1的位的位值加起来就得到了结果13。

你的程序要读入一个非负整数，整数的范围是[0,100000]，
然后按照上述算法计算出表示奇偶性的那个二进制数字，输出它对应的十进制值。

提示：将整数从右向左分解，数位每次加1，而二进制值每次乘2。

输入格式:
一个非负整数，整数的范围是[0,1000000]。

输出格式：
一个整数，表示计算结果。

输入样例：
342315

输出样例：
13

时间限制：500ms内存限制：32000kb
 */

import java.util.Scanner;

public class test_3_2 {



        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int number;//输入的数
            int count = 0;//输入的数有多少位
            int balance;//最后一位数字

            int result = 0;

            int a;
            int b;
            int c;
            int s;

            number = in.nextInt();

            while(number != 0){

                balance = number%10;
                count = count + 1;

                a = count %2;//count是奇数还是偶数
                b = balance%2;//最后一位数字是奇数还是偶数

                c = (int) Math.pow(2,count-1);

                if ( a == b)
                {
                    s = 1;//奇偶一致为1
                }
                else
                {
                    s = 0;//奇偶不一致为0
                }

                result = result + c * s;

                number = number/10;

            }

            System.out.print(result);


        }



}
