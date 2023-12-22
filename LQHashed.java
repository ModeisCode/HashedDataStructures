public class LQHashed {


    public static final int CAPACITY = 1000;
    Car cars[] = new Car[CAPACITY];


    public void add(Car car) {
        cars[generateHash(car.Id)] = car;
    }

    public void delete(String Id) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                if (cars[i].Id == Id)
                    cars[i] = null;
            }
        }
    }

    public void print() {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println(cars[i].toString());
            }
        }
    }


    public void update(String Id,Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                if (cars[i].Id == Id)
                    cars[i] = car;
            }
        }
    }

    private int generateHash(String Id) {
        int hash = 0;
        int ascii = 0;
        for (int i = 0; i < Id.length(); i++) {
            ascii = (int)Id.charAt(i);
            hash += ascii;
        }
        hash = hash % CAPACITY;
        if (validHash(hash)) {
            while (validHash(hash) && cars[hash] != null) {
                hash++;
                if (!validHash(hash))
                    return hash;
            }
        }
        return hash;
    }

    private boolean validHash(int hash) {
        if (hash <= CAPACITY && hash >= 0)
            return true;
        return false;
    }

}
