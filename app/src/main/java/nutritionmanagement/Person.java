package nutritionmanagement;

public abstract class Person {

    //fields
    private ActivityLevel activityLevel;
    private String name;
    private String ageName;
    private String dietReccomendation;
    
    //constructor
    public Person(String name, ActivityLevel activityLevel, String ageName, String dietReccomendation) {
        this.activityLevel = activityLevel;
        this.name = name;
        this.ageName = ageName;
        this.dietReccomendation = dietReccomendation;
    }

    //getters
    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public String getName() {
        return name;
    }

    public String getAgeName () {
        return ageName;
    }

    public String getDietReccomendation() {
        return dietReccomendation;
    }

    //setter

    public void setDietReccomendation(String dietReccomendation) {
        this.dietReccomendation = dietReccomendation;
    }

    //description method
    public String description() {
        return String.format("%s is an %s %s so they should get %d calories and eat %s in their diet.",name, activityLevel.getActivityLevelName(), ageName,  activityLevel.getReccomendedCalories(), dietReccomendation);
    }
}
