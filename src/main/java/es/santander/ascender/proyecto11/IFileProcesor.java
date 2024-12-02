package es.santander.ascender.proyecto11;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

interface IFileProcesor {
    String leerFile(String filePath) throws Exception;
    String eliminarVocales(String input);
    void escribirAFile(String filePath, String content) throws Exception;
}

public class FileProcesor implements IFileProcesor {
    //Metodo 
        // public o private = public
        //tipo de elemento que retorna = string
        //nombre del metodo = leerFile
        //atributos (tipo de atributo + nombre de atributo) = String filePath
        //excepcion (opcional)                                       
        //contenido del metodo entre llaves 
    @Override 
    public String leerFile(String filePath) throws IOException {
        Path path = Path.of(filePath);
        return Files.readString(path);
    }   
    @Override
    public void escribirAFile(String filePath, String content) throws IOException {
        Files.writeString(Path.of(filePath), content);
    }

   @Override
    public String eliminarVocales(String input) {
        return input.replaceAll("[aeiouAEIOU]", "");
    }
}
