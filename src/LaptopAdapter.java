public class LaptopAdapter implements PowerOutlet {

    private final Laptop laptop;

    public LaptopAdapter(Laptop laptop) {

        this.laptop = laptop;
    }

    @Override
    public void plugIn() {

        laptop.charge();
    }
}