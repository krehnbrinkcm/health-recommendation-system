package nutritionmanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class NutritionAgencyTests {

    NutritionAgency na;


    @BeforeEach
    public void beforeEach() {
    na = new NutritionAgency();
    }


    //This test checks to make sure the nutrition agency constructor works
    @Test
    void testNutritionAgencyConstructor() {
        assertNotNull(na, "nutrition agency constructor returned null");
    }

    //tests the getSedintaryCalorieReccomendation method
    @Test
    void testGetSedintaryCalorieReccomendation() {
        assertEquals(na.getSedintaryCalorieReccomendation(), 2000);
    }

        //tests the getSlightyActiveCalorieReccomendation method
    @Test
    void testGetSlightlyActiveCalorieReccomendation() {
        assertEquals(na.getSlightlyActiveCalorieReccomendation(), 2500);
    }

        //tests the getActiveCalorieReccomendation method
    @Test
    void testGetActiveCalorieReccomendation() {
        assertEquals(na.getActiveCalorieReccomendation(), 3200);
    }

        //tests getDietReccomendation methods
        @Test
        void testGetDietReccomendations() {
        assertEquals(na.getElderlyDietReccomendation(), "calcium");
        assertEquals(na.getAdultDietReccomendation(), "protein");
        assertEquals(na.getTeenDietReccomendation(), "carbs");
        assertEquals(na.getChildDietReccomendation(), "milk");
        }


        @Test
        void testSetters() {
            na.setActiveCalorieReccomendation(32);
            na.setSlightlyActiveCalorieReccomendation(25);
            na.setSedintaryCalorieReccomendation(20);
            na.setElderlyDietReccomendation("c");
            na.setAdultDietReccomendation("p");
            na.setTeenDietReccomendation("c");
            na.setChildDietReccomendation("m");

        assertEquals(na.getElderlyDietReccomendation(), "c");
        assertEquals(na.getAdultDietReccomendation(), "p");
        assertEquals(na.getTeenDietReccomendation(), "c");
        assertEquals(na.getChildDietReccomendation(), "m");
        assertEquals(na.getActiveCalorieReccomendation(), 32);
        assertEquals(na.getSlightlyActiveCalorieReccomendation(), 25);
        assertEquals(na.getSedintaryCalorieReccomendation(), 20);
        }


    

}
