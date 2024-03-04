/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perulangan1;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;

public class Perulangan1 {

    public static void main(String[] args) {
        Scanner bilangan = new Scanner(System.in);
        
        System.out.print("Masukan Angka: ");
        int n = bilangan.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
