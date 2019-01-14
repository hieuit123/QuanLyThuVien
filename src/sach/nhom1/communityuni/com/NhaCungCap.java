/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach.nhom1.communityuni.com;

import java.util.Scanner;

/**
 * 20
 * 
 * @author tranm
 */
public class NhaCungCap implements NhapXuat{
    public String manhacungcap;
    protected String ten;
    protected String diachi;
    protected String sdt;

    public NhaCungCap(){
        manhacungcap="";
        ten="";
        diachi="";
        sdt="";
        
    }
    public NhaCungCap(String manhacungcap, String ten, String diachi, String sdt) {
        this.manhacungcap = manhacungcap;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    public NhaCungCap(NhaCungCap ncx){
        this.manhacungcap = ncx.manhacungcap;
        this.ten = ncx.ten;
        this.diachi = ncx.diachi;
        this.sdt = ncx.sdt;
    }
    

    public String getManhacungcap() {
        return manhacungcap;
    }

    public void setManhacungcap(String manhacungcap) {
        this.manhacungcap = manhacungcap;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    
    
    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ma nha cung cap:");
        manhacungcap=sc.nextLine();
        System.out.println("Nhap vao ten:");
        ten=sc.nextLine();
        System.out.println("Nhap vao dia chi:");
        diachi=sc.nextLine();
        System.out.println("Nhap vao so dien thoai:");
        sdt=sc.nextLine();
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void xuat() {
        System.out.printf("%-15s%-30s%-30s%-17s\n","Ma cung cap","Ten","Dia chi","So dien thoai");
        System.out.printf("%-15s%-30s%-30s%-17s",manhacungcap,ten,diachi,sdt);
    }
}
