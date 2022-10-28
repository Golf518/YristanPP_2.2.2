package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue = "5")Integer count, Model model) {
        model.addAttribute("cars",
                new CarServiceImp().returnQtyOfCar(count));
        return "cars";
    }
}
