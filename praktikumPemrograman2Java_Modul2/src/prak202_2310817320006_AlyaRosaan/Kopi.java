package prak202_2310817320006_AlyaRosaan;

public class Kopi {
	String namaKopi;
	String ukuran;
	double harga;
	String pembeli;
	double pajakKopi;
	
public void info() {
	System.out.println("Nama Kopi: " + namaKopi);
	System.out.println("Ukuran: " + ukuran);
	System.out.println("Harga: " + harga);
}

void setPembeli(String pembeli) {
	this.pembeli = pembeli;
}

public String getPembeli() {
	return pembeli;
}

public double getPajak() {
	pajakKopi = 0.11 * harga;
	return pajakKopi;
}
	
}
