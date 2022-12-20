// Create a Ordenador class
public class Ordinador {
    private String marca; // Create a class attribute
    private String model; 
    private String processador; 
    private String quantitatMemoriaRam;
    private String capacitatDiscDur;
  
    // Create a class constructor for the Main class
    public Ordinador(String marca, String model) {
      this.marca= marca;  // Set the initial value for the class attributes
      this.model= model;
      processador= "AMD Ryzen 5 5600G 6x4.4GHz Turbo";
      quantitatMemoriaRam= " 16 Gb";
      capacitatDiscDur= "500 Gb";
    }
      
    public Ordinador(String marca, String model, String processador, String quantitatMemoriaRam, String capacitatDiscDur) {
        this.marca=marca;
        this.model=model;
        this.processador=processador;
        this.quantitatMemoriaRam=quantitatMemoriaRam;
        this.capacitatDiscDur=capacitatDiscDur;
    } 
    
    //Mètodes que permetin consultar cadascun dels atributs.
    public String getMarca(){
        return marca;
    }

    public String getModel(){
        return model;
    }

    public String getProcessador(){
        return processador;
    }

    public String getQuantitatMemoriaRam(){
        return quantitatMemoriaRam;
    }

    public String getCapacitatDiscDur(){
        return capacitatDiscDur;
    }

    public void setProcessador(String processador ){;
        this.processador=processador;
    }

    public void setQuantitatMemoriaRam(String quantitatMemoriaRam){
        this.quantitatMemoriaRam=quantitatMemoriaRam;
    }

    public void setCapacitatDiscDur(String capacitatDiscDur){
        this.capacitatDiscDur=capacitatDiscDur;
    }

    // metodo de ejecucion

    public void programaEjecucion(String programaEjecucion){
        System.out.println("En aquests moments s'està executant: "+"\'"+ programaEjecucion + "\'");
    }

    public String toString(){
        return "la marca: "+ marca + "\n"+
               " el model: "+ model + "\n"+
               " el processador: "+ processador + "\n"+
               " la quantitat de memòria RAM: "+ quantitatMemoriaRam + "\n"+
               " la capacitat del disc dur: "+ capacitatDiscDur + "\n";
    }
} 
  