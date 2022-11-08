import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;
import LoginAndPassword.Login;
import LoginAndPassword.User;
import someDrivers.Drivers;
import someDrivers.LitrenceB;
import someDrivers.LitrenceC;
import someDrivers.LitrenceD;
import someTransport.Buss;
import someTransport.Car;
import someTransport.FreightCar;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
//        Car lada = new Car("Лада", "Калина", 1.6f, Car.body.sedan);
//        Car bmw = new Car("БМВ", "Х5", 1.7f, Car.body.pickup);
//        Car toyota = new Car("Тойото", "Селика", 1.8f, Car.body.coupe);
//        Buss icarus = new Buss("Икарус", "Желтый", 1.9f, Buss.capacity.small);
//        Buss schoolBus = new Buss("Школьный", "Автобус", 2.0f, Buss.capacity.extraLarge);
//        Buss partyBus = new Buss("Автобус", "для вечеринок", 2.1f, Buss.capacity.middle);
//        FreightCar mann = new FreightCar("Манн", "45.1", 2.2f, FreightCar.carryCapacity.N1);
//        FreightCar kamaz = new FreightCar("Камах", "5450", 2.3f, FreightCar.carryCapacity.N2);
//        FreightCar ural = new FreightCar("Урал", "19.145", 2.4f, FreightCar.carryCapacity.N3);
//
//        System.out.println();
//        Drivers<LitrenceB> bob = new Drivers<LitrenceB>("Bob", new LitrenceB(lada), 2);
//        Drivers<LitrenceC> ron = new Drivers<LitrenceC>("Ron", new LitrenceC(ural), 3);
//        Drivers<LitrenceD> john = new Drivers<LitrenceD>("John", new LitrenceD(partyBus), 5);
//
//        System.out.println(bob + "\n" + ron + "\n" + john);
//
//        System.out.println(ron);

        User bob = new User("Bob", "123123");
        Login.confirmLiginAndPassword("Bob","123123","123123", bob);

    }
}
