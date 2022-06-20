package designPattern.singleton;

public class AirforceOne {
    private volatile static AirforceOne onlyInstance;

    // Make the constructor private so its only accessible to
    // member class

    private AirforceOne(){

    }
    public void fly(){
        System.out.println("Airforce one is flying...");
    }

    // Create a static method for object creation
    public static AirforceOne getInstance(){
        if (onlyInstance == null){

            synchronized (AirforceOne.class){
                if(onlyInstance== null){
                    onlyInstance = new AirforceOne();
                }
            }
        }
        return onlyInstance;
    }
}

class Client{
    public void main(){
        AirforceOne airforceOne = AirforceOne.getInstance();
        airforceOne.fly();
    }
}
