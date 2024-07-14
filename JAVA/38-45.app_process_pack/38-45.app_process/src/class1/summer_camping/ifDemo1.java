package class1.summer_camping;

import java.util.Random;

public class ifDemo1 {
    public static void main(String[] args) {
        //TODO：心跳（60-100）正常，否则提示系统进一步检查
        //格式1：if(条件表达式){code}
        Random heartBeater = new Random();
        int heartBeat = heartBeater.nextInt(0,120);
        if(heartBeat < 60 || heartBeat > 100){
            System.out.println("The number of your heartbeat data is " + heartBeat + ". You need hava to check again!");
        }
        System.out.println("The inspection is over.");

        //TODO:发红包
        //格式2：if(条件表达式){code} else {the second code}
        double money = heartBeater.nextDouble(0,10000);
        if(money >= 1314){
            System.out.println("success!");
        }else {
            System.out.println("fail!");
        }

        //TODO:绩效系统 0-60 C 60-80 B 80-90 A 90-100 A+
        //格式3：if(条件表达式){code}else if(条件表达式){code}else{code}
        double grades = heartBeater.nextDouble(0,100);

        if (grades >= 0 && grades < 60) {
            System.out.println("bad");
        } else if (grades >= 60 && grades <80) {
            System.out.println("well");
        } else if (grades >= 80 && grades <90) {
            System.out.println("good");
        } else if (grades >= 90 && grades <100) {
            System.out.println("best");
        }else {
            System.out.println("data has problem");
        }
    }
}
