package com.example.hellolib;

/**
 * Created by lenovo on 2018/4/10.
 */
import java.util.Scanner;

public class ScanDemo {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // 从键盘接收数据

            // next方式接收字符串
            System.out.println("next方式接收：");
            // 判断是否还有输入
            if (scan.hasNext()) {
                String str1 = scan.next();
                System.out.println("输入的数据为：" + str1);
            }

            System.out.println("nextLine方式接收：");
            //nextline方式接收
            if (scan.hasNextLine()) {
               String str1 = scan.nextLine();
               System.out.println("输入的数据:" + str1);
            }

            int i = 0;
            if (scan.hasNextInt()) {
                i = scan.nextInt();
                System.out.println("输入的int是：" + i);
            } else
                System.out.println("输入的不是整数。");

            float f =0.0f;
            if (scan.hasNextFloat()) {
                f = scan.nextFloat();
                System.out.println("输入的float是：" + f);
            } else
                System.out.println("输入的不是float。");

            scan.close();
        }
}
