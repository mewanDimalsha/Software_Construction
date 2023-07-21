import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TicTacToeView {
    private JFrame frame;
    private JButton[][] buttons;

    public TicTacToeView() {
        frame = new JFrame("Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(3, 3));

        buttons = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
                frame.add(buttons[i][j]);
            }
        }

        frame.setVisible(true);
    }

    public void setButtonListener(ActionListener listener, int row, int col) {
        buttons[row][col].addActionListener(listener);
    }

    public void updateButton(int row, int col, int player) {
        buttons[row][col].setText(player == 1 ? "1" : "2");
        buttons[row][col].setEnabled(false);
    }

    public void showResult(String message) {
        JOptionPane.showMessageDialog(frame, message, "Game Over", JOptionPane.INFORMATION_MESSAGE);
    }
}
