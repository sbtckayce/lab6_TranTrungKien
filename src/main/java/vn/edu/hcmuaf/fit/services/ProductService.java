package vn.edu.hcmuaf.fit.services;

import vn.edu.hcmuaf.fit.bean.Product;
import vn.edu.hcmuaf.fit.dao.ProductDAO;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ProductService {
    private static ProductService intance;


    public static ProductService getIntance() {
        if (intance == null) {
            intance = new ProductService();

        }
        return intance;
    }

    private ProductService() {

    }
    public List<Product> getAll(){

        return ProductDAO.getInstance().getAll();
    }


}
