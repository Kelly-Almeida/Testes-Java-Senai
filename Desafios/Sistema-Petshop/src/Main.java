import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean round = true;
        String [] ops = new String[] {"Cadastrar pet", "Pets cadastrados", "Ver pet", "Ver naipe", "Sair"};
        String [] pets = new String[] {"Cachorro", "Gato", "Papaguaio", "Voltar"};
        List<Animal> petsCad = new ArrayList<>();

        do{
            int escol;
            do{
                System.out.println("===============================");
                System.out.println("\tSistema petshop");
                System.out.println("===============================");

                for(int i = 1; i <= ops.length; i++){
                    System.out.println(i + " - " + ops[i -1]);
                }

                System.out.print("=> ");
                escol = scan.nextInt();

                if (escol < 1 || escol > ops.length){
                    System.out.println("Digite um valor válido!!!");
                }
            }while(escol < 1 || escol > ops.length);

            String resp = ops[escol -1];
            switch (resp){
                case "Cadastrar pet":
                    int escolPets = 0;
                    do{
                        System.out.println("Escolha o pet a ser cadastrado: ");
                        for(int i = 1; i <= pets.length; i++){
                            System.out.println(i + " - " + pets[i -1]);

                        }
                        escolPets = scan.nextInt();
                    }while(escolPets < 0 || escolPets > pets.length);

                    String pet = pets[escolPets - 1];
                    String [] infoRaca;
                    int idade;
                    Animal newAnimal;

                    switch (pet){
                        case "Sair":
                            break;
                        case "Cachorro":
                            infoRaca = escolRacaNome();
                            idade = escolIdade();

                            newAnimal = new Cachorro(infoRaca[1], infoRaca[0], idade);
                            petsCad.add(newAnimal);
                            System.out.println("Cachorro cadastrado!!");
                            break;
                        case "Gato":
                            infoRaca = escolRacaNome();
                            idade = escolIdade();

                            newAnimal = new Gato(infoRaca[1], infoRaca[0], idade);
                            petsCad.add(newAnimal);
                            System.out.println("Gato cadastrado!!");
                            break;
                        case "Papaguaio":
                            infoRaca = escolRacaNome();
                            idade = escolIdade();

                            newAnimal = new Papaguaio(infoRaca[1], infoRaca[0], idade);
                            petsCad.add(newAnimal);
                            System.out.println("Papaguaio cadastrado!!");
                            break;
                    }


                    break;
                case "Pets cadastrados":
                    if (petsCad.size() == 0){
                        System.out.println("Não há pets cadastrados");
                    }else{
                        for (int i = 1; i <= petsCad.size(); i++){
                            System.out.println(i + " - " + petsCad.get(i-1).setNome());
                        }
                    }
                    break;
                case "Ver pet":
                    if (petsCad.size() == 0){
                        System.out.println("Não há pets cadastrados");
                    }else{
                        for (int i = 1; i <= petsCad.size(); i++){
                            System.out.println(i + " - " + petsCad.get(i-1).setNome() );
                        }

                        int id;
                        do{
                            System.out.println("Digite o id do pet: ");
                            id = scan.nextInt();

                            if (id < 1 || id > petsCad.size()){
                                System.out.println("Digite um id válido!!");
                            }
                        }while(id < 1 || id > petsCad.size());

                        System.out.println(id + " - " + petsCad.get(id-1).setNome() + " " + petsCad.get(id - 1).setRaca() + " " + petsCad.get(id - 1).setIdade());

                    }
                    break;

                case "Ver naipe":
                    if (petsCad.size() == 0){
                        System.out.println("Não há pets cadastrados");
                    }else{
                        for (int i = 1; i <= petsCad.size(); i++){
                            System.out.println(i + " - " + petsCad.get(i-1).setNome() );
                        }

                        int id;
                        do{
                            System.out.println("Digite o id do pet: ");
                            id = scan.nextInt();

                            if (id < 1 || id > petsCad.size()){
                                System.out.println("Digite um id válido!!");
                            }
                        }while(id < 1 || id > petsCad.size());

                        petsCad.get(id-1).mostrarNipe();

                    }
                    break;
                case "Sair":
                    round = false;
                    break;
            }

        }while(round);
    }
    public static String [] escolRacaNome(){
        Scanner scan = new Scanner(System.in);
        String[] resps = new String[2];

        System.out.print("Digite o nome do pet: ");
        resps[0] = scan.nextLine();

        System.out.print("Digite a raça do pet: ");
        resps[1] = scan.nextLine();

        return resps;
    }

    public static int escolIdade(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a idade do pet: ");
        return scan.nextInt();
    }
}