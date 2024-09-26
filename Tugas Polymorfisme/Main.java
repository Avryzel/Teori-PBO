public class Main {
    public static void main(String[] args) {
        //Membuat objek dari class Handphone
        Handphone xiaomi = new Handphone("Redmi", "Note 4");
        String[] daftarNomor = {"0812345", "084567", "0298876"};

        xiaomi.nyalakan();
        xiaomi.kirimPesan("0812345", "Halo");
        xiaomi.kirimPesan("812345", "0813456", "Tolong");
        xiaomi.kirimPesan(daftarNomor, "Bayar Hutang!!");
        xiaomi.matikan();

        System.out.println();

        //Membuat objek dari class Smartphone
        Smartphone asus = new Smartphone("ROG", "Phone 4");

        asus.nyalakan();
        asus.kirimPesan("081234", "Gas mabar");
        asus.kirimPesan("a@gmail.com", "Izin mengirim email", "Ayo login");
        asus.aksesInternet();
        asus.matikan();

        System.out.println();

        //Membuat objek dari class FeaturePhone
        FeaturePhone nokia = new FeaturePhone("Nokia", "3310");

        nokia.nyalakan();
        nokia.mainGameSnake();
        nokia.matikan();
    }
}