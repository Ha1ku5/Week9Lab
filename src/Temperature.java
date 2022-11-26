/*
Class Temperature
Stores a temperature in C or F
Can convert between systems
Can compare between two values

@author Alex Leatha
@version 11/25/2022
 */

public class Temperature {
    enum system {C, F}
    private double temp;
    private system scale;

    //constructor
    public Temperature(){
        temp = 0.0;
        scale = system.C;

    }

    //returns degrees C
    public double DegreesC(){
       if (scale == system.C){
           return temp;
       } else {
           return (5 * (temp - 32) / 9);
       }
    }

    //returns degrees F
    public double DegreesF(){
        if (scale == system.C){
            return (9 * temp / 5 ) + 32;
        } else {
            return temp;
        }
    }

    //temp setter
    public void setTemp(double num){
        temp = num;
    }

    //scale setter
    public void setScale(system let){
        scale = let;
    }

    //bot values setter
    public void setAll(double num, system let){
        temp = num;
        scale = let;
    }

    //returns current temperature as string, rounded to the nearest tenth
    public String toString(){
        double rounded = Math.round(temp*10.0)/10.0;
        return rounded + " " + scale;

    }

    //comparison method
    //returns -1 if temp is less than passed value
    // 0  if they are equal
    //and 1 if the temp is greater than the passed value
    public int compare(double num){
        if(temp < num){
            return -1;
        } else if (temp > num){
            return 1;
        } else if(temp == num){
            return 0;
        } else {
            System.out.println("something is very wrong");
            return 0;
        }
    }
}
