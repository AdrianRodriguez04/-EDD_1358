package mx.unam.fes.redesSociales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioRedesSociales {

    public static void main(String[] args) {

        try {
            BufferedReader lector = new BufferedReader(new FileReader(
                    "C:\\Users\\bigad\\OneDrive\\Documentos\\"
                    + "NetBeansProjects\\Tareas_EstructuraDeDatos_1358\\src"
                    + "\\main\\java\\mx\\unam\\fes\\redesSociales\\"
                    + "presenciaredes.csv"));
            String linea;
            while ((linea = lector.readLine()) != null) {

                var partes = linea.split(",");
                int partesTotales = partes.length;
                for (int i = 0; i < partesTotales; i++) {
                    System.out.print(partes[i] + "   ");
                }
                System.out.println("\n");
            }
        } catch (IOException e) {
        }
        
        int twitterEnero = 62404, twitterJunio = 67496;

        int promEneroF = 660, promFebreroF = 4850, promMarzoF = 3638,
                promAbrilF = 4585, promMayoF = 5308, promJunioF = 7925;

        int promEneroT = 863, promFebreroT = 828, promMarzoT = 917,
                promAbrilT = 1261, promMayoT = 945, promJunioT = 1145;

        int visEne = 12226, visFeb = 15605, visMar = 19602, visAbr = 19452,
                visMay = 21805, visJun = 17344;

        System.out.println("La difrencia de seguidores de Twiter entre el "
                + "mes de Enero y Junio es de: " + (twitterJunio - twitterEnero) 
                + "\n");

        System.out.println("El promedio de crecimiento de seguidores de "
                + "Facebook es de: "
                + ((promEneroF + promFebreroF + promMarzoF + promAbrilF
                + promMayoF + promJunioF) / 6) + "\n");

        System.out.println("El promedio de crecimiento de seguidores de "
                + "Twitter es de: "
                + ((promEneroT + promFebreroT + promMarzoT + promAbrilT
                + promMayoT + promJunioT) / 6) + "\n");

        Scanner primerMes = new Scanner(System.in);

        int mesUno, mesDos;

        System.out.println("Seleccione su primer numero de mes entre Enero a "
                + "Junio:\n 1.-Enero\n 2.-Febrero\n 3.-Marzo\n 4.-Abril\n "
                + "5.-Mayo\n 6.-Junio");
        mesUno = primerMes.nextInt();

        if (mesUno == 1) {
            mesUno = visEne;
        } else {
            if (mesUno == 2) {
                mesUno = visFeb;
            } else {
                if (mesUno == 3) {
                    mesUno = visMar;
                } else {
                    if (mesUno == 4) {
                        mesUno = visAbr;
                    } else {
                        if (mesUno == 5) {
                            mesUno = visMay;
                        } else {
                            if (mesUno == 6) {
                                mesUno = visJun;
                            }
                        }
                    }
                }
            }
        }

        Scanner segundoMes = new Scanner(System.in);
        System.out.println("Seleccione su segundo numero de mes entre Enero a "
                + "Junio:\n 1.-Enero\n 2.-Febrero\n 3.-Marzo\n 4.-Abril\n "
                + "5.-Mayo\n 6.-Junio");
        mesDos = segundoMes.nextInt();
        
        if (mesDos == 1) {
            mesDos = visEne;
        } else {
            if (mesDos == 2) {
                mesDos = visFeb;
            } else {
                if (mesDos == 3) {
                    mesDos = visMar;
                } else {
                    if (mesDos == 4) {
                        mesDos = visAbr;
                    } else {
                        if (mesDos == 5) {
                            mesDos = visMay;
                        } else {
                            if (mesDos == 6) {
                                mesDos = visJun;
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println("La diferencia de visualizaciones en Youtuve de "
                + "los meses seleccionados es de: " + (mesUno - mesDos));
    }
}
