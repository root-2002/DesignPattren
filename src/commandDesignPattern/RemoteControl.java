package commandDesignPattern;

import java.util.Arrays;

public class RemoteControl {
    private Command[] onCommand;
    private Command[] offCommand;
    public RemoteControl(){
        this.onCommand=new Command[2];
        this.offCommand =new Command[2];
    }
    public void addCommand(int slot , Command onCommand, Command offCommand){
        this.onCommand[slot] =onCommand;
        this.offCommand[slot] =offCommand;
    }
    public void onButtonPressed(int slot){
     this.onCommand[slot].execute();
    }
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < onCommand.length; i++) {
            buffer.append(String.format("[Slot %d] %s \t %s%n", i, onCommand[i].getClass().getSimpleName(), offCommand[i].getClass().getSimpleName()));
        }
        return buffer.toString();
    }

    public void offButtonPressed(int slot){
        this.offCommand[slot].execute();
    }
}
