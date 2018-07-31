public class Animal {
    private String name;
    private int steps;
    private String voice;
    public Animal(String name){
        this.name=name;
    }
    public int go (int steps){
        this.steps = steps;
        return steps;
    }
    public String say (String voice){
        this.voice = voice;
        return voice;
    }
    public void printInformation(){
        System.out.println("Animal is " + name );
        System.out.println("Amount of steps is " + steps );
        System.out.println("Animal says " + voice );
    }

    public static void main (String [] args){
        Animal Tiger = new Animal ("Tiger");
        Tiger.go(11);
        Tiger.say("Mew");
        Tiger.printInformation();
    }
}

