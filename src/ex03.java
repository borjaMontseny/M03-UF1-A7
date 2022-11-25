import java.util.Scanner;

/**
 * @author borjaMontseny
 */
public class ex03 {

	public static void main(String[] args) {

		System.out.println("Pedra, paper, tisores. THE GAME\n");

		int contadorA = 0;
		int contadorB = 0;

		String opcioA = "res";
		String opcioB = "res";

		Scanner sc = new Scanner(System.in);

		while (contadorA < 3 && contadorB < 3) {
			System.out.print("A: ");
			opcioA = sc.next();

			System.out.print("B: ");
			opcioB = sc.next();

			// casos en els que guanya A
			boolean paperAGuanyaPedraB = (opcioA.charAt(1) == 'a') && (opcioB.charAt(1) == 'e');
			boolean pedraAGuanyaTisoraB = (opcioA.charAt(1) == 'e') && (opcioB.charAt(1) == 'i');
			boolean tisoraAGuanyaPaperB = (opcioA.charAt(1) == 'i') && (opcioB.charAt(1) == 'a');

			boolean guanyaA = paperAGuanyaPedraB || pedraAGuanyaTisoraB || tisoraAGuanyaPaperB;

			// casos en els que guanya B
			boolean paperBGuanyaPedraA = (opcioA.charAt(1) == 'e') && (opcioB.charAt(1) == 'a');
			boolean pedraBGuanyaTisoraA = (opcioA.charAt(1) == 'i') && (opcioB.charAt(1) == 'e');
			boolean tisoraBGuanyaPaperA = (opcioA.charAt(1) == 'a') && (opcioB.charAt(1) == 'i');

			boolean guanyaB = paperBGuanyaPedraA || pedraBGuanyaTisoraA || tisoraBGuanyaPaperA;

			if (guanyaA) {
				contadorA++;
			} else if (guanyaB) {
				contadorB++;
			} else {
				System.out.println("Empat\n");
			}

			System.out.println(contadorA + " - " + contadorB + "\n");

		}

		sc.close();

		if (contadorA == 3) {
			System.out.println("Ha guanyat la partida A");
		} else if (contadorB == 3) {
			System.out.println("Ha guanyat la partida B");
		}

	}

}
