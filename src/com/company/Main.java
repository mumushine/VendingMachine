package com.company;
import java.util.*;
public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner kb = new Scanner(System.in);
        int FiveCoin_counts = 0;
        int OneCoin_counts = 0;
        int orangejuice = 2;
        int beer = 2;
        boolean flag = true;
        while (flag) {
            System.out.println("请选择你投入的是一元硬币还是五角硬币");
            System.out.println("1.一元硬币    2.五角硬币");
            int coin = kb.nextInt();
            System.out.println("请选择你要的饮料");
            System.out.println("1.橙汁   2.啤酒");
            int drink = kb.nextInt();
            if (drink == 1){
                if (coin == 1) {
                    if (orangejuice > 0) {
                        OneCoin_counts += 1;
                        if (FiveCoin_counts != 0) {
                            System.out.println("橙汁已掉落，同时注意找零");
                            FiveCoin_counts -= 1;
                            orangejuice -= 1;
                        } else {
                            System.out.println("已经没有零钱找零啦");
                        }
                    }
                    else {

                        System.out.println("已经没有橙汁了");
                    }

                } else {
                    if (orangejuice > 0) {
                        FiveCoin_counts += 1;
                        System.out.println("橙汁已掉落");
                        orangejuice -= 1;
                    }
                    else {
                        System.out.println("已经没有橙汁了");
                    }
                }
            }
            else if (drink == 2){
                if (coin == 1) {
                    if (beer > 0) {
                        OneCoin_counts += 1;
                        if (FiveCoin_counts != 0) {
                            System.out.println("啤酒已掉落，同时注意找零");
                            FiveCoin_counts -= 1;
                            beer -= 1;
                        } else {
                            System.out.println("已经没有零钱找零啦");
                        }
                    }
                    else {

                        System.out.println("已经没有啤酒了");
                    }

                } else {
                    if (beer > 0) {
                        FiveCoin_counts += 1;
                        System.out.println("啤酒已掉落");
                        beer -= 1;
                    }
                    else {
                        System.out.println("已经没有啤酒了");
                    }
                }
            }
            System.out.println("是否继续交易");
            System.out.println("1.是    2.否");
            int answer = kb.nextInt();
            if (answer == 2) flag = false;
        }
        System.out.println("欢迎下次光临");
    }
}
