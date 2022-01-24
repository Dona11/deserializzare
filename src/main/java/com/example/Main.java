package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {
    
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

            //deserializzazione da un file XML a JAVA
            File file = new File("src/main/resources/classi.xml");
            XmlMapper xmlMapper = new XmlMapper();
            root value = xmlMapper.readValue(file, root.class);
            System.out.println("Cognomi:\n");
            for(int i = 0; i < value.getStudenti().size(); i++){
                System.out.println(value.getStudenti().get(i).getCognome());
            }
            //serializzazione da un java a un file.xml
            xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
            xmlMapper.writeValue(new File("src/main/resources/classe_aggiornata.xml"), value);
            File newFile = new File("classe_aggiornata.xml");
            //serializzazione da un file a una stringa
            String xml = xmlMapper.writeValueAsString(value);
            System.out.println(xml);
    }

}
