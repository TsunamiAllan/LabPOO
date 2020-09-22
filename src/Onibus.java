public class Onibus {
    private Assento lugares[] = new Assento[20];
    private String origem;
    private String destino;
    
    public boolean addPassageiro(int lugar, Cliente c)
    {
        if(lugar<this.lugares.length & lugar>=0)
        {
         if(lugares[lugar]==null)
         {
             Assento a = new Assento();
             a.setCliente(c);
             this.lugares[lugar] = a;
             return true;
         }
        }else
        {
            return false;
        }
        return false;
    }
    
    public String imprimePassageiros()
    {
        String lista = "";
        for(int cont=0; cont<this.lugares.length; cont++)
        {
            if(lugares[cont]!=null)
            {
                lista+="Passageiro "+lugares[cont].getCliente().getNome()+", Assento "+ (cont+1)+ ", Pagamento " + lugares[cont].getCliente().getPagamento() + "\n";
            }
        }
        return lista;
    }

    public Assento[] getLugares() {
        return lugares;
    }

    public void setLugares(Assento[] lugares) {
        this.lugares = lugares;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
}
