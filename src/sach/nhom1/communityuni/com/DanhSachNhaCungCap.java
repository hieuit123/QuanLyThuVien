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
public class DanhSachNhaCungCap {
    NhaCungCap[] ds = new NhaCungCap[1000];
    int n;
    public void xuat(){
        System.out.printf("%-20s%-20s\n","Ma nha cung cap","Ten nha cung cap");
        for(int i=0;i<n;i++){
            
            ds[i].xuat();
        }
    }
    public void them(){
        ds[n]=new NhaCungCap();
        ds[n].nhap();
        ++n;
    }
    public void xoa(){
        System.out.println("Nhap vao ma nha cung cap can xoa:");
        String ma=Nhap.oi.nextLine();
        for(int i=0;i<n;i++){
            if(ds[i].getManhacungcap().equals(ma)){
                for(int k=i;k<n-1;k++){
                    ds[k]=ds[k+1];
                    --n;
                    return;
                }
            }
        }
    }
    public void ghiFile() throws IOException{
        File f=new File("danhsachnhacungcap.txt");
        if (f==null){
            f.createNewFile();
            
        }
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(n+"");
        bw.newLine();
        for (int i=0;i<n;i++){
           bw.write(ds[i].getManhacungcap()+"&");
           bw.write(ds[i].getTen()+"");
           bw.newLine();
        }
        bw.close();
    }
    
    public void docFile() throws IOException{
        try{
        File f=new File("danhsachnhacungcap.txt");
            FileReader fr=new FileReader(f);
            try (BufferedReader br = new BufferedReader(fr)) {
                n= Integer.parseInt(br.readLine());
                for(int i=0;i<n;i++){
                    String chuoicon=br.readLine();
                    String[] tachchuoi=chuoicon.split("&");
                    
                    
                    ds[i]=new NhaCungCap();
                    ds[i].setManhacungcap(tachchuoi[0]);
                    ds[i].setTen(tachchuoi[1]);
                }
                br.close();
            }
        }
        catch(FileNotFoundException e ){
            e.getMessage();
        }
       
    }
}
