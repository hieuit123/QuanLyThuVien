/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang.nhom1.communityuni.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author vienthong
 */
public class HamNhapGhiFile {
    
    File f;
    FileWriter fw;
    FileReader fr;
    BufferedReader br;
    BufferedWriter bw;
    public void moFile(String tenfile) throws IOException{
        f=new File(tenfile);
        if(f==null) f.createNewFile();
    }
    public void dongFile() throws IOException{
        bw.close();
        br.close();
    }
    public void docFile() throws FileNotFoundException{
        fr=new FileReader(f);
        br=new BufferedReader(fr);
    }
    public void ghiFile() throws IOException{
        fw=new FileWriter(f);
        bw=new BufferedWriter(fw);
    }
    public void ghiFilePhieuMuon(PhieuMuon[] p,int n) throws IOException{
        moFile("danhsachphieumuon.txt");
        
        ghiFile();
        bw.write(n+"");
        bw.newLine();
        
        for(int i=0;i<n;i++){
            bw.write(p[i].getMaphieumuon()+"&");
            bw.write(p[i].getMadg()+"&");
            bw.write(p[i].getMasach()+"&");
            bw.write(p[i].getNgaymuon()+"&");
            bw.write(p[i].getNgaytra()+"&");
            bw.write(p[i].getSoluong()+"&");
            bw.write(p[i].getTrangthai()+"");
            bw.newLine();
        }
        
            bw.close();
        
    }
    int soluongphieumuon;
    public void docFilePhieuMuon(PhieuMuon[] p) throws IOException{
        moFile("danhsachphieumuon.txt");
        docFile();
        soluongphieumuon=Integer.parseInt(br.readLine()+"");
        for(int i=0;i<soluongphieumuon;i++){
            p[i]=new PhieuMuon();
             String chuoicon=br.readLine();
                String[] tachchuoi=chuoicon.split("&");
            p[i].setMaphieumuon(tachchuoi[0]);
            p[i].setMadg(tachchuoi[1]);
            p[i].setMasach(tachchuoi[2]);
            p[i].setNgaymuon(tachchuoi[3]);
            p[i].setNgaytra(tachchuoi[4]);
            p[i].setSoluong(Integer.parseInt(tachchuoi[5]));
            p[i].setTrangthai(tachchuoi[6]);
        }
        br.close();
    }

    public int getSoluongphieumuon() {
        return soluongphieumuon;
    }

    public void setSoluongphieumuon(int soluongphieumuon) {
        this.soluongphieumuon = soluongphieumuon;
    }
    
}
