package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code) {
        try {
            InputStream is = new ClassPathResource("country.xml").getInputStream();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document doc = factory.newDocumentBuilder().parse(is);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("country");
            List<Country> countries = new ArrayList<>();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String cCode = element.getElementsByTagName("code").item(0).getTextContent();
                String cName = element.getElementsByTagName("name").item(0).getTextContent();
                countries.add(new Country(cCode, cName));
            }

            return countries.stream()
                    .filter(c -> c.getCode().equalsIgnoreCase(code))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Country not found"));

        } catch (Exception e) {
            throw new RuntimeException("Error reading country.xml", e);
        }
    }
}
