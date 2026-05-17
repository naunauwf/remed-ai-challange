public class Mobil extends Kendaraan {

  private int jumlahKursi;
  private String tipeBahanBakar;

  // Constructor
  public Mobil(String nomorPlat, String merk, int tahunProduksi, int jumlahKursi, String tipeBahanBakar) {
    super(nomorPlat, merk, tahunProduksi);
    setJumlahKursi(jumlahKursi); // setter validasi
    this.tipeBahanBakar = tipeBahanBakar;
  }
  
  // setter
  public void setJumlahKursi(int jumlahKursi) {
    if(jumlahKursi < 2) {
      System.out.println("Error: jumlah kursi minimal 2!");
    } else {
      this.jumlahKursi = jumlahKursi;
    }
  }

  public void setTipeBahanBakar(String tipeBahanBakar) {
    this.tipeBahanBakar = tipeBahanBakar;
  }

  // getter
  public int getJumlahKursi() {
    return jumlahKursi;
  }

  public String getTipeBahanBakar() {
    return tipeBahanBakar;
  }

  // override tampilkanInfo
  @Override
  public void tampilkanInfo() {
    System.out.println();
    System.out.println("=== MOBIL ===");
    super.tampilkanInfo();
    System.out.println("Jumlah Kursi: " + jumlahKursi);
    System.out.println("Tipe Bahan Bakar: " + tipeBahanBakar);
    System.out.println();
  }
}