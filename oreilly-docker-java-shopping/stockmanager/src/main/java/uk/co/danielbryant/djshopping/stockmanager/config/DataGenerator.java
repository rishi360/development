package uk.co.danielbryant.djshopping.stockmanager.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import uk.co.danielbryant.djshopping.stockmanager.model.Stock;
import uk.co.danielbryant.djshopping.stockmanager.repositories.StockRepository;

import javax.annotation.PostConstruct;

@Component
public class DataGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataGenerator.class);

    private StockRepository stockRepository;

    @Autowired
    protected DataGenerator(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @PostConstruct
    @Transactional
    public void init() {
        LOGGER.info("Generating synthetic data for demonstration purposes...");

        stockRepository.save(new Stock("1", "12345678", 5));
        stockRepository.save(new Stock("2", "34567890", 2));
        stockRepository.save(new Stock("3", "54326745", 999));
        stockRepository.save(new Stock("4", "93847614", 0));
        stockRepository.save(new Stock("5", "11856388", 1));
        stockRepository.save(new Stock("6", "00002228", 55));
        stockRepository.save(new Stock("7", "99891190", 1101));
        stockRepository.save(new Stock("8", "88864412", 67));
        stockRepository.save(new Stock("9", "88864445", 4));
        stockRepository.save(new Stock("10", "84451145", 5));
        stockRepository.save(new Stock("11", "88864444", 10));
        LOGGER.info("... data generation complete");
    }
}
