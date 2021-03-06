package Lezione0112.Duck;

public class DuckFactoryAndGoose extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createTaddyDuck() {
        return new TaddyDuck();
    }

    public Quackable createGoose(){
        return new GooseAdapter(new Goose());
    }
}
