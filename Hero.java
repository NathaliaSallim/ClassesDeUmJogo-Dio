import java.util.Scanner;

public class Hero {
    private String nome;
    private String sexo;
    private int idade;
    private String tipo;
    
    public Hero (String nome, String sexo, int idade, String tipo) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque = " ";
        switch (this.tipo) {
            case "mago":
                ataque = "magia";
                break;

            case "guerreiro":
            ataque = "espada";
                break;
            
            case "monge":
            ataque = "artes marciais";
                break;

            case "ninja":
            ataque = "shuriken";
                break;
        
            default:
            ataque = "usou um ataque desconhecido";
                break;
        }
        System.out.println(" ");      
        System.out.println("O " + tipo + " " + nome + " atacou usando " + ataque + "!");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do herói: ");
        String nomeHeroi = sc.next();

        System.out.println("Digite o sexo do herói (masculino/feminino): ");
        String sexoHeroi = sc.next();

        System.out.println("Digite a idade do herói: ");
        int idadeHeroi = sc.nextInt();

        System.out.println("Digite o tipo do herói: ");
        String tipoHeroi = sc.next();
      
        Hero heroi = new Hero(nomeHeroi, sexoHeroi, idadeHeroi, tipoHeroi);
        heroi.atacar();

        System.out.println("Dados do heroi ");
        System.out.println("Nome: " + nomeHeroi);
        System.out.println("Sexo: " + sexoHeroi);
        System.out.println("Idade: " + idadeHeroi + " anos");
        System.out.println("Tipo: " + tipoHeroi);
          

        sc.close();
    }
}