package pkg5;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	List products;
	Set productSet;
	Map prices;
	Properties description;
	public List getProducts() {
		return products;
	}
	public void setProducts(List products) {
		this.products = products;
	}
	public Set getProductSet() {
		return productSet;
	}
	public void setProductSet(Set productSet) {
		this.productSet = productSet;
	}
	public Map getPrices() {
		return prices;
	}
	public void setPrices(Map prices) {
		this.prices = prices;
	}
	public Properties getDescription() {
		return description;
	}
	public void setDescription(Properties description) {
		this.description = description;
	}
	
	
}
