package commandDesignPattern;

public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl =new RemoteControl();
        Light light =new Light();
        TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);
        TurnOffLightCommand turnOffLightCommand =new TurnOffLightCommand(light);
        Tv tv =new Tv();
        TurnOnTvCommand turnOnTvCommand =new TurnOnTvCommand(tv);
        TurnOffTvCommand turnOffTvCommand =new TurnOffTvCommand(tv);
        remoteControl.addCommand(0,turnOnLightCommand,turnOffLightCommand);
        remoteControl.addCommand(1,turnOnTvCommand,turnOffTvCommand);
        remoteControl.onButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPressed(1);
        remoteControl.offButtonPressed(0);

    }
}
