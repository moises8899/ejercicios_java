
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Font.PLAIN;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;


public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        JPanel panel = new JPanel();
        this.add(panel); //Añado el panel al JFrame
        panel.setPreferredSize(new Dimension(800, 600)); //Dimensiones del panel

        this.setTitle("Ejemplo 19");
        this.setSize(800, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //Para poder modificar más propiedades con Graphics 2d
        Graphics2D g2d = (Graphics2D) g;

        //Línea
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(30, 70, 770, 70);

        //Rectángulo (relleno y borde)
        g2d.setColor(Color.BLUE);
        g2d.fillRect(30, 100, 350, 60);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(30, 100, 350, 60);

        //Rectángulo redondeado
        g2d.setColor(Color.CYAN);
        g2d.drawRoundRect(420, 100, 350, 60, 50, 50);

        //Arco
        g2d.setColor(Color.PINK);
        g2d.drawArc(30, 200, 100, 100, 180, -90);

        //Círculo
        g2d.setColor(Color.RED);
        g2d.drawOval(100, 200, 100, 100);

        //Óvalo (con relleno y borde)
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(240, 200, 150, 100);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(240, 200, 150, 100);

        //Polígono (3 lados)
        int[] triangulo_x = {450, 510, 570};
        int[] triangulo_y = {300, 200, 300};
        g2d.setColor(Color.red);
        g2d.drawPolygon(triangulo_x, triangulo_y, 3);
        int[] triangulo_x2 = {600, 510, 600};
        int[] triangulo_y2 = {300, 500, 300};
        g2d.setColor(Color.green);
        g2d.drawPolygon(triangulo_x2, triangulo_y2, 3);

        //Polígono (5 lados con relleno y borde)
        int[] pentagono_x = {670, 650, 700, 750, 730};
        int[] pentagono_y = {300, 245, 200, 245, 300};
        g2d.setColor(Color.MAGENTA);
        g2d.fillPolygon(pentagono_x, pentagono_y, 5);
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(pentagono_x, pentagono_y, 5);

        //Texto
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("ARIAL", PLAIN, 32));
        g2d.drawString("Esto es un texto", 30, 400);

        //Imagen
        Toolkit t = Toolkit.getDefaultToolkit();
        Image imagen = t.getImage("src/img/smile.png");
        g2d.drawImage(imagen, 30, 450, this);

        //Degradado
        GradientPaint gp = new GradientPaint(400, 350, Color.RED, 770, 550, Color.GREEN);
        g2d.setPaint(gp);
        g2d.fillRect(400, 350, 370, 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}