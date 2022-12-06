public class Human {
    private String name;
    private String town;
    private int yearOfBirth;

    private String jobTitle;


    public Human(String name, String town, int yearOfBirth, String jobTitle) {

        if (name == null || name == "") {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town == "") {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (jobTitle == null || jobTitle == "") {

            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "«Информация не указана»";
        } else {
            this.name = name;
        }
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()){
            this.town = "«Информация не указана»";
        }else {
        this.town = town;}
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
        this.yearOfBirth = yearOfBirth;}
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            this.jobTitle = "«Информация не указана»";

        }else {
        this.jobTitle = jobTitle;}
    }

    @Override
    public String toString() {
        return
                "Привет! Меня зовут " + name + ". " +
                        "Я из города " + town + ". " +
                        "Я родился в " + yearOfBirth + "(ом) году." + "Я работаю на должности " + jobTitle +
                        " Будем знакомы! ";
    }
}
