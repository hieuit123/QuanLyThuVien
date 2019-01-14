/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach.nhom1.communityuni.com;
    
import java.util.Scanner;
import khachhang.nhom1.communityuni.com.Nhap;

/**
 *
 * @author tranm
 */
public class Sach implements NhapXuat{
    public String masach;
    protected String ten;
    protected String theloai;
    protected String nam;
    protected String maloaisach;
    protected int dongia;
    protected int soluong;
    protected String manxb;
    protected String matacgia;
    
    public Sach(){
        ten="";
        theloai="";
        nam="";
        masach="";
        manxb="";
        matacgia="";
        maloaisach="";
        dongia=0;
        soluong=0;
    }
    public Sach(String ten,String theloai,String nam,String ma, String manxb, String matacgia, String maloaisach, int dongia, int soluong){
        this.ten=ten;
        this.theloai=theloai;
        this.nam=nam;
        this.masach=ma;
        this.manxb=manxb;
        this.matacgia=matacgia;
        this.maloaisach=maloaisach;
        this.dongia=dongia;
        this.soluong=soluong;
        
    }
    public Sach(Sach s){
        this.ten=s.ten;
        this.theloai=s.theloai;
        this.nam=s.nam;
        this.masach=s.masach;
        this.manxb=s.manxb;
        this.matacgia=s.matacgia;
        this.maloaisach=s.maloaisach;
        this.dongia=s.dongia;
        this.soluong=s.soluong;
    }
    @Override
    public void nhap(){
        System.out.println("Nhap vao ma sach:");
        masach=Nhap.oi.nextLine();
        System.out.println("Nhap vao ten sach:");
        ten=Nhap.oi.nextLine();
        System.out.println("Nhap vao the loai sach:");
        theloai=Nhap.oi.nextLine();
        System.out.println("Nhap vao nam sang tac:");
        nam=Nhap.oi.nextLine();
        System.out.println("Nhap vao ma loai sach:");
        maloaisach=Nhap.oi.nextLine();
        System.out.println("Nhap vao ma nha xuat ban:");
        manxb=Nhap.oi.nextLine();
        System.out.println("Nhap vao ma tac gia:");
        matacgia=Nhap.oi.nextLine();
        System.out.println("Nhap vao don gia sach:");
        dongia=Nhap.oin.nextInt();
        System.out.println("Nhap vao so luong sach:");
        soluong=Nhap.oin.nextInt();
    }
    @Override
    public void xuat(){
      
        System.out.printf("%-17s%-30s%-20s%-12s%-17s%-12s%-17s%-10d%-20d\n",masach,ten,theloai,matacgia,nam,manxb,maloaisach,soluong,dongia);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getMa() {
        return masach;
    }

    public String getMaloaisach() {
        return maloaisach;
    }

    public void setMaloaisach(String maloaisach) {
        this.maloaisach = maloaisach;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setMa(String ma) {
        this.masach = ma;
    }

    public String getManxb() {
        return manxb;
    }

    public void setManxb(String manxb) {
        this.manxb = manxb;
    }

    public String getMatacgia() {
        return matacgia;
    }

    public void setMatacgia(String matacgia) {
        this.matacgia = matacgia;
    }
    
}
