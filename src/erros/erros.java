package erros;

class Erros {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        //try {} catch (Exception e) {}
    try {

    } catch (Exception e){

    }

        int c = a / b;
        System.out.println(c);
    }
    public void geraError (){
        new RuntimeException("Ocorreu um erro de execucao!");
    }
}