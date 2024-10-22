package prak203_2310817320006_AlyaRosaan;

public class Pegawai {
	 public String nama;
	 public String asal; //-> kesalahan kode menggunakan Char, karena Char digunakan ketika hanya perlu menyimpan satu karakter.
	 					//jadi harus menggunakan String agar bisa menyimpan teks/kalimat
	 public String jabatan;
	 public int umur;
	 public String getNama() {
	 return nama;
	 }
	 public String getAsal() {
	 return asal;
	 }
	 public void setJabatan(String jabatan) { //ini bagian dari setter, kesalahannya tidak ada parameternya "(String jabatan)"
	 this.jabatan = jabatan; //-> kesalahannya "j" itu tidak merujuk pada apapun didalam parameter, 
	 						 //oleh sebab itu diganti "jabatan" karena merujuk pada parameter untuk memanggil metode setJabatan
	 }

}
