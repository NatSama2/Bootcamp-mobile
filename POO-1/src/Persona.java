
public class Persona {

            // atributos
            private String nombre;
            private int edad;
            private String correo;

            // constructor con parametros
            public Persona(String nombre, int edad, String correo) {

                        this.nombre = nombre;
                        this.edad = edad;
                        this.correo = correo;

            }

            // constructor por default

            public Persona() {
            }

            @Override
            public String toString() {
                        return "Persona [nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + "]";
            }

            // métodos
            public static boolean validarNombre(String nombre) {
                        return nombre.matches("[a-zA-Z]+");

            }

            public static boolean validarEdad(String edad) {
                        try {

                                    int e = Integer.parseInt(edad);
                                    return e > 0 && e <= 120;

                        } catch (NumberFormatException e) {
                                     return false;
                        }

            }

           
            public static boolean validarCorreo(String correo) {
                        if (correo == null) {
                            return false;
                        }
                    
                        // Expresión regular para validar un correo electrónico
                        String emailRegex = "^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$";
                    
                        // Validar el correo contra la expresión regular
                        return correo.matches(emailRegex);
                    }





}
