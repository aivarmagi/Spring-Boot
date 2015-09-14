package ee.aivar.services;

import ee.aivar.domain.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

	Iterable<Product> listAllProducts();

	Product getProductById(Integer id);

	Product saveProduct(Product product);

	void deleteProduct(Integer id);
}
