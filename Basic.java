package cn.yingyu5658.basic;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        for (; ; ) {


            System.out.println("欢迎使用！");
            System.out.println("按键1 2 3 4分别为加 减 乘 除，输入后请回车");
            Scanner startSc = new Scanner(System.in);
            int selectNumber = startSc.nextInt();
            //以下为加法
            if (selectNumber == 1) {
                System.out.println("请输入您要计算的第一个数字");
                Scanner jiafaSc = new Scanner(System.in);
                int jiafa1 = jiafaSc.nextInt();
                System.out.println("请输入您要计算的第二个数字");
                int jiafa2 = jiafaSc.nextInt();
                jiafa(jiafa1, jiafa2);
            }
            //以下为减法
            if (selectNumber == 2) {
                System.out.println("请输入您要计算的第一个数字");
                Scanner jianfaSc = new Scanner(System.in);
                int jianfa1 = jianfaSc.nextInt();
                System.out.println("请输入您要计算的第二个数字");
                int jianfa2 = jianfaSc.nextInt();
                jianfa(jianfa1, jianfa2);
            }
            //以下为乘法
            if (selectNumber == 3) {
                System.out.println("请输入您要计算的第一个数字");
                Scanner chengfaSc = new Scanner(System.in);
                int chengfa1 = chengfaSc.nextInt();
                System.out.println("请输入您要计算的第二个数字");
                int chengfa2 = chengfaSc.nextInt();
                chengfa(chengfa1, chengfa2);
            }
            if (selectNumber == 4) {
                System.out.println("请输入您要计算的第一个数字");
                Scanner chufaSc = new Scanner(System.in);
                int chufa1 = chufaSc.nextInt();
                System.out.println("请输入您要计算的第二个数字");
                int chufa2 = chufaSc.nextInt();
                chufa(chufa1, chufa2);
            }
            System.out.println("已完成当前轮计算");
            System.out.println("-----------------------------------------");
        }
    }

    public static int jiafa(int a, int b) {
        int jieguo = a + b;
        System.out.println(jieguo);
        return a + b;
    }

    public static int jianfa(int a, int b) {
        int jieguo = a - b;
        System.out.println(jieguo);
        return a - b;
    }

    public static int chengfa(int a, int b) {
        int jieguo = a * b;
        System.out.println(jieguo);
        return a * b;
    }

    public static int chufa(int a, int b) {
        int jieguo = a / b;
        System.out.println(jieguo);
        return a / b;
    }
}

