package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "model1", 1));
        cars.add(new Car(2, "model2", 2));
        cars.add(new Car(3, "model3", 3));
        cars.add(new Car(4, "model4", 4));
        cars.add(new Car(5, "model5", 5));
    }

    public List<Car> cars(int count) {
        return cars.stream()
                .limit(count).collect(Collectors.toList());
    }
}
