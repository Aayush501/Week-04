package org.resumescreeningsystem;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductManager extends JobRole{

    // specifying required skills while creating a constructor
    public ProductManager(){
        super("Product Manager", new ArrayList<>(Arrays.asList("AWS", "Project management Tools", "Testing")));
    }
}
