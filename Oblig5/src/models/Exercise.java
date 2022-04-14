package models;

public class Exercise {
    private String name;
    private int repetitions;
    private int weight;

    public Exercise(String name, int repetitions, int weight) {
        this.name = name;
        this.repetitions = repetitions;
        this.weight = weight;




    }

    @Override
    public String toString() {
        return "Exercise: " + name + ": " + repetitions + " repetitions with " +
                weight + "kg.";

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRepetitions() {
        return repetitions;
    }
    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }
    public int getWeight(int weight) {
        return weight;
    }
    public void setWeight(int exeWeight){
        this.weight = weight;
    }
}
