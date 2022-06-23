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
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
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
}
