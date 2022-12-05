public class Human {
    private String name;
    private  String town;
    private int yearOfBirth;

    public Human(String name, String town, int yearOfBirth) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return
                "Привет! Меня зовут " + name + ". " +
                "Я из города " + town + ". " +
                "Я родился в " + yearOfBirth + "(ом) году. Будем знакомы! ";
    }
}
