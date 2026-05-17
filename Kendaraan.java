public class Kendaraan {
  private String nomorPlat;
  private String merk;
  private int tahunProduksi;
  private boolean tersedia;

  // Constructor
  public Kendaraan(String nomorPlat, String merk, int tahunProduksi) {
    this.nomorPlat = nomorPlat;
    this.merk = merk;
    setTahunProduksi(tahunProduksi); // pakai setter untuk validasi
    this.tersedia = true; // default value tersedia = true
  }

  // setter dengan validasi
  public void setNomorPlat(String nomorPlat) {
    this.nomorPlat = nomorPlat;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public void setTahunProduksi(int tahunProduksi) {
    if(tahunProduksi > 2026) {
      System.out.println("Tahun produksi tidak boleh lebih dari 2026!");
    } else {
      this.tahunProduksi = tahunProduksi;
    }
  }

  public void setTersedia(boolean tersedia) {
    this.tersedia = tersedia; 
  }

  // getter
  public String getNomorPlat() {
    return nomorPlat;
  }

  public String getMerk() {
    return merk;
  }

  public int getTahunProduksi() {
    return tahunProduksi;
  }

  public boolean isTersedia() {
    return tersedia;
  }

  // method tampilan info
  public void tampilkanInfo() {
    System.out.println("Nomor Plat: " + nomorPlat);
    System.out.println("Merk: " + merk);
    System.out.println("Tahun Produksi: " + tahunProduksi);
    System.out.println("Status: " + (tersedia ? "Tersedia" : "Tidak Tersedia"));
  } 
}