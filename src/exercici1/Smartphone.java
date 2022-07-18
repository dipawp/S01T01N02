package exercici1;

public class Smartphone extends Telefon implements Camera,Rellotge{
	
	
	public Smartphone() {
		
	}

	
	@Override
	public void fotografiar() {
		// TODO Auto-generated method stub
		System.out.println("S’està fent una foto");
		
	}

	@Override
	public void alarma() {
		// TODO Auto-generated method stub
		System.out.println("Està sonant l’alarma");
	}


	@Override
	public void trucar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("S'està trucant al numero " + numero);
	}

}
