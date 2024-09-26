public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone " + this.merk + " " + this.model + " sedang booting");
    }

    public void matikan() {
        System.out.println("Handphone " + this.merk + " " + this.model + " sedang dimatikan");
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan ke no : " + nomorTujuan);
        System.out.println("Pesan : " + pesan);
    }

    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan) {
        System.out.println("Mengirim pesan ke no 1 : " + nomorTujuan1);
        System.out.println("Mengirim pesan ke no 2 : " + nomorTujuan2);
        System.out.println("Pesan : " + pesan);
    }

    public void kirimPesan(String[] daftarNomor, String pesan) {
        System.out.println("Mengirim pesan ke no berikut :");
        for(String nomor : daftarNomor) {
            System.out.println("- " + nomor);
        }
        System.out.println("Pesan : " + pesan);
    }
}
