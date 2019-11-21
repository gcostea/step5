package net.herbert.step5.repository;

import net.herbert.step5.model.City;
import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CityRepository extends ReactiveCrudRepository<City, String> {

    @Query("SELECT * FROM cities c WHERE c.country = :country")
    Flux<City> findByCountry(String country);

    @Query("SELECT COUNT(*) FROM cities c WHERE c.country = :country")
    Mono<Long> countAllInCountry(String country);

}
