public class Main {

    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay();
        clock.setTime(10 ,9 ,20 );
        clock.print();
        for(int i = 0; i < 3; i++)
        {
            clock.timeTick();
            clock.print();
        }
    }
}