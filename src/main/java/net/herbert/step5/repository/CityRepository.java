package net.herbert.step5.repository;

import net.herbert.step5.model.City;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends ReactiveCrudRepository<City, Integer> {
}
