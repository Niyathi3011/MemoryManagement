package Models;

public class Variable {

    private final String name;
    private final int memory;

    public Variable(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", memory=" + memory +" ";
    }
}
