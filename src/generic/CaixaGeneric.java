package generic;

public class CaixaGeneric<TIPO> {
  private TIPO coisa;

   public void guardar(TIPO coisa){
    this.coisa = coisa;
  }

  public TIPO abrir(){
    return coisa;
  }
}