/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang.nhom1.communityuni.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author vienthong
 */
public class DanhSachPhieuPhat {
    
    PhieuPhat[] ds=new PhieuPhat[1000];
    int n=0;
    
    public void xuat(){
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","Ma phieu muon","Ma phieu phat","Muc do hong","So luong","Tong tien phat");
        for(int i=0;i<n;i++){
            
            ds[i].xuat();
        }
    }
    public void them() throws IOException{
        System.out.println("Nhap vao thong tin phieu phat can them:");
        ds[n]=new PhieuPhat();
        ds[n].nhap();
        ++n;
    }
    public void xoa(){
        System.out.println("Nhap vao ma phieu phat can xoa:");
        String ma=Nhap.oi.nextLine();
        for(int i=0;i<n;i++){
            if(ds[i].getMaphieuphat().equals(ma)){
                for(int k=i;k<n-1;k++){
                    ds[k]=ds[k+1];
                    --n;
                    return;
                }
            }
        }
    }
    
    public void ghiFile() throws IOException{
        File f=new File("danhsachphieuphat.txt");
        if (f==null){
            f.createNewFile();
            
        }
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(n+"");
        bw.newLine();
        
        for (int i=0;i<n;i++){
           bw.write(ds[i].getMaphieumuon()+"&");
           bw.write(ds[i].getMaphieuphat()+"&");
           bw.write(ds[i].getMucdohong()+"&");
           bw.write(ds[i].getSoluong()+"&");
           bw.write(ds[i].getTongtienphat()+"");
           bw.newLine();
        }
        bw.close();
    }
    
    public void docFile() throws IOException{
        try{
        File f=new File("danhsachphieuphat.txt");
            FileReader fr=new FileReader(f);
            try (BufferedReader br = new BufferedReader(fr)) {
                n= Integer.parseInt(br.readLine());
                for(int i=0;i<n;i++){
                    String chuoicon=br.readLine();
                    String[] tachchuoi=chuoicon.split("&");
                    
                    
                    ds[i]=new PhieuPhat();
                    ds[i].setMaphieumuon(tachchuoi[0]);
                    ds[i].setMaphieuphat(tachchuoi[1]);
                    ds[i].setMucdohong(Integer.parseInt(tachchuoi[2]));
                    ds[i].setSoluong(Integer.parseInt(tachchuoi[3]));
                    ds[i].setTongtienphat(Integer.parseInt(tachchuoi[4]));
                }
                br.close();
            }
        }
        catch(FileNotFoundException e ){
            e.getMessage();
        }
       
    }
    
}
