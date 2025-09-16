Muhammad Rizky Febrianto | 2409116045
# Program Manajemen Surat di Kelurahan

## Deskripsi Singkat

Program Manajemen Surat Kelurahan ini dibuat menggunakan bahasa Java dengan konsep CRUD (Create, Read, Update, Delete) dan menerapkan pola MVC (Model-View-Controller).
Program memungkinkan pengguna untuk:
* Menambahkan surat baru (judul, nomor, tanggal, status).
* Menampilkan daftar surat.
* Mengupdate status surat.
* Menghapus surat.
* Mencari surat berdasarkan nomor.

## Alur Program

Tampilan Menu Utama

<img width="211" height="160" alt="image" src="https://github.com/user-attachments/assets/110331f1-e0ea-41c4-9a0a-9e186a345d2e" />

User diberi pilihan: Tambah Surat, Lihat Daftar Surat, Update, Hapus, Cari Surat, atau Keluar.
Input menu divalidasi agar hanya menerima angka.

<img width="218" height="197" alt="image" src="https://github.com/user-attachments/assets/582007e3-cd08-4cc6-8067-214c46d3b3ad" />


1. Tambah Surat (Create)
   
   <img width="394" height="221" alt="image" src="https://github.com/user-attachments/assets/e571eba1-0eaf-45e0-9ed4-6f4533d2c699" />

* User memasukkan judul, nomor, dan tanggal surat.
* Program memvalidasi: input tidak boleh kosong, nomor surat tidak boleh duplikat.
* Surat baru otomatis diberi status awal "Pending".
* Disimpan ke dalam ArrayList<Surat>.

2. Tampilkan Daftar Surat (Read)
* Jika daftar kosong maka akan tampil pesan "Belum ada surat".

  <img width="205" height="155" alt="image" src="https://github.com/user-attachments/assets/e06de9ee-a798-439c-8686-8fb9833396a2" />

* Jika ada data maka akan tampil detail setiap surat (judul, nomor, tanggal, status).

  <img width="290" height="238" alt="image" src="https://github.com/user-attachments/assets/dde31576-acc0-410c-be31-674d74d47320" />

3. Update Status Surat (Update).

   <img width="361" height="440" alt="image" src="https://github.com/user-attachments/assets/e4f741d3-4f64-4eca-8b13-dd10981bb2fa" />
   
* User memasukkan nomor surat yang ingin diperbarui.
* Jika ketemu maka user bisa mengubah status surat.
* Jika tidak ada maka akan tampil pesan "Surat tidak ditemukan".

4. Hapus Surat (Delete)
   
   <img width="363" height="356" alt="image" src="https://github.com/user-attachments/assets/71329359-db4f-4c66-a3e2-b9f19352297c" />

* User memasukkan nomor surat yang ingin dihapus.
* Jika ketemu maka data surat dihapus dari daftar.
* Jika tidak ketemu maka akan tampil pesan error.

5. Cari Surat (Search)
   
   <img width="327" height="446" alt="image" src="https://github.com/user-attachments/assets/0160312b-aad2-4dd5-b702-b64ba2eee509" />
   
* User memasukkan nomor surat.
* Jika ketemu maka akan tampil detail surat.
* Jika tidak ketemu maka akan tampil pesan "Surat tidak ditemukan".

6. Keluar Program
   
   <img width="524" height="221" alt="image" src="https://github.com/user-attachments/assets/8ce55fa7-d72e-4020-9c90-7eb800036a1b" />

* Program berhenti saat user memilih menu 0.

## Penjelasan Struktur MVC

Program ini dibuat dengan menerapkan konsep MVC yang dipisahkan ke dalam package:

<img width="245" height="145" alt="image" src="https://github.com/user-attachments/assets/d82a0d82-f463-459a-915b-6c004aed3ad1" />

1. Model (model/Surat.java)
* Berisi struktur data Surat.
* Memiliki atribut: judulSurat, nomorSurat, tanggalSurat, dan statusSurat.
* Constructor digunakan untuk menginisialisasi data saat objek surat dibuat.

2. View (view/Main.java)
* Menampilkan menu utama kepada user.
* Mengambil input dari user menggunakan Scanner.
* Meneruskan aksi user ke Service untuk diproses.

3. Controller (controller/Service.java)
* Berisi logika CRUD: tambahSurat(), tampilkanSurat(), updateSurat(), hapusSurat(), dan cariSurat().
* Mengatur bagaimana data surat diolah dan ditampilkan.
* Menghubungkan antara View dan Model.
