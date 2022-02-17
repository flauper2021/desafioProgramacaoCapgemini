package questaoUm;

public class Main {

    public static void main(String[] args) {

        String caracter = "*";
        String vazio = "" ;
        String espaco = "     ";

        for(int i = 6; i > 0; i--){
            vazio = vazio + caracter;

            if(i > 1) {
                System.out.println( espaco + vazio);
                espaco = espaco.substring(0, espaco.length() - 1);
            }else{
                System.out.println(vazio);
            }
        }
    }
}

