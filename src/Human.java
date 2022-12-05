public class Human {
    private String name;
    private String town;
    private int yearOfBirth;

    private String jobTitle;


    public Human(String name, String town, int yearOfBirth, String jobTitle) {

        if (name == null || name == "") {
            this.name = "«Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town == "") {
            this.town = "«Информация не указана";
        } else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (jobTitle == null || jobTitle == "") {

            this.jobTitle = "«Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

        public String getName () {
            return name;
        }

        public String getTown () {
            return town;
        }

        public int getYearOfBirth () {
            return yearOfBirth;
        }

        @Override
        public String toString () {
            return
                    "Привет! Меня зовут " + name + ". " +
                            "Я из города " + town + ". " +
                            "Я родился в " + yearOfBirth + "(ом) году." + "Я работаю на должности " + jobTitle +
                            " Будем знакомы! ";
        }
    }
