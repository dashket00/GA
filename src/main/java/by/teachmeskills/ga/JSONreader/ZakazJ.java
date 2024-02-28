package by.teachmeskills.ga.JSONreader;

import java.util.List;

public class ZakazJ {
    private String data;
    private String shop;
    private List<Good> goods;

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

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    public static class Good {
        private String name;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
