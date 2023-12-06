package nutritionmanagement;

public class Sedintary extends ActivityLevel implements Observer{
    //constructor
    public Sedintary(NutritionAgency na) {
        super("sedintary",2000);
        na.registerObserver(this);
    }

    @Override
    public void update(Subject o, Object args) {
        NutritionAgency nutritionAgency = (NutritionAgency) o;
        this.setReccomendedCalories(nutritionAgency.getSedintaryCalorieReccomendation());
    }
}
