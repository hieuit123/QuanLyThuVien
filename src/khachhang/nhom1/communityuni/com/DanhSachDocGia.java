package khachhang.nhom1.communityuni.com;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DanhSachDocGia{
    private Scanner sc;
    private int soluong;
    DocGia[] dg=new DocGia[1000];

    public DanhSachDocGia() {
    }

    public DanhSachDocGia(int soluong) {
        this.soluong = soluong;
        dg = new DocGia[soluong];
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public DocGia[] getDg() {
        return dg;
    }

    public void setDs(DocGia[] dg) {
        this.dg = dg;
    }
    
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void them() {
        System.out.println("Thêm một đọc giả mới:\nNhap vao thong tin doc gia:\n");
        dg[soluong]=new DocGia();
        dg[soluong].nhap();
        ++soluong;
        System.out.println("Them thanh cong");
    }
    
  public  void sua(String ma) {
        System.out.println("Mời bạn nhập thông tin cần sửa:");
        boolean kiemtra = false;
        for(int i=0;i<soluong;i++){
            if(dg[i].maso.equals(ma)){
                DocGia temp = new DocGia();
                temp.nhap();
                dg[i].setMaso(temp.getMaso());
                dg[i].setHoten(temp.getHoten());
                dg[i].setDiachi(temp.getDiachi());
                dg[i].setSodienthoai(temp.getSodienthoai());
                kiemtra = true;
                System.out.println("Sua thanh cong");
                return;
            }
        }
        if (!kiemtra){
            System.out.println("Đọc giả không tồn tại.");
        }
    }

   public void xoa(String ma) {
        for(int i=0;i<soluong;i++){
            if(dg[i].getMaso().equals(ma)){
                for(int k=i;k<soluong-1;k++){
                    dg[k]=dg[k+1];
                }
                --soluong;
                System.out.println("Xoa thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay ma doc gia can xoa trong danh sach");
    }

    public void xuat() {
        System.out.println(">>-----DANH SACH DOC GIA-----<<");
        System.out.println("----------------------------------");
        
        String format = "%-20s%-20s%-20s%-20s\n";
        System.out.printf(format, "Ma doc gia", "Ten doc gia","Dia chi","So dien thoai");
        for (int i = 0; i < soluong; i++) {
            dg[i].xuat();
        
        }
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    public void ghiFile() throws IOException{
        File f = new File("danhsachdocgia.txt");
        if (f==null){
            f.createNewFile();
            
        }
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw;
        bw = new BufferedWriter(fw);
        bw.write(soluong+"");
        bw.newLine();
        for (int i=0;i<soluong;i++){
           bw.write(dg[i].getMaso()+"&");
           bw.write(dg[i].getHoten()+"&");
           bw.write(dg[i].getDiachi()+"&");
           bw.write(dg[i].getSodienthoai()+"");
           bw.newLine();
        }
        bw.close();
    }
    
    
    public int checkMa(String ma){
        for(int i=0;i<soluong;i++){
            if(dg[i].getMaso().equals(ma)){
                
                return i;
            }
        }
        return -1;
    }
    public void docFile() throws IOException{
        try{
        File f=new File("danhsachdocgia.txt");
            FileReader fr=new FileReader(f);
            try (BufferedReader br = new BufferedReader(fr)) {
                soluong= Integer.parseInt(br.readLine());
                for(int i=0;i<soluong;i++){
                    String chuoicon=br.readLine();
                    String[] tachchuoi=chuoicon.split("&");
                    dg[i]=new DocGia();
                    
                    dg[i].setMaso(tachchuoi[0]);
                    dg[i].setHoten(tachchuoi[1]);
                    dg[i].setDiachi(tachchuoi[2]);
                    dg[i].setSodienthoai(tachchuoi[3]);
                }
                br.close();
            }
        }
        catch(FileNotFoundException e ){
            e.getMessage();
        }
       
    }

    public void timkiemMa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void timkiemTen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}