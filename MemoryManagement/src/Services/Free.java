package Services;

import Models.Systems;
import Models.Variable;

public class Free extends Systems {

    public static void free(String processName,String variableName){

          for(Variable variable:getSystem().get(processName)) {
              if (variable.getName().equals(variableName)) {
                  setAvailableMemory(Systems.getAvailableMemory() + variable.getMemory());
                  setUnavailableMemory(Systems.getUnavailableMemory() - variable.getMemory());
                  getSystem().get(processName).remove(variable);
                  System.out.println("Success"+ getUnavailableMemory()+"/"+getUnavailableMemory());
              }

              else
                  System.out.println("error"+getUnavailableMemory()+"/"+getUnavailableMemory());
          }
    }
}


