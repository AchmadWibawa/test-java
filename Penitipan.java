/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author acer
 */
public class Penitipan {
    DataPenitipan anggota;
    Helm helmMotor;
    HelmBogo helmBogo;
    
    public Penitipan(DataPenitipan anggota, Helm helm, HelmBogo helmBogo){
        this.anggota = anggota;
        this.helmMotor = helm;
        this.helmBogo = helmBogo;
    }
    
    public void tampildata(){
        System.out.println("----------------Data Anggota----------------");
        System.out.println("Nama            : "+anggota.getNama());
        System.out.println("Alamat          : "+anggota.getAlamat());
        System.out.println("Jenis Kelamin   : "+anggota.getJenisKelamin());
        System.out.println("--------------------------------------------");
        System.out.println("----------------Data Helm-------------------");
        System.out.println("Merk            : "+helmMotor.getMerkHelm());
        System.out.println("Size            : "+helmMotor.getSize());
        System.out.println("Warna           : "+helmMotor.getWarnaHelm());
        System.out.println("Symbol Helm     : "+helmMotor.getSymbolHelm());
    }
    
    public void tampildataB(){
        System.out.println("----------------Data Anggota----------------");
        System.out.println("Nama            : "+anggota.getNama());
        System.out.println("Alamat          : "+anggota.getAlamat());
        System.out.println("Jenis Kelamin   : "+anggota.getJenisKelamin());
        System.out.println("--------------------------------------------");
        System.out.println("----------------Data Helm-------------------");
        System.out.println("Merk            : "+helmBogo.getMerkHelm());
        System.out.println("Size            : "+helmBogo.getSize());
        System.out.println("Warna           : "+helmBogo.getWarnaHelm());
        System.out.println("Symbol Helm     : "+helmBogo.getSymbolHelm());
        System.out.println("Jenis Kaca      : "+helmBogo.getJenisKaca());
    }
}
