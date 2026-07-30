package org.exemple;

import lombok.Data;
import tools.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import tools.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import tools.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

@Data
@JacksonXmlRootElement(localName =  "biblioteca")
public class Biblioteca {
    @JacksonXmlElementWrapper(localName = "livros") //cria as tags livros do xml
    @JacksonXmlProperty(localName = "Livro")//cria as tags livro do xml

    private List<Livro> livros = new ArrayList<>();

    public Biblioteca(){}

    public Biblioteca(List<Livro> livros) {
        this.livros = livros;
    }
}
