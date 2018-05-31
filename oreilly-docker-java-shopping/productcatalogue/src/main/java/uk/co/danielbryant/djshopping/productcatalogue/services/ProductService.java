package uk.co.danielbryant.djshopping.productcatalogue.services;

import uk.co.danielbryant.djshopping.productcatalogue.model.Product;

import java.math.BigDecimal;
import java.util.*;

public class ProductService {

    //{productId, Product}
    private Map<String, Product> fakeProductDAO = new HashMap<>();

    public ProductService() {
        fakeProductDAO.put("1", new Product("1", "Michel", "Premium ACME Widgets", new BigDecimal(1.20)));
        fakeProductDAO.put("2", new Product("2", "Sprocket", "Grade B sprockets", new BigDecimal(4.10)));
        fakeProductDAO.put("3", new Product("3", "Rishabh", "Large Anvils", new BigDecimal(45.50)));
        fakeProductDAO.put("4", new Product("4", "steve", "Grade D cogs", new BigDecimal(1.80)));
        fakeProductDAO.put("5", new Product("5", "Tool", "Multitools", new BigDecimal(154.10)));
        fakeProductDAO.put("6", new Product("6", "Nic", "Single", new BigDecimal(1054.30)));
        fakeProductDAO.put("7", new Product("7", "Screw", "Phone", new BigDecimal(137.40)));
        fakeProductDAO.put("8", new Product("8", "link", "Iphone", new BigDecimal(197.40)));
        fakeProductDAO.put("9", new Product("9", "G5", "Moto", new BigDecimal(157.40)));
        fakeProductDAO.put("10", new Product("10", "samsung", "S9", new BigDecimal(188.40)));
        fakeProductDAO.put("11", new Product("11", "samsung", "S8", new BigDecimal(140.40)));

    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(fakeProductDAO.values());
    }

    public Optional<Product> getProduct(String id) {
        return Optional.ofNullable(fakeProductDAO.get(id));
    }
}
