public class Endereco{
  
    //Atributos privados
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String cep;

    //Construtor completo
    public Endereco(String rua, int numero, String bairro, String cidade, String cep){
      this.rua = rua;
      this.numero = numero;
      this.bairro = bairro;
      this.cidade = cidade;
      this.cep = cep;
    }

    //Construtor sem CEP
    public Endereco(String rua, int numero, String bairro, String cidade){
      this.rua = rua;
      this.numero = numero;
      this.bairro = bairro;
      this.cidade = cidade;
    }

    //Get e Set para rua
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getRua() {
        return this.rua;
    }

    //Get e Set para numero
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }

    //Get e Set para bairro
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getBairro() {
        return this.bairro;
    }

    //Get e Set para cidade
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCidade() {
        return this.cidade;
    }

    //Get e Set para CEP
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCep() {
        return this.cep;
    }
}