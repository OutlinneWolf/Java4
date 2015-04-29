
public class program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Construtores Inicializadores
        pessoa p1 = new pessoa("Bruno", " Coimbra");
        pessoa p2 = new pessoa("Alberto", " Clandestino");

        p1.agoraFaloEu(p2);
        p1.dizOlaAPessoa("Antonio");
        p1.dizOlaAmigo(p2.getName());
	}

}
