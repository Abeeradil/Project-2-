public class Car {
    //الكلاس اللي نعرف فيه السياره مع المسار وعدد ركابها
    private String code;
    private Route fixed_route;
    private int maximum;

    // الكونستركتر اللي كل الشغل عليه من هنا ناخذ كل المعلومات تقريبا ونمررها
    public Car(String code, Route fixed_route, int maximum) {
        this.code = code;
        this.fixed_route = fixed_route;
        this.maximum = maximum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getFixed_route() {
        return fixed_route;
    }

    public void setFixed_route(Route fixed_route) {
        this.fixed_route = fixed_route;
    }

    //عشان ننقص العدد لمن يحجزو الاشخاص
    public int getMaximum() {
        return --maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    //نتاكد اذا السياره متاحه او لا
    public boolean isAvailable() {
        return maximum > 0;
    }

}
