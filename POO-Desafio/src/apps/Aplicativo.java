package apps;

import dispositivo.Iphone;

public class Aplicativo extends Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void entrarAplicativo() {
        System.out.println("ENTRANDO NO APLICATIVO");
    }
    public void sairAplicativo() {
        System.out.println("SAINDO DO APLICATIVO");
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO PARA FULANO ...");
        atender();
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO FULANO ...");
        System.out.println("LIGAÇÃO FINALIZADA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO UMA MENSAGEM NO CORREIO DE VOZ ...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA WEB");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA NA PÁGINA WEB");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA WEB");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA ...");
    }

    @Override
    public void passar() {
        System.out.println("TROCANDO DE MÚSICA ...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA ...");
    }
}
