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
public class Utama {
    public static void main (String[] args){
        Helm hlm = new Helm();
        HelmBogo hlmB = new HelmBogo();
        DataPenitipan dp = new DataPenitipan();
        
        hlm.setMerkHelm("INK");
        hlm.setSize("L");
        hlm.setWarnaHelm("Hitam");
        hlm.setSymbolHelm("Logo INK");
        
        hlmB.setMerkHelm("Cargloss");
        hlmB.setSize("M");
        hlmB.setWarnaHelm("Pink");
        hlmB.setSymbolHelm("Logo C");
        hlmB.setJenisKaca("Flat");
        
        dp.setNama("Achmad");
        dp.setJenisKelamin("Pria");
        dp.setAlamat("Mayjen Panjaitan");
        
        
        Penitipan p = new Penitipan(dp, hlm, hlmB);
        p.tampildataB();
    }
}
