import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner anaranbl = new Scanner(System.in);


String nombreEmpleado, documentoEmpleado ="";
        double salarioBruto, salarioNeto = 0, valorHora = 0, valorTotal = 0, cantidadHoras = 0;
        double deduccionPension = 0, deduccionSalud = 0, horasExtras = 0,valorHorasExtras = 0;
        double bonificacion = 0, fondoSolidaridadPensional = 0, valorRetencionFuente = 0;
        double auxilioTransporte = 0, salarioMinimo = 0;

        System.out.println("Ingrese el nombre del empleado:");
        nombreEmpleado =anaranbl.nextLine();
        System.out.println("Ingrese el documento del empleado");
        documentoEmpleado =anaranbl.nextLine();
        System.out.println("Ingrese el valor de hora");
        valorHora = anaranbl.nextDouble();
        System.out.println("Ingrese la cantidad de horas");
        cantidadHoras =anaranbl.nextDouble();
        System.out.println("Ingrese el valor del salario minimo actual ");
        salarioMinimo =anaranbl.nextDouble();

        if(cantidadHoras > 24){
                System.out.println("Se le puede pagar al empleado");
                salarioBruto = valorHora * cantidadHoras;
                System.out.println("El salario bruto del empleado:" + nombreEmpleado + " es $: " + salarioBruto);
                deduccionPension = salarioBruto * 0.04;
                deduccionSalud = salarioBruto * 0.04;
                System.out.println(" La deduccion por salud es " + deduccionSalud);
                System.out.println("La deduccion por pension es " + deduccionPension);
                if (salarioBruto <= (salarioMinimo*2)){
                        auxilioTransporte = 200000;
                        bonificacion = salarioBruto * 0.01;
                }else {
                        auxilioTransporte = 0;
                        bonificacion = 0;

                }
                if(cantidadHoras > 96) {
                        horasExtras = cantidadHoras - 96;
                        valorHorasExtras = (valorHora*0.25) * horasExtras;
                }
                System.out.println(" Detalle de pago " + nombreEmpleado);
                System.out.println(" El salario bruto del empleado " + nombreEmpleado + " es $ : " + salarioBruto);
                System.out.println(" La deduccion por salued es " + deduccionSalud);
                System.out.println(" La deduccion por pension es " + deduccionPension);
                System.out.println(" El auxilio de transporte es " + auxilioTransporte);
                System.out.println(" La bonificacion es " + bonificacion);
                System.out.println(" El pago por horas extras es " + valorHorasExtras);
                System.out.println(" El salario no es " + (salarioBruto - deduccionSalud - deduccionPension + auxilioTransporte + bonificacion + valorHorasExtras));


        }else  {
                System.out.println("Le faltan " + (24 - cantidadHoras) + " horas de trabajo ");
        }




        }
    }
