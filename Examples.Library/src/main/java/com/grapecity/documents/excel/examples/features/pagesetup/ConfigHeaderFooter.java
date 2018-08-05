package com.grapecity.documents.excel.examples.features.pagesetup;

import java.io.InputStream;
import java.net.URL;

import com.grapecity.documents.excel.IWorksheet;
import com.grapecity.documents.excel.Workbook;
import com.grapecity.documents.excel.drawing.ImageType;
import com.grapecity.documents.excel.examples.ExampleBase;

public class ConfigHeaderFooter extends ExampleBase {

    @Override
    public void execute(Workbook workbook) {

        URL url = ClassLoader.getSystemResource("xlsx/PageSetup Demo.xlsx");
        String filePath = url.getPath().substring(1).replaceAll("%20", " ");
        workbook.open(filePath);
        IWorksheet worksheet = workbook.getWorksheets().get(0);

        //Set page headerfooter
        worksheet.getPageSetup().setLeftHeader("&\"Arial,Italic\"LeftHeader");
        worksheet.getPageSetup().setCenterHeader("&P");

        //Set page headerfooter's graphic
        worksheet.getPageSetup().setCenterFooter("&G");
        InputStream stream = ClassLoader.getSystemResourceAsStream("logo.png");
        worksheet.getPageSetup().getCenterFooterPicture().setGraphicStream(stream, ImageType.PNG);

        //If you have picture resources locally, you can also set graphic in this way.
        //worksheet.getPageSetup().setCenterFooter("&G");
        //worksheet.getPageSetup().getCenterFooterPicture().setFilename("C:\\picture.png");
        //worksheet.PageSetup.CenterFooterPicture.Filename = @"C:\picture.png";

    }

}