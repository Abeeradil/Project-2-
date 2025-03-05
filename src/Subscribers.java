public class Subscribers extends Passenger {
    //كلاس للاشخاص  المشتركين  مع خصم 50 % من قيمه الرحله

    public Subscribers(String name, String id) {
        super(name, id);
    }

    // عمليه الخصم
    @Override
    public double calculate(Car car) {
        return super.calculate(car) * 0.5;
    }
}
