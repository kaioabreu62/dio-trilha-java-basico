/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author  Gleyson Sampaio
 * @version 1.0
 * @since   01/01/2022
 */

/* Tags
Mas e quais as informações, que obtemos através de classes documentadas, na linguagem ? Java Documentation é composto por tags que, representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:
Tag	Descrição
@autor - Autor / Criador
@version - Versão do recurso disponibilizado
@since - Versão / Data de início da disponibilização do recurso
@param - Descrição dos parâmetros dos métodos criados
@return - Definição do tipo de retorno de um método
@throws - Se o método lança alguma exceção
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}
