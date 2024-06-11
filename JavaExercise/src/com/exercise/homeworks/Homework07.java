package com.exercise.homeworks;
//练习p436-441

/*
有一个Car ,有属性temperature（温度），车内有Air(空调)类，有吹风的功能flow,
Air 会监视车内的温度，如果温度超过40度则吹冷气，如果温度低于0度则吹暖气，如果在这之前则关掉空调，实例化具有不同温度的Car 对象，调用空调的flow 方法
测试空调吹的风是否正确

体现类与类的包含关系的案例（内部类（成员内部类））
 */
public class Homework07 {
    public static void main(String[] args) {
        Cars car1 = new Cars(41.4);
        // 实例如何调用内部类
        car1.getAir().flow();
        Cars car2 = new Cars(-7);
        // 实例如何调用内部类
        car2.getAir().flow();

        Cars car3 = new Cars(34);
        // 实例如何调用内部类
        car3.getAir().flow();


    }


}

class Cars{
    private double temperature;

    public Cars(double temperature) {
        this.temperature = temperature;
    }



    // Air 成员内部类
     class Air{

        public void flow(){
            if (temperature>40){
                System.out.println("空调温度大于40吹冷风..");

            }else if(temperature < 0){
                System.out.println("空调温度低于0吹暖风..");
            }else{
                System.out.println("温度正常关掉空调..");
            }

        }



    }
    //提供一个方法来返回air 对象
    public Air getAir (){
        return new Air();

    }


}