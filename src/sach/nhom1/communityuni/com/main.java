/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach.nhom1.communityuni.com;

import java.io.IOException;
import java.util.Scanner;
import khachhang.nhom1.communityuni.com.DanhSachDocGia;
import khachhang.nhom1.communityuni.com.DanhSachPhieuMuon;
import khachhang.nhom1.communityuni.com.DanhSachPhieuPhat;
import khachhang.nhom1.communityuni.com.Nhap;

/**
 *
 * @author tranm
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        DanhSachSach ds=new DanhSachSach();
        ds.docfile();
        DanhSachPhieuMuon dspmuon=new DanhSachPhieuMuon();
        dspmuon.docFile();
        DanhSachDocGia dsdocgia=new DanhSachDocGia();
        dsdocgia.docFile();
        DanhSachTacGia dstacgia=new DanhSachTacGia();
        dstacgia.docFile();
        DanhSachLoaiSach dsloaisach=new DanhSachLoaiSach();
        dsloaisach.docFile();
        DanhSachPhieuNhap dsnhap=new DanhSachPhieuNhap();
        dsnhap.docFile();
        DanhSachPhieuPhat dspphat=new DanhSachPhieuPhat();
        dspphat.docFile();
        DanhSachNXB dsnxb=new DanhSachNXB();
        dsnxb.docFile();
        DanhSachNhaCungCap dsnhacungcap=new DanhSachNhaCungCap();
        dsnhacungcap.docFile();
               
        int k=0;
        System.out.print("-------------------Quan ly thu vien--------------------\n");
        
        while(k<10){
        System.out.print("Nhap vao lua chon:\n1:Quan ly sach\n2:Quan ly doc gia\n3:Quan ly muon tra sach\n4:Quan ly phat tien\n5:Quan ly tac gia\n6:Quan ly nha xuat ban\n7:Quan ly nha cung cap\n8Quan ly nhap hang\n9:Thoat\n");
        k=new Scanner(System.in).nextInt();   
        switch(k){
            //Quan ly sach
            case 1:
                int t=0;
                while(t<7){
                System.out.println("Nhap vao lua chon:\n1:Them sach\n2:Them nhieu sach\n3:Xoa sach\n4:Sua thong tin sach\n5:Xuat danh sach\n6:Thong ke\n7:Tim kiem theo ma sach\n8:Tim kiem theo ten sach\n9:Thoat");
                t=new Scanner(System.in).nextInt();
                switch(t){
                    case 1:
                        ds.them();
                        
                        break;
                    case 2:
                        ds.themNhieu();
                        
                        break;
                    case 3:
                        ds.xoa();
                        
                        break;
                    case 4:
                        ds.sua();
                        break;
                    case 5: 
                        ds.xuat();
                        break;
                    case 6:
                        
                        break;
                    case 7:
                        ds.timkiemMa();
                        break;
                    case 8:
                        ds.timkiemTen();
                        break;
                    case 9:t=10;
                    System.out.print("Ban co muon luu lai?\n1:Co\n2:Khong\n");
                        int tam=new Scanner(System.in).nextInt();
                        if(tam==1) ds.ghifile();
                    break;
                }
                }
            break;
            //end quan ly sach
            //Quan ly doc gia
            case 2:
                int temp=0;
                
               while(temp<8){
                System.out.print("\nNhap vao lua chon cua ban:\n1:Them doc gia moi\n2:Xoa doc gia\n3:Sua doc gia\n4:Danh sach doc gia\n5:Tim kiem theo ma doc gia\n6:Tim kiem theo ten doc gia7:Thoat\n");
                temp=Nhap.oin.nextInt();
                switch(temp){
                    case 1:dsdocgia.them();
                    break;
                    case 2:
                        System.out.println("Nhap vao ma doc gia can xoa:");
                        String ma=Nhap.oi.nextLine();
                        dsdocgia.xoa(ma);
                        break;
                    case 3:
                        System.out.println("Nhap vao ma doc gia can sua");
                        ma=Nhap.oi.nextLine();    
                        dsdocgia.sua(ma);
                        break;
                    case 4: dsdocgia.xuat();
                    
                    break;
                    case 5:
                        dsdocgia.timkiemTen();
                        break;
                    case 6:
                        dsdocgia.timkiemMa();
                        break;
                    case 7: temp=9;
                        System.out.print("Ban co muon luu lai?\n1:Co\n2:Khong\n");
                        int tam=new Scanner(System.in).nextInt();
                        if(tam==1) dsdocgia.ghiFile();
                        break;
                }
               }
                
                
                break;
            // end quan ly doc gia
            //Quan ly muon tra sach
            case 3:
                int tam=0;
                while(tam<5){
                    System.out.println("Nhap vao lua chon cua ban:\n1:Them phieu muon\n2:Danh dau tra sach\n3:Danh sach phieu muon\n4:Xoa phieu muon\n5:Thoat\n");
                    tam=new Scanner(System.in).nextInt();
                    switch(tam){
                        case 1:
                            dspmuon.them();
                            System.out.println("Them thanh cong!\n");
                            break;
                        case 2:
                           dspmuon.traSach();
                            break;
                        case 3:
                            dspmuon.xuat();
                            break;
                        case 4:
                            dspmuon.xoa();
                        case 5:
                            tam=6;
                            System.out.print("Ban co muon luu lai?\n1:Co\n2:Khong\n");
                        int tam1=new Scanner(System.in).nextInt();
                        if(tam1==1) dspmuon.ghiFile();
                            break;
                    }
                }
                
                break;
                
            case 4://                                                                   Quản lý phạt tiền
                int tam4=0;
                while(tam4<5){
                    System.out.println("Nhap vao lua chon cua ban:\n1:Them phieu phat\n2:Xoa phieu phat\n3:Danh sach phieu phat\n4:Thoat");
                    tam4=Nhap.oin.nextInt();
                    switch(tam4){
                        case 1:
                            dspphat.them();
                            break;
                        case 2: 
                            dspphat.xoa();
                            break;
                        case 3:
                            dspphat.xuat();
                            break;
                        case 4:
                            tam4=6;
                            
                            break;
                    }
                }
                break;
            case 5:
                int tam5=0;
                while(tam5<5){
                    System.out.println("Nhap vao lua chon cua ban:\n1:Them tac gia\n2:Xoa tac gia\n3:Danh sach tac gia\n4:Thoat");
                    tam5=Nhap.oin.nextInt();
                    switch(tam5){
                        case 1: dstacgia.them();
                        break;
                        case 2:
                            dstacgia.xoa();
                            break;
                        case 3:dstacgia.xuat();
                        break;
                        case 4: tam5=6;
                        break;
                            
                    }
                }
                    break;
            case 6://Quan ly nha xuat ban
                int tam6=0;
                while(tam6<5){
                    System.out.println("Nhap vao lua chon cua ban:\n1:Them nha xuat ban\n2:Xoa nha xuat ban\n3:Danh sach nha xuat ban\n4:Thoat");
                    tam6=Nhap.oin.nextInt();
                    switch(tam6){
                        case 1:dsnxb.them();
                        break;
                        case 2:dsnxb.xoa();
                        break;
                        case 3: dsnxb.xuat();
                        break;
                        case 4: tam6=7;
                        System.out.print("Ban co muon luu lai?\n1:Co\n2:Khong\n");
                       int ncheck=new Scanner(System.in).nextInt();
                        if(ncheck==1) dsnxb.ghiFile();
                        break;
                    }
                    }
                break;
                case 7://Quan ly nha cugn ccap
                int tam7=0;
                while(tam7<5){
                    System.out.println("Nhap vao lua chon cua ban:\n1:Them nha cung cap\n2:Xoa nha cung cap\n3:Danh sach nha cung cap\n4:Thoat");
                    tam6=Nhap.oin.nextInt();
                    switch(tam6){
                        case 1:dsnhacungcap.them();
                        break;
                        case 2:dsnhacungcap.xoa();
                        break;
                        case 3: dsnhacungcap.xuat();
                        break;
                        case 4: tam7=7;
                         System.out.print("Ban co muon luu lai?\n1:Co\n2:Khong\n");
                       int ncheck=new Scanner(System.in).nextInt();
                        if(ncheck==1) dsnhacungcap.ghiFile();
                        break;
                    }
                    }
                break;
            // exit
            case 9: k=11; 
            break;
               
        }
        }
        
       
   }
}
    

