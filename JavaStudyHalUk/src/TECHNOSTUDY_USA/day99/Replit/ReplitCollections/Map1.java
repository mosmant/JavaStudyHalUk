package TECHNOSTUDY_USA.day99.Replit.ReplitCollections;

import java.util.Map;

public class Map1 {
    /*
    Create a method name is map1()
parameters are one Integer -String map and one integer
return type is String
return the value of the integer
Example:
Map is
                1 ,  "Lion"
                2 ,  "Tiger"
                3 ,  "Elephant"
                4 ,  "Cat"
                5  , "Dog"
Integer 3
Result should be Elephant
     */
    public static String map1( Map<Integer,String> map, Integer i){
        return map.get(i);
    }
}
