package Services;

import Models.Systems;
import Models.Variable;

import java.util.List;

public class Inspect extends Systems {
    public static void inspect(String processName){

        for(Variable variable:getSystem().get(processName)){

            System.out.println( variable.toString());

        }
    }
}
