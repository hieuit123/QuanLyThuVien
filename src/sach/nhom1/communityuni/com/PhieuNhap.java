
package sach.nhom1.communityuni.com;

import java.util.Scanner;

/**
 *
 * @author tranm
 */
public class PhieuNhap implements NhapXuat{
    protected String maphieunhap;
    protected String masach;
    protected String manhacungcap;
    protected String ngaynhap;
    protected int dongia;
    protected int soluong;
    protected int thanhtien;
    
    public PhieuNhap(){
        maphieunhap="";
        masach="";
        manhacungcap="";
        ngaynhap="";
        dongia=0;
        soluong=0;
        thanhtien=0;
        
    }
    public PhieuNhap(String maphieunhap, String masach, String manhacungcap, String ngaynhap, int dongia, int soluong, int thanhtien){
        this.maphieunhap=maphieunhap;
        this.masach=masach;
        this.manhacungcap=manhacungcap;
        this.ngaynhap=ngaynhap;
        this.dongia=dongia;
        this.soluong=soluong;
        this.thanhtien=thanhtien;
    }
    public PhieuNhap(PhieuNhap phieu){
        this.maphieunhap=phieu.maphieunhap;
        this.masach=phieu.masach;
        this.manhacungcap=phieu.manhacungcap;
        this.ngaynhap=phieu.ngaynhap;
        this.dongia=phieu.dongia;
        this.soluong=phieu.soluong;
        this.thanhtien=phieu.thanhtien;
    }
    
    @Override
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ma phieu nhap:");
        maphieunhap=sc.nextLine();
        System.out.println("Nhap vao ma sach:");
        masach=sc.nextLine();
        System.out.println("Nhap vao ma nha cung cap:");
        manhacungcap=sc.nextLine();
        System.out.println("Nhap vao ngay nhap hang:");
        ngaynhap=sc.nextLine();
        System.out.println("Nhap vao don gia sach:");
        Scanner sb=new Scanner(System.in);
        dongia=sb.nextInt();
        System.out.println("Nhap vao so luong sach");
        soluong=sb.nextInt();
        thanhtien=dongia*soluong;
        
    }

    /**
     *
     */
    @Override
    public void xuat(){
       System.out.printf("%-20s%-20s%-20s%-20s%-20d%-20d%-20d\n",maphieunhap, masach, manhacungcap, ngaynhap,dongia, soluong,thanhtien);
    }

    public String getMaphieunhap() {
        return maphieunhap;
    }

    public void setMaphieunhap(String maphieunhap) {
        this.maphieunhap = maphieunhap;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getManhacungcap() {
        return manhacungcap;
    }

    public void setManhacungcap(String manhacungcap) {
        this.manhacungcap = manhacungcap;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
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

    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
    
