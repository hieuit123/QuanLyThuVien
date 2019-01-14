/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang.nhom1.communityuni.com;

import java.util.Scanner;

/**
 *
 * @author tranm
 */
public class PhieuMuon {
    public String maphieumuon;
    public String madg;
    public String masach;
    public int soluong;
    public String ngaymuon;
    public String ngaytra;
   public String trangthai;
    
    
    public PhieuMuon(){
        maphieumuon="";
        madg="";
        masach="";
        soluong=0;
        ngaymuon="";
        ngaytra="";
        trangthai="";
    }
    
     public PhieuMuon(String maphieumuon, String madg, String masach, int soluong, String ngaymuon, String ngaytra, String trangthai) {
        this.maphieumuon = maphieumuon;
        this.madg = madg;
        this.masach = masach;
        this.soluong = soluong;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
        this.trangthai = trangthai;
    }
    public PhieuMuon(PhieuMuon p){
        this.maphieumuon = p.maphieumuon;
        this.madg = p.madg;
        this.masach = p.masach;
        this.soluong = p.soluong;
        this.ngaymuon = p.ngaymuon;
        this.ngaytra = p.ngaytra;
        this.trangthai = p.trangthai;
    }
     
    public void nhap(){
        
        
        System.out.println("Nhap vao ma phieu muon");
        maphieumuon=Nhap.oi.nextLine();
        System.out.println("Nhap vao ma doc gia");
        madg=Nhap.oi.nextLine();
        System.out.println("Nhap vao ma sach");
        masach=Nhap.oi.nextLine();
        System.out.println("Nhap vao ngay muon");
        ngaymuon=Nhap.oi.nextLine();
        System.out.println("Nhap vao ngay tra");
        ngaytra=Nhap.oi.nextLine();
        System.out.println("Nhap vao so luong ");
        
        soluong=Nhap.oin.nextInt();        
    }
    public void xuat(){
        System.out.printf("%-17s%-15s%-15s%-17s%-17s%-17s%-17s\n",maphieumuon,madg,masach,ngaymuon,ngaytra,soluong,trangthai);
//        
     
    }
    
    public String getMaphieumuon() {
        return maphieumuon;
    }

    public void setMaphieumuon(String maphieumuon) {
        this.maphieumuon = maphieumuon;
    }

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
}

