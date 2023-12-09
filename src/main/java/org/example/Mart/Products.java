package org.example.Mart;

public class Products {
        public String productname;
        public double price;

        public String getProductname() {
            return productname;
        }

        public void setProductname(String productname) {
            this.productname = productname;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Products(String productname, double price) {
            this.productname = productname;
            this.price = price;
        }
    }


