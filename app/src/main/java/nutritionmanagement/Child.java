package nutritionmanagement;

public class Child extends Person implements Observer{

    //constructor
    public Child(String name, ActivityLevel activityLevel, NutritionAgency na) {
        super(name, activityLevel, "child", "milk");
        na.registerObserver(this);
    }    

    //update
    @Override
    public void update(Subject o, Object args) {
        NutritionAgency nutritionAgency = (NutritionAgency) o;
        this.setDietReccomendation(nutritionAgency.getChildDietReccomendation());
    }
}
