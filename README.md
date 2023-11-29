## SystemAnalyst-PBO Tahap 2

PENJELASAN : 
Dengan implementasi kode, kelas-kelas dari class diagram telah berhasil diimplementasikan sebagai berikut:
1. Transaksi Pengembalian : 
•	Kelas ini mempresentasikan transaksi pengembalian buku di perpustakaan.
•	Atribut :
a)	id : Identifikasi unik transaksi.
b)	tanggalPeminjaman : Tanggal peminjaman buku.
c)	tanggalPengembalian : Tanggal pengembalian buku.
d)	waktu : Waktu transaksi.
e)	durasiPeminjaman : Durasi pemninjaman dalam hari.
•	Metode :
f)	catatPengembalian(): Mencatat dan menampilkan informasi transaksi pengembalian

2. TransaksiPeminjaman : 
•	Kelas ini mempresentasikan transaksi peminjaman buku di perpustakaan.
•	Atribut :
a)	id : Identifikasi unik transaksi.
b)	tanggalPeminjaman : Tanggal peminjaman buku.
c)	tanggalPengembalian : Tanggal pengembalian buku
d)	waktu : Waktu transaksi
e)	durasiPeminjaman : Durasi peminjaman dalam hari
f)	anggota: Objek AnggotaPerpustakaan terkait dengan transaksi
g)	buju : Objek Buku terkait dengan transaksi
•	Metode :
a)	catatPeminjaman(): Mencatat dan menampilkan informasi transaksi peminjaman 
b)	catatPengembalian() : Mencatat dan menampilkan informasi transaksi pengembalian
      3. AnggotaPerpustakaan : 
•	Kelas ini mempresentasikan anggota perpustakaan
•	Atribut : 
a)	nama : Nama anggota 
b)	nomorAnggota : Nomor identifikasi anggota
c)	alamat : Alamat anggota
d)	sejarahPeminjaman : Daftar transaksi peminjamnan yang dilakukan anggota
•	Metode :
a)	pinjamBuku () : Melakukan peminjaman buku dan memperbarui sejarah peminjaman
b)	kembalikanBuku() : Melakukan pengembalian buku dan memperbarui sejarah peminjman
          4. Buku : 
•	Kelas ini mempresentasikan informasi tentang buku di perpustakaan
•	Atribut : 
a)	judulBuku : Judul buku
b)	pengarang : pengarang
c)	nomorISBN : nomorISBN
•		Metode :
a)	tambahKoleksi() : Melakukan penambahan buku
b)	cekKetersediaan() : Melakukan pengecekan ketersediaan barang
	
          5. Notifikasi :
•	Kelas ini meimplementasikan notifikasi tentang perpustakaan 
•	Atribut :
a)	id : id
b)	tanggal : tanggal
c)	pesan : pesan 
d)	anggota : anggota
•	   	Metode :
a)	kirimNotifikasiPeminjaman() : Mengirim notifikasi tentang peminjaman buku
b)	kirimNotifikasiPengembalian() : Mengirim notifikasi tentang pengemembalian buku

          6. Admin :
•	Kelas ini merepresentasikan administrator perpustakaan
•	Atribut
a)	id : Identifikasi unik admin
b)	nama : Nama admin
c)	alamat : Alamat admin
d)	nomorTelepon : Nomor telepon admin
•	    	Metode :
a)	login() : Proses login admin
b)	logout() : Proses logout admin

Implementasi kode telah berhasil merealisasikan setiap elemen yang terdapat dalam class diagram. Setiap kelas,atribut, dan metode yang dijabarkan dalam class diagram telah diwujudkan dalam kode program.Selain itu,hubungan antar kelas juga telah terimplementasikan dengan baik,memastikan bahwa setiap transkasi,baik itu peminjaman,pengembalian ,dan notifikasi, dapat dikelola dengan efisien.Keseluruhan,implementasi kode mencerminkan kesesuai yang dengan desain konseptual yang tergambar dalam class diagram.

