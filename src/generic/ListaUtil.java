 package generic;

public class ListaUtil {
  public static Object getUltimo1(List<Object> lista) {
    return lista.get(lista.size() - 1);
  }

  public static <T> T getUltimo2(List<T> lista){
    return lista.get(lista.size() - 1);
  }

  public static <a,b,c> c getUltimo2(List<a,b,c> lista){
    c teste = null;
    return c;
  }
}