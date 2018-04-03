/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek1;

/**
 *
 * @author Rifki
 */
public class Biodata {
    String nama;
    String NPM;
    String kelas;
    String alamat;
    String hobi;
    
    void cetakInfo(){
        System.out.println("Nama :"+nama);
        System.out.println("NPM : "+NPM);
        System.out.println("Kelas : "+kelas);
        System.out.println("Alamat : "+alamat);
        System.out.println("Hobi : "+hobi);
    }
    public static void main(String[] args) {
        Biodata Rifki = new Biodata();
        Biodata Alfi = new Biodata();
        Biodata Amad = new Biodata();
        
        Rifki.nama="Muhammad Rifki";
        Rifki.NPM="17630646";
        Rifki.kelas="nonreg 4B";
        Rifki.alamat="jl.sidodadi 2";
        Rifki.hobi="tidur\n";
        
        Alfi.nama="Alfiannor";
        Alfi.NPM="13302021";
        Alfi.kelas="nonreg 4B";
        Alfi.alamat="jl.sidodadi 2";
        Alfi.hobi="makan\n";
        
        Amad.nama="Amad";
        Amad.NPM="13302022";
        Amad.kelas="nonreg 4B";
        Amad.alamat="jl.sidodadi 2";
        Amad.hobi="Main Game";
       
        Rifki.cetakInfo();
        Alfi.cetakInfo();
        Amad.cetakInfo();
    }
    
}
