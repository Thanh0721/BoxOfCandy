public class Candy {
    private String flavor;

    public Candy(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String toString() {
        return flavor;
    }
}