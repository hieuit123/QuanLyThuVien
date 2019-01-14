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
public class Truyen extends Sach{
    protected String loaitruyen;
    protected int luatuoi;
    
    public Truyen(){
        super();
        luatuoi=0;
        loaitruyen="";
        
    }
    public Truyen(String ten,String theloai,String nam,String ma, String manxb, String matacgia, String maloaisach, int dongia, int soluong,int luatuoi, String loaitruyen){
        super(ten,theloai, nam, ma, manxb, matacgia,maloaisach,dongia,soluong);
        this.luatuoi=luatuoi;
        this.loaitruyen=loaitruyen;
    }
    public Truyen(Truyen tr){
        super(tr);
        this.loaitruyen=tr.loaitruyen;
        this.luatuoi=tr.luatuoi;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap vao ten loai truyen :");
        loaitruyen = new Scanner(System.in).nextLine();
        System.out.println("Nhap vao lua tuoi khuyen cao");
        luatuoi=new Scanner(System.in).nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.printf("\n%-13s%-20s\n","Loai truyen","Lua tuoi duoc doc");
        System.out.printf("%-13s%-20s",loaitruyen,luatuoi);
    }

    public String getLoaitruyen() {
        return loaitruyen;
    }

    public void setLoaitruyen(String loaitruyen) {
        this.loaitruyen = loaitruyen;
    }

    public int getLuatuoi() {
        return luatuoi;
    }

    public void setLuatuoi(int luatuoi) {
        this.luatuoi = luatuoi;
    }
}
