package form;

/**
 * Main Class untuk menjalankan aplikasi BI-KANTIN
 * Menampilkan FormLogin pertama kali saat dijalankan
 * @author fatha
 */
public class Main {
    public static void main(String[] args) {
        // Terapkan Look and Feel Nimbus agar antarmuka rapi dan konsisten
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ignored) {}

        // Jalankan FormLogin pertama kali
        java.awt.EventQueue.invokeLater(() -> {
            new FormLogin().setVisible(true);
        });
    }
}
