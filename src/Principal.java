import com.sanfalcon.consulta.ConsultarTipoDeCambio;
import com.sanfalcon.menus.Generar;
import com.sanfalcon.menus.Menu;
import com.sanfalcon.tipocambio.TipoDeCambio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // key => 80a82cf0bf52fa0b4c276211
        // uri conversion de moneda =>  https://v6.exchangerate-api.com/v6/80a82cf0bf52fa0b4c276211/pair/PEN/USD/100
        try {
            Scanner teclado = new Scanner(System.in);
            ConsultarTipoDeCambio consultarTipoDeCambio = new ConsultarTipoDeCambio();
            Generar menuTipoDeCambioGenerar = new Generar();
            // Mostrar los menus
            System.out.println(menuTipoDeCambioGenerar.getListMenu());
            int opcion = teclado.nextInt();

            Menu menuSeleccionado = menuTipoDeCambioGenerar.getList().get(opcion - 1);

            while (menuSeleccionado.isFinalizar() == false) {
                System.out.println("Ingrese el valor que desea convertir");
                double cantidadMoneda = teclado.nextDouble();

                TipoDeCambio resultado = consultarTipoDeCambio.consultar(menuSeleccionado.getMonedaBase(), menuSeleccionado.getMonedaConversion(), cantidadMoneda);

                System.out.println(resultado.mensaje());

                // volvemos a ejecutar el codigo
                System.out.println(menuTipoDeCambioGenerar.getListMenu());
                opcion = teclado.nextInt();

                menuSeleccionado = menuTipoDeCambioGenerar.getList().get(opcion - 1);
            }

        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("Debes agregar una opcion valida de conversión");
        } catch (Exception e) {
            System.out.println("Se produjo un problema: " + e.getMessage());
        } finally {
            System.out.println("Sistema de conversion finalizado");
        }
    }
}
