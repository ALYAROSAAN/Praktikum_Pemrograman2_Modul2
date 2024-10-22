package prak203_2310817320006_AlyaRosaan;

public class Soal3Main {

	public static void main(String[] args) {
		Pegawai p1 = new Pegawai();
		 p1.nama = "Roi"; //kurang titik koma
		 p1.asal = "Kingdom of Orvel"; //harus menggunakan String untuk mendefinisikan variabel asal agar bisa menyimpan teks/kalimat
		 p1.umur = 17; //baris tambahan untuk mengatur nilai dari atribut "umur" pada objek "p1" 
		 			   //karena sebelumnya output untuk informasi umur tidak ditampilkan pada baris kode yang menampilkan informasi umur
		 p1.setJabatan("Assasin");
		 System.out.println("Nama Pegawai: " + p1.getNama());
		 System.out.println("Asal: " + p1.getAsal());
		 System.out.println("Jabatan: " + p1.jabatan);
		 System.out.println("Umur: " + p1.umur + " tahun"); //ditambah kata "tahun" untuk melengkapi output dari informasi umur

	}

}
