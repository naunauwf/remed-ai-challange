public class Motor extends Kendaraan {
  
  private int ccMesin;
  private String jenisMotor;

  public Motor(String nomorPlat, String merk, int tahunProduksi, int ccMesin, String jenisMotor) {
    super(nomorPlat, merk, tahunProduksi);
    setCcMesin(ccMesin); // setter utk validasi
    this.jenisMotor = jenisMotor;
  }

  // setter validasi
  public void setCcMesin(int ccMesin) {
    if (ccMesin < 90) {
      System.out.println("Error: CC Mesin minimal 90!");
    } else {
      this.ccMesin = ccMesin;
    }
  }

  public void setJenisMotor(String jenisMotor) {
    this.jenisMotor = jenisMotor;
  }

  // getter
  public int getCcMesin() {
    return ccMesin;
  }

  public String getJenisMotor() {
    return jenisMotor;
  }

  @Override
  public void tampilkanInfo() {
    System.out.println("=== MOTOR ===");
    super.tampilkanInfo();
    System.out.println("CC Mesin: " + ccMesin);
    System.out.println("Jenis Motor: " + jenisMotor);
    System.out.println();
  }
}