/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perulangan2;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;

public class Perulangan2 {

    public static void main(String[] args) {
        Scanner kubus = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi 1: ");
        int sisi1 = kubus.nextInt();

        System.out.print("Masukkan panjang sisi 2: ");
        int sisi2 = kubus.nextInt();

        System.out.print("Masukkan panjang sisi 3: ");
        int sisi3 = kubus.nextInt();

        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
