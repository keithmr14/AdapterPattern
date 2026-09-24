public class Main {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();

        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneOutlet = new SmartphoneAdapter(charger);

        laptopOutlet.plugIn();
        refrigeratorOutlet.plugIn();
        smartphoneOutlet.plugIn();
    }
}