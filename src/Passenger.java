public abstract class Passenger {
    // كلاس الركاب ويورثو منه كلاسين المشتركين واللي لا
    private String name;
    private String id;
    public Car reserved_car;
    private double trip_cost;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }

    //هنا نتاكد ان السياره محجوزه او لا ونطبع رساله
    public String reserved_car(Car car) {
        if (car.isAvailable()) {
            reserved_car = car;
            car.getMaximum();
            trip_cost = calculate(car);
            return "The car has been booked successfully ";

        } else {
            return "The car is not available, book another car ";
        }
    }

    // عمليه الحساب لقيمه السياره اشا فيها خصم او كذا
    public double calculate(Car car) {
        return car.getFixed_route().getTrip_price();
    }

    // هنا نطبع للمستخدم البيانات حقتو كامله كتذكره يعني
    public void display_info() {
        String carCode = (reserved_car != null) ? reserved_car.getCode() : "no car reserved"; //اذا كانت السياره غير متاحه يطبع التالي
        System.out.println("name:" + name + " ,id:" + id + " ,carCode:" + carCode + " ,trip cost" + trip_cost);
    }

}
