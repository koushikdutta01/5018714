
public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setOperatingSystem("Windows 10")
                .build();

        Computer officeComputer = new Computer.Builder("Intel i5", "16GB")
                .setStorage("1TB HDD")
                .setOperatingSystem("Ubuntu")
                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
