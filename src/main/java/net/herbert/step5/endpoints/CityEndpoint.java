package net.herbert.step5.endpoints;

import net.herbert.step5.model.City;
import net.herbert.step5.repository.CityRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cities")
public class CityEndpoint {

    @GetMapping
    public Flux<City> getAll() {
        return cityRepository.findAll();
    }

    @GetMapping("/{name}")
    public Flux<City> getInCountry(@PathVariable String name) {
        return cityRepository.findByCountry(name);
    }

    @GetMapping("/{name}/count")
    public Mono<Long> getCountInCountry(@PathVariable String name) {
        return cityRepository.countAllInCountry(name);
    }

    public CityEndpoint(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    private final CityRepository cityRepository;

}
