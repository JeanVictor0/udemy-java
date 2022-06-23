package junit.modelo;

import java.util.ArrayList;
import java.util.List;

class Campo {
  private final int linha;
  private final int coluna;
  private boolean minado;
  private boolean aberto;
  private boolean marcado;

  private List<Campo> vizinhos = new ArrayList<>();
  Campo(int linha,int coluna){
    this.linha = linha;
    this.coluna = coluna;
  }

  
}