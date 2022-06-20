package designPattern.builder;

public class IglooHouseBuilder implements HouseBuilder{


    private House house;

    public IglooHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildBasement() {
       house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice Block");
    }

    @Override
    public void buildRoof() {
        house.setStructure("Ice Dome");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice Carving");

    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
