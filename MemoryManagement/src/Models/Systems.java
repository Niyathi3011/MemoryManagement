package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Systems{

    private static Map<String,List<Variable>> system=new HashMap<>();

    private static int availableMemory;
    private static int unavailableMemory;


    public static void setAvailableMemory(int availableMemory) {
       Systems.availableMemory = availableMemory;
    }

    public static void setUnavailableMemory(int unavailableMemory) {
        Systems.unavailableMemory = unavailableMemory;
    }

    public static Map<String, List<Variable>> getSystem() {
        return system;
    }

    public static int getAvailableMemory() {
        return availableMemory;
    }

    public static int getUnavailableMemory() {
        return unavailableMemory;
    }

}
