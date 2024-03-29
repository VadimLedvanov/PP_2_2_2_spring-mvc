package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDao {
    List<Car> cars = Arrays.asList(
            new Car(1, "bmw", 2024),
            new Car(2, "mercedes", 2020),
            new Car(3, "audi", 2015),
            new Car(4, "lada vesta", 1993),
            new Car(5, "lexus", 2014));

    @Override
    public List<Car> printCars(Integer count) {
        if (count == null) {
            return cars;
        }

        if (count >= cars.size())
            return cars;
        else return cars.subList(0, count);
    }


}
