package org.exemple;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class BibliotecaManager {

    private final String nameArquivo;
    private final XmlMapper xmlMapper;


    public BibliotecaManager(String nameArquivo){
        this.nameArquivo = nameArquivo;
        //this.xmlMapper = new XmlMapper();

        //Ativa a formatação correta (identação, quebra linha) no xml  VERSÃO 3
        this.xmlMapper = XmlMapper.builder()
                .enable(SerializationFeature.INDENT_OUTPUT)
                .build();

        //this.xmlMapper.isEnabled(SerializationFeture.INDENT_OUTPUT);
    }

    public Biblioteca carregar() {
        File arquivo = new File(this.nameArquivo);

        if(!arquivo.exists()){
            System.out.println("Arquivo não encontrado. Criando nova Biblioteca...");
            return new Biblioteca();
        }

        try{
            //Lê os aquivos e retorna um objeto
            return xmlMapper.readValue(arquivo, Biblioteca.class);
        }catch (JacksonException e){
            System.out.println("Erro ao ler o arquivo XML: " + e.getMessage());

            e.printStackTrace();
            return new Biblioteca();
        }


    }

    public void salvar(Biblioteca biblioteca){
        try{
            xmlMapper.writeValue(new File(nameArquivo), biblioteca);
        }catch (JacksonException e){
            System.out.println("Eroo ao salvar o arquivo XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
