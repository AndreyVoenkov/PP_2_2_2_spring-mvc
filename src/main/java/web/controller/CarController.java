package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
@RequestMapping("/cars")
public class CarController {

	private CarServiceImp carServiceImp;

	@Autowired
	public CarController(CarServiceImp carServiceImp) {
		this.carServiceImp = carServiceImp;
	}

	@GetMapping

	public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
		model.addAttribute( "cars", carServiceImp.cars(count));
		return "cars/carsList";
	}
}