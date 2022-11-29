/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3062;

/**
 *
 * @author Judecca_GilangFibarkah_21103062
 */
public class StudStaff_3062 extends Mahasiswa_3062 implements pendapatan_3062 {
    int  jamKerja_3062;
    String unitKerja_3062;
    
    public StudStaff_3062 () {
        
    }
    
    public double totalPendapatan_3062(){
        return (jamKerja_3062 * 30000);
    }
    public void tampilDataStudentStaff_3062(){
        super.tampilDataMhs_3062();
        System.out.println("Unit Kerja                     : " + unitKerja_3062);
        System.out.println("Jam Kerja                      : " +jamKerja_3062);
        System.out.println("Total Pendapatan Student Staff : " +totalPendapatan_3062());
    }
}
