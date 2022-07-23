package cuantro_uno_controlDeFlujo.condicionales;

public class Condicionales {
    public static void main(String[] args) {
        // If();
        // IfElse();
        //IfElseIf();
        Switch();
    }




    public static void If() {
        int edad = 19;
        boolean esMayor = edad >= 18;
        if (esMayor) {
            System.out.println(" es mayor de edad");
        }
        if (edad >= 18) {
            System.out.println("es mayor de edad");
        }
    }

    private static void IfElse() {
        int edad = 16;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

    }

    private static void IfElseIf() {
        // dias de la semana, para comparar se utiliza equals
        String dia = "ja";
        if (dia.equals("lunes")) {
            System.out.println("Animo con la semana");

        } else if (dia.equals("martes")) {
            System.out.println("Martes con m de me besas");

        } else if (dia.equals("miercoles")) {
            System.out.println("miercoles ");

        } else if (dia.equals("jueves")) {
            System.out.println("ya es juernes");

        } else if (dia.equals("viernes")) {
            System.out.println("nos fuimos");

        } else if (dia.equals("sabado")) {
            System.out.println("nos murimos");

        } else if (dia.equals("domingo")) {
            System.out.println("se acabo");

        }else {
            System.out.println("El dia introducido no es valido");
        }
    }
    private static void Switch() { // evaluar casos
        String dia = "ja";

        switch (dia){
            case "lunes":
                System.out.println("hoy es lunes animo!!");
                break; // romper
            case "martes":
                System.out.println("hoy es martes");
                break;
            case "miercoles":
                System.out.println(" hoy es jueves");
                break;
            case "jueves":
                System.out.println("hoy es jueves");
                break;
            case "viernes":
                System.out.println("hoy es viernes");
                break;
            case "sabado":
                System.out.println("hoy es sabado");
                break;
            case "domingo":
                System.out.println("hoy es domingo");
                break;
            default:
                System.out.println(" no es un dia valido");



        }



    }
}
