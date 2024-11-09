// ウィンドウの表示

import javax.swing.JFrame;

public class windowDisplay extends JFrame {
    public static void main (String[] args) {
        JFrame frame = new JFrame("JavaSwingのテスト");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
    }
}