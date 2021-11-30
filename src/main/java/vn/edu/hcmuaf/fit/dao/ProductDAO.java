package vn.edu.hcmuaf.fit.dao;

import org.jdbi.v3.core.collector.JdbiCollectors;
import vn.edu.hcmuaf.fit.bean.Product;
import vn.edu.hcmuaf.fit.db.JDBIConnect;

import java.util.List;
import java.util.stream.Collectors;

public class ProductDAO {
    private static ProductDAO instance;

    private ProductDAO() {

    }

    public static ProductDAO getInstance() {
        if (instance == null) {
            instance = new ProductDAO();
        }
        return instance;
    }

    public List<Product> getAll() {
        return JDBIConnect.get().withHandle(handle -> {
            return handle.createQuery("SELECT * FROM products").mapToBean(Product.class).stream().collect(Collectors.toList());
        });

    }
}
