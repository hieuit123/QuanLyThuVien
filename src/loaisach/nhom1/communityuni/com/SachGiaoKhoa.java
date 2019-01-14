/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loaisach.nhom1.communityuni.com;

import java.util.Scanner;
import sach.nhom1.communityuni.com.Sach;

/**
 *
 * @author tranm
 */
public class SachGiaoKhoa extends Sach{
    protected String mon;
    protected int lop;

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }
    
    public SachGiaoKhoa(){
        super();
        mon="";
        lop=0;
    }
    
    public SachGiaoKhoa(String ten,String theloai,String nam,String ma, String manxb, String matacgia, String maloaisach, int dongia, int soluong,  int lop, String mon){
        super(ten,theloai, nam, ma, manxb, matacgia,maloaisach,dongia,soluong);
        this.lop=lop;
        this.mon=mon;
    }
    
    public SachGiaoKhoa(SachGiaoKhoa sgk){
        super(sgk);
        this.lop=sgk.lop;
        this.mon=sgk.mon;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao mon hoc cua sach giao khoa: ");
        mon=sc.nextLine();
        System.out.println("Nhap vao lop cua sach giao khoa: ");
        lop=sc.nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("\n%-15s%-7s\n","Mon hoc","Lop");
        System.out.printf("%-15s%-7s",mon,lop);
    }
}
