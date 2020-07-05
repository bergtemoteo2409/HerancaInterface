
public class Teste {
	
public static void main(String[ ] args) {

	AreaCalculavel obj1 = new Retangulo (10,20);
	
	System.out.println(obj1.calculaArea( ));
	
	
	obj1 = new Quadrado (10);
	
	System.out.println (obj1.calculaArea( ));

	}
}
