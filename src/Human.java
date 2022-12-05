public class Human {
    private String name;
    private  String town;
    private int yearOfBirth;

    private String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

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
                "Я родился в " + yearOfBirth + "(ом) году." + "Я работаю на должности " + jobTitle +
                        " Будем знакомы! " ;
    }
}
