//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //انشاء طريقين واعطائهم قيم
        Route r1 = new Route("makkah", "riyadh", 100);
        Route r2 = new Route("makkah", "riyadh", 500);
//السياره الاولى
        Car c1 = new Car("Car1", r1, 2);
//انشاء ركاب
        Passenger p1 = new Subscribers("Abeer", "10011") {
        };// الراكب الاول مشترك بخصم 50% على قيمه رحلته
        Passenger p2 = new Non_Subscribers("lolo", "10012", true) {
        };// الراكب الثاني الغير مشترك بخصم 10% على قيمه رحلته

//محاوله حجز سياره محجوزه
        Passenger p3 = new Passenger("abeer", "001") {
        };
// انشاء سياره طاقتها الاستيعابيه 0
        Car c2 = new Car("002", r2, 0);
        //انشاء ركاب وظهور رساله خطا لا السياره لا تكفي او غير متاحه
        Passenger p4 = new Subscribers("majd", "001001") {
        };
        Passenger p5 = new Non_Subscribers("ohod", "123400", true);


        System.out.println("-----------car1--------------");
        System.out.println(p1.reserved_car(c1));
        p1.display_info();
        System.out.println("------------------------");
        System.out.println(p2.reserved_car(c1));
        p2.display_info();
        System.out.println("------------------------");
        System.out.println(p3.reserved_car(c1));
        p3.display_info();
        System.out.println("\n-----------car2--------------\n");
        System.out.println(p2.reserved_car(c2));
        p4.display_info();
        System.out.println("------------------------");
        System.out.println(p3.reserved_car(c2));
        p5.display_info();


    }
}