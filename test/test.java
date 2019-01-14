
import java.io.IOException;
import khachhang.nhom1.communityuni.com.DanhSachPhieuPhat;
import sach.nhom1.communityuni.com.DanhSachPhieuNhap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vienthong
 */
public class test {
    public static void main(String[] args) throws IOException{
       DanhSachPhieuNhap ds=new DanhSachPhieuNhap();
       
       ds.nhap();
       ds.xuat();
       ds.ghiFile();
    }
    
}
