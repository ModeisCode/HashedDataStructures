public class Car {
    String Id;
    String owner;

    public Car(String id, String owner) {
        Id = id;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Id='" + Id + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
