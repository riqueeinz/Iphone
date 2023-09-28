// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe que implementa o papel de Reprodutor Musical
class iPhoneReprodutorMusical implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando reprodução...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}

// Classe que implementa o papel de Aparelho Telefônico
class iPhoneAparelhoTelefonico implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Realizando chamada...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}

// Classe que implementa o papel de Navegador na Internet
class iPhoneNavegadorInternet implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de utilização
        iPhoneReprodutorMusical reprodutor = new iPhoneReprodutorMusical();
        reprodutor.selecionarMusica("Música Legal");
        reprodutor.tocar();

        iPhoneAparelhoTelefonico telefone = new iPhoneAparelhoTelefonico();
        telefone.ligar();
        telefone.atender();

        iPhoneNavegadorInternet navegador = new iPhoneNavegadorInternet();
        navegador.exibirPagina("https://www.example.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
