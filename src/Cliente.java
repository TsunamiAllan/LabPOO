public class Cliente {
    private String nome;
    private String telefone;
    private  String pagamento;   
    
    public String getNome() {
        return nome;
    }

    public String getPagamento() {
        return pagamento;
    } 

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
