/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_c_3062;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Judecca_GilangFibarkah_21103062 
 */
public class UTS_NO3_C_3062 {

    public static void main(String[] args) {
        //object array
        Asprak_3062[] Asisst_3062 = new Asprak_3062[1];
        StudStaff_3062[] Staf_3062 = new StudStaff_3062[1];
        
        Asisst_3062[0] = new Asprak_3062();
        Staf_3062[0] = new StudStaff_3062();

        //buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data asprak
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                Asisst_3062[i].nim_3062 = br.readLine();
                System.out.print("Nama             : ");
                Asisst_3062[i].nama_3062 = br.readLine();
                System.out.print("Jurusan          : ");
                Asisst_3062[i].jurusan_3062 =br.readLine();
                System.out.print("IPK              : ");
                Asisst_3062[i].ipk_3062 =Float.parseFloat(br.readLine());
                System.out.print("Mata Kuliah      : ");
                Asisst_3062[i].mkAsisten_3062 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                Asisst_3062[i].jmlPertemuan_3062 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data asprak
            System.out.println("");
            System.out.println("");
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(Asprak_3062 AP : Asisst_3062){
                AP.tampilDataAsistenPraktikum_3062();
                System.out.println("");
            }

            //mengisi data ke array pada data studstaff
            System.out.println("");
            System.out.println("");
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                Staf_3062[i].nim_3062 = br.readLine();
                System.out.print("Nama        : ");
                Staf_3062[i].nama_3062 = br.readLine();
                System.out.print("Jurusan     : ");
                Staf_3062[i].jurusan_3062 =br.readLine();
                System.out.print("IPK         : ");
                Staf_3062[i].ipk_3062 =Float.parseFloat(br.readLine());
                System.out.print(" Unit Kerja : ");
                Staf_3062[i].unitKerja_3062 =br.readLine();
                System.out.print("Jam Kerja   : ");
                Staf_3062[i].jamKerja_3062 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data studstaff
            System.out.println("");
            System.out.println("");
            System.out.println("DATA STUDENT STAFF");
            for(StudStaff_3062 SS : Staf_3062){
                SS.tampilDataStudentStaff_3062();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
    }
}
