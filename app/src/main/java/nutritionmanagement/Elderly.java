package nutritionmanagement;

public class Elderly extends Person implements Observer{

    //constructor
    public Elderly(String name, ActivityLevel activityLevel, NutritionAgency na) {
        super(name, activityLevel, "elderly", "calcium");
        na.registerObserver(this);
    }    

    //update
    @Override
    public void update(Subject o, Object args) {
        NutritionAgency nutritionAgency = (NutritionAgency) o;
        this.setDietReccomendation(nutritionAgency.getElderlyDietReccomendation());
    }
}
