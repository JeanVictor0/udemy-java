package erros;

@SuppressWarnings("serial")
public class Personalizada {

    private String nomeDoAtributo;
    public Personalizada(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }
    
    public String getNomeDoAtributo() {
        return nomeDoAtributo;
    } 

    public void setNomeDoAtributo(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }
    
}
