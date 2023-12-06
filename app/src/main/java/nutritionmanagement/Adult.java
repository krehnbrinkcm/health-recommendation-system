package nutritionmanagement;

public class Adult extends Person implements Observer{

    //constructor
    public Adult(String name, ActivityLevel activityLevel, NutritionAgency na) {
        super(name, activityLevel, "adult", "protein");
        na.registerObserver(this);
    }    

    //update
    @Override
    public void update(Subject o, Object args) {
        NutritionAgency nutritionAgency = (NutritionAgency) o;
        this.setDietReccomendation(nutritionAgency.getAdultDietReccomendation());
    }
}