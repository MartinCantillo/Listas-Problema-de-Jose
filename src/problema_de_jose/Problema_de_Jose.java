package problema_de_jose;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author martin cantillo
 */
public class Problema_de_Jose {

    Scanner entrada = new Scanner(System.in);
    Random rnd = new Random();

    public class nodo {

        String dato;
        nodo sig;
        nodo ant;

    }
    nodo cab, q, p, aux, t, m, ultimo;
    int i, num2;

    public Problema_de_Jose() {
        this.cab = null;
        this.q = null;
        this.p = null;
        this.aux = null;
        this.t = null;
        this.m = null;
        this.ultimo = null;
    }

    public boolean listavacia() {
        if (cab == null) {
            return true;
        } else {
            return false;
        }
    }

     public void insertar(String info){
         
        nodo n = new nodo();
        n.dato = info;
        n.sig = n;
        n.ant = n;
        if (cab == null) {
            cab = n;
        } else {
            p = cab;
            while(p.sig != cab){
                p = p.sig;
            }
            p.sig = n;
            n.ant = p ;
            cab.ant = n ;
            n.sig = cab;

        }
     }

    public void procedimiento() {
        int ba;
        if (listavacia()) {
            System.out.print("la lista esta vacia ");
        }else {
        // ba = rnd.nextInt(10);
        //System.out.println("Numero  " + ba + "  Insertado");
        System.out.println("di un numero ");
        ba = entrada.nextInt();
       // System.out.println("di otro numero");
        //num2 = entrada.nextInt();
         
             q = null;
             p=cab;
                for (i = 1; i <= ba; i++) {
                    q=p;
                    p = p.sig;
                }
                if(cab.sig.sig==cab){
                    aux=p;
                    System.out.println("el ganador es el soldado  " + p.dato);
                     System.out.println("");
                     System.out.println("---Se elimino  el soldado" + q.dato +"---");
                    p.sig=p;
                    p.ant=p;
                    cab=p;
                }else if(q==cab){
                    System.out.println("el soldado que se elimino  es " + q.dato);
                   cab.ant.sig=p;
                    p.ant=cab.ant;
                    cab =p;
                }
                else{
                    System.out.println("Se elimino al soldado " + q.dato);
                    q.ant.sig=p;
                    p.ant=q.ant;
                    
                }
            
        }
    }

    public void mostrarlista() {
        if (listavacia()) {
            System.out.print("la lista esta vacia ");
        } else {
            nodo r = cab;
         
            while (r.sig != cab) {
                System.out.print("->");
                System.out.print(r.dato + " -> ");
                r = r.sig;
            }
            System.out.print(r.dato + " -> ");

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rnd = new Random();

        Problema_de_Jose listas = new Problema_de_Jose();
        int opc, i = 1, j=1, dato;
        String nombre;
        do {
            System.out.println("");
            System.out.println("1.Insertar al inicio");
            System.out.println("2.Mostrar Lista ");
            System.out.println("3.Lanzar Balota ");
            System.out.println("10. Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("");
                    System.out.println("Digite el nombre del soldado " + j + "");
                    nombre = entrada.next();
                    System.out.println("");
                    System.out.println("soldado --" + nombre + "-- ingresado ");
                    listas.insertar(nombre);
                     j++;
                    break;
                case 2:
                    listas.mostrarlista();
                    break;
                case 3:
                    listas.procedimiento();
                    break;
            }

        } while (opc != 10);

    }

}
