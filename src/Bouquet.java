public class Bouquet {


    private int flower1;
    private int flower2;
    private int flower3;
    private int flower4;

    public Bouquet(int flower1, int flower2, int flower3, int flower4) {
        this.flower1 = flower1;
        this.flower2 = flower2;
        this.flower3 = flower3;
        this.flower4 = flower4;
    }


    public int getFlower1() {
        return flower1;
    }

    public int getFlower2() {
        return flower2;
    }

    public int getFlower3() {
        return flower3;
    }

    public int getFlower4() {
        return flower4;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flower1=" + flower1 +
                ", flower2=" + flower2 +
                ", flower3=" + flower3 +
                ", flower4=" + flower4 +
                '}';
    }
}

