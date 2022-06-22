package junit.modelo;

class Campo {
  private final int linha;
  private final int coluna;
  private boolean minado;
  private boolean aberto;
  private boolean marcado;

  Campo(int linha,int coluna){
    this.linha = linha;
    this.coluna = coluna;
  }

  
}