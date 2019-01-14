/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach.nhom1.communityuni.com;

import khachhang.nhom1.communityuni.com.Nhap;

/**
 *
 * @author tranm
 */
public class LoaiSach {
    String maloaisach;
    String tenloaisach;

    public LoaiSach(String maloaisach, String tenloaisach) {
        this.maloaisach = maloaisach;
        this.tenloaisach = tenloaisach;
    }
    public LoaiSach(){
        maloaisach="";
        tenloaisach="";
    }
    public LoaiSach(LoaiSach l){
        this.maloaisach=l.maloaisach;
        this.tenloaisach=l.tenloaisach;
    }

    public void nhap(){
        System.out.print("Nhap vao ma loai sach: ");
        maloaisach=Nhap.oi.nextLine();
        System.out.print("Nhap vao ten loai sach: ");
        tenloaisach=Nhap.oi.nextLine();
    }
    public void xuat(){
        System.out.printf("%-20s%-30s",maloaisach,tenloaisach);
    }
    public String getMaloaisach() {
        return maloaisach;
    }

    public void setMaloaisach(String maloaisach) {
        this.maloaisach = maloaisach;
    }

    public String getTenloaisach() {
        return tenloaisach;
    }

    public void setTenloaisach(String tenloaisach) {
        this.tenloaisach = tenloaisach;
    }
    
}
