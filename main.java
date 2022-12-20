
public class main {

    public static void main(String[] args) {
        Ordinador ordenador1 = new Ordinador("HP", "Portátil HP 15s-fq5020ns"); // Create an object of class Ordinador (This will call the constructor)
        Ordinador ordenador2 = new Ordinador("Sony", "Portátil HP 15s-fq5020ns", "Intel® Core™ i5 1235U (De 12.ª generación)","8 GB RAM","512 GB SSD"); // Create an object of class Ordinador (This will call the constructor)
    
    System.out.println(ordenador1.getMarca());
    System.out.println(ordenador1.getModel());
    ordenador1.setProcessador("MD Ryzen 5 4500 3.6GHz Box");
    System.out.println(ordenador1.getProcessador());
    System.out.println(ordenador1.getQuantitatMemoriaRam());
    System.out.println(ordenador1.getCapacitatDiscDur());

    System.out.println(ordenador2.getMarca());
    System.out.println(ordenador2.getModel());
    System.out.println(ordenador2.getProcessador());
    System.out.println(ordenador2.getQuantitatMemoriaRam());
    System.out.println(ordenador2.getCapacitatDiscDur());

    ordenador1.programaEjecucion("VSCODE");

    System.out.println(ordenador1.toString());



    }
    
}
