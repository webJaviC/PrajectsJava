
package liconex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class LICONEX {

    
    
   static int tope = 0;
   static    Examen arregloDeExamenes [] = new Examen[100];

    public static void main(String[] args) {
        
        // TODO code application logic here
        
        //Agregar examenes
        Scanner entrada = new Scanner(System.in);
        String ingreso = "";
        
        while (!ingreso.equals("9")){
         mostrarMenuPrincipal();
         ingreso = entrada.nextLine() ;
         switch (ingreso){
             case "1" : cargarExamenMoto(arregloDeExamenes) ;
             break;
             case "2" :cargarExamenAuto(arregloDeExamenes);
             break;
             case "3" : mostrarConsultas();
               String in = entrada.nextLine() ;
               consultar(in);
             break;
             case "9" : System.out.println("Programa finalizado");
             break;
             default: System.out.println("Ingrese un numero válido");
             break;               
         }                  
    }       
    }
      
    
    private static void agregarExamen(Examen [] examenes , Examen examen){
        examenes[tope++] = examen;
    }
    
    private static void mostrarMenuPrincipal(){ 
        System.out.println("     LICENCIAS DE CONDUCIR");
        System.out.println("         Menu Principal");
        System.out.println("===============================");
        System.out.println("1.- Registrar Examen MOTO");
        System.out.println("2.- Registrar Examen AUTO");
        System.out.println("3.- Consultas");       
        System.out.println(" ");
        System.out.println("9.- Cerrar la aplicación");    
    }
    
        private static void mostrarConsultas(){

          
        System.out.println("     LICENCIAS DE CONDUCIR");
        System.out.println("         Menu Consultas");
        System.out.println("===============================");
        System.out.println("1.- Examen por DNI");
        System.out.println("2.- Exámenes de moto por FECHA");
        System.out.println("3.- Exámenes de auto por FECHA");  
        System.out.println("4.- <Consulta Opcional>"); 
        System.out.println(" ");
        System.out.println("9.- Volver al menú anterior");    
    }
         
        private static void cargarExamenMoto(Examen [] arregloDeExamen){
                       
        Scanner entradaMoto = new Scanner(System.in);
        Examen primerExamenMoto;
        Persona persona ;
        String fechadeExamen;
        Circuito primerCircuito ;
        Circuito segundoCircuito ;
        Moto moto;
        int faltasDelCircuito;
        int tiempoDelCircuito;
        
        System.out.println("A continuación cargaremos un examen de moto. Seguí las siguientes instrucciones:");
        
        System.out.println(" ");
        
        System.out.println("Ingresá la fecha del examen");
         int  dia = entradaMoto.nextInt();
        int mes = entradaMoto.nextInt();
       int anio = entradaMoto.nextInt();
       
        fechadeExamen = cargarFecha( dia, mes, anio);
        
        System.out.println(" ");
        
        System.out.println("Ahora cargaremos los datos del usuario:");
        System.out.println("Ingresá el nombre completo del usuario");
        String nombreCompleto = entradaMoto.nextLine();
        System.out.println("Ingresá la fecha de nacimiento del usuario");
        int  dias = entradaMoto.nextInt();
        int meses = entradaMoto.nextInt();
       int anios = entradaMoto.nextInt();
       
        
        String fechaNacimientoUsuario =  cargarFecha( dias, meses, anios);
        System.out.println("Ingresá el DNI del usuario");
        int dni = entradaMoto.nextInt();
     
        persona = new Persona( nombreCompleto, fechaNacimientoUsuario, dni);
        
        System.out.println(" ");

        System.out.println("A continuación cargaremos los datos del vehiculo evaluado:");
        System.out.println("Ingresá la marca");
        String marca = entradaMoto.next();
        System.out.println("Ingresá el número de cilindrada");
        int cilindrada = entradaMoto.nextInt();
        System.out.println("Ingresá la cantidad de espejos");
        int tieneDosEspejos = entradaMoto.nextInt();
        System.out.println("Ingresá la patente");
        String patente = entradaMoto.nextLine();
        moto = new Moto( tieneDosEspejos, patente, marca, cilindrada);
        System.out.println(" ");

        System.out.println("A continuación cargaremos el primer examen. Seguí las siguientes instrucciones:");
        System.out.println("Ingresá la cantidad de faltas que tuvo el usuario");
        faltasDelCircuito = entradaMoto.nextInt();
        System.out.println("Ingresá el tiempo que tomo el primer examen");
        tiempoDelCircuito = entradaMoto.nextInt();
        primerCircuito =  new Circuito (faltasDelCircuito,tiempoDelCircuito);
        
        System.out.println(" ");

        System.out.println("A continuación cargaremos el segundo examen. Seguí las siguientes instrucciones:");
        System.out.println("Ingresá la cantidad de faltas que tuvo el usuario");
        faltasDelCircuito = entradaMoto.nextInt();
        System.out.println("Ingresá el tiempo que tomo el primer examen");
        tiempoDelCircuito = entradaMoto.nextInt();    
        segundoCircuito =  new Circuito (faltasDelCircuito,tiempoDelCircuito);
       
        primerExamenMoto = new ExamenMoto(primerCircuito, segundoCircuito, moto, fechadeExamen,persona );
        primerExamenMoto.circuitoAprobado();
        System.out.println(primerExamenMoto.toString()) ;
        agregarExamen(arregloDeExamen,primerExamenMoto ) ;
        }
        
        private static void cargarExamenAuto(Examen [] arregloDeExamen){
                  
        Scanner entradaAuto = new Scanner(System.in);
        Examen examenAuto;
        Persona persona ;
        String fechadeExamen;
        Circuito circuitoAuto ;
        Auto auto;
        int faltasDelCircuito;
        int tiempoDelCircuito;
        
        System.out.println("A continuación cargaremos un examen de Auto. Seguí las siguientes instrucciones:");
       
        System.out.println(" ");
        
        System.out.println("Ingresá la fecha del examen");
        int  dia = entradaAuto.nextInt();
        int mes = entradaAuto.nextInt();
       int anio = entradaAuto.nextInt();
       
        fechadeExamen = cargarFecha( dia, mes, anio);
        
        System.out.println(" ");
        
        System.out.println("Ahora cargaremos los datos del usuario:");
        System.out.println("Ingresá el nombre completo del usuario");
        String nombreCompleto = entradaAuto.nextLine();
        System.out.println("Ingresá el DNI del usuario");
        int dni = entradaAuto.nextInt();
        System.out.println("Ingresá la fecha de nacimiento del usuario");
         int  dias = entradaAuto.nextInt();
        int meses = entradaAuto.nextInt();
       int anios = entradaAuto.nextInt();
       
        
        String fechaNacimientoUsuario =  cargarFecha( dias, meses, anios);
        persona = new Persona( nombreCompleto, fechaNacimientoUsuario, dni);
        
        System.out.println(" ");
        
        System.out.println("A continuación cargaremos los datos del vehiculo evaluado:");
        System.out.println("Ingresá la patente");
        String patente = entradaAuto.nextLine();
        System.out.println("Ingresá la marca");
        String marca = entradaAuto.nextLine();
        System.out.println("Ingresá el número de cilindrada");
        int cilindrada = entradaAuto.nextInt();
        System.out.println("Ingresá la cantidad de puertas");
        int cantidadDePuertas = entradaAuto.nextInt();
        auto = new Auto( cantidadDePuertas, patente, marca, cilindrada);
        
        System.out.println(" ");

        System.out.println("A continuación cargaremos los resultados del primer examen. Seguí las siguientes instrucciones:");
        System.out.println("Ingresá la cantidad de faltas que tuvo el usuario");
        faltasDelCircuito = entradaAuto.nextInt();
        System.out.println("Ingresá el tiempo que tomo el primer examen");
        tiempoDelCircuito = entradaAuto.nextInt();
        circuitoAuto =  new Circuito (faltasDelCircuito,tiempoDelCircuito);
        
        examenAuto = new ExamenAuto(circuitoAuto, auto, fechadeExamen,persona);
        examenAuto.circuitoAprobado();
        agregarExamen(arregloDeExamen,examenAuto ) ;

      }
              
       private static void consultar(String opcion){
            Scanner ent = new Scanner(System.in);
            String in=opcion;
             while(!in.equals("9")){
                 switch(in){
                     case "1":
                         System.out.println("Consultar examen por DNI");
                         buscarExamenPorDni(arregloDeExamenes);
                     break;
                     
                     case "2":
                         System.out.println("Consultar examen de MOTO por Fecha");
                         buscarExamenMotoPorFecha(arregloDeExamenes);
                     break;
                     case "3":
                         System.out.println("Consultar examen de AUTO por Fecha");
                         buscarExamenAutoPorFecha(arregloDeExamenes);
                     break;
                     case "4":
                         System.out.println("Consultar examen por DNI");
                         break;
                                
             }
                 mostrarConsultas();
                 in = ent.nextLine() ;             }   
             
        }
       
       private static void buscarExamenPorDni( Examen [] arregloDeExamen ){
              Scanner ent = new Scanner(System.in);
              int dni = ent.nextInt();

       for(int i=0; i<tope; i++){
              if(arregloDeExamen[i].persona.dni == dni){
              System.out.println(arregloDeExamen[i].toString());
           }
         }
        }
       
             private static void buscarExamenMotoPorFecha( Examen [] arregloDeExamen ){
           Scanner ent = new Scanner(System.in);
              String fecha = ent.nextLine();

       for(int i=0; i<tope; i++){
              if(arregloDeExamen[i].fechaExamen.equals(fecha) && arregloDeExamen[i].isExamenMoto()){
              System.out.println(arregloDeExamen[i].toString());
           }
         }
        }

         private static void buscarExamenAutoPorFecha( Examen [] arregloDeExamen ){
              Scanner ent = new Scanner(System.in);
              String fecha = ent.nextLine();

       for(int i=0; i<tope; i++){
              if(arregloDeExamen[i].fechaExamen.equals(fecha) && arregloDeExamen[i].isExamenAuto()){
              System.out.println(arregloDeExamen[i].toString());
           }
         }
        }
            
            private static void buscarExamenPorPatente( Examen [] arregloDeExamen ){
              Scanner ent = new Scanner(System.in);
              String patente = ent.nextLine();

       for(int i=0; i<tope; i++){
              if( arregloDeExamen[i].vehiculo.patente.equals(patente)){
                  System.out.println(arregloDeExamen[i].toString());
              
              }
         }
        }
         private static String cargarFecha(int dias,int meses,int anios){
          
        LocalDate fechaNacimiento = LocalDate.of(anios,meses,dias);
        String fechaNa;
  
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        formatter.format(fechaNacimiento);
        
        fechaNa = formatter.format(fechaNacimiento);
        return fechaNa;
    }
}
