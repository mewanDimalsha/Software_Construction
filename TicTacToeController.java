import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController {
    private TicTacToeModel model;
    private TicTacToeView view;

    public TicTacToeController(TicTacToeModel model, TicTacToeView view) {
        this.model = model;
        this.view = view;

        // Attach action listeners to buttons
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                view.setButtonListener(new ButtonClickListener(i, j), i, j);
            }
        }
    }

    class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int currentPlayer = model.getCellValue(row, col);
            if (currentPlayer == 0 && !model.hasWon(1) && !model.hasWon(2) && !model.isBoardFull()) {
                model.makeMove(row, col);
                view.updateButton(row, col, model.getCellValue(row, col));

                if (model.hasWon(1)) {
                    view.showResult("Player 1 wins!");
                } else if (model.hasWon(2)) {
                    view.showResult("Player 2 wins!");
                } else if (model.isBoardFull()) {
                    view.showResult("It's a draw!");
                }
            }
        }
    }
}
