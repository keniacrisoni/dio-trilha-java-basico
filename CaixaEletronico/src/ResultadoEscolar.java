public class ResultadoEscolar {
    public static void main(String[] args) {
        int media = 5;

        if (media >= 7) {
            System.out.println("Aprovado");

        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");

        } else {
            System.out.println("Reprovado");
        }

        // String nota = media >=7 ?"Aprovado" : media>=5 && media<7? "Recuperação " :
        // "Reprovado";
        // System.out.println(nota);
    }

}
