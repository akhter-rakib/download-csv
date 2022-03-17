package com.rakib.downloadcsv.model;

import com.rakib.downloadcsv.export.AbstractExporter;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductCSVExporter extends AbstractExporter {
    public void export(List<Product> list, HttpServletResponse response) throws IOException {
        super.setResponseHeader(response, "text/csv;charset=utf-8", ".csv", "product_");
        ICsvBeanWriter csvBeanWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
        String[] csvHeader = {"ID", "PRODUCT NAME", "Batch NAME"};
        String[] fieldMapping = {"id", "productName", "batchName"};
        csvBeanWriter.writeHeader(csvHeader);
       /* for (Product product : list){
            csvBeanWriter.write(product, fieldMapping);
        }*/
        list.forEach(product -> {
            try {
                csvBeanWriter.write(product, fieldMapping);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        csvBeanWriter.close();
    }
}
