package model;

public class Surat {
    public String judulSurat, nomorSurat, tanggalSurat, statusSurat;
    
    public Surat(String judulSurat, String nomorSurat, String tanggalSurat) {
        this.judulSurat = judulSurat;
        this.nomorSurat = nomorSurat;
        this.tanggalSurat = tanggalSurat;
        this.statusSurat = "Pending";
    }
}
