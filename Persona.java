public class Persona {
	String name;
	String sexo;
	int edad;

	public void caminar() {
		System.out.println(name + " Esta caminando");
	}

	public void estudiar(){
		System.out.println(name + " Esta estudiando");
	}

	public void comer(String comida){
		System.out.println(name + " Esta comiendo" + comida);
	}

	public void pedirCerveza(){
		if(edad >= 18){
			System.out.println("Dar cerveza");
		} else{
			System.out.println("No tienes edad para tomar");
		}
		
	}

}

class Curso {
	
	public static void main (String args []){
	Persona anita = new Persona ();
	anita.name = "Ana";
	anita.sexo = "F";
	anita.edad = 15;
	anita.caminar();
	anita.estudiar();
	anita.comer(" chilaquiles");
	anita.pedirCerveza();

	Persona yun = new Persona();
	yun.name = "Yunuet";
	yun.sexo = "F";
	yun.edad = 19;
	yun.caminar();
	yun.estudiar();
	yun.comer(" empanadas");
	yun.pedirCerveza();

	}
}