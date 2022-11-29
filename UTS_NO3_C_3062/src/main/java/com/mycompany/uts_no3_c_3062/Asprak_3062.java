/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3062;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class Asprak_3062 extends Mahasiswa_3062 implements pendapatan_3062 {
    String mkAsisten_3062;
    int jmlPertemuan_3062;
    
    public Asprak_3062(){
        
    }
    
    public double totalPendapatan_3062(){
        return(jmlPertemuan_3062 * 50000);
    }
    public void tampilDataAsistenPraktikum_3062() {
        super.tampilDataMhs_3062();
        System.out.println("Mata Kuliah        : " + mkAsisten_3062);
        System.out.println("Jumlah Pertemuan   : " + jmlPertemuan_3062);
        System.out.println("Total Pendapatan   : " + totalPendapatan_3062());   
    }
}
