package Services;

import Models.Systems;
import Models.Variable;

import java.util.ArrayList;
import java.util.List;

public class Allocate extends Systems {

    public static void allocate(String[] commands) {

        if (getAvailableMemory() > Integer.parseInt(commands[3])) {
            if (!getSystem().containsKey(commands[1])) {
                getSystem().put(commands[1], new ArrayList<>());
            }
            getSystem().get(commands[1]).add(new Variable(commands[2], Integer.parseInt(commands[3])));

           setAvailableMemory(getAvailableMemory() - Integer.parseInt(commands[3]));
           setUnavailableMemory(getUnavailableMemory() + Integer.parseInt(commands[3]));

            System.out.println("Success "+ Systems.getUnavailableMemory()+"/"+Systems.getAvailableMemory());
        }

        else
            System.out.println("Error"+ Systems.getUnavailableMemory()+"/"+Systems.getAvailableMemory());
    }
}

