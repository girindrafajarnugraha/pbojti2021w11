/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author INDRAFN
 */
public class Singa extends Binatang implements IKarnivora{
    private String Suara;
    private String warnaBulu;

    public Singa(String Suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.Suara = Suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan: Daging");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Singa");
    }

    public String getSuara() {
        return Suara;
    }

    public void setSuara(String Suara) {
        this.Suara = Suara;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public void setJmlKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }
    
    public void displayData(){
        System.out.println("Jenis: Karnivora");
        this.displayMakan();
        System.out.println("Nama: " + this.getNama());
        System.out.println("Jumlah Kak: " + this.getJmlKaki());
        System.out.println("Suara: " + this.getSuara());
        System.out.println("Warna Bulu: " + this.getWarnaBulu());
        System.out.println();
    }
}
