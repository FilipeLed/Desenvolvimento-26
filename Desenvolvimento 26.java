import java.io.Serializable;

public class Cliente implements Serializable

{
  private String nome;
  private char sexo;
  private String cpf;
  public Cliente(String nome, char sexo, String cpf)
  {
    
    this.nome = nome;
    this.sexo = sexo;
    this.cpf = cpf;
  }
  public String getCpf()
  {
    return cpf;
  }
  public void setCpf(String cpf)
  {
    this.cpf = cpf;
  }
  public String getNome()
  {
    return nome;
  }
  public void setNome(String nome)
  {
    this.nome = nome;
  }
  public char getSexo()
  {
    return sexo;
  }
  public void setSexo(char sexo)
  {
    this.sexo = sexo;
  }
  public String toString()
  {
    return this.nome + " / " + "Sexo: " + this.sexo + "\n" + "CPF: "
    + this.cpf;
  }
}


package br.com.artigos.serial;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExemploStream
{
  public static void main(String[] args)
  {
    // Cria o objeto serializado
    Cliente cliente = new Cliente("Filipe Diniz", 'M', "0000000001");
    try
    {
      //Gera o arquivo para armazenar o objeto
      FileOutputStream arquivoGrav =
      new FileOutputStream("/Users/filipe/Desktop/saida.dat");
      //Classe responsavel por inserir os objetos
      ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
      //Grava o objeto cliente no arquivo
      objGravar.writeObject(cliente);
      objGravar.flush();
      objGravar.close();
      arquivoGrav.flush();
      arquivoGrav.close();
      System.out.println("Objeto gravado com sucesso!");
    }

    catch(Exception e) {
      e.printStackTrace();
    }
    System.out.println("Recuperando objeto: ");
    //Carrega o arquivo
    FileInputStream arquivoLeitura = new FileInputStreamc: /saida.dat;
    //Classe responsavel por recuperar os objetos do arquivo
    ObjectInputStream objLeitura =
    new ObjectInputStream(arquivoLeitura);
    System.out.println(objLeitura.readObject());
    objLeitura.close();
    arquivoLeitura.close();
  }

}