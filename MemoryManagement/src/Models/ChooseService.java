package Models;

import static Services.Allocate.allocate;
import static Services.Free.free;
import static Services.Inspect.inspect;
import static Services.Kill.kill;

public class ChooseService {

    public static void chooseService(String[] commands){
        switch(commands[0]){
            case "allocate": allocate(commands);break;
            case "free": free(commands[1],commands[2]);break;
            case "inspect":inspect(commands[1]);break;
            case "kill":kill(commands[1]);break;
        }
    }
}
