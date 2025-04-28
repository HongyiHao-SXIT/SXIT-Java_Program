package com.boda.xy;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test{
    	public static void methodA() { 
            try{
        var value = 30;
        if(value < 40)
          throw new Exception("value值太小。");
} catch(Exception ex){
         System.out.println(ex.getMessage());
}
System.out.println("catch块后的代码。");

    		 } 
}
