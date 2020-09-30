/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan3;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class BilanganGenapDanGanjil {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.print("Masukan angka :");
    int angka = input.nextInt();

    if(angka % 2 == 0){
        System.out.println("Bilangan " + angka + " : Bilangan Genap");
}   else {
        System.out.println("Bilangan " + angka + " : Bilangan Ganjil");
}   
}
}
