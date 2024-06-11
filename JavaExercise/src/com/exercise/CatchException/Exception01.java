package com.exercise.CatchException;
//p456 457
/*
1.编写应用程序EcmDef.java ,接受命令的两个参数（整数），计算两个数相除，
2.计算两个数相除要求方法cal(int n1, int n2)
3.对数据格式不正确 （NumberforformatException），缺少命令行参数 (ArrayIndexOutofBoundsException)，除0 进行异常处理(ArithmeticException)
 */

// 如何运行，配置参数，然后直接run  edit configurations ->program argument (在这里添加参数  eg 10 0 )->apply ->run
public class Exception01 {
    public static void main(String[] args) {
        //先把接收到的参数，转成整数
        //先验证输入的参数的个数是否正确，两个参数

        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            //因为接收的是一个 string 要转换成整数
            int n1 = Integer.parseInt((args[0]));
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println("计算的结果是："+res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不对，需要输入整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0 的异常");
        }


    }
    public static double cal(int n1,int n2){

        return n1/n2;
    }

}