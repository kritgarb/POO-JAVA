public class Recursos {
    String nome;
    double volumeAtual;
    double areaSuperficial;
    double capacidadeMaxima;
    double litros_por_m_quadrado = 1;

    public Recursos(String nome, double areaSuperficial){
        this.nome = nome;
        this.areaSuperficial = areaSuperficial;
        this.capacidadeMaxima = areaSuperficial * 1000;
        this.volumeAtual = 0;
    }

    public void adicionarAgua(double volume){
        if (volumeAtual + volume <= capacidadeMaxima){
            this.volumeAtual += volumeAtual;
        } else {
            throw new IllegalArgumentException("Excesso de água. O reservatório está cheio.");
        }
    }

    public void adicionarAguaPorChuva(double precipitacao) {
        double volumeAdicionado = precipitacao * areaSuperficial * litros_por_m_quadrado;
        adicionarAgua(volumeAdicionado);
    }

    public void mostrarInformacoes() {
        System.out.println("Reservatório: " + nome);
        System.out.println("Área: " + areaSuperficial + " m²");
        System.out.println("Capacidade máxima: " + capacidadeMaxima + " litros");
        System.out.println("Volume atual: " + volumeAtual + " litros");
    }
}

class main {
    public static void main(String[] args) {
        Recursos reservatorio = new Recursos("Reservatório Principal", 100);
        reservatorio.adicionarAgua(50);
        reservatorio.adicionarAguaPorChuva(2);
        reservatorio.mostrarInformacoes();
    }
}
