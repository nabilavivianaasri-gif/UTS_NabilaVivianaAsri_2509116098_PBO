# 🏋️ Sistem Data Tempat Gym

## 📌 Deskripsi Program
Program Sistem Data Tempat Gym adalah program berbasis Java yang digunakan untuk mengelola data member gym. Program ini menyediakan beberapa fitur utama seperti menambah member, menampilkan data member, mencari member, mengupdate data member, menghapus member, mengurutkan data berdasarkan nama, serta menampilkan ringkasan data gym.

Setiap member memiliki data seperti ID member, nama, usia, jenis member, paket gym, biaya, tanggal daftar, tanggal berakhir, dan status keanggotaan. Jenis member dibagi menjadi Membership Standar dan Membership Premium, sedangkan paket gym terdiri dari Bulanan dan Tahunan.

Program ini juga menerapkan konsep Pemrograman Berorientasi Objek (PBO) seperti encapsulation, inheritance, polymorphism, access modifier, constructor, method overriding, enum, validasi input, dan ArrayList. Polymorphism diterapkan melalui class MemberReguler dan MemberPremium yang melakukan method overriding terhadap method seperti getJenisMember(), getFasilitas(), dan getBiaya().

Secara keseluruhan, program dibuat untuk membantu proses pengelolaan data member gym secara lebih terstruktur, sehingga data dapat ditambah, dicari, diperbarui, dihapus, dan ditampilkan dengan lebih mudah melalui menu.

## 1.Penjelasan Class & Atribut

Program Sistem Data Tempat Gym dibagi menjadi dua package, yaitu main dan model. Masing-masing class memiliki tugas yang berbeda agar program lebih mudah diatur dan dikembangkan.

### Pada Package main terdapat:
### Main
Merupakan class utama yang digunakan untuk memulai dan menjalankan program.
### Pada Package model terdapat:
### DataGym
Digunakan untuk mengelola kumpulan data member gym.
Menyimpan daftar member menggunakan ArrayList.
### Member
Merupakan class induk atau superclass yang menjadi dasar untuk data member.
Menyimpan data umum yang dimiliki oleh member.
### MemberPremium
Merupakan class turunan dari Member.
Digunakan untuk membedakan member yang memilih jenis membership Premium.
### MemberReguler
Merupakan class turunan dari Member.
Digunakan untuk data member dengan jenis membership Reguler/Standar.
### Menu
Bertugas mengatur tampilan menu dan menerima input dari pengguna.
### PaketGym
Digunakan untuk mengatur informasi mengenai paket gym yang tersedia, seperti paket Bulanan dan Tahunan.

## 2.Penjelasan Tiap Class
### Main
Class Main merupakan bagian pertama yang dijalankan ketika program dimulai.
Class ini digunakan untuk memanggil dan menjalankan Menu, sehingga pengguna dapat langsung melihat pilihan menu sistem gym.
Jadi, Main dapat dianggap sebagai titik awal dari keseluruhan program.
### Member
Class Member digunakan untuk menyimpan data dasar yang dimiliki oleh seorang member gym.
Class ini berperan sebagai superclass yang menjadi dasar bagi MemberReguler dan MemberPremium.
Di dalamnya terdapat atribut dan method untuk mengatur informasi member, seperti ID, nama, usia, paket, dan biaya.
Class ini juga menerapkan encapsulation melalui penggunaan access modifier dan getter/setter.
Terdapat validasi pada data tertentu agar informasi yang dimasukkan tidak sembarangan.
### MemberReguler
MemberReguler merupakan subclass dari class Member.
Class ini digunakan untuk membedakan member yang menggunakan jenis Membership Reguler/Standar.
Data dasar tetap mengambil dari class Member, sedangkan informasi mengenai jenis membership disesuaikan dengan member reguler.
Class ini juga menjadi salah satu contoh penerapan inheritance dan polymorphism dalam program.
### MemberPremium
MemberPremium juga merupakan class turunan dari Member.
Class ini digunakan untuk menangani member yang memilih Membership Premium.
Selain mewarisi data dari class Member, class ini memiliki pengaturan biaya yang berbeda karena terdapat biaya tambahan untuk membership Premium.
Class ini juga menerapkan method overriding, sehingga beberapa perilaku dari class induk dapat disesuaikan dengan kebutuhan member Premium.
### DataGym
Class DataGym berfungsi sebagai pusat pengelolaan data member yang digunakan oleh program.
Data member disimpan menggunakan ArrayList, sehingga program dapat menampung banyak data member sekaligus.
Class ini menangani proses seperti menambah, menampilkan, mencari, mengubah, dan menghapus data member.
Selain itu, class ini juga digunakan untuk proses pengurutan dan menampilkan ringkasan data gym.
Penggunaan ArrayList di sini sesuai karena DataGym memang bertugas sebagai tempat pengelolaan kumpulan objek Member.
### Menu
Class Menu digunakan untuk mengatur interaksi antara pengguna dengan sistem.
Di dalamnya terdapat Scanner yang digunakan untuk menerima input dari pengguna melalui keyboard.
Class ini menampilkan beberapa pilihan, seperti Tambah Member, Tampilkan Semua Member, Cari Member, Update Member, Hapus Member, Urutkan Member, Ringkasan Data, dan Keluar.
Menu menggunakan perulangan agar pengguna dapat melakukan beberapa proses tanpa harus menjalankan program dari awal.
Perulangan akan berhenti ketika pengguna memilih menu Keluar.
### PaketGym
Class PaketGym digunakan untuk mengatur informasi yang berkaitan dengan paket gym.
Class ini membantu program dalam membedakan pilihan paket yang tersedia, seperti Bulanan dan Tahunan.
Dengan adanya class ini, pengelolaan informasi paket menjadi lebih terpisah dari data member sehingga struktur program lebih rapi dan mudah dipahami.

## 3.Encapsulation dan Inheritance


<img width="505" height="142" alt="image" src="https://github.com/user-attachments/assets/877ddfd6-4e46-4128-85be-569c38fdfd03" />



Pada class Member, encapsulation diterapkan dengan menggunakan access modifier private pada atribut seperti nama, usia, paket, dan biaya. Data tersebut tidak dapat diakses secara langsung dari luar class, sehingga untuk mengambil atau mengubah datanya digunakan getter dan setter. Setter juga digunakan untuk melakukan validasi agar data yang dimasukkan sesuai dengan aturan program. Dengan begitu, data member menjadi lebih aman dan terkontrol.


<img width="305" height="98" alt="image" src="https://github.com/user-attachments/assets/e961ae99-3091-4dbd-b64e-cb747432d291" />



Pada class PaketGym, encapsulation digunakan untuk mengatur data yang berkaitan dengan paket gym agar tidak dapat diubah secara langsung dari luar class. Informasi seperti nama paket dan biaya dikelola melalui method yang tersedia di dalam class. Dengan cara ini, pengelolaan paket Bulanan dan Tahunan menjadi lebih teratur dan data yang digunakan oleh program dapat dikontrol dengan baik.

# 4. Alur Program

<img width="222" height="185" alt="image" src="https://github.com/user-attachments/assets/600cdd39-3e5b-42e4-97b5-45f5392fe623" />

Program dimulai dengan menampilkan judul Sistem Data Tempat Gym kemudian sistem menyiapkan data awal yang akan digunakan. Setelah data siap, program menampilkan menu utama yang berisi jumlah member dan pilihan proses yang dapat dilakukan.

Pengguna dapat memilih untuk menambah, menampilkan, mencari, memperbarui, atau menghapus data member. Selain itu, terdapat menu Ringkasan Data Gym untuk melihat informasi jumlah member berdasarkan status dan jenis membership. Setelah proses selesai, program akan kembali ke menu utama sehingga pengguna dapat melakukan proses lainnya.

Program akan terus berjalan selama pengguna masih memilih menu yang tersedia. Jika pengguna memilih Keluar, maka perulangan menu dihentikan dan program selesai dijalankan.

### 1.Tambah Member

<img width="323" height="325" alt="image" src="https://github.com/user-attachments/assets/f4e74aac-1f54-4bee-91af-430e4c03ad39" />


Pada proses ini, pengguna memilih menu Tambah Member kemudian memasukkan nama dan usia member. Setelah itu, program menampilkan pilihan jenis membership, yaitu Membership Standar dan Membership Premium beserta fasilitas yang diperoleh. Pengguna memilih Membership Premium, sehingga mendapatkan fasilitas tambahan dan biaya tambahan sebesar Rp500.000.

Selanjutnya, pengguna memilih paket gym Bulanan dengan biaya Rp350.000. Setelah semua data diisi, sistem menyimpan data member dan membuat ID member secara otomatis, yaitu GYM003. Program kemudian menampilkan hasil data member berupa jenis membership, paket yang dipilih, total biaya sebesar Rp850.000, serta tanggal berlakunya membership.

<img width="253" height="84" alt="image" src="https://github.com/user-attachments/assets/a650c3e0-5f0f-41bf-9abc-39edbb4fb79f" />


Program melakukan validasi pada nama dan usia. Nama harus berupa huruf, sedangkan usia harus berada di antara 15–100 tahun. Jika input tidak sesuai, program akan menolak dan meminta pengguna memasukkan data kembali.

### 2. Menampilkan Semu Member

<img width="213" height="361" alt="image" src="https://github.com/user-attachments/assets/378f784b-b9e5-4def-8db0-6a89766352d3" />

Pada menu ini, program menampilkan seluruh data member gym yang sudah tersimpan. Pengguna dapat memilih urutan tampilan berdasarkan ID atau nama. Data yang ditampilkan meliputi nama, usia, jenis member, paket, biaya, tanggal daftar, masa berlaku, dan status member lalu kembali ke menu utama.

<img width="224" height="219" alt="image" src="https://github.com/user-attachments/assets/95a34b9a-5bc0-4f5b-815c-9213ffead170" />

jika memilih mengurutkan berdasarkan nama program akan menampilkan data member berdasarkan urutan nama a-z

## 3. Cari Member

<img width="208" height="179" alt="image" src="https://github.com/user-attachments/assets/f5ddcd4f-eb5b-48f7-8563-ec9605553345" />

Pada menu ini, pengguna memilih pencarian berdasarkan nama dan memasukkan kata kunci “Vivi”. Program kemudian mencari data yang sesuai dan menemukan 1 member, yaitu Vivi dengan ID GYM003. Hasil pencarian menampilkan data lengkap member seperti usia, jenis membership, paket, biaya, tanggal daftar, masa berlaku, dan status lalu kembali ke menu utama.

<img width="195" height="80" alt="image" src="https://github.com/user-attachments/assets/353a6d84-6783-407a-a5a4-e43e3393fc9a" />

Penjelasan Validasi Pencarian

Pada proses ini, pengguna salah memasukkan pilihan menu dengan angka 3, sehingga program meminta pilihan kembali dengan rentang 1–2. Setelah memilih pencarian berdasarkan nama, pengguna memasukkan kata kunci “324”, tetapi data dengan nama tersebut tidak ditemukan.

## 4. Update Member

<img width="278" height="368" alt="image" src="https://github.com/user-attachments/assets/91d4e992-1d8b-4002-a310-1c8de0388e48" />

Pada proses ini, pengguna memilih menu Update Member dan memasukkan ID GYM007 untuk mencari data yang ingin diubah. Program menampilkan data lama, kemudian pengguna memasukkan data baru berupa nama Jule, usia 23 tahun, jenis member Premium, dan paket gym yang dipilih. Setelah semua data selesai diisi, pengguna mengonfirmasi perubahan dengan memilih Y, sehingga sistem menyimpan dan memperbarui data member tersebut lalu kembali ke menu utama.

<img width="308" height="231" alt="image" src="https://github.com/user-attachments/assets/0f9c05fc-3d5c-4013-a92f-dfe6a3056a7c" />

Penjelasan Validasi Update Member

Pada proses ini, pengguna memilih menu Update Member lalu memasukkan ID member. Saat memasukkan d, sistem menolak karena format ID harus sesuai, contohnya GYM001. Setelah memasukkan GYM005, sistem kembali menolak karena ID tersebut tidak ditemukan, sehingga proses update dibatalkan dan program kembali ke menu utama.

## 5. Hapus Member


<img width="287" height="274" alt="image" src="https://github.com/user-attachments/assets/6c28587d-66d5-46f3-a345-57757d34bee0" />


Pada proses ini, pengguna memilih menu Hapus Member dan memasukkan ID GYM007. Program menampilkan data member yang akan dihapus, kemudian meminta konfirmasi dari pengguna. Setelah pengguna memilih Y, sistem menghapus data tersebut dan menampilkan pesan bahwa data member berhasil dihapus. Setelah itu, program kembali ke menu utama.

<img width="266" height="47" alt="image" src="https://github.com/user-attachments/assets/86413e08-4491-4afc-bdce-7ad4fd70b90f" />

Penjelasan Validasi Hapus Member

Pada proses ini, pengguna memasukkan ID GYM005 untuk dihapus. Namun, ID tersebut tidak ditemukan dalam data member, sehingga sistem menampilkan pesan “ID member tidak ditemukan” dan proses penghapusan tidak dapat dilakukan.

## 6. Ringkasan Data Gym

<img width="206" height="131" alt="image" src="https://github.com/user-attachments/assets/72c9b3ed-49d4-4881-878c-0416b20f26bb" />

Pada menu Ringkasan Data Gym, program menampilkan rangkuman keseluruhan data member yang tersimpan. Informasi yang ditampilkan meliputi total member, jumlah member aktif, jumlah member reguler dan premium, jumlah paket bulanan dan tahunan, serta total nilai membership. Setelah ringkasan ditampilkan, program kembali ke menu utama.

## 7. Keluar

<img width="418" height="125" alt="image" src="https://github.com/user-attachments/assets/cf5df089-bac1-4e61-a99f-62fe35a588f3" />

Pada proses ini, pengguna memilih menu 7. Keluar. Program kemudian menghentikan sistem dan menampilkan pesan bahwa program telah ditutup. Setelah itu, proses program selesai dan muncul keterangan BUILD SUCCESS yang menunjukkan bahwa program berhasil dijalankan tanpa error.

Penjelasan Validasi Menu

Pada proses ini, pengguna memasukkan pilihan menu 8, sedangkan menu yang tersedia hanya dari 1–7. Program menolak input tersebut dan menampilkan pesan bahwa nilai harus berada di antara 1 dan 7, kemudian pengguna diminta memasukkan pilihan yang benar.

# 5.Nilai Tambah

1. Polymorphism

Polymorphism diterapkan menggunakan method overriding pada class MemberReguler dan MemberPremium. Kedua class tersebut memiliki method yang berasal dari class Member dan dapat memberikan perilaku yang berbeda sesuai jenis membership. Dengan demikian, program dapat menangani member Reguler dan Premium dengan cara yang berbeda meskipun berasal dari class induk yang sama.

2. Access Modifier

Program menerapkan beberapa access modifier seperti private dan public. Access modifier private digunakan untuk membatasi akses terhadap atribut tertentu, sedangkan public digunakan pada class atau method yang perlu diakses dari class lain. Penggunaan access modifier membantu mengatur hak akses setiap bagian program.

3. Encapsulation

Encapsulation diterapkan dengan menyembunyikan data tertentu di dalam class menggunakan access modifier private. Data tersebut kemudian diakses melalui getter dan setter. Selain itu, terdapat penggunaan private final pada data tertentu seperti idMember dan tanggalDaftar, sehingga nilainya tidak dapat diubah setelah ditentukan.

4. Validasi Input

Program menerapkan validasi input untuk mencegah pengguna memasukkan data yang tidak sesuai. Validasi diterapkan pada input seperti nama, usia, ID member, pilihan jenis membership, pilihan paket, dan pilihan menu. Jika input tidak sesuai dengan ketentuan, program akan menampilkan pesan kesalahan dan meminta pengguna memasukkan data yang benar kembali.


