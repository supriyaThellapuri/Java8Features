package org.example.Mart;

public class Order {
    public static  void main(String[] args) {
        Products dress=new Products("summerdress",4500.00);
        Products shoes=new Products("Running shoes",500.00);
        ShoppingCart cart=new ShoppingCart();
        cart.addProduct(dress);
        cart.addProduct(shoes);
        cart.getProduct().ifPresent(products -> products.forEach(p->System.out.println(p.getProductname()+"- $"+p.getPrice())));
        cart.calculateTotal().ifPresent(total -> System.out.println(total));



    }
}
