import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float sumaNota = 0;
        System.out.println("INICIO DEL PROGRAMA: CALCULO DE NOTAS");

        for(int i=1; i <= 4; i++){
            System.out.println("¿Cuál es la nota de tu elemento evaluable " + i + "?");
            float nota = sc.nextFloat();

            sumaNota += nota;
        }

        float promedioNotas = sumaNota / 4;

        if(promedioNotas >= 5){
            System.out.println("Aprobaste con una nota de " + promedioNotas);
        } else {
            System.out.println("Desaprobaste con una nota de " + promedioNotas);
        }
    }

}
