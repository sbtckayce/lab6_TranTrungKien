package vn.edu.hcmuaf.fit.services;

import vn.edu.hcmuaf.fit.bean.Product;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductService {
    private static ProductService intance;
    private static Map<String, Product> maps = new HashMap<String, Product>();

    static {
        maps.put("1", new Product("1", "Acer Aspire 3", "A315 56 37 DV", "11.900.000 đ", "10.999.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/bravo.png"));
        maps.put("2", new Product("2", "Nitro 5 Eagle", "AN 515 57-720", "34.490.000 đ", "28.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/nitro5.png"));
        maps.put("3", new Product("3", "Zephyrus G14", "GA 401QE-K209T", "43.990.000 đ", "39.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/aspire7.jpg"));
        maps.put("4", new Product("4", "MSI Moderm", "BQ 1006T", "14.990.000 đ", "13.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/msi.jpg"));
        maps.put("5", new Product("5", "Pretador Helios", "300 PH 315", "39.990.000 đ", "37.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/aspi7.jpg"));
        maps.put("6", new Product("6", "Ideapad 5 pro 16", "5410 V415", "25.990.000 đ", "24.299.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/idea.jpg"));
        maps.put("7", new Product("7", "Macbook Air 13.3", "LOU 9311", "41.090.000 đ", "39.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/maccc.jpg"));
        maps.put("8", new Product("8", "MSI Bravo 15", "B5DD 246", "24.990.000 đ", "22.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/bravo.png"));
        maps.put("9", new Product("9", "HP 15 EF130", "GA 401QE-K209T", "12.990.000 đ", "11.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/hp15.jpg"));
        maps.put("10", new Product("10", "Asus ExpertBook", "FX 516 PM", "32.490.000 đ", "30.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/exper.png"));

        maps.put("11", new Product("11", "Acer Aspire 7", "A 715-42G", "25.990.000 đ", "23.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/aspi7.jpg"));
        maps.put("12", new Product("12", "Dell Alienware M15", "Edittion 7123", " 59.990.000 đ", "58.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/alien.png"));
        maps.put("13", new Product("13", "Ideapad 3", "82NWERT", "36.990.000 đ", "35.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/g2.jpg"));
        maps.put("14", new Product("14", "HP Pavillion", "EJ268", "52.090.000 đ", "49.599.000 đ", 1,
                "http://localhost:8080/lab6/assets/img/pavi.jpg"));
    }

    public static ProductService getIntance() {
        if (intance == null) {
            intance = new ProductService();

        }
        return intance;
    }

    private ProductService() {

    }
    public List<Product> getAll(){
        return new LinkedList<Product>(maps.values());
    }
}
