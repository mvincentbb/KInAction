package designPattern.builder;

public class BuilderTest {

    public static void main(String[] args) {
        IglooHouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
        engineer.constructHouse();

        House house = engineer.getHouse();
        System.out.println("Builder constructed :"+ house);

    }
}
