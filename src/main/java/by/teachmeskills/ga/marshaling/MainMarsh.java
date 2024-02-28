package by.teachmeskills.ga.marshaling;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Arrays;

public class MainMarsh {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product();
        product1.setName("perfume");
        product1.setPrice(10000);

        Product product2 = new Product();
        product2.setName("lipstick");
        product2.setPrice(999);

        Goods goods = new Goods();
        goods.setProducts(Arrays.asList(product1, product2));

        Zakaz zakaz = new Zakaz();
        zakaz.setData("2024-02-01");
        zakaz.setShop("GA");
        zakaz.setGoods(goods);

        JAXBContext jaxbContext = JAXBContext.newInstance(Zakaz.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(zakaz, new File("marshProducts.xml"));
    }
}
