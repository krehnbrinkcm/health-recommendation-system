package nutritionmanagement;

public abstract class ActivityLevel {

    //fields
    private String activityLevelName;
    private int reccomendedCalories;

    //constructor
    public ActivityLevel(String activityLevel, int reccomendedCalories) {
        this.activityLevelName = activityLevel;
        this.reccomendedCalories = reccomendedCalories;
    }

    public String getActivityLevelName() {
        return activityLevelName;
    }

    public int getReccomendedCalories() {
        return reccomendedCalories;
    }
}
