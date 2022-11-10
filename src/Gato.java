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
    }

