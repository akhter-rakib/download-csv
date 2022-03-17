package com.rakib.downloadcsv.export;

import com.rakib.downloadcsv.util.DateUtils;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class AbstractExporter {

    protected void setResponseHeader(HttpServletResponse response, String contentType, String extension, String prefix) {

        String fileName = prefix + DateUtils.getDate(new Date(), "yyyy-MM-dd_HH-mm-ss") + extension;
        response.setContentType(contentType);
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=" + fileName;
        response.setHeader(headerKey, headerValue);
    }
}
