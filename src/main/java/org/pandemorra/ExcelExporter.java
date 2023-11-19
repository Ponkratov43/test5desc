package org.pandemorra;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelExporter {

    public void exportToExcel(List<Product> products, File file) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Product Catalog");

            // Создание заголовков
            Row headerRow = sheet.createRow(0);
            String[] headers = {"ID", "Name", "Category", "Action", "Photo", "Source Link", "Availability", "Price", "Description"};
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            // Заполнение данными
            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                Row row = sheet.createRow(i + 1);
                row.createCell(0).setCellValue(product.getId());
                row.createCell(1).setCellValue(product.getName());
                row.createCell(2).setCellValue(product.getCategory());
                row.createCell(3).setCellValue(product.getAction());
                row.createCell(4).setCellValue(product.getPhoto());
                row.createCell(5).setCellValue(product.getSourceLink());
                row.createCell(6).setCellValue(product.isAvailability());
                row.createCell(7).setCellValue(product.getPrice());
                row.createCell(8).setCellValue(product.getDescription());
            }

            // Запись в файл
            try (FileOutputStream outputStream = new FileOutputStream(file)) {
                workbook.write(outputStream);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
