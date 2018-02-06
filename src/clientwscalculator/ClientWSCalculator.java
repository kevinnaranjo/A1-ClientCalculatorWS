
package clientwscalculator;


public class ClientWSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("20 + 20 = " + sum(20,20));
        System.out.println("La raíz de 36 es: " + raiz(36));
        System.out.println("1200/8.5 = " + div(1200,8.5));
        
        System.out.println("La tabla del 5");
        for (int i = 1; i < 11; i++) {
            System.out.println(" 5 x " + i + " = " + mult(5,i));
            
        }
    }

    private static int sum(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.sum(n1, n2);
    }

    private static double raiz(double n1) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.raiz(n1);
    }

    private static double div(double n1, double n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.div(n1, n2);
    }

    private static int mult(int n1, int n2) {
        pack.Calc_Service service = new pack.Calc_Service();
        pack.Calc port = service.getCalcPort();
        return port.mult(n1, n2);
    }
    
}
