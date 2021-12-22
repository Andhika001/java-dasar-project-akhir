# java-dasar-project-akhir
Saya membuat program java perbankan dari materi Java Dasar<br/>
### Akun Admin<br/>
* Nama     : Admin  
* Norek    : 1111  
* Saldo    : 5.000.000  

### Ada 2 jenis tabungan yaitu :
1. Hemat = biaya transfer antar bank hanya Rp2000
2. Bebas = bisa menyimpan saldo lebih dari 5JT

### Fitur Bank
1. Cek saldo beserta info data nasabah
2. Setor Uang
3. Tarik Uang
4. Transfer Uang (Antar Rekening/Antar Bank)
5. Riwayat Transaksi
    * Setoran Terakhir
    * Tarik Uang Terakhir
    * Transfer Terakhir
    * Terima Uang Terakhir
6. Khusus Admin bisa cek semua data nasabah terdaftar
 
### Cek saldo dan info nasabah
1. Jenis Tabungan
2. Nama Lengkap
3. No Rekening
4. Saldo Sekarang

### Setor Uang
Setor uang untuk menambahkan jumlah saldo saat ini dengan uang yang disetor<br/>
Nasabah dengan Tabungan Hemat memiliki batas saldo sebesar 5JT<br/>
Apabila nasabah ingin setor/terima uang lebih dari itu maka tidak bisa

### Tarik Uang
Tarik uang untuk mengurangi jumlah saldo saat ini dengan uang yang ditarik<br/>
Apabila nasabah menarik uang melebihi saldo saat ini maka tidak bisa

### Transfer Uang
Transfer uang adalah transaksi memindahkan uang dari rekening saat ini ke rekening lainnya<br/>
Ada 2 jenis transfer yaitu antar rekening dan antar bank
#### 1. Antar Rekening
Cara transfer uang antar rekening dengan memasukkan no rekening tujuan<br/>
* Apabila no rekening tujuan tidak ada, maka akan kembali ke menu utama<br/>
* Apabila no rekening ada, maka akan muncul nama pemilik rekening<br/>
* Masukkan jumlah uang dan kirim. Transfer berhasil<br/>
* Saldo pengirim akan dikurangi sebesar jumlah uang yang dikirim<br/>
* Saldo penerima akan bertambah sebesar jumlah uang yang diterima<br/>
* Apabila jumlah uang yang dikirim melebihi saldo pengirim, maka Transfer gagal
#### 2. Antar Bank
