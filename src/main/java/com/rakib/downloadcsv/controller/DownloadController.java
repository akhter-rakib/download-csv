package com.rakib.downloadcsv.controller;

import com.rakib.downloadcsv.service.ProductExportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class DownloadController {

    private final ProductExportService productExportService;

    public DownloadController(ProductExportService productExportService) {
        this.productExportService = productExportService;
    }

    @GetMapping("exportProductCSV")
    public void export(HttpServletResponse response) throws IOException {
        productExportService.productExporter(response);
    }
}
