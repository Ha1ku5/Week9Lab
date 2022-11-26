/*
Class TempTester
used to test methods in class Temperature

@author Alex Leatha
@version 11/25/2022
 */

public class TempTester {

    public static void main(String[] args) {

        //testing the methods

        Temperature test1 = new Temperature();
        Temperature test2 = new Temperature();
        test2.setAll(-40, Temperature.system.F);

        System.out.println(test1 + " in Fahrenheit is " + test1.DegreesF());
        System.out.println("-40 F is " + test2.DegreesC() + " C");
        test1.setTemp(56.155);
        System.out.println("temp 1 is " + test1);//default toString replaced by mine apparently. cool.
        test1.setScale(Temperature.system.F);

        test1.setScale(Temperature.system.F);
        System.out.println(test1.compare(test2.DegreesF()));



    }




}
