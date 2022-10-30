package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImp {
    private  List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 34, "black"));
        cars.add(new Car("MB", 124,"silver"));
        cars.add(new Car("Honda", 9, "white" ));
        cars.add(new Car("Mitsubishi", 154, "red"));
        cars.add(new Car("MB", 210,"red") );

    }
    public List<Car> carList() {
        return cars;
    }


    public List<Car> returnQtyOfCar(Integer count) {
        carList().stream().limit(count).collect(Collectors.toList());

        return cars;
    }
}
