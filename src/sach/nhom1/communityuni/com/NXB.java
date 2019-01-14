/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach.nhom1.communityuni.com;

import java.util.Scanner;

/**
 *
 * @author tranm
 */
public class NXB implements NhapXuat{
   protected String ma;
   protected String ten;

    public NXB(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
   public NXB(){
       ma="";
       ten="";
   }
   public NXB(NXB n){
       this.ma=n.ma;
       this.ten=n.ten;
   }
   
   
   
   @Override
   public void nhap(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Nhap vao ma nha xuat ban :");
       ma=sc.nextLine();
       System.out.println("Nhap vao ten nha xuat ban :");
       ten=sc.nextLine();
   }
   @Override
   public void xuat(){
       System.out.printf("%-20s%-20s\n",ma,ten);
   }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
   
}
