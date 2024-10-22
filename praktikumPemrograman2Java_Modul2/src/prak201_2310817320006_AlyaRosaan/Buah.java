package prak201_2310817320006_AlyaRosaan;

public class Buah {
	String nama;
	double berat;
	double harga;
	double jumlahBeli;
	double hargaSebelumdiskon;
	double totalDiskon;
	double hargaSetelahdiskon;
	
	public void tampilkanInfo() {
		System.out.println("Nama Buah: " + nama);
		System.out.println("Berat: " + berat);
		System.out.println("harga: " + harga);
		System.out.println("jumlah Beli: " + jumlahBeli + "kg");
		
		hargaSebelumdiskon = jumlahBeli * harga / berat;
		System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", hargaSebelumdiskon));
		
		totalDiskon = (jumlahBeli / 4) * 0.02 * harga * 4;
		System.out.println("Total diskon: Rp" + String.format("%.2f", totalDiskon));
		
		hargaSetelahdiskon = hargaSebelumdiskon - totalDiskon;
		System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", hargaSetelahdiskon) + "\n");
	}
}