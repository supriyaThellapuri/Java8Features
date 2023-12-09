package org.example.Mart;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

    public class ShoppingCart {
        List<Products> product;

        public ShoppingCart() {
            this.product = new ArrayList<Products>();
        }
        public void addProduct(Products product) {
            this.product.add(product);
        }
        public Optional<List<Products>>getProduct() {

            return product.isEmpty() ? Optional.empty() : Optional.of(product);
        }
        public Optional<Double> calculateTotal() {
            return product.isEmpty() ? Optional.empty() : Optional.of(product.stream().mapToDouble(Products::getPrice).sum()) ;
        }

}
