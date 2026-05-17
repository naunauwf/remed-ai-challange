public class RentalApp {

  public static void main(String[] args) {
    Mobil mobil = new Mobil("B 1945 SSS", "BMW", 2025, 2, "Premium");
    mobil.tampilkanInfo();

    Motor motor = new Motor("B 1998 SSH", "HONDA", 1994, 90, "Matic");
    motor.tampilkanInfo();

    System.out.println("Ubah status ketersedia motor..");
    motor.setTersedia(false);

    System.out.println("after perubahan status");
    motor.tampilkanInfo();

    System.out.println(motor.getCcMesin());
  }
}