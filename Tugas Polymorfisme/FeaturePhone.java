public class FeaturePhone extends Handphone {
    public FeaturePhone(String merk, String model) {
        super(merk, model);
    }
    
    @Override
    public void nyalakan() {
        System.out.println("FeaturePhone " + merk + " " + model + " sedang booting");
    }

    @Override
    public void matikan() {
        System.out.println("FeaturePhone " + merk + " " + model + " sedang dimatikan");
    }

    public void mainGameSnake() {
        System.out.println("FeaturePhone " + merk + " " + model + " sedang menjalankan Game Snake");
    }
}