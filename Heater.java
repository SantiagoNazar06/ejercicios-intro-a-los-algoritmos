import java.util.ArrayList; 

/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    private Float temperature;
    private Float increment;
    private ArrayList<Float> temperatures;

    public Heater()
    {
        increment = 5.0F;
        temperatures = new ArrayList<>();
    }
    
    public void setIncrement(Float newIncrement){
        assert increment > 0: "Increment cannot be negative";
        increment = newIncrement;
    }
    
    public void addTemperature (Float newTemp){
        assert newTemp > -273.15 : "La temperatura no puede superar los  -273.15 Farenheith"; 
        temperatures.add(newTemp);
    }

    public void cooler(int index)
    {
        if(temperatures.get(index) > 273.15){
            Float tempTemporary = temperatures.get(index);
            tempTemporary-= increment;
        }else{    
            System.out.println("You can not increase the temperature");
        }
    }
    
    public void  warmer(int index)
    {        
        if(temperatures.get(index) < 100){
            Float tempTemporary = temperatures.get(index);
            tempTemporary+= increment;
        }else{    
            System.out.println("You can not increase the temperature");
        }
    }
    
    public void getTemperatures()
    {
        for (double temp : temperatures){
            System.out.println(temp + " Cº");
        }
    }
    
    public int cantDeTemperaturasExtremas (){
        int extremeTemperature = 0;
        for (double temp : temperatures){
           if(temp > 35.0 || temp < -15.0){
            extremeTemperature ++;
            }
        }
        return extremeTemperature;
    }
    
    public int consecutivasIguales(){
        int cantIg = 0; 
        for(int i = 0; i < temperatures.size()-1; i++){
            if (temperatures.get(i).equals(temperatures.get(i+1))){
                cantIg++;
            }
        }
        return cantIg; 
    }
    
}
