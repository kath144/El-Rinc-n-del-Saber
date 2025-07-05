package Sistema;

import Vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        // Para que la interfaz gráfica se ejecute correctamente
        javax.swing.SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
}
