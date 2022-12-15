import java.util.Objects;

public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    //хочу, чтобы у human была возможность подъёма по карьерной лестнице
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (Objects.isNull(name) || Objects.equals(name, " ") || Objects.equals(name, "")) {
            this.name = ": Информация не указана!!!";
        } else {
            this.name = name;
        }

        this.yearOfBirth = Math.max(yearOfBirth, 0);

        if (Objects.isNull(town) || Objects.equals(town, " ") || Objects.equals(town, "")) {
            this.town = ": Информация не указана!!!";
        } else {
             this.town = town;
        }

        if (Objects.isNull(jobTitle) || Objects.equals(jobTitle, " ") || Objects.equals(jobTitle, "")) {
            this.jobTitle = ": Информация не указана!!!";
        } else {
            this.jobTitle = jobTitle;
        }
    }
}
