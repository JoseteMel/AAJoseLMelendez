package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static ArrayList<Piano> pianoArrayList = new ArrayList<>();
    public static ArrayList<Organo> organoArrayList = new ArrayList<>();
    public static ArrayList<Sintetizador> sintetizadorArrayList = new ArrayList<>();

    public static void inicio() {

        Scanner sc = new Scanner(System.in);

        int opcion;
        boolean error = false;

        do {
            if(error) {
                System.out.println("Tienes que elegir entre una de las 3 opciones.\n"); //Mensaje de error si no selecciona una opción correcta
            }
            System.out.println("~~~~~~ MENÚ PRINCIPAL ~~~~~~");
            System.out.println("[1] Crear un instrumento.");
            System.out.println("[2] Buscar un instrumento.");
            System.out.println("[3] Salir.");
            System.out.print("¿Qué quieres hacer?: \n");

            opcion = sc.nextInt();  //Introduce por teclado la opción a elegir

            if(opcion < 1 || opcion > 3){
                error = true;
            }
        } while (opcion < 1 || opcion > 3);

        switch (opcion) {
            case 1:
                crearInstrumento();
                break;
            case 2:
                if(pianoArrayList.isEmpty() && organoArrayList.isEmpty() && sintetizadorArrayList.isEmpty()) {
                    System.out.println("No hay registros todavía. Crea alguno...\n");
                    crearInstrumento();
                } else {
                    buscarInstrumento();
                }
                break;
            case 3:
                saliendo();
                break;
        }
    }

    public static void crearInstrumento() {

        Scanner sc = new Scanner(System.in);

        int opcion;
        boolean error = false;

        do {
            if(error) {
                System.out.println("\nElige uno de los 3 instrumentos.\n"); //Mensaje de error si no selecciona una opción correcta
            }
            System.out.println("~~~~ CREAR INSTRUMENTO ~~~~");
            System.out.println("[1] Piano.");
            System.out.println("[2] Órgano.");
            System.out.println("[3] Sintetizador.");
            System.out.println("[4] Ir atrás.");
            System.out.print("Elige uno: ");

            opcion = sc.nextInt();  //Introduce por teclado la opción a elegir

            if(opcion < 1 || opcion > 4){
                error = true;
            }
        } while (opcion < 1 || opcion > 4);

        switch (opcion) {
            case 1:
                crearPiano();
                break;
            case 2:
                crearOrgano();
                break;
            case 3:
                crearSintetizador();
                break;
            case 4:
                inicio();
                break;
        }
    }

    public static void crearPiano() {
        Scanner sc = new Scanner(System.in);

        System.out.println("~~ CREANDO UN PIANO ~~");
        System.out.println("Rellena las siguientes características:");
        //Número de serie
        System.out.print("Número de serie: ");
        String numSerie = sc.nextLine();
        //Marca
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        //Tipo de piano
        System.out.print("Tipo de piano: ");
        String tipo = sc.nextLine();
        //Precio
        System.out.print("Precio: ");
        float precio = sc.nextFloat();
        //Número de teclas
        System.out.print("Número de teclas: ");
        int numTeclas = sc.nextInt();
        //Peso
        System.out.print("Peso del piano: ");
        float peso = sc.nextFloat();
        //Material de construcción
        System.out.print("Material de construcción: ");
        sc.nextLine();
        String material = sc.nextLine();
        //Número de ruedas
        System.out.print("Número de ruedas: ");
        int numRuedas = sc.nextInt();
        //Descripción del desperfecto
        System.out.print("Describe si tiene algún desperfecto: ");
        sc.nextLine();
        String desperfectos = sc.nextLine();
        //Afinado
        String afinadoStr;
        boolean afinado = false;
        do {
            System.out.print("¿Está afinado? (S/N): ");
            afinadoStr = sc.nextLine();
        } while (!afinadoStr.equalsIgnoreCase("s") && !afinadoStr.equalsIgnoreCase("n"));
        if (afinadoStr.equals("s")) {
            afinado = true;
        }
        //Número de pedales
        System.out.print("¿Cuántos pedales tiene?: ");
        int numPedales = sc.nextInt();

        Piano piano = new Piano(numSerie, marca, tipo, precio, numTeclas, peso, material, numRuedas, desperfectos, afinado, numPedales);

        pianoArrayList.add(piano);

        System.out.println("\nLos datos han sido guardados correctamente.\n");

        fin();
    }

    public static void crearOrgano() {
        Scanner sc = new Scanner(System.in);

        System.out.println("~~ CREANDO UN ÓRGANO ~~");

        System.out.println("Rellena las siguientes características:");
        //Número de serie
        System.out.print("Número de serie: ");
        String numSerie = sc.nextLine();
        //Marca
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        //Tipo de piano
        System.out.print("Tipo de órgano: ");
        String tipo = sc.nextLine();
        //Precio
        System.out.print("Precio: ");
        float precio = sc.nextFloat();
        //Número de teclas
        System.out.print("Número de teclas: ");
        int numTeclas = sc.nextInt();
        //Peso
        System.out.print("Peso del órgano: ");
        float peso = sc.nextFloat();
        //Lugar donde se encuentra instalado
        System.out.print("¿Dónde se encuentra instalado?: ");
        sc.nextLine();
        String lugarInstalacion = sc.nextLine();
        //Número de filas de teclas del órgano
        System.out.print("¿Cuántas filas de teclas tiene?: ");
        int numFilasTeclas = sc.nextInt();
        //Número de tubos (si se trata de un órgano de Iglesia)
        System.out.print("¿Cuántos tubos tiene?: ");
        int numTubos = sc.nextInt();
        //Tiene pedalera
        String pedaleraStr;
        boolean pedalera = false;
        do {
            System.out.print("¿Tiene pedalera? (S/N): ");
            sc.nextLine();
            pedaleraStr = sc.nextLine();
        } while (!pedaleraStr.equalsIgnoreCase("s") && !pedaleraStr.equalsIgnoreCase("n"));
        if (pedaleraStr.equals("s")) {
            pedalera = true;
        }
        //Está reparado
        String reparadoStr;
        boolean reparado = false;
        do {
            System.out.print("¿Está reparado? (S/N): ");
            reparadoStr = sc.nextLine();
        } while (!reparadoStr.equalsIgnoreCase("s") && !reparadoStr.equalsIgnoreCase("n"));
        if (reparadoStr.equals("s")) {
            reparado = true;
        }

        Organo organo = new Organo(numSerie, marca, tipo, precio, numTeclas, peso, lugarInstalacion, numFilasTeclas, numTubos,
                pedalera, reparado);

        organoArrayList.add(organo);

        System.out.println("\nLos datos han sido guardados correctamente.\n");

        fin();
    }

    public static void crearSintetizador() {
        Scanner sc = new Scanner(System.in);

        System.out.println("~~ CREANDO UN SINTETIZADOR ~~");

        System.out.println("Rellena las siguientes características:");
        //Número de serie
        System.out.print("Número de serie: ");
        String numSerie = sc.nextLine();
        //Marca
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        //Tipo de piano
        System.out.print("Tipo de sintetizador: ");
        String tipo = sc.nextLine();
        //Precio
        System.out.print("Precio: ");
        float precio = sc.nextFloat();
        //Número de teclas
        System.out.print("Número de teclas: ");
        int numTeclas = sc.nextInt();
        //Peso
        System.out.print("Peso del sintetizador: ");
        float peso = sc.nextFloat();
        //Número de osciladores
        System.out.print("¿Cuántos osciladores tiene?: ");
        int numOsciladores = sc.nextInt();
        //Número de controles y botones
        System.out.print("¿Cuántos botones tiene?: ");
        int numBotones = sc.nextInt();
        //Efectos
        String efectosStr;
        boolean efectos = false;
        do {
            System.out.print("¿Incluye unidad de efectos? (S/N): ");
            sc.nextLine();
            efectosStr = sc.nextLine();
        } while (!efectosStr.equalsIgnoreCase("s") && !efectosStr.equalsIgnoreCase("n"));
        if (efectosStr.equals("s")) {
            efectos = true;
        }
        //Tipo de pantalla
        System.out.print("¿Qué tipo de pantalla tiene?: ");
        String tipoPantalla = sc.nextLine();
        //¿Es monofónico?
        String monofonicoStr;
        boolean monofonico = false;
        do {
            System.out.print("¿Es monofónico? (S/N): ");
            monofonicoStr = sc.nextLine();
        } while (!monofonicoStr.equalsIgnoreCase("s") && !monofonicoStr.equalsIgnoreCase("n"));
        if (monofonicoStr.equals("s")) {
            monofonico = true;
        }

        Sintetizador sintetizador = new Sintetizador(numSerie, marca, tipo, precio, numTeclas, peso, numOsciladores, numBotones,
                efectos, tipoPantalla, monofonico);

        sintetizadorArrayList.add(sintetizador);

        System.out.println("\nLos datos han sido guardados correctamente.\n");

        fin();
    }

    public static void buscarInstrumento() {

        Scanner sc = new Scanner(System.in);

        int opcion;
        boolean error = false;

        do {
            if(error) {
                System.out.println("\nElige uno de los 3 instrumentos.\n"); //Mensaje de error si no selecciona una opción correcta
            }
            System.out.println("~~~~ BUSCAR INSTRUMENTO ~~~~");
            System.out.println("[1] Piano.");
            System.out.println("[2] Órgano.");
            System.out.println("[3] Sintetizador.");
            System.out.println("[4] Ir atrás.");
            System.out.print("Elige un instrumento para buscarlo: ");

            opcion = sc.nextInt();  //Introduce por teclado la opción a elegir

            if(opcion < 1 || opcion > 4){
                error = true;
            }
        } while (opcion < 1 || opcion > 4);

        switch (opcion) {
            case 1:
                if(pianoArrayList.isEmpty()) {
                    System.out.println("No hay registros de pianos. Crea alguno...\n");
                    crearPiano();
                } else {
                    buscarPiano();
                }
                break;
            case 2:
                if(organoArrayList.isEmpty()) {
                    System.out.println("No hay registros de órganos. Crea alguno...\n");
                    crearOrgano();
                } else {
                    buscarOrgano();
                }
                break;
            case 3:
                if(sintetizadorArrayList.isEmpty()) {
                    System.out.println("No hay registros de sintetizadores. Crea alguno...\n");
                    crearSintetizador();
                } else {
                    buscarSintetizador();
                }
                break;
            case 4:
                inicio();
                break;
        }
    }

    public static void buscarPiano() {

        Scanner sc = new Scanner(System.in);

        int posicion;

        System.out.println("Buscar piano por Número de Serie.");
        System.out.print("Introduce el número de serie: ");
        String numSerie = sc.nextLine();

        for(Piano piano : pianoArrayList) {
            if(piano.getNumeroSerie().equalsIgnoreCase(numSerie)) {
                posicion = pianoArrayList.indexOf(piano);
                System.out.println(pianoArrayList.get(posicion));
                fin();
            } else {
                busquedaFail();
            }
        }
    }

    public static void buscarOrgano() {

        Scanner sc = new Scanner(System.in);

        int posicion;

        System.out.println("Buscar órgano por Número de Serie.");
        System.out.print("Introduce el número de serie: ");
        String numSerie = sc.nextLine();

        for(Organo organo : organoArrayList) {
            if(organo.getNumeroSerie().equalsIgnoreCase(numSerie)) {
                posicion = organoArrayList.indexOf(organo);
                System.out.println(organoArrayList.get(posicion));
                fin();
            } else {
                busquedaFail();
            }
        }
    }

    public static void buscarSintetizador() {

        Scanner sc = new Scanner(System.in);

        int posicion;

        System.out.println("Buscar sintetizador por Número de Serie.");
        System.out.print("Introduce el número de serie: ");
        String numSerie = sc.nextLine();

        for(Sintetizador sintetizador : sintetizadorArrayList) {
            if(sintetizador.getNumeroSerie().equalsIgnoreCase(numSerie)) {
                posicion = sintetizadorArrayList.indexOf(sintetizador);
                System.out.println(sintetizadorArrayList.get(posicion));
                fin();
            } else {
                busquedaFail();
            }
        }
    }

    public static void busquedaFail() {

        Scanner sc = new Scanner(System.in);

        String respuesta;

        System.out.println("No se ha podido encontrar un piano con ese número de serie.");

        do {
            System.out.println("¿Quieres volver a intentarlo? (S/N)");
            respuesta = sc.nextLine();

            if(respuesta.equalsIgnoreCase("S")) {
                buscarInstrumento();
            } else if (respuesta.equalsIgnoreCase("N")) {
                boolean error = false;
                int opcion;

                do {
                    if(error) {
                        System.out.println("Tienes que elegir entre una de las 2 opciones.\n");
                    }
                    System.out.println("[1] Volver al inicio.");
                    System.out.println("[2] Salir.");

                    opcion = sc.nextInt();

                    if(opcion != 1 || opcion != 2){
                        error = true;
                    }
                } while (opcion != 1 && opcion != 2);

                switch (opcion) {
                    case 1:
                        inicio();
                        break;
                    case 2:
                        saliendo();
                        break;
                }
            }

        } while(!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
    }

    public static void fin() {
        Scanner sc = new Scanner(System.in);

        String respuesta;

        do {
            System.out.println("¿Quieres realizar otra tarea? (S/N)");
            respuesta = sc.nextLine();

            if(respuesta.equalsIgnoreCase("S"))
                inicio();
            else if (respuesta.equalsIgnoreCase("N"))
                saliendo();
        } while(!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));
    }

    public static void saliendo() {
        System.out.println("Saliendo...");
    }
}
