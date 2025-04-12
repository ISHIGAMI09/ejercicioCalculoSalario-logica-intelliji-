import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String nombreEmpleado = "", documentoEmpleado = "";
     double salarioBruto = 0 , salarioNeto = 0 , valorHoras = 0 , catidadHoras = 0 , deduccionSalud = 0 , deduccionPenssion = 0 , horasExtras = 0 , valorHorasExtras = 0 , bonificacion = 0 , fondoSolidaridadPensional = 0 , valorReteFuente = 0 , auxilioDeTransporte = 0 , salarioMinomo = 0;

     System.out.println("Ingresa el Nombre del Empleado");
     nombreEmpleado = sc.nextLine();
     System.out.println("Ingrese el documento del empleado");
     documentoEmpleado = sc.nextLine();
     System.out.println("Ingrese el valor de la hora");
     valorHoras = sc.nextDouble();
     System.out.println("Ingrese la cantidad de las horas");
     catidadHoras = sc.nextDouble();
     System.out.println("Ingrese el valor del salario minimo actual: ");
     salarioMinomo = sc.nextDouble();

     if(catidadHoras > 24){
         System.out.println("Se le puede pagar al empleado");
         salarioBruto = valorHoras * catidadHoras ;
         System.out.println("el salario bruto del empleado: "+nombreEmpleado + " es  $:"+ salarioBruto);
         deduccionPenssion = salarioBruto * 0.04 ;
         deduccionSalud = salarioBruto * 0.04 ;
         System.out.println("La decuccion por salud es:" + deduccionSalud);
         System.out.println("La decuccion por pension es:" + deduccionPenssion);
         if (salarioBruto <= (salarioMinomo*2)) {
             auxilioDeTransporte = 2000000;
             bonificacion = salarioBruto * 0.1;
         } else {
             auxilioDeTransporte = 0;
             bonificacion = 0 ;
         }
         if (catidadHoras > 96 ){
         horasExtras = catidadHoras * 96;
         valorHorasExtras = (valorHoras * 0.25) * horasExtras;
         }
         System.out.println("Detalle de pago" + nombreEmpleado);
         System.out.println("El salario bruto del empleado" + nombreEmpleado + " es $");
         System.out.println("la deduccion por salud es " + deduccionSalud);
         System.out.println("la deduccion por pension es" + deduccionPenssion);
         System.out.println(" el auxilio de transporte es " + auxilioDeTransporte);
         System.out.println(" la bonificacion es " + bonificacion);
         System.out.println("el pago de horas extras es " + horasExtras);
         System.out.println(" el salario neto es" + (salarioBruto-deduccionSalud-deduccionPenssion+auxilioDeTransporte+bonificacion+horasExtras));
     } else {
         System.out.println("le faltan" + (24- catidadHoras) + "horas de trabajo");



      }
    }
}