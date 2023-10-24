package commandDesignPattern;

public class TurnOffTvCommand implements Command {
    Tv tv;
    TurnOffTvCommand(Tv tv){
        this.tv=tv;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }

    @Override
    public void undo() {
        this.tv.turnOn();
    }
}
