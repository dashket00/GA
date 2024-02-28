package by.teachmeskills.ga.marshaling;

import javax.xml.bind.annotation.*;


import java.util.List;

    @XmlRootElement(name = "zakaz")
    @XmlAccessorType(XmlAccessType.FIELD)
    public class Zakaz {
        @XmlAttribute
        private String data;

        @XmlElement
        private String shop;

        @XmlElement
        private Goods goods;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getShop() {
            return shop;
        }

        public void setShop(String shop) {
            this.shop = shop;
        }

        public Goods getGoods() {
            return goods;
        }

        public void setGoods(Goods goods) {
            this.goods = goods;
        }
    }
    @XmlAccessorType(XmlAccessType.FIELD)
    class Goods {
        @XmlElement(name = "product")
        private List<Product> products;

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }
    }
    class Product {
    @XmlElement
    private String productName;

    @XmlElement
    private int productPrice;

        public String getName() {
            return productName;
        }

        public void setName(String productName) {
            this.productName = productName;
        }

        public int getPrice() {
            return productPrice;
        }

        public void setPrice(int productPrice) {
            this.productPrice = productPrice;
        }


}



