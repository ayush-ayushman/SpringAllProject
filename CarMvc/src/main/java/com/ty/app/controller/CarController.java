package com.ty.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ty.app.dto.Car;

@Controller
public class CarController {
	private List<Car> listOfCars = new ArrayList<Car>();

	@RequestMapping(value = "/register")
	public String reg() {
		return "carInfo";

	}

	@RequestMapping(value = "/save")
	public String saveCar(HttpServletRequest request) {
		String manufacturename = request.getParameter("manu");
		String carType = request.getParameter("cartype");
		String carName = request.getParameter("cname");
		String engineCapacity = request.getParameter("eng");
		String horsePower = request.getParameter("hp");
		String torque = request.getParameter("tor");
		String imageUrl = request.getParameter("url");
		String cylinder = request.getParameter("cylinder");
		String seatingCapacity = request.getParameter("seatcap");
		String bootCapacity = request.getParameter("boot");
		Car car = new Car();
		car.setBoot(bootCapacity);
		car.setCarname(carName);
		car.setCartype(carType);
		car.setEngine(engineCapacity);
		car.setHorsepower(horsePower);
		car.setImageurl(imageUrl);
		car.setTorque(torque);
		car.setManufacturername(manufacturename);
		car.setCylinders(cylinder);
		car.setSeatscapacity(seatingCapacity);
		listOfCars.add(car);
		request.setAttribute("car3", listOfCars);
		return "success";

	}

}
