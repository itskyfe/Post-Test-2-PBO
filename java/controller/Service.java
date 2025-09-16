package controller;

import model.Surat;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    private ArrayList<Surat> daftarSurat = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void tambahSurat() {
        System.out.print("Masukkan Nama Surat: ");
        String judulSurat = input.nextLine();
        if (judulSurat.isEmpty()){
            System.out.println("Input tidak boleh kosong! Silahkan coba lagi");
            return;
        }

        System.out.print("Masukkan Nomor Surat: ");
        String nomorSurat = input.nextLine();
        if (nomorSurat.isEmpty()){
            System.out.println("Input tidak boleh kosong! Silahkan coba lagi");
            return;
        }else{
            for (Surat s : daftarSurat) {
                if (s.nomorSurat.equalsIgnoreCase(nomorSurat)) {
                    System.out.println("Nomor surat sudah ada! Silahkan coba lagi");
                    return;
                }
            }
        }

        System.out.print("Masukkan Tanggal Masuk Surat (dd/mm/yyyy): ");
        String tanggalSurat = input.nextLine();
        if (tanggalSurat.isEmpty()){
            System.out.println("Input tidak boleh kosong! Silahkan coba lagi");
            return;
        }

        daftarSurat.add(new Surat(judulSurat, nomorSurat, tanggalSurat));
        System.out.println("Surat berhasil ditambahkan");
    }

    public void tampilkanSurat() {
        if (daftarSurat.isEmpty()) {
            System.out.println("Belum ada surat");
        }else{
            for ( Surat i : daftarSurat) {
                System.out.println("Nama Surat : " + i.judulSurat);
                System.out.println("Nomor Surat : " + i.nomorSurat);
                System.out.println("Tanggal Masuk Surat : " + i.tanggalSurat);
                System.out.println("Status Surat : " + i.statusSurat);
                System.out.println("--------------------------");
            }
        }
    }

    public void updateSurat() {
        System.out.print("Masukkan Nomor Surat yang ingin diupdate: ");
        String nomor = input.nextLine();

        for (Surat s : daftarSurat) {
            if (s.nomorSurat.equalsIgnoreCase(nomor)) {
                System.out.print("Masukkan Status Baru: ");
                String statusBaru = input.nextLine();
                if (statusBaru.isEmpty()){
                   System.out.println("Input tidak boleh kosong! Silahkan coba lagi");
                    return;
                }else{
                    s.statusSurat = statusBaru;
                    System.out.println("Status surat berhasil diupdate!");
                    return;
                }
            }
        }
        System.out.println("Surat tidak ditemukan. Silahkan coba lagi");
    }

    public void hapusSurat() {
        System.out.print("Masukkan Nomor Surat yang ingin dihapus: ");
        String nomor = input.nextLine();

        for (int i = 0; i < daftarSurat.size(); i++) {
            if (daftarSurat.get(i).nomorSurat.equalsIgnoreCase(nomor)) {
                daftarSurat.remove(i);
                System.out.println("Surat berhasil dihapus!");
                return;
            }
        }
        System.out.println("Surat tidak ditemukan. Silahkan coba lagi");
    }

    public void cariSurat() {
        System.out.print("Masukkan Nomor Surat yang dicari: ");
        String nomorCari = input.nextLine();

        for (Surat s : daftarSurat) {
            if (s.nomorSurat.equals(nomorCari)) {
                System.out.println("Judul   : " + s.judulSurat);
                System.out.println("Nomor   : " + s.nomorSurat);
                System.out.println("Tanggal : " + s.tanggalSurat);
                System.out.println("Status  : " + s.statusSurat);
                System.out.println("----------------------");
                break;
            }else{
                System.out.println("Surat tidak ditemukan");
            }
        }
    }
}
