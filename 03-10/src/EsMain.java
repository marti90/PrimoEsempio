
public class EsMain {

	public static void main(String[] args) {
		
		Giorno g = Giorno.MARTEDI;
		
		switch(g){
			
			case LUNEDI:
				System.out.println("Luned� � una bella giornata");
		        break;
		        
			case MARTEDI:
				System.out.println("Marted� � pi� bella");
				break;
		default:
			break;
		}

	}

}
