
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("intel")
                .ram(4)
                .hdd(500)
                .bluetoothEnabled(true)
                .build();

        System.out.println(computer.toString());
    }
}
