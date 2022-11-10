import java.util.concurrent.TimeUnit;

public class Gato {

        private String nombre;
        private boolean estado;
        private String color;
        private String pelo;
        private boolean agil;
        private int velocidadmaxima;
        private boolean domestico;


        Gato(String nombre, String color, String pelo, boolean agil, int velocidadmaxima, boolean domestico){

            this.nombre = nombre;
            this.color = color;
            this.pelo = pelo;
            this.agil = agil;
            this.velocidadmaxima = velocidadmaxima;
            this.domestico = domestico;

        }

    public void DisparaGato(){

        if(!this.estado){
            System.out.println( this.nombre + " ya esta muerto dejalo :(");
        }
        else if(Math.random()>0.7){
            System.out.println(this.nombre + " ha muerto :(");
            this.estado = false;
        }else {
            System.out.println(this.nombre + " ha sobrevivido :)");
        }
    }
        @Override

        public String toString() {

            String estado;
            estado = String.format("El nombre del gato es %s, su color es %s y tiene el pelo %s. \nAgilidad: %s Domestico: %s Velocidad Máxima: %d", nombre, color, pelo, agil, domestico, velocidadmaxima);

            return estado;

        }
        public void concurso(){

            if(agil && velocidadmaxima > 20 && pelo.equals("Corto")){

                System.out.println("¡El gato " + nombre + " es APTO para un concurso!");

            }else{

                System.out.println("El gato " + nombre + " NO es apto para un concurso.");

                if (!agil) System.out.println("El gato NO es ÁGIL");
                if (velocidadmaxima < 20) System.out.println("El gato NO tiene suficiente velocidad");
                if (!pelo.equals("Corto")) System.out.println("El gato necesita un corte de pelo");
            }
        }
    public void saludo() throws InterruptedException {
        System.out.println("Initializating Artifitial Retardation");
        System.out.println("|Progress  0.95%|");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("|Progress  5.65%|");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("|Progress 15.75%|");
        TimeUnit.SECONDS.sleep(4);
        System.out.println("|Progress    80%|");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("|Progress 99.99%|");
        TimeUnit.SECONDS.sleep(10);
        System.out.println("----------------------------------------------------------------");
        System.out.println("(OwO) whats this?");
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Hewwo, w-would you liek to do sumthing with me? :3 <3 uwu");
        System.out.println("----------------------------------------------------------------");
        System.out.println("|1º");
        System.out.println("|2º");
        System.out.println("|3º");
        System.out.println("|4º");
        System.out.println("|5º");
        System.out.println("----------------------------------------------------------------");
    }
    }

