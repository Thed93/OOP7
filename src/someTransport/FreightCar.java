package someTransport;

public class FreightCar extends Transport implements Competing {
    public FreightCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startDriving() {
        System.out.println("Развивает скорость 100 км/ч за 15 секунд.");
    }

    @Override
    public void endDriving() {
        System.out.println("Останавливается за 15 секунд.");
    }
    @Override
    public void pitStop() {
        System.out.println("Дозаправляют, проверяю общее состояние автомобиля, исправляют замеченные неисправности, отправляют дальше");

    }

    @Override
    public void bestLapTime() {
        System.out.println("3.20 мин.");

    }

    @Override
    public void maxSpeed() {
        System.out.println("100 км/ч");

    }
}