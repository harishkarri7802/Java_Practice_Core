//Write a program to create a static nested class and demonstrate its use.
class Laptop {

    private String processor;
    private String ram;

    private Laptop(Memory builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
    }

    // Static Nested Class
    static class Memory {
        private String processor;
        private String ram;

        public Memory setProcessor(String processor) {
            if (processor == null || processor.isEmpty()) {
                throw new IllegalArgumentException("Processor cannot be empty!");
            }
            this.processor = processor;
            return this;
        }

        public Memory setRam(String ram) {
            if (!ram.matches("\\d{1,2}GB")) {
                throw new IllegalArgumentException("Invalid RAM format! Use like 8GB, 16GB");
            }
            this.ram = ram;
            return this;
        }

        public Laptop build() {
            if (processor == null) {
                throw new IllegalStateException("Processor must be set before building Laptop!");
            }
            if (ram == null) {
                throw new IllegalStateException("RAM must be set before building Laptop!");
            }
            return new Laptop(this);
        }
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}

public class Week2_20 {
    public static void main(String[] args) {
        try {
            Laptop l1 = new Laptop.Memory()
                    .setProcessor(Common.getValidString("Enter the processor : "))
                    .setRam("6GB")
                    .build();

            System.out.println(l1);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
