public class Pertion {
    private  String name,gender,dayOfBirt;

    public Pertion(String name, String gender, String dayOfBirt) {
        this.name = name;
        this.gender = gender;
        this.dayOfBirt = dayOfBirt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirt() {
        return dayOfBirt;
    }

    public void setDayOfBirt(String dayOfBirt) {
        this.dayOfBirt = dayOfBirt;
    }

    @Override
    public String toString() {
        return "pertion{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dayOfBirt='" + dayOfBirt + '\'' +
                '}';
    }
}
