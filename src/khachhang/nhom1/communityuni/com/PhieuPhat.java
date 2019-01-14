/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang.nhom1.communityuni.com;

/**
 *
 * @author vienthong
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tranq
 */
import java.io.IOException;
import java.util.Scanner;
import khachhang.nhom1.communityuni.com.DanhSachPhieuMuon;
import sach.nhom1.communityuni.com.DanhSachSach;
public class PhieuPhat {
    protected String maphieuphat;
    protected String maphieumuon;
    protected int tongtienphat;
    protected int mucdohong;
    protected int soluong;
    
    public PhieuPhat()
    {
        
        maphieuphat="";
        maphieumuon="";
        tongtienphat=0;
        mucdohong=0;
        soluong=0;
    }
    
    public PhieuPhat(String maphieuphat, String maphieumuon, int tongtienphat, int mucdohong,int soluong)
    {
        
        this.maphieuphat=maphieuphat;
        this.maphieumuon=maphieumuon;
        this.tongtienphat=tongtienphat;
        this.mucdohong=mucdohong;
        this.soluong=soluong;
    }
    
    public PhieuPhat(PhieuPhat p)
    {
        
        this.maphieuphat=p.maphieuphat;
        this.maphieumuon=p.maphieumuon;
        this.tongtienphat=p.tongtienphat;
        this.mucdohong=p.mucdohong;
        this.soluong=p.soluong;
    }
    
    public void nhap() throws IOException
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao ma phieu muon: ");
        maphieumuon=sc.nextLine();
        if(!DanhSachPhieuMuon.checkMa(maphieumuon)){
            System.out.println("Ma phieu muon khong ton tai!");
            return;
        }
        System.out.print("Nhap vao ma phieu phat: ");
        maphieuphat=sc.nextLine();
        
        Scanner sb= new Scanner(System.in);
        System.out.print("Muc do hu hong: ");
        //Note
        System.out.print("1.Dơ sách: 5.000đ" + "\n2.Rách sách: 20.000đ" + "\n3.Mất sách: Giá sách cho mượn\n");
        //Nhap vao du li
        mucdohong=sb.nextInt();
        System.out.print("Nhap vao so luong sach: ");
        soluong=sb.nextInt();
        tongtienphat=soluong*giaPhat(mucdohong);
       
        
    }
    
    public int giaPhat(int mucdo) throws IOException
    {
        String masach=DanhSachPhieuMuon.timMasach(maphieumuon);
       String giasach=DanhSachSach.timGiasach(masach);
        int gia=Integer.parseInt(giasach);
        System.out.println(masach);
        switch(mucdo)
        {
            case 1: return 5000;
            case 2: return 20000;
            case 3: return gia;
        }
        return 0;
    }
    
    public void xuat()
    {
        System.out.printf("%-20s%-20s%-17s%-17s%-25s",maphieumuon,maphieuphat,mucdohong,soluong,tongtienphat);
    }

    //get,setMaphieuphat
    public String getMaphieuphat()
    {
        return maphieuphat;
    }
    public void setMaphieuphat(String maphieuphat)
    {
        this.maphieuphat=maphieuphat;
    }

    //get,setMaphieumuon
    public String getMaphieumuon()
    {
        return maphieumuon;
    }
    public void setMaphieumuon(String maphieumuon)
    {
        this.maphieumuon=maphieumuon;
    }
    
    //get,setSoluong
    public int getSoluong()
    {
        return soluong;
    }
    public void setSoluong(int soluong)
    {
        this.soluong=soluong;
    }

    //get,setMucdohong
    public int getMucdohong()
    {
        return mucdohong;
    }
    public void setMucdohong(int mucdohong)
    {
        this.mucdohong=mucdohong;
    }

    //get,setTongtienphat
    public int getTongtienphat()
    {
        return tongtienphat;
    }
    public void setTongtienphat(int tongtienphat)
    {
        this.tongtienphat=tongtienphat;
    }

}

