package khachhang.nhom1.communityuni.com;

import java.util.Scanner;

public class DocGia{
    protected String hoten;
    protected String maso;
    protected String diachi;
    protected String sodienthoai;
    private Scanner sc = new Scanner(System.in);
    
    public DocGia(){
        hoten="";
        maso="";
        diachi="";
        sodienthoai="";
    
    }

  
    
    public DocGia(String hoten, String maso, String diachi, String sodienthoai){
        this.hoten = hoten;
        this.maso = maso;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
    }
    
    public DocGia(DocGia dg){ //CONTRUCTOR COPY
        this.hoten = dg.hoten;
        this.maso = dg.maso;
        this.diachi = dg.diachi;
        this.sodienthoai = dg.sodienthoai;
    }
    
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    
    private void sop(String string){
        System.out.print(string);
    }
    
    public void nhap(){
        System.out.println("Nhap ma doc gia: ");
        maso = Nhap.oi.nextLine();
        
        sop("Nhap ten doc gia: ");
        hoten = Nhap.oi.nextLine();
        
        sop("Nhập dia chi doc gia: ");
        diachi = Nhap.oi.nextLine();
        
        sop("Nhap so dien thoai: ");
        sodienthoai = Nhap.oi.nextLine();
       
    }
    
    public void xuat(){
        System.out.printf("%-20s%-30s%-20s%-20s\n",maso,hoten,diachi,sodienthoai);
    }
}
