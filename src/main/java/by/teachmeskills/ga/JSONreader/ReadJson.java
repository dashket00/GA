package by.teachmeskills.ga.JSONreader;

import by.teachmeskills.ga.JSONreader.ZakazJ;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadJson {
    public static void main(String[] args) {
        File jsonFile = new File("json.json");

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            ZakazJ zakazJ = objectMapper.readValue(jsonFile, ZakazJ.class);

            System.out.println("Дата заказа: " + zakazJ.getData());
            System.out.println("Магазин: " + zakazJ.getShop());
            System.out.println("Товары:");
            for (ZakazJ.Good good : zakazJ.getGoods()) {
                System.out.println("  - " + good.getName() + ": $" + good.getPrice());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
