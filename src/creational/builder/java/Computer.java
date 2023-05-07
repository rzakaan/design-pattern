/*
 * 
 * Pros 
 * ---- 
 * We can set just the properties we need and the build method can handle defaults. 
 * The generated objects are thread-safe
 * 
 * Cons 
 * ---- 
 * It’s a lot of code.
 * Repetition code
 */
public class Computer {
    // required
    private String cpu;
    private int ram;
    private int hdd;

    // optional
    private boolean isBluetoothEnabled;

    // Builder class
    public static class ComputerBuilder {
        // required
        private String cpu;
        private int ram;
        private int hdd;

        // optional
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String cpu) {
            this.cpu = cpu;
        }

        public ComputerBuilder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder hdd(int hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder bluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return String.format("cpu:%s ram:%d hdd:%d", cpu, ram, hdd);
    }
}