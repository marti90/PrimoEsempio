
public class EsMain {

	public static void main(String[] args) {
		
		Giorno g = Giorno.MARTEDI;
		
		switch(g){
			
			case LUNEDI:
				System.out.println("Lunedì è una bella giornata");
		        break;
		        
			case MARTEDI:
				System.out.println("Martedì è più bella");
				break;
		default:
			break;
		}

	}

}
