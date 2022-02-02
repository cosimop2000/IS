package Lezione0112.Duck;

public class AnimalFactoryFacade {
    CountingDuckFactory cdf;
    DuckFactoryAndGoose dag;

    public AnimalFactoryFacade(CountingDuckFactory cdf, DuckFactoryAndGoose dag) {
        this.cdf = cdf;
        this.dag = dag;
    }

    public Quackable createMallardDuck(){
        return cdf.createMallardDuck();
    }


    public Quackable createRedHeadDuck(){
        return cdf.createRedHeadDuck();
    }


    public Quackable createDuckCall(){
        return cdf.createDuckCall();
    }


    public Quackable createRubberDuck(){
        return cdf.createRubberDuck();
    }


    public Quackable createTaddyDuck(){
        return cdf.createTaddyDuck();
    }


    public Quackable createGoose(){
        return dag.createGoose();
    }

}
