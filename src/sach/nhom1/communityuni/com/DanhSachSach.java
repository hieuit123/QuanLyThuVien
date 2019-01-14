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
import java.util.logging.Level;
import java.util.logging.Logger;
import khachhang.nhom1.communityuni.com.DanhSachPhieuMuon;
import khachhang.nhom1.communityuni.com.Nhap;
import loaisach.nhom1.communityuni.com.SachGiaoKhoa;
import loaisach.nhom1.communityuni.com.Truyen;

/**
 *
 * @author
 */
public class DanhSachSach{
    
    Sach[] ds=new Sach[1000];
    int n;
    
   public void them() {
        System.out.println("Nhap vao thong tin cuon sach thu"+(n+1)+" can them:");
        System.out.println("Chon loai sach ban muon them:\n1:Sach Giao Khoa\n2:Truyen\n3:Sach");
            int k=new Scanner(System.in).nextInt();
            switch(k){
                case 1: ds[n]=new SachGiaoKhoa();
                ds[n].nhap();
                break;
                case 2: ds[n]=new Truyen();
                ds[n].nhap();
                break;
                case 3: ds[n]=new Sach();
                ds[n].nhap();
                break;
                default: System.out.println("Nhap sai!");
            }
      
        ++n;
    }
    public void themNhieu(){
        System.out.println("Nhap vao so cuon sach muon them");
        int k=new Scanner(System.in).nextInt();
        int t=n+k; //Tong 2 so n va k
        for(int i=n;i<t;i++){
            System.out.println("Nhap vao thong tin cuon sach thu "+(i+1));
            System.out.println("Chon loai sach ban muon them:\n1:Sach Giao Khoa\n2:Truyen\n3:Sach");
            int v=new Scanner(System.in).nextInt();
            switch(v){
                case 1: ds[i]=new SachGiaoKhoa();
                ds[i].nhap();
                break;
                case 2: ds[i]=new Truyen();
                ds[i].nhap();
                break;
                case 3: ds[i]=new Sach();
                ds[i].nhap();
                break;
                default: System.out.println("Nhap sai!");
            }
        }
        n=t;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void sua() {
        System.out.println("Nhap vao ma sach can sua:");
        String tempma=new Scanner(System.in).nextLine();
        System.out.println("Nhap vao thong tin can chinh sua lai");
        for(int i=0;i<n;i++){
            if(ds[i].masach.equals(tempma)){
                Scanner sc=new Scanner(System.in);
                String temp="";
                int tempn=0;
                System.out.println("Nhap vao ma sach:");
                temp=sc.nextLine();
                ds[i].setMa(temp);
                System.out.println("Nhap vao ten sach:");
                temp=sc.nextLine();
                ds[i].setTen(temp);
                System.out.println("Nhap vao the loai sach:");
               
                temp=sc.nextLine();
                ds[i].setTheloai(temp);
                System.out.println("Nhap vao nam sang tac:");
                temp=sc.nextLine();
                ds[i].setNam(temp);
                System.out.println("Nhap vao ma loai sach:");
                temp=sc.nextLine();
                ds[i].setMaloaisach(temp);
                System.out.println("Nhap vao ma nha xuat ban:");
                temp=sc.nextLine();
                ds[i].setManxb(temp);
                System.out.println("Nhap vao ma tac gia:");
                temp=sc.nextLine();
                ds[i].setMatacgia(temp);
                System.out.println("Nhap vao don gia sach:");
                tempn=new Scanner(System.in).nextInt();
                ds[i].setDongia(tempn);
                System.out.println("Nhap vao so luong sach:");
                tempn=Nhap.oin.nextInt();
                
                ds[i].setSoluong(tempn);
                
                break;
            }
        }
    }
    public static String timGiasach(String ma) throws IOException{//                            Tìm giá sách bằng mã sách
            if(ma==null) return null;
        
            File f=new File("danhsachsach.txt");
            FileReader fr = new FileReader(f);
        try (BufferedReader br = new BufferedReader(fr)) {
            int soluong=Integer.parseInt(br.readLine());
            
            for(int i=0;i<soluong;i++){
                String chuoicon=br.readLine();
                String[] tachchuoi=chuoicon.split("&");
                if(ma.equals(tachchuoi[0])) {
                    br.close();
                    return tachchuoi[7];
                }
            }
            br.close();
        }
            
        
        return null;
    }
   public void xoa() {
        System.out.println("Nhap vao ma sach can xoa");
        String ma=Nhap.oin.nextLine();
        for(int i=0;i<n;i++){
            if(ds[i].getMa().equals(ma)){
                for(int k=i;k<n-1;k++){
                    ds[i]=ds[i+1];
                }
                --n;
                break;
            }
        }
    }
 
      
    public void timkiemMa(){
        System.out.print("Nhap vao ma so sach ban muon tim kiem: ");
        String ma=Nhap.oi.nextLine();
        for(int i=0;i<n;i++){
            if(ds[i].getMa().equals(ma)){
                System.out.println("<------------------------------------------------------------Ket qua tim kiem---------------------------------------------------------------------------->");
                System.out.printf( "%-17s%-30s%-20s%-12s%-17s%-12s%-17s%-10s%-20s\n","Ma sach","Ten sach","The loai sach","Ma tac gia","Nam sang tac","Ma NXB","Ma loai sach","So luong","Don gia");
                
                ds[i].xuat();
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }
    
    
    public void timkiemTen(){
      System.out.print("Nhap vao ten sach ban muon tim: ");
      String ten=Nhap.oi.nextLine();
        System.out.println("<-------------------------------------------------------------------------Ket qua tim kiem-------------------------------------------------------------------->");
       Boolean k=false;
       System.out.printf( "%-17s%-30s%-20s%-12s%-17s%-12s%-17s%-10s%-20s\n","Ma sach","Ten sach","The loai sach","Ma tac gia","Nam sang tac","Ma NXB","Ma loai sach","So luong","Don gia");
        for(int i=0;i<n;i++){
           
          String temp=ds[i].getTen();
          if(temp.indexOf(ten)!=-1){
              ds[i].xuat();
              k=true;
          }
          
      }
        if(!k) System.out.println("Khong tim thay!");
      
    }
    
    
    
    void nhap() {
        System.out.println("Nhap vao so cuon sach");
        n= Nhap.oin.nextInt();
        
        for(int i=0;i<n;i++){
            
            System.out.println("Chon loai sach ban muon nhap:\n1:Sach Giao Khoa\n2:Truyen\n3:Sach");
            int k=new Scanner(System.in).nextInt();
            switch(k){
                case 1: ds[i]=new SachGiaoKhoa();
                ds[i].nhap();
                break;
                case 2: ds[i]=new Truyen();
                ds[i].nhap();
                break;
                case 3: ds[i]=new Sach();
                ds[i].nhap();
                break;
                default: System.out.println("Nhap sai!");
            }
            
            
            
        }
        
    }

    
    public void xuat() {
        System.out.printf( "%-17s%-30s%-20s%-12s%-17s%-12s%-17s%-10s%-20s\n","Ma sach","Ten sach","The loai sach","Ma tac gia","Nam sang tac","Ma NXB","Ma loai sach","So luong","Don gia");
            for(int i=0;i<n;i++){
                ds[i].xuat();
            }
    }
    public void ghifile() throws IOException{
        File f=new File("danhsachsach.txt");
        if(null==f) f.createNewFile();
        FileWriter fw=new FileWriter(f);
        
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(n+"");//                                                       Dòng đàu tiên ghi vào số lượng sách
            bw.newLine();
            for(int i=0;i<n;i++){
                bw.write(ds[i].getMa()+"&");//                                      Thêm dâu "&" vào để split. (Cắt chuỗi)
                bw.write(ds[i].getTen()+"&");
                bw.write(ds[i].getMatacgia()+"&");
                bw.write(ds[i].getManxb()+"&");
                bw.write(ds[i].getMaloaisach()+"&");
                bw.write(ds[i].getTheloai()+"&");
                bw.write(ds[i].getNam()+"&");
                bw.write(ds[i].getDongia()+"&");
                bw.write(ds[i].getSoluong()+"");
                
                
                bw.newLine();
            }
          
        }
        
    }
   public void docfile() throws FileNotFoundException, IOException{
            
        
            File f=new File("danhsachsach.txt");
            FileReader fr;
            fr = new FileReader(f);
        try (BufferedReader br = new BufferedReader(fr)) {         // Thêm try để phần mềm chạy mượt mà không gặp lỗi file.
            String temp=br.readLine();//                          Đọc số lượng sách trong danh sách; Hàng đầu tiên trong file danh sách chứa số lượng sách
            n=Integer.parseInt(temp);//                           Ép n kiểu String về Int
            for(int i=0;i<n;i++){
                String chuoicon=br.readLine();//                 Đọc các dòng tiếp theo chứa thông tin cuốn sách đó
                String[] tachchuoi=chuoicon.split("&");  //     Split bằng dấu "&"  Tạo một mảng chứa các thông tin đó; Mỗi phần tử của mảng chứa thông tin của một loại thuộc tính
                /* if(tachchuoi[4].equals("TR") ) {
                ds[i]=new Truyen();
                
                }
                if(tachchuoi[4].equals("SGK")) {
                ds[i]=new SachGiaoKhoa();
                }*/
                ds[i]=new Sach();
                ds[i].setMa(tachchuoi[0]);             //  Phần tử thứ 0 chứ dữ liệu của mã sách
                ds[i].setTen(tachchuoi[1]);             // Phần tử thứ 1 chứa dữ liệu của Tên sách Ở dưới tương tự
                ds[i].setMatacgia(tachchuoi[2]);
                ds[i].setManxb(tachchuoi[3]);
                ds[i].setMaloaisach(tachchuoi[4]);
                ds[i].setTheloai(tachchuoi[5]);
                ds[i].setNam(tachchuoi[6]);
                ds[i].setDongia(Integer.parseInt(tachchuoi[7]));
                ds[i].setSoluong(Integer.parseInt(tachchuoi[8]));
            }
          
        }
        
    }
    
}
