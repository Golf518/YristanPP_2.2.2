package service;

import dao.CarDao;
import dao.CarDaoIml;
import model.Car;

import java.util.List;

public class CarServiceImp implements CarService{
    private CarDao carDao = new CarDaoIml();

    @Override
    public List<Car> returnQtyOfCar(Integer count) {
        return null;
    }
}
