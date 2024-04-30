public class Operadores {

    public static void main(String[] args) {
        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";

        if(a==b)
           resultado = "verdadeiro";
        else
           resultado = "falso";

        System.out.println(resultado);


        resultado = (a==b) ? "verdadeiro" : "falso";

        System.out.println(resultado);

        /* Operador de Atribuiçao eh representado por:
        O simbolo de igualdade "="

        Operadores Aritmeticos eh utilizado para representar operacoes matematicas:
        + (adicao)
        - (subtracao)
        / (divisao)
        ^ (potencia)
        % (resto de divisao)

        Operadores Unarios sao usados para incrementar, decrementar, inverter valores numericos e booleanos:
        (+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente
        (-) Operador unário de valor negativo – nega um número ou expressão aritmética
        (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade
        (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade
        (!) Operador unário lógico de negação – nega o valor de uma expressão booleana

        Operador ternario eh uma forma reduzida de definir uma condicao e escolher por um dentre dois valores:
        <Expressão Condicional>`` ? ``<Caso condição seja true>`` : ``<Caso condição seja false>
        Exemplo: String resultado = (a==b) ? "verdadeiro" : "false";

        Operadores relacionais avaliam a relacao entre duas variaveis ou expressoes:
        == Quando desejamos verificar se uma variável é IGUAL A outra
        != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        < Quando desejamos verificar se uma variável é MENOR QUE outra.
        <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

        Operadores logicos, representam o recurso que nos permite criar expressoes logicas maiores, a partir da juncao de duas ou mais expressoes.
        && Operador Lógico "E"
        || Operador Lógico "OU"

         */
    }
}
