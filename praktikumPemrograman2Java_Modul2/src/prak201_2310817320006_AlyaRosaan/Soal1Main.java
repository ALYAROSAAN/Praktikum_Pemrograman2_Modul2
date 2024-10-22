package prak201_2310817320006_AlyaRosaan;

public class Soal1Main {

	public static void main(String[] args) {
		Buah b1 = new Buah();
		b1.nama = "Apel";
		b1.berat = 0.4;
		b1.harga = 7000;
		b1.jumlahBeli = 40.0;
		
		Buah b2 = new Buah();
		b2.nama = "Mangga";
		b2.berat = 0.2;
		b2.harga = 3500;
		b2.jumlahBeli = 15.0;
		
		Buah b3 = new Buah();
		b3.nama = "alpukat";
		b3.berat = 0.25;
		b3.harga = 10000.0;
		b3.jumlahBeli = 12.0; 
		
		b1.tampilkanInfo();
		b2.tampilkanInfo();
		b3.tampilkanInfo();
	}

}
