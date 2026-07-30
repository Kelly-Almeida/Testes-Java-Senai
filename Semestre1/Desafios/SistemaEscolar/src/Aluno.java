import java.util.List;

public class Aluno {
    private int id;
    private String nome;
    private List <Float> notas;
    private int serie;
    private char turma;
    private int freq;

    public Aluno (String nome,int serie,char turma, List <Float> notas, int freq){
        this.nome = nome;
        this.freq = freq;
        this.notas = notas;
        this.serie = serie;
        this.turma = turma;

        System.out.println("Aluno cadastrado com sucesso!!");
    }

    public String getNome(){return this.nome;}

    public float getNota(int i){return this.notas.get(i);}

    public void showNotas (){
        int i = 1;
        for (float nota : this.notas){
            System.out.println(i + " - " + nota);
            i++;
        }
    }

    public int getFreq(){return this.freq;}

    public String getSerie(){return this.serie + "° serie";}

    public float getMedia(){
        float soma = 0;
        for (float nota: this.notas){
            soma += nota;
        }
        return soma/ this.notas.toArray().length;
    }

    public String getResultado(){
        String status;
        float media = getMedia();
        if (this.freq < 75){
            status = "reprovado";
        }else{
            if (media < 3){status = "reprovado";}
            else if (media < 6){status = "recuperação";}
            else{status = "aprovado";}
        }
        return status;
    }


    public String getTurma(){
        return this.serie + "° " + this.turma;
    }

}
