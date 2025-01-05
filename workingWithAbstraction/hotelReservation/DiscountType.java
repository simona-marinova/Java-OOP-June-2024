package workingWithAbstraction.hotelReservation;

public enum DiscountType {
    //VIP, SecondVisit, None.

    VIP (20),
    SECOND_VISIT (10),
    NONE (0);

   private final int discountPercentage;

    DiscountType(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public static DiscountType getDiscountType (String value) {
       return switch (value) {
           case "VIP" -> VIP;
           case "SecondVisit" -> SECOND_VISIT;
           case "None" -> NONE;
           default -> throw new IllegalArgumentException("Unsupported discount type"+ value);
       };
    }
}
