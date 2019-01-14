/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach.nhom1.communityuni.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author tranq
 */
public class DanhSachPhieuNhap {
    PhieuNhap[] ds = new PhieuNhap[1000];
    int n;
    
    public void nhap()
    {
        System.out.println("Nhap so luong phieu nhap: ");
        n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap vao thong tin phieu nhap thu "+(i+1));
            ds[i]=new PhieuNhap();
            ds[i].nhap();
        }
    }
    public void xuat()
    {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n","Ma phieu nhap", "Ma sach", "Ma nha cung cap", "Ngay nhap", "Don gia", "So luong","Thanh tien");
        for(int i=0;i<n;i++)
        {
            ds[i].xuat();
        }
    }
    
    public void ghiFile() throws IOException
    {
        File f=new File("danhsachphieunhap.txt");
        if(f==null)
        {
            f.createNewFile();
        }
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(n+"");
        bw.newLine();
        for(int i=0;i<n;i++)
        {
            bw.write(ds[i].getMaphieunhap()+"&");
            bw.write(ds[i].getMasach()+"&");
            bw.write(ds[i].getManhacungcap()+"&");
            bw.write(ds[i].getNgaynhap()+"&");
            bw.write(ds[i].getDongia()+"&");
            bw.write(ds[i].getSoluong()+"&");
            bw.write(ds[i].getThanhtien()+"");
        }
        bw.close();
    }
    
    public void docFile() throws IOException
    {
        try
        {
            File f=new File("danhsachphieunhap.txt");
            FileReader fr=new FileReader(f);
            try(BufferedReader br = new BufferedReader(fr);){
                n=Integer.parseInt(br.readLine());
                for(int i=0;i<n;i++)
                {
                    String chuoicon= br.readLine();
                    String[] tachchuoi=chuoicon.split("&");
                    
                    ds[i]=new PhieuNhap();
                    ds[i].setMaphieunhap(tachchuoi[0]);
                    ds[i].setMasach(tachchuoi[1]);
                    ds[i].setManhacungcap(tachchuoi[2]);
                    ds[i].setNgaynhap(tachchuoi[3]);
                    ds[i].setDongia(Integer.parseInt(tachchuoi[4]));
                    ds[i].setSoluong(Integer.parseInt(tachchuoi[5]));
                    ds[i].setThanhtien(Integer.parseInt(tachchuoi[6]));
                }
                br.close();
            }
        }
        catch(FileNotFoundException e)
        {
            e.getMessage();
        }
    }
}
