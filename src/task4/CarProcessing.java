package task4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarProcessing {
    @Test
    void removeDumplactes() {

        CarProcessing cp = new CarProcessing();

        Car[] cars = {
                new Car("Honda", "Civic", "Red"),
                new Car("Holden", "Civic", "Red"),
                new Car("Holden", "Civic", "Red"),
                new Car("Jeep", "Wrangler", "Blue"),
                new Car("Jeep", "Wrangler", "Green"),
                new Car("Jeep", "Wrangler", "Green"),
                new Car("Jeep", "Wrangler", "Green"),
                new Car("Holden", "Falcon", "Yellow"),
                new Car("Honda", "Civic", "Blue"),
                new Car("Honda", "Civic", "Blue"),
                new Car("Honda", "Falcon", "Blue"),
                new Car("Honda", "Civic", "Purple")
        };

        Car[] cars2 = {
                new Car("Honda", "Civic", "Red"),
                new Car("Jeep", "Wrangler", "Blue"),
                new Car("Jeep", "Wrangler", "Green"),
                new Car("Holden", "Falcon", "Yellow"),
                new Car("Honda", "Civic", "Blue"),
                new Car("Honda", "Falcon", "Blue"),
                new Car("Honda", "Civic", "Purple")
        };

        Car[] noDuplicates = cp.removeDuplicates(cars);


        assertArrayEquals(cars2,noDuplicates,"Not consistent with the expected results");
    }

    public Car[] removeDuplicates(Car[] inputArray) {


        Car[] temp=new Car[inputArray.length];

        int index=0;


        for (int i = 0; i < inputArray.length; i++) {

            boolean flag=true;

            for (int j = 0; j < index; j++) {

                if (inputArray[i].getModel().equals(temp[j].getModel())&&inputArray[i].getColor().equals(temp[j].getColor())){
                    flag=false;
                    break;
                }
            }

            if (flag){
                temp[index]=inputArray[i];
                index++;
            }
        }

        Car[] result=new Car[index];

        for (int i = 0; i < index; i++) {
            result[i]=temp[i];
        }
        return result;
    }

}
