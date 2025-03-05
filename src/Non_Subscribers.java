public class Non_Subscribers extends Passenger {
    //كلاس للاشخاص الغير مشتركين  مع خصم 10 % من قيمه الرحله

    private boolean discount_coupon;

    public Non_Subscribers(String name, String id, boolean discount_coupon) {
        super(name, id);
        this.discount_coupon = discount_coupon;
    }

    //عمليه الخصم اذا ذكر الشخص ان لديه كوبون
    @Override
    public double calculate(Car car) {
        double cost = super.calculate(car);
        if (discount_coupon) {
            return cost * 0.10;
        } else {
            return 0;
        }
    }
}
