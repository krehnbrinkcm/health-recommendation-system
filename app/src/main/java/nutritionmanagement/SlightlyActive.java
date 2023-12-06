package nutritionmanagement;

public class SlightlyActive extends ActivityLevel implements Observer {
    //constructor
    public SlightlyActive(NutritionAgency na) {
        super("slightly active",2500);
        na.registerObserver(this);
    }

    @Override
    public void update(Subject o, Object args) {
        NutritionAgency nutritionAgency = (NutritionAgency) o;
        this.setReccomendedCalories(nutritionAgency.getSlightlyActiveCalorieReccomendation());
    }
}

