public class Calculations { 
    
    public int additiveCalculation(int bath,int standard,int bath_ideal,int standard_ideal, int volume){
        int total_additive, add_per_liter; 
        add_per_liter = bath_ideal - ((bath*standard_ideal)/standard);
        total_additive = add_per_liter * volume;
        return total_additive;
    }   
}
