package ui;

import business.BeeHive;
import entity.Bee;

import java.util.ArrayList;
import java.util.Scanner;

public class BeeUI {
    public static void main(String[] args) {
        BeeHive bh = null;
        boolean keepRunning = true;
        Scanner sc = new Scanner(System.in);
        int choice;
        while (keepRunning) {
            System.out.println("-----------Bee hive------------");
            System.out.println("\t1 - Create bee list");
            System.out.println("\t2 - Attack bee");
            System.out.println("\t3 - Exit");
            System.out.println("Enter your choice(1,2,3): ");
            choice = sc.nextInt();
            ArrayList<Bee> bees;
            switch (choice) {
                case 1: {
                    bh = new BeeHive();
                    bh.init();
                    bees = bh.getListBee();
                    System.out.println("Bees details at the begining:");
                    showBees(bees);
                    break;
                }
                case 2:{
                    if(bh == null){
                        System.out.println("No bees");
                    }else {
                        bh.attackBee();
                        bees = bh.getListBee();
                        System.out.println("Bees details at the momment");
                        showBees(bees);
                    }
                    break;
                }
                default:{
                    keepRunning = false;
                }
            }
        }
    }

    public static void showBees(ArrayList<Bee> bees) {
        for (int i = 0; i < bees.size(); i++) {
            System.out.println(bees.get(i));
        }
    }
}
