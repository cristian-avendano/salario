
import java.text.NumberFormat;


public class main {
    public static void main(String[] args) {
        //salario por cada caso
        System.out.println(calcSalario('a'));
        System.out.println(calcSalario('b'));
        System.out.println(calcSalario('c'));
    }
    
    public static  String calcSalario(char clase){
        double sala = 1000000;
        double salario = 1000000;
        
        NumberFormat a = NumberFormat.getNumberInstance();
        switch(clase){
            case 'a':
                //comision
                
                salario = salario + sala * 0.3;
                
                //retencion en la fuente
                
                salario = salario - sala * 0.1;
                
                //salud y pension;
                
                salario = salario - sala * 0.12;
                
                
            break;
            
            case 'b':
                //comision
                
                salario = salario + sala * 0.2;
               
                //salud y pension;
                
                salario = salario - sala * 0.12;
                
            break;
            
            case 'c':
                //comision
                
                salario = salario + sala * 0.1;
                
                
                //salud y pension;
                
                salario = salario - sala * 0.12;
                
            break;
            
        }
        return "$" + a.format(salario);
    }
    
}
