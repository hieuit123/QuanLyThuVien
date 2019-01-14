/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach.nhom1.communityuni.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import khachhang.nhom1.communityuni.com.Nhap;

/**
 *
 * @author vienthong
 */
public class DanhSachLoaiSach {
    LoaiSach[] ls=new LoaiSach[1000];
    int soluong=0;
    
    
    public void nhap(){
        for(int i=0;i<soluong;i++){
            ls[i]=new LoaiSach();
            ls[i].nhap();
        }
    }
    
    public void them(){
        ls[soluong]=new LoaiSach();
        ls[soluong].nhap();
        ++soluong;
    }
    public void xuat(){
        System.out.printf("%-20s%-20s\n","Ma loai sach","Ten loai sach");
        
        for(int i=0;i<soluong;i++){
            ls[i].xuat();
        }
    }
    public void xoa(){
        System.out.println("Nhap vao ma loai sach can xoa:");
        String ma=Nhap.oi.nextLine();
        for(int i=0;i<soluong;i++){
            if(ls[i].getMaloaisach().equals(ma)){
                for(int k=i;k<soluong-1;k++){
                    ls[k]=ls[k+1];
                    --soluong;
                    return;
                }
            }
        }
    }
    public void ghiFile() throws IOException{
        File f=new File("danhsachloaisach.txt");
        if (f==null){
            f.createNewFile();
            
        }
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(soluong+"");
        bw.newLine();
        for (int i=0;i<soluong;i++){
           bw.write(ls[i].getMaloaisach()+"&");
           bw.write(ls[i].getTenloaisach()+"");
           bw.newLine();
        }
        bw.close();
    }
    
    public void docFile() throws IOException{
        try{
        File f=new File("danhsachloaisach.txt");
            FileReader fr=new FileReader(f);
            try (BufferedReader br = new BufferedReader(fr)) {
                soluong= Integer.parseInt(br.readLine());
                for(int i=0;i<soluong;i++){
                    String chuoicon=br.readLine();
                    String[] tachchuoi=chuoicon.split("&");
                    
                    
                    ls[i]=new LoaiSach();
                    ls[i].setMaloaisach(tachchuoi[0]);
                    ls[i].setTenloaisach(tachchuoi[1]);
                }
                br.close();
            }
        }
        catch(FileNotFoundException e ){
            e.getMessage();
        }
       
    }
    public LoaiSach[] getLs() {
        return ls;
    }

    public void setLs(LoaiSach[] ls) {
        this.ls = ls;
    }
    
    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
}
