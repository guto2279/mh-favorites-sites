import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		System.out.println("---------------- MEUS SITES FAVORITOS ---------------- ");
		
		Scanner scanner = new Scanner (System.in);
		List <Website> meusWebsites = new ArrayList<>();
		
		System.out.println("Digite o nome do Website");
		String nome = scanner.nextLine();
		System.out.println("Digite o link do Website");
		String url = scanner.nextLine();
		
		Website website = new Website();
		
		website.setNome(nome);
		website.setUrl(url);
		
		meusWebsites.add(website);
		
		for (Website websites : meusWebsites) {
			System.out.println(websites);
		}
		
		}
	
}
