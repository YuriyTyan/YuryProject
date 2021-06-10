package class31;

public abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName = insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}

class Car extends Insurance{
    String carModel;
    Car(String insuranceName, String carModel){
        super (insuranceName);
        this.carModel = carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote for car Model "+carModel+" with "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance "+insuranceName+" for car model "+ carModel);

    }
}

class Pet extends Insurance {

    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote for pet "+petType+" with "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance "+insuranceName+" for car model "+ petType);
    }
}
class Health extends Insurance {

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {

    }

    @Override
    public void cancelInsurance() {

    }
}