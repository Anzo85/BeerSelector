package org.anzo;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {


    public List getBrand(String color) {


        List brands = new ArrayList();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
            brands.add("Amber ale");
            brands.add("American Pale Ale");
            brands.add("Bière de Garde");
            brands.add("Burton Pale Ale");



        } else if (color.equals("dark")) {
            brands.add("Guinness");
            brands.add("Gulden Draak ");
            brands.add("Dogfish Head");
            brands.add("St. Bernardus Abt 12");
            brands.add("EKU 28");
            brands.add("Mc Chouffe");
            brands.add("Dark Cloud");
            brands.add("Penn Dark");


        } else if (color.equals("brown")) {

            brands.add("Abita Turbodog");
            brands.add("Brooklyn Brown Ale");
            brands.add("Dogfish Indian Brown Ale");
            brands.add("Duck Rabbit Brown Ale");
            brands.add("Newcastle Brown Ale");
        } else {
            brands.add("Carlsberg");
            brands.add("Hoegarden");
            brands.add("Pilsner Urquell");
            brands.add("Jever Pilsener");

        }

        return brands;
    }
}

