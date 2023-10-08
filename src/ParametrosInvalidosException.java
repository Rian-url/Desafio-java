
public class ParametrosInvalidosException extends Exception {
    public static void main(String[] args) {
    }

    static int formatarContagem(int contagem) throws ParametrosInvalidosException{
       if( contagem < 0){
       throw new ParametrosInvalidosException();
       }

       return contagem;
    }

}
