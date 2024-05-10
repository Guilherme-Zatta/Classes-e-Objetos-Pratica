import classes.Animal;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
      //  listarPessoas();

      listarAnimais();
    }

    public static void listarAnimais(){
        Animal[] animais = new Animal[10];
        animais[0] = new Gato
    }

    public static void listarPessoas(){
        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = new Pessoa(
            "Zatta",
            "11393320902",
            "23/11/1999",
            'M');

            Pessoa.mensagem();

            pessoas[1] = new Pessoa(
                "Guilherme",
                "11393320902",
                "23/11/1999",
                'M');

        // for tradicional
        // for (int i = 0; i < pessoas.length; i++){
        //         if (pessoas != null) {
        //     System.out.println(pessoas[i].getNome());
        //         }
        // }

        // for erch - para cada item, do primeiro ao ultimo
        for (Pessoa pessoa : pessoas){
                if (pessoas != null) {
            System.out.println(pessoa.getNome());
                }
        }
        System.out.println();

    }
}
