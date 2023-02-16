package operadores;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa consição é verdadeira");
        }
	    
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);
        
        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor a numeroDois? " + simNao);

        // ComparacaoAvancada
        String nomeUm = "PAUCIA";
        String nomeDois = new String("PAUCIA");

        System.out.println(nomeUm.equals(nomeDois)); //true
    }
}
