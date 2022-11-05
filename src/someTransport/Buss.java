package someTransport;

public class Buss extends Transport implements Competing {
    public Buss(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startDriving() {
        System.out.println("Развивает скорость 100 км/ч за 20 секунд.");
    }

    @Override
    public void endDriving() {
        System.out.println("Останавливается за 20 секунд.");
    }

    @Override
    public void pitStop() {
        System.out.println("Дозаправляют, проверяю исправность, состояние пассажиров, отправляют дальше");

    }

    @Override
    public void bestLapTime() {
        System.out.println("5.05 мин.");

    }

    @Override
    public void maxSpeed() {
        System.out.println("60 км/ч");

    }
}