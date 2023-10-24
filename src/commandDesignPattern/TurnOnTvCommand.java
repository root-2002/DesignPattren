package commandDesignPattern;

public class TurnOnTvCommand implements Command{
    Tv tv;
    TurnOnTvCommand(Tv tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        this.tv.turnOn();
    }

    @Override
    public void undo() {
        this.tv.turnOff();
    }
}
