package Lezione0112.Duck;

public class Simulator {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();
        DuckFactoryAndGoose duckFactoryAndGoose = new DuckFactoryAndGoose();

        AnimalFactoryFacade animalFactoryFacade = new AnimalFactoryFacade(countingDuckFactory,duckFactoryAndGoose);

        simulator.init(animalFactoryFacade);
    }

    void init ( AnimalFactoryFacade animal ){

        Quackable duck1 = animal.createMallardDuck();
        Quackable duck2 = animal.createRedHeadDuck();
        Quackable duck3 = animal.createDuckCall();
        Quackable duck4 = animal.createRubberDuck();
        Quackable duck5 = animal.createTaddyDuck();
        Quackable goose = animal.createGoose();

        simulate(duck1);
        simulate(duck2);
        simulate(duck3);
        simulate(duck4);
        simulate(duck5);
        simulate(goose);

        for ( int i = 0 ; i < 100 ; ++i){
            simulate(duck5);
        }

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");

    }

    void simulate(Quackable bird){
        bird.quack();
    }
}


