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
public class DataPenitipan {
    String nama;
    String alamat;
    String jenisKelamin;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getJenisKelamin(){
        return jenisKelamin;
    }
}
