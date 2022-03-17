package com.rakib.downloadcsv.service;

import com.rakib.downloadcsv.model.Product;
import com.rakib.downloadcsv.model.ProductCSVExporter;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductExportService {

    public void productExporter(HttpServletResponse response) throws IOException {
        List<Product> list = productList();
        ProductCSVExporter exporter = new ProductCSVExporter();
        exporter.export(list, response);
    }

    List<Product> productList() {
        List<Product> list = new ArrayList<>();
        Product p1 = new Product(1, "P1", "B1");
        Product p2 = new Product(1, "P1", "B1");
        Product p3 = new Product(1, "P1", "B1");
        Product p4 = new Product(1, "P1", "B1");
        Product p5 = new Product(1, "P1", "B1");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        return list;
    }
}
