public class Construtores {

    public static void main(String[] args) {
        /* Construtores
           Sabemos que, para criar um objeto na linguagem Java, utilizamos a seguinte estrutura de código:

           Copy
           Classe novoObjeto = new Classe();
           Desta forma, será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

           Muitas vezes, já queremos que na criação (instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto, defina algumas propriedades essenciais. Abaixo, iremos ilustrar uma classe Pessoa, onde a mesma terá os atributos: Nome, CPF e Endereço.

            public class Pessoa {
                private String nome;
                private String cpf;
                private String endereco;

                public String getNome() {
                    return nome;
                }
                public String getCpf() {
                    return cpf;
                }
                public String getEndereco() {
                    return endereco;
                }
                public void setEndereco(String endereco) {
                    this.endereco = endereco;
                }
                //...
                //setters de nome e cpf ?
            }

            Criaremos uma Pessoa, mas como não temos o setter para nome e cpf, este objeto não tem como receber estes valores:

            public class SistemaCadastro {
                public static void main(String[] args) {
                    //criamos uma pessoa no sistema
                    Pessoa marcos = new Pessoa();

                    //definimos o endereço de marcos
                    marcos.setEndereco("RUA DAS MARIAS");

                    //e como definir o nome e cpf do marcos ?

                    //imprimindo o marcos sem o nome e cpf

                    System.out.println(marcos.getNome() + "-" + marcos.getCpf());
                }
            }

            Entrando em cena o construtor, para criar nossos objetos, já com valores requeridos no momento da criação\instanciação (new):
            public class Pessoa {
                private String nome;
                private String cpf;
                private String endereco;

                // método construtor
                // o nome deverá ser igual ao nome da classe
                public Pessoa (String cpf, String nome) {
                    this.cpf = cpf;
                    this.nome = nome;
                }

                //...
                //getters
                //setters
            }

            Alterando o nosso sistema, para agora criar o objeto com informações já requeridas, conforme definição da ordem dos parâmetros do construtor:
            public class SistemaCadastro {
                public static void main(String[] args) {
                    //criamos uma pessoa no sistema
                    Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");

                    //continua ...

                }
            }

         */
    }
}
