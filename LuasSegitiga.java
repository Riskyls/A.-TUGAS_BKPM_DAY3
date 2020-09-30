/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuan3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class LuasSegitiga {

    public static void main(String[] args) {
    BufferedReader segitiga = new BufferedReader(new InputStreamReader(System.in));
    try {
        System.out.println("=== Menghitung Luas Segitiga ===");
        System.out.print("Masukan Alas   : ");
        String nilaiA = segitiga.readLine();
        int alas = Integer.parseInt(nilaiA);
        
        System.out.print("Masukan Tinggi : ");
        String nilaiT = segitiga.readLine();
        int tinggi = Integer.parseInt(nilaiT);

        double luas = ((alas * tinggi)/2);

        System.out.println("Luas        : " +luas);

    }catch(IOException e) {
        System.out.println("Eror!!");

}
}
}