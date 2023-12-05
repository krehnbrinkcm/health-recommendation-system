package nutritionmanagement;

public abstract class Person {

    //fields
    private ActivityLevel activityLevel;
    String name;
    String ageName;
    String dietReccomendation;
    
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

    //description method
    public String description() {
        return String.format("%s is an %s %s person so they shoul get %d calories and get %s from their diet.",name, activityLevel.getActivityLevelName(), ageName,  activityLevel.getReccomendedCalories(), dietReccomendation);
    }
}
