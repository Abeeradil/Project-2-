public class Route {
    //كلاس الطريق لتحديد المسار
    private String start_pick;
    private String destination;
    private double trip_price;

    public Route(String start_pick, String destination, double trip_price) {
        this.start_pick = start_pick;
        this.destination = destination;
        this.trip_price = trip_price;
    }

    public String getStart_pick() {
        return start_pick;
    }

    public void setStart_pick(String start_pick) {
        this.start_pick = start_pick;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTrip_price() {
        return trip_price;
    }

    public void setTrip_price(double trip_price) {
        this.trip_price = trip_price;
    }


}
