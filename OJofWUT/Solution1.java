import java.util.Scanner;

public class Solution1 {


    /*
    1000. 打印沙漏 ===============================================================
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char c = scanner.next().charAt(0);
        int totalLevel = 0;//记录层数
        int surplus = 0; //剩余的数
        int num1 = 0;
        for (int i = 0; i < 100; i++) {
            if (N < 2 * i * i - 1) {
                totalLevel = i - 1;
                break;
            }
        }
        totalLevel = 2 * totalLevel - 1;//原层数
        //上半部分
        for (int i = totalLevel - 1; i >= 0; i -= 2) {
            //添加空格
            for (int k = 1; k <= totalLevel - i - 1; k += 2) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                num1++;
            }
            System.out.print("\n");
        }
        //下半部分
        int num2 = 0;
        for (int i = 2; i < totalLevel; i += 2) {
            for (int k = totalLevel - 2; k >= i ; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                num2++;
            }
            System.out.print("\n");
        }
        surplus = N - (num1 + num2);
        if (surplus > 0) {
            System.out.println(surplus);
        }
    }
//        public static void main(String[] args)
//        {
//            Scanner scan = new Scanner(System.in);
//            int n = scan.nextInt();
//            int count=0,count1=0,count2=0;
//            int h = (int)Math.sqrt((n+1)/2);//计算行数;
//            int h1 =h;//上半部分的行数;
//            int h2 = h-1;//下半部分的行数;
//            String str = scan.nextLine();
//            String str1 = str.trim();//去掉字符串的前导与尾部的空格;
//            char[] ch = str1.toCharArray();//将str1转换成字符数组;
//            for(int i=1;i<=h1;i++)//上半部分的行数;
//            {
//                for(int j=1;j<=i-1;j++)//控制的是空格的个数;
//                {
//                    System.out.printf(" ");
//                }
//                for(int k=1;k<=(h1-i)*2+1;k++)//控制的是*号的个数;
//                {
//                    System.out.printf("%c",ch[0]);
//                    count1++;
//                }
//                System.out.println();
//            }
//            for(int i=1;i<=h2;i++)//控制行数;
//            {
//                for(int j=h2-i;j>=1;j--)//控制空格的个数;
//                {
//                    System.out.printf(" ");
//                }
//                for(int k=1;k<=2*i+1;k++)
//                {
//                    System.out.printf("%c",ch[0]);
//                    count2++;
//                }
//                System.out.println();
//            }
//            System.out.printf("%d",n-count1-count2);
//        }



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        for (int i = 1; i <= num; i++) {
//            for (int k = 1; k <= num-i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.print("\n");
//        }
//    }

}
