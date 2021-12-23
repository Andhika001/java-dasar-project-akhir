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
* Masukkan no rekening tujuan (harus sesuai)<br/>
* Apabila no rekening ada, maka akan muncul nama pemilik rekening<br/>
* Masukkan jumlah uang yang akan ditransfer<br/>
* Transfer berhasil jika saldo pengirim lebih dari jumlah uang<br/>
* Transfer gagal jika saldo pengirim kurang dari jumlah uang<br/>
* Khusus transfer ke Tabungan Hemat tidak boleh melebihi batas<br/>
#### 2. Antar Bank
Cara transfer uang antar bank :<br/>
* Masukkan kode bank (harus sesuai)<br/>
* Masukkan no rekening tujuan (harus sesuai)<br/>
* Masukkan jumlah uang yang akan ditransfer<br/>
* Transfer berhasil jika saldo pengirim lebih dari jumlah uang + 5000<br/>
* Transfer gagal jika saldo pengirim kurang dari jumlah uang  + 5000<br/>

### Riwayat Transaksi
Setiap nasabah bisa melihat riwayat transaksinya, meliputi :
* Setor uang terakhir
* Tarik uang terakhir
* Transfer uang terakhir
* Terima uang terakhir

### Data Semua Nasabah
Admin bisa melihat data semua nasabah terdaftar yang dibagi berdasarkan jenis<br/>
* Nama lengkap
* No rekening
* Saldo saat ini