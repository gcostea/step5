package net.herbert.step5.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.test.StepVerifier;

@SpringBootTest
public class CityRepositoryTest {

    @Test @DisplayName("Test that the city database is not empty")
    public void testThatTheCityDatabaseIsNotEmpty() {
        cityRepository.countAllInCountry("Romania")
                .as(StepVerifier::create)
                .expectNextMatches(count -> count > 0)
                .verifyComplete();
    }

    @Autowired public CityRepositoryTest(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    private final CityRepository cityRepository;
}