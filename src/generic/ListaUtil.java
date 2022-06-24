 package generic;

import java.util.List;

public class ListaUtil {
  
  public static Object getUltimo1(List <Object> lista) {
    return lista.get(lista.size() - 1);
  }

  public static <T> T getUltimo2(List<T> lista){
    return lista.get(lista.size() - 1);
  }

//  public static <A,B,C> C getUltimo2(List<A,B,C> lista){
//   
//    return lista.get();
//  }
}