public class Phone {
    private String IMEI;
    private String brand;
    private String model;
    public static final int emergency = 911;

    public Phone(String IMEI, String brand, String model) {
        this.IMEI = IMEI;
        this.brand = brand;
        this.model = model;
    }

    public static void callEmergency() {
        System.out.println("Dialing " + emergency);
    }

}


