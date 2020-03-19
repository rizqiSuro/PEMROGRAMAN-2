/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Thread2 extends Thread {

    private int hitungMundur = 5;

    public Thread2() {
        start();
    }

    public void run() {
        int jumlah;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah thread: ");
        jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Hallo, saya adalah: Thread #" + i);

            try {
                Thread.sleep(900);
                while (true) {
                    System.out.println("Thread #1 : " + hitungMundur);
                    if (--hitungMundur == 0) {
                        return;
                    }
                }
            } catch (Exception e) {

            }

        }

    }

    public static void main(String[] args) {
        new Thread2();

    }
}
