package Pio.Daw.iker.ProyMaven;

public class PwServiceIkerTest {

	public static void main(String[] args) {
		PwServiceIker servicio=new PwServiceIker();
		String password = "Micontraseña";
		String passwordEncriptada=servicio.encriptarContrasena(password);
		System.out.println("Prueba de alumno Iker");
		System.out.println("La contraseña encriptada es" + passwordEncriptada);
		
		//verificacion
		boolean esValida = servicio.verificarContrasena(password, passwordEncriptada);
		System.out.println("La contraseña encriptada es valida: "+esValida);		
	}
}
