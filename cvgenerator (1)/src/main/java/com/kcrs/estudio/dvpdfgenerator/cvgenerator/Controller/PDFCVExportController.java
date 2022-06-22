package com.kcrs.estudio.dvpdfgenerator.cvgenerator.Controller;

import com.kcrs.estudio.dvpdfgenerator.cvgenerator.services.interfaces.PDFGeneratorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/pdf/generator")
public class PDFCVExportController {
    @Autowired
    private PDFGeneratorInterface pdfGenerator;

    @GetMapping("/download")
        public void generatePDF(HttpServletResponse httpServletResponse) {
        httpServletResponse.setContentType("application/pdf");
        DateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormater.format(new Date());
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename= cv" + currentDateTime + ".pdf";
        httpServletResponse.setHeader(headerKey, headerValue);
        this.pdfGenerator.pdfGenerator(httpServletResponse);
    }


}
