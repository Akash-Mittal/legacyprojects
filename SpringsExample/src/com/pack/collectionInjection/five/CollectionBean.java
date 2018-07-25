package com.pack.collectionInjection.five;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
Map pricesMap;
List productList;
Set productSet;
Properties description;

public Map getPricesMap() {
	return pricesMap;
}
public void setPricesMap(Map pricesMap) {
	this.pricesMap = pricesMap;
}
public List getProductList() {
	return productList;
}
public void setProductList(List productList) {
	this.productList = productList;
}
public Set getProductSet() {
	return productSet;
}
public void setProductSet(Set productSet) {
	this.productSet = productSet;
}
@Override
public String toString() {
	return "CollectionBean [pricesMap=" + pricesMap + ", productList="
			+ productList + ", productSet=" + productSet + ", description="
			+ description + "]";
}
public Properties getDescription() {
	return description;
}
public void setDescription(Properties description) {
	this.description = description;
}


	
	
}
