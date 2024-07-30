// Step 6

public class Test
{
	public static void main(String[] args)
	{
		Light drawingRoomLight = new Light();

        // Create commands
        Command lightOn = new LightOnCommand(drawingRoomLight);
        Command lightOff = new LightOffCommand(drawingRoomLight);

        // Create remote control and set commands
        RemoteControl remote = new RemoteControl();

        // To turn on the light
        remote.setCommand(lightOn);
        remote.pressButton();

        // To turn off the light
        remote.setCommand(lightOff);
        remote.pressButton();
	}
}
