package com.kcrs.estudio.dvpdfgenerator.cvgenerator.services;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.exceptions.controller.PdfFailCreationException;
import com.kcrs.estudio.dvpdfgenerator.cvgenerator.services.interfaces.PDFGeneratorInterface;
import com.lowagie.text.Document;

import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.ZonedDateTime;

@Service
public class PDFGenerator implements PDFGeneratorInterface {
    @Override
    public void pdfGenerator(HttpServletResponse response) {
        Document document= new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, response.getOutputStream());
        } catch (IOException e) {
            throw new PdfFailCreationException("SE001",e.getMessage(),"", ZonedDateTime.now());
        }
        document.open();

        Font fontTitle= FontFactory.getFont(FontFactory.COURIER_BOLD);
        fontTitle.setSize(18);

        Paragraph paragraph= new Paragraph("this is a title", fontTitle);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);


        Font fontParagaph= FontFactory.getFont(FontFactory.COURIER_BOLD);
        fontTitle.setSize(18);

        Paragraph paragraph2= new Paragraph("this is a paragraph text test", fontParagaph);
        paragraph.setAlignment(Paragraph.ALIGN_LEFT);

        document.add(paragraph);
        document.add(paragraph2);
        document.close();

        }
}
