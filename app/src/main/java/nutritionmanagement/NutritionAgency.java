package nutritionmanagement;

import java.util.ArrayList;

public class NutritionAgency implements Subject{
    
    //observer array list
    private ArrayList<Observer> observers;

    //calorie reccomendation fields
    private int activeCalorieReccomendation;
    private int slightlyActiveCalorieReccomendation;
    private int sedintaryCalorieReccomendation;

    //diet reccomendations fields
    private String elderlyDietReccomendation;
    private String adultDietReccomendation;
    private String teenDietReccomendation;
    private String childDietReccomendation;

    public NutritionAgency() {
        this.observers = new ArrayList<>();
        //starter values
        activeCalorieReccomendation = 3200;
        slightlyActiveCalorieReccomendation = 2500;
        sedintaryCalorieReccomendation = 2000;

        
        elderlyDietReccomendation = "calcium";
        adultDietReccomendation = "protein";
        teenDietReccomendation = "carbs";
        childDietReccomendation = "milk";

    }

    //getters
    public int getActiveCalorieReccomendation() {
        return activeCalorieReccomendation;
    }

    public int getSlightlyActiveCalorieReccomendation() {
        return slightlyActiveCalorieReccomendation;
    }

    public int getSedintaryCalorieReccomendation() {
        return sedintaryCalorieReccomendation;
    }

    public String getElderlyDietReccomendation() {
        return elderlyDietReccomendation;
    }
    
    public String getAdultDietReccomendation() {
        return adultDietReccomendation;
    }

    public String getTeenDietReccomendation() {
        return teenDietReccomendation;
    }

    public String getChildDietReccomendation() {
        return childDietReccomendation;
    }

    //setters
    public void setActiveCalorieReccomendation(int activeCalorieReccomendation) {
        this.activeCalorieReccomendation = activeCalorieReccomendation;
        notifyAllObservers();
    }

        public void setSlightlyActiveCalorieReccomendation(int slightlyActiveCalorieReccomendation) {
        this.slightlyActiveCalorieReccomendation = slightlyActiveCalorieReccomendation;
        notifyAllObservers();
    }

        public void setSedintaryCalorieReccomendation(int sedintaryCalorieReccomendation) {
        this.sedintaryCalorieReccomendation = sedintaryCalorieReccomendation;
        notifyAllObservers();
    }



    public void setElderlyDietReccomendation(String elderlyDietReccomendation) {
        this.elderlyDietReccomendation = elderlyDietReccomendation;
        notifyAllObservers();
    }

    public void setAdultDietReccomendation(String adultDietReccomendation) {
        this.adultDietReccomendation = adultDietReccomendation;
        notifyAllObservers();
    }

    public void setTeenDietReccomendation(String teenDietReccomendation) {
        this.teenDietReccomendation = teenDietReccomendation;
        notifyAllObservers();
    }

    public void setChildDietReccomendation(String childDietReccomendation) {
        this.childDietReccomendation = childDietReccomendation;
        notifyAllObservers();
    }

    //subject methods 
    @Override
    public void registerObserver(Observer o) { 
        observers.add(o); 
    }

    @Override
    public void removeObserver(Observer o) { 
        observers.remove(o); 
    }

    @Override
    public void notifyObserver(Observer o) {
        o.update(this, null); 
    }

    @Override
    public void notifyAllObservers(){ 
        for (Observer o : observers) {
            o.update(this, null); 
        }
    }




}
