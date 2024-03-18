package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{


    private final CarDAOImpl carDAO;
    @Autowired
    public CarServiceImpl(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> printCars(Integer count) {
        return carDAO.printCars(count);
    }
}
