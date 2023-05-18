package crud_operation.service;

import java.util.List;

import crud_operation.dao.LaptopDao;
import crud_operation.dto.Laptop;

public class LaptopService {
	
	LaptopDao laptopdao = new LaptopDao();

	// insertLaptop method
	public String insertLaptop(Laptop laptop) {
		return laptopdao.insertLaptop(laptop);
	}
	
	//displayLaptop method 
	public List<Laptop> displayLaptop() {
		return laptopdao.displayLaptop();
	}

}
