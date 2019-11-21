package net.herbert.step5.repository;

import net.herbert.step5.model.City;
import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CityRepository extends ReactiveCrudRepository<City, String> {

    @Query("SELECT * FROM cities WHERE country = :countryName")
    Flux<City> findByCountry(String countryName);

    @Query("SELECT COUNT(*) FROM cities WHERE country = :countryName")
    Mono<Long> countAllInCountry(String countryName);

}
