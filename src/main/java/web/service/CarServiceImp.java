package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {

    List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();

        cars.add(new Car("toyota", 11, 1995));
        cars.add(new Car("honda", 22, 1990));
        cars.add(new Car("ford", 33, 2005));
        cars.add(new Car("mazda", 44, 2010));
        cars.add(new Car("mercedes", 55, 2000));
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}
