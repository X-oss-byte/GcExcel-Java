package com.grapecity.documents.excel.examples.features.pagesetup;

import java.net.URL;

import com.grapecity.documents.excel.IWorksheet;
import com.grapecity.documents.excel.Workbook;
import com.grapecity.documents.excel.examples.ExampleBase;

public class ConfigPageMargins extends ExampleBase {

    @Override
    public void execute(Workbook workbook) {
        workbook.open(this.getResourceStream("xlsx/PageSetup Demo.xlsx"));
        IWorksheet worksheet = workbook.getWorksheets().get(0);

        //Set margins, in points.
        worksheet.getPageSetup().setTopMargin(36);
        worksheet.getPageSetup().setBottomMargin(36);
        worksheet.getPageSetup().setRightMargin(72);

    }

    @Override
    public String getTemplateName() {
        return "PageSetup Demo.xlsx";
    }

    @Override
    public String[] getResources() {
        return new String[] {"xlsx/PageSetup Demo.xlsx"};
    }
}
