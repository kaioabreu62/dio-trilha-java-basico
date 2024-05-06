public class Modificadores {

    public static void main(String[] args) {
        /* Visibilidade dos recursos
           Modificadores
           Em Java, utilizamos três palavras reservadas e um conceito default (sem nenhuma palavra reservada) para definir os quatro tipo de visibilidade de atributos, métodos e até mesmo classes, no que se refere ao acesso por outras classes. Iremos ilustrar do mais visível, ao mais restrito tipo de visibilidade nos arquivos em nosso projeto.
           Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos, através do contexto em uma lanchonete, que vende lanche natural e suco.

           Modificador public
           Como o próprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote, poderá visualizar tais recursos.

           package lanchonete;

            public class Cozinheiro {
                //pode ser default
                public void adicionarLancheNoBalcao() {
                    System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
                }
                //pode ser default
                public void adicionarSucoNoBalcao() {
                    System.out.println("ADICIONANDO SUCO NO BALCÃO");
                }
                //pode ser default
                public void adicionarComboNoBalcao() {
                    adicionarLancheNoBalcao();
                    adicionarSucoNoBalcao();
                }
                public void prepararLanche() {
                    System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
                }
                public void prepararVitamina() {
                    System.out.println("PREPARANDO SUCO");
                }
                public void prepararCombo() {
                    prepararLanche();
                    prepararVitamina();
                }
                public void selecionarIngredientesLanche() {
                    System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
                }
                public void selecionarIngredientesVitamina() {
                    System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
                }
                public void lavarIngredientes() {
                    System.out.println("LAVANDO INGREDIENTES");
                }
                public void baterVitaminaLiquidificador() {
                    System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
                }
                public void fritarIngredientesLanche() {
                    System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
                }
                public void pedirParaTrocarGas(Atendente meuAmigo) {
                    meuAmigo.trocarGas();
                }
                public void pedirParaTrocarGas(Almoxarife meuAmigo) {
                    meuAmigo.trocarGas();
                }
                public void pedirIngredientes(Almoxarife almoxarife) {
                    almoxarife.entregarIngredientes();
                }
            }

            package lanchonete;

                public class Almoxarife {
                    public void controlarEntrada() {
                        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
                    }
                    public void controlarSaida() {
                        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
                    }
                    public void entregarIngredientes() {
                        System.out.println("ENTREGANDO INGREDIENTES");
                        //...?
                    }
                    public void trocarGas() {
                        System.out.println("ALMOXARIFE TROCANDO O GÁS");
                    }
                }

                package lanchonete;

                    public class Atendente {
                        public void servindoMesa() {
                            //...?
                            System.out.println("SERVINDO A MESA");
                        }
                        public void pegarLancheCozinha() {
                            System.out.println("PEGANDO O LANCHE NA COZINHA");
                        }
                        public void receberPagamento() {
                            System.out.println("RECEBENDO PAGAMENTO");
                        }
                        public void trocarGas() {
                            System.out.println("ATENDENTE TROCANDO O GÁS");
                        }
                        public void pegarPedidoBalcao() {
                            System.out.println("PEGANDO O PEDIDO NO BALCÃO");
                        }
                    }

                    package lanchonete;

                        public class Cliente {
                            public void escolherLanche() {
                                System.out.println("ESCOLHENDO O LANCHE");
                            }
                            public void fazerPedido() {
                                System.out.println("FAZENDO O PEDIDO");
                            }
                            public void pagarConta() {
                                System.out.println("PAGANDO A CONTA");
                            }
                            public void consultarSaldoAplicativo() {
                                System.out.println("CONSULTANDO SALDO NO APLICATIVO");
                            }
                            public void pegarPedidoBalcao() {
                                System.out.println("PEGANDO O PEDIDO NO BALCÃO");
                            }
                        }

                        package lanchonete;

                        public class Estabelecimento {
                            public static void main(String[] args) {
                                Cozinheiro cozinheiro = new Cozinheiro();
                                //ações que não precisam estarem disponíveis para toda a aplicação
                                cozinheiro.lavarIngredientes();
                                cozinheiro.baterVitaminaLiquidificador();
                                cozinheiro.selecionarIngredientesVitamina();
                                cozinheiro.prepararLanche();
                                cozinheiro.prepararVitamina();
                                cozinheiro.prepararVitamina();

                                //ações que estabelecimento precisa ter ciência
                                cozinheiro.adicionarSucoNoBalcao();;
                                cozinheiro.adicionarLancheNoBalcao();
                                cozinheiro.adicionarComboNoBalcao();

                                Almoxarife almoxarife = new Almoxarife();
                                //ações que não precisam estarem disponíveis para toda a aplicação
                                almoxarife.controlarEntrada();
                                almoxarife.controlarSaida();
                                //ação que somente o seu pacote cozinha precisa conhecer (default)
                                almoxarife.entregarIngredientes();
                                almoxarife.trocarGas();

                                Atendente atendente = new Atendente();
                                atendente.pegarLancheCozinha();
                                atendente.receberPagamento();
                                atendente.servindoMesa();
                                //ação que somente o seu pacote cozinha precisa conhecer (default)
                                atendente.trocarGas();

                                Cliente cliente = new Cliente();
                                cliente.escolherLanche();
                                cliente.fazerPedido();
                                cliente.pagarConta();

                                //não deveria, mas o estabelecimento
                                //ainda não definiu normas de atendimento
                                cliente.pegarPedidoBalcao();

                                //esta ação é muito sigilosa, qua tal ser privada ?
                                cliente.consultarSaldoAplicativo();

                                //já pensou os clientes ouvindo que o gás acabou ?
                                cozinheiro.pedirParaTrocarGas(atendente);
                                cozinheiro.pedirParaTrocarGas(almoxarife);

                            }
                        }

           Modificador default
           O modificador default, está fortemente associado a organização das classes por pacotes, algumas implementações, não precisam estar disponíveis por todo o projeto, e este modificador de acesso, restringe a visibilidade por pacotes.
           Dentro do pacote lanchonete, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

            lanchonete.atendimento.cozinha: Pacote que contém classes, da parte da cozinha da lanchonete e atendimentos.
            lanchonete.area.cliente: Pacote que contém classes, relacionadas ao espaço do cliente.

            Para definir um método visível a nível de pacote, basta NÃO declarar nenhum modificador, exemplo:

            Copy
            // Cozinheiro.java

            //público
            public void lavarIngredientes() {
               System.out.println("LAVANDO INGREDIENTES");
            }

            //nível de pacote
            //sem nenhuma palavra reservada de acesso
            void lavarIngredientes() {
               System.out.println("LAVANDO INGREDIENTES");
            }

            Modificador private
            Depois de reestruturar nosso estabelecimento (projeto), onde temos as divisões (pacotes), espaço do cliente e atendimento, chegou a hora de uma reflexão sobre visibilidade ou modificadores de acesso.
            Conhecemos as ações disponíveis nas classes Cozinheiro, Almoxarife, Atendente e Cliente, mesmo com a organização da visibilidade por pacote, será que realmente estas classes precisam ser tão explícitas?
            Será que o Cozinheiro precisa saber que\como o Almoxarife controla as entradas e saídas ?
            Que o Cliente precisa saber como o Atendente recebe o pedido, para servir sua mesa ?
            Que o Atendente precisa saber que antes de pagar, o Cliente consulta o saldo no App ?
            Diante destes questionamentos, é que nossas classes precisam continuar mantendo suas ações (métodos), mas nem todas precisam ser vistas por ninguém.

            Modificador protected
            O modificador protected em programação é utilizado em linguagens orientadas a objetos para restringir o acesso a membros (como variáveis e métodos) de uma classe.
            Quando um membro é marcado como protected, ele pode ser acessado pela própria classe, por suas subclasses e por classes no mesmo pacote.
            No entanto, ele não pode ser acessado por classes que não são subclasses e que estejam em pacotes diferentes. Isso permite um nível intermediário de encapsulamento, garantindo que certos membros sejam acessíveis apenas dentro da hierarquia de classes relacionadas.

         */
    }
}
