public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command turnOn = new LightOnCommand(livingRoomLight);
        Command turnOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        System.out.println("Pressing ON button:");
        remote.setCommand(turnOn);
        remote.pressButton();

        System.out.println("\nPressing OFF button:");
        remote.setCommand(turnOff);
        remote.pressButton();
    }
}
