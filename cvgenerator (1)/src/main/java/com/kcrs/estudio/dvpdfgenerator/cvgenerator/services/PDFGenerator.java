package com.kcrs.estudio.dvpdfgenerator.cvgenerator.services;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.controller.PdfFailCreationException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.services.interfaces.PDFGeneratorInterface;
import com.lowagie.text.Document;

import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.time.ZonedDateTime;

@Service
public class PDFGenerator implements PDFGeneratorInterface {
    @Override
    public void pdfGenerator(HttpServletResponse response) {
        Document document = new Document(PageSize.A4, 10, 10, 10, 10);


        try {
            PdfWriter.getInstance(document, response.getOutputStream());
        } catch (IOException e) {
            throw new PdfFailCreationException("SE001", e.getMessage(), "", ZonedDateTime.now());
        }
        document.open();
        footer(document);
        Font fontTitle = FontFactory.getFont(FontFactory.COURIER_BOLD);
        fontTitle.setSize(18);

        Paragraph paragraph = new Paragraph("this is a title", fontTitle);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);


        Font fontParagaph = FontFactory.getFont(FontFactory.COURIER_BOLD);
        fontTitle.setSize(18);

        Paragraph paragraph2 = new Paragraph("this is a paragraph text test", fontParagaph);
        paragraph.setAlignment(Paragraph.ALIGN_LEFT);


        document.add(paragraph);
        document.add(paragraph2);
        document.newPage();
        document.add(paragraph2);
        document.newPage();
        tablepdf(document);
        document.close();

    }


    public Document footer(Document document) {

            //PdfWriter.getInstance(document, new FileOutputStream("footer.pdf"));
            HeaderFooter footer = new HeaderFooter(false, new Phrase(" hoja de vida ferney"));
            footer.setAlignment(Element.ALIGN_CENTER);
            footer.setBorderWidthBottom(0);
            document.setFooter(footer);
            document.open();
            document.add(new Paragraph(" header "));




        return document;
    }


    public void tablepdf(Document document){
        PdfPTable table = new PdfPTable(4);
        PdfPCell cell;
        cell = new PdfPCell(new Paragraph("test colors:"));
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("red"));
        cell.setBorder(Rectangle.NO_BORDER);
        cell.setBackgroundColor(Color.red);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("green"));
        cell.setBorder(Rectangle.BOTTOM);
        cell.setBorderColorBottom(Color.magenta);
        cell.setBorderWidthBottom(10f);
        cell.setBackgroundColor(Color.green);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("blue"));
        cell.setBorder(Rectangle.TOP);
        cell.setUseBorderPadding(true);
        cell.setBorderWidthTop(5f);
        cell.setBorderColorTop(Color.cyan);
        cell.setBackgroundColor(Color.blue);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("test GrayFill:"));
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("0.25"));
        cell.setBorder(Rectangle.NO_BORDER);
        cell.setGrayFill(0.25f);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("0.5"));
        cell.setBorder(Rectangle.NO_BORDER);
        cell.setGrayFill(0.5f);
        table.addCell(cell);
        cell = new PdfPCell(new Paragraph("0.75"));
        cell.setBorder(Rectangle.NO_BORDER);
        cell.setGrayFill(0.75f);
        table.addCell(cell);
        document.add(table);
    }
}
