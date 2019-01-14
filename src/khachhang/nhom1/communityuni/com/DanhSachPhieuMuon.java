/*3
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang.nhom1.communityuni.com;

import HamNghiepVu.TimKiemKhoa;
import static HamNghiepVu.TimKiemKhoa.TimKiem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vienthong
 */
public class DanhSachPhieuMuon {
    PhieuMuon[] ds=new PhieuMuon[1000];
    
    int n=0;        //So luong phieu;
     
    public void xuat(){
        System.out.printf("%-17s%-15s%-15s%-17s%-17s%-17s%-17s\n","Ma phieu","Ma doc gia","Ma sach","Ngay muon","Ngay tra","So luong","Trang thai");
        for(int i=0;i<n;i++){
            ds[i].xuat();
        }
    }
    public void xoa(){
        System.out.println("Nhap vao ma phieu muon can xoa:");
        String ma=Nhap.oi.nextLine();
        for(int i=0;i<n;i++){
            if(ds[i].getMaphieumuon().equals(ma)){
                for(int k=i;k<n-1;k++){
                    ds[k]=ds[k+1];
                    --n;
                    return;
                }
            }
        }
    }
    public static boolean checkMa(String ma) throws IOException{
        FileReader fr=null;
        try {
            File f=new File("danhsachphieumuon.txt");
            fr = new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            
            int soluong=Integer.parseInt(br.readLine());
            
            for(int i=0;i<soluong;i++){
               String chuoicon=br.readLine();
                String[] tachchuoi=chuoicon.split("&");
                if(ma.equals(tachchuoi[0])) {
                    br.close();
                    return true;
                }
            }
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DanhSachPhieuMuon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DanhSachPhieuMuon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    public static String timMasach(String ma) throws IOException{//                     Tìm mã sách bằng mã phiếu mượn
        FileReader fr=null;
        
        try {
           
            File f=new File("danhsachphieumuon.txt");
            fr = new FileReader(f);
            
            try (BufferedReader br = new BufferedReader(fr)) {
                
                int soluong=Integer.parseInt(br.readLine()+"");
                
                for(int i=0;i<soluong;i++){
                    
                    String chuoicon=br.readLine();
                    String[] tachchuoi=chuoicon.split("&");
                    if(ma.equals(tachchuoi[0])) {
                     
                        br.close();
                        return tachchuoi[2];
                    }
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DanhSachPhieuMuon.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DanhSachPhieuMuon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void them(){
        ds[n]=new PhieuMuon();
        ds[n].nhap();
        ++n;
    }
    public void ghiFile() throws IOException{
        HamNhapGhiFile so=new HamNhapGhiFile();
        so.ghiFilePhieuMuon(ds, n);
    }
    public void docFile() throws IOException{
        HamNhapGhiFile so=new HamNhapGhiFile();
        so.docFilePhieuMuon(ds);
        n=so.getSoluongphieumuon();
    }
    public int tim(String ma){
        
        for(int i=0;i<n;i++){
            if(ds[i].getMaphieumuon().equals(ma)) {
                return i;
            }
    }
        return -1;
    }
    public void traSach(){
        System.out.println("Nhap vao ma phieu muon de danh dau tra sach");
        String ma=Nhap.oi.nextLine();
        int stt=tim(ma);
        if(stt!=-1) {
            ds[stt].setTrangthai("Da tra");
            System.out.println("Danh dau tra sach thanh cong");
        }
        else System.out.println("Khong tim thay ma phieu muon vua nhap!");
    }

    public PhieuMuon[] getDs() {
        return ds;
    }

    public void setDs(PhieuMuon[] ds) {
        this.ds = ds;
    }
    
}
