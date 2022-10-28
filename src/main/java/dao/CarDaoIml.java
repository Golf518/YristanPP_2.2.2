package dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoIml implements CarDao {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("BMW", 34, "black"));
        cars.add(new Car("MB", 124,"silver"));
        cars.add(new Car("Honda", 9, "white" ));
        cars.add(new Car("Mitsubishi", 154, "red"));
        cars.add(new Car("MB", 210,"red") );
    }

    @Override
    public List<Car> returnQtyOfCar(Integer count) {
        return addCarList().stream().limit(count < 0 ? 0 : count).collect(Collectors.toList());
    }

    @Override
    public List<Car> addCarList() {
        return null;
    }
}
