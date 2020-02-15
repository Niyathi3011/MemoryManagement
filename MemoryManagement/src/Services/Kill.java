package Services;

import Models.Systems;
import Models.Variable;

public class Kill extends Systems {

    public static void kill(String processName){

        for(Variable variable: Systems.getSystem().get(processName)){

            setAvailableMemory(getAvailableMemory()+variable.getMemory());
           setUnavailableMemory(getUnavailableMemory()-variable.getMemory());
        }

        Systems.getSystem().get(processName).clear();

        System.out.println("Success" + Systems.getUnavailableMemory()+"/"+Systems.getAvailableMemory());

    }
}
