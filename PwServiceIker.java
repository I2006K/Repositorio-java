package Pio.Daw.iker.ProyMaven;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class PwServiceIker {

    private BasicPasswordEncryptor passwordEncryptor;
    // Constructor
    public PwServiceIker() {
        this.passwordEncryptor = new BasicPasswordEncryptor();
    }
    // Método para encriptar la contraseña
    public String encriptarContrasena(String contrasena) {
        return passwordEncryptor.encryptPassword(contrasena);
    }
    // Método para verificar la contraseña
    public boolean verificarContrasena(String contrasena, String contrasenaEncriptada) {
        return passwordEncryptor.checkPassword(contrasena, contrasenaEncriptada);
    }
}