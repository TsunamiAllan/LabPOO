import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Arquivo 
{
    private String caminho, nome;
    private String conteudo;

    public Arquivo(String caminho, String nome) 
    {
        this.caminho = caminho;
        this.nome = nome;
        this.conteudo = new String();
    }    
    public boolean salvar()
    {
        try{
            FileWriter w = new FileWriter(this.caminho + "\\" + this.nome);
            w.write(conteudo);
            try {
                w.flush();
                w.close();
            } catch (IOException e) {                
                e.printStackTrace();
            }
            return true;
        }catch(IOException e)
        {
            e.printStackTrace();
            return false;
        } 
               
    }
    public boolean carregar()
    {
        try
        {           
            Path path = Paths.get(this.caminho + "\\" +this.nome);
            this.conteudo = new String(Files.readAllBytes(path));
            return true;
        }catch(IOException e)
        {
            e.printStackTrace();
            return false;
        }
       
    }
    public String getCaminho() 
    {
        return caminho;
    }
    public void setCaminho(String caminho) 
    {
        this.caminho = caminho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 
    
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    
}
