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
public class TacGia implements NhapXuat{
    protected String ma;
   protected String ten;
   
   public TacGia()
   {
       ma="";
       ten="";
   }
   public TacGia(String ma,String ten)
   {
       this.ma=ma;
       this.ten=ten;
   }
   public TacGia(TacGia tg)
   {
       this.ma=tg.ma;
       this.ten=tg.ten;
   }
   
    @Override
   public void nhap(){
       
       System.out.println("Nhap vao ma tac gia :");
       ma=Nhap.oi.nextLine();
       System.out.println("Nhap vao ten tac gia :");
       ten=Nhap.oi.nextLine();
   }
   
    @Override
   public void xuat(){
       System.out.printf("%-20s%-20s\n",ma,ten);
   }
   
   public String getMa()
   {
       return ma;
   }
   public void setMa(String ma)
   {
       this.ma=ma;
   }
   
   public String getTen()
   {
       return ten;
   }
   public void setTen(String ten)
   {
       this.ten=ten;
   }
}
