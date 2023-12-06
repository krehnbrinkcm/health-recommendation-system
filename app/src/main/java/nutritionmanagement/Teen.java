package nutritionmanagement;

public class Teen extends Person implements Observer{

    //constructor
    public Teen(String name, ActivityLevel activityLevel, NutritionAgency na) {
        super(name, activityLevel, "teen", "carbs");
        na.registerObserver(this);
    }    

    //update
    @Override
    public void update(Subject o, Object args) {
        NutritionAgency nutritionAgency = (NutritionAgency) o;
        this.setDietReccomendation(nutritionAgency.getTeenDietReccomendation());
    }
}
