package nutritionmanagement;

public class Active extends ActivityLevel implements Observer{
    //constructor
    public Active(NutritionAgency na) {
        super("active",3200);
        na.registerObserver(this);
    }

    @Override
    public void update(Subject o, Object args) {
        NutritionAgency nutritionAgency = (NutritionAgency) o;
        this.setReccomendedCalories(nutritionAgency.getActiveCalorieReccomendation());
    }
}


