package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = {"/cars", "/cars.html"})
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {

        if (count > 5) {
            count = 5;
        }

        model.addAttribute("cars", carService.getCars(count));

        return "cars";
    }
}