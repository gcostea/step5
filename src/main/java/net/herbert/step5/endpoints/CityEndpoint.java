package net.herbert.step5.endpoints;

import net.herbert.step5.model.City;
import net.herbert.step5.repository.CityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/cities")
public class CityEndpoint {

    @GetMapping
    public Flux<City> getAll() {
        return cityRepository.findAll();
    }

    public CityEndpoint(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    private final CityRepository cityRepository;

}
