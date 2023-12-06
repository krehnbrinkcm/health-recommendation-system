package nutritionmanagement;

import java.util.ArrayList;

public class NutritionAgency implements Subject{
    
    //observer array list
    private ArrayList<Observer> observers;

    //calorie reccomendation fields
    private int activeCalorieReccomendation;

    //diet reccomendations fields
    private String elderlyDietReccomendation;

    public NutritionAgency() {
        this.observers = new ArrayList<>();
        //starter values
        activeCalorieReccomendation = 3200;
        
        elderlyDietReccomendation = "lots of calcium";
    }

    //getters
    public int getActiveCalorieReccomendation() {
        return activeCalorieReccomendation;
    }

    public String getElderlyDietReccomendation() {
        return elderlyDietReccomendation;
    }

    //setters
    public void setActiveCalorieReccomendation(int activeCalorieReccomendation) {
        this.activeCalorieReccomendation = activeCalorieReccomendation;
    }

    public void setElderlyDietReccomendation(String elderlyDietReccomendation) {
        this.elderlyDietReccomendation = elderlyDietReccomendation;
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
