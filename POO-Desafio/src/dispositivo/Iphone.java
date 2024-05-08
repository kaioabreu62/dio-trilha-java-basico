package dispositivo;

import apps.Aplicativo;

public abstract class Iphone {
    public static void main(String[] args) {
        Aplicativo app = new Aplicativo();

        System.out.println("REPRODUTOR MUSICAL");
        app.entrarAplicativo();
        app.selecionarMusica();
        app.tocar();
        app.passar();
        app.tocar();
        app.sairAplicativo();

        System.out.println();
        System.out.println("APARELHO TELEFÔNICO");
        app.entrarAplicativo();
        app.iniciarCorreioVoz();
        app.ligar();
        app.atender();
        app.sairAplicativo();

        System.out.println();
        System.out.println("NAVEGADOR DE INTERNET");
        app.entrarAplicativo();
        app.exibirPagina();
        app.adicionarNovaAba();
        app.atualizarPagina();
        app.exibirPagina();
        app.sairAplicativo();
    }
}
