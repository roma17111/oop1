

public class Flower {


    private String flowerName;
    private final String country;
    private final double cost;
    private int ifeSpan;

    public Flower(String flowerName, String country, double cost, int ifeSpan) {
        if (flowerName == null || flowerName.isEmpty()) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (ifeSpan < 0) {
            this.ifeSpan = Math.abs(ifeSpan);
        } else {
            this.ifeSpan = ifeSpan;
        }
    }


    public Flower (String flowerName, String country, double cost) {
        if (flowerName == null || flowerName.isEmpty()) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        this.ifeSpan = 3 ;
    }



    @Override
    public String toString() {
        return
                flowerName + ". " +
                "Страна происхождения: " + country + ". " +
                " Стоимость штуки: " + cost + ". " +
                " Срок стояния: " + ifeSpan
                ;
    }
}
