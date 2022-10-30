package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

import java.util.stream.Collectors;

@Controller
public class CarController {
    @Autowired
    private CarServiceImp carServiceImp;
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }



    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false)Integer count, ModelMap model) {
        if (count!=null) {
            model.addAttribute("cars",
                    carServiceImp.returnQtyOfCar(count).stream().limit(count).collect(Collectors.toList()));
        } else {
            model.addAttribute("cars", carServiceImp.carList());
        }
        return "cars";

    }
}
