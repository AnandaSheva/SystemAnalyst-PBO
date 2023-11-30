## SystemAnalyst-PBO Tahap 2

PENJELASAN :<br>
Dengan implementasi kode, kelas-kelas dari class diagram telah berhasil diimplementasikan sebagai berikut:
1. Transaksi Pengembalian : <br>

•	Atribut :<br>
a)	id : Identifikasi unik transaksi.<br>
b)	tanggalPeminjaman : Tanggal peminjaman buku.<br>
c)	tanggalPengembalian : Tanggal pengembalian buku.<br>
d)	waktu : Waktu transaksi.<br>
e)	durasiPeminjaman : Durasi pemninjaman dalam hari.<br>

•	Metode :<br>
f)	catatPengembalian(): Mencatat dan menampilkan informasi transaksi pengembalian<br>

2. TransaksiPeminjaman : <br>

•	Atribut :<br>
a)	id : Identifikasi unik transaksi.<br>
b)	tanggalPeminjaman : Tanggal peminjaman buku.<br>
c)	tanggalPengembalian : Tanggal pengembalian buku <br>
d)	waktu : Waktu transaksi <br>
e)	durasiPeminjaman : Durasi peminjaman dalam hari <br>
f)	anggota: Objek AnggotaPerpustakaan terkait dengan transaksi <br>
g)	buju : Objek Buku terkait dengan transaksi <br>

•	Metode : <br>
a)	catatPeminjaman(): Mencatat dan menampilkan informasi transaksi peminjaman <br>
b)	catatPengembalian() : Mencatat dan menampilkan informasi transaksi pengembalian <br>

3. AnggotaPerpustakaan : <br>

•	Atribut : <br>
a)	nama : Nama anggota <br>
b)	nomorAnggota : Nomor identifikasi anggota <br>
c)	alamat : Alamat anggota <br>
d)	sejarahPeminjaman : Daftar transaksi peminjamnan yang dilakukan anggota <br>

•	Metode : <br>
a)	pinjamBuku () : Melakukan peminjaman buku dan memperbarui sejarah peminjaman <br>
b)	kembalikanBuku() : Melakukan pengembalian buku dan memperbarui sejarah peminjman <br>

4. Buku : <br>

•	Atribut : <br>
a)	judulBuku : Judul buku <br>
b)	pengarang : pengarang <br>
c)	nomorISBN : nomorISBN <br>

•	Metode : <br>
a)	tambahKoleksi() : Melakukan penambahan buku <br>
b)	cekKetersediaan() : Melakukan pengecekan ketersediaan barang <br>
	

5. Notifikasi : <br>

•	Atribut : <br>
a)	id : id <br>
b)	tanggal : tanggal <br>
c)	pesan : pesan <br>
d)	anggota : anggota <br>

•	Metode : <br>
a)	kirimNotifikasiPeminjaman() : Mengirim notifikasi tentang peminjaman buku <br>
b)	kirimNotifikasiPengembalian() : Mengirim notifikasi tentang pengemembalian buku <br>


6. Admin : <br>

•	Atribut <br>
a)	id : Identifikasi unik admin <br>
b)	nama : Nama admin <br> 
c)	alamat : Alamat admin <br>
d)	nomorTelepon : Nomor telepon admin <br>

•	Metode : <br>
a)	login() : Proses login admin <br>
b)	logout() : Proses logout admin

Implementasi kode telah berhasil merealisasikan setiap elemen yang terdapat dalam class diagram. Setiap kelas,atribut, dan metode yang dijabarkan dalam class diagram telah diwujudkan dalam kode program.Selain itu,hubungan antar kelas juga telah terimplementasikan dengan baik,memastikan bahwa setiap transkasi,baik itu peminjaman,pengembalian ,dan notifikasi, dapat dikelola dengan efisien.Keseluruhan,implementasi kode mencerminkan kesesuai yang dengan desain konseptual yang tergambar dalam class diagram.

