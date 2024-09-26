public class Smartphone extends Handphone {
    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang dimatikan");
    }

    @Override
    public void kirimPesan(String noTujuan, String pesan) {
        super.kirimPesan(noTujuan, pesan);
    }

    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mengirim email ke " + emailTujuan);
        System.out.println("Subjek\t: " + subjek);
        System.out.println("Pesan\t: " + pesan);
    }

    public void aksesInternet() {
        System.out.println("Smartphone " + merk + " " + model + " sedang mengakses internet");
    }
}


