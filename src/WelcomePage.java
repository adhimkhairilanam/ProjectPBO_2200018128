import java.awt.*;
import javax.swing.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome to the Puzzle Game!");
    JButton startGameButton = new JButton("Start Game");

    WelcomePage(String userID) {

        welcomeLabel.setBounds(50, 50, 300, 35);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 20));

        startGameButton.setBounds(125, 150, 150, 50);
        startGameButton.setFocusable(false);
        startGameButton.addActionListener(e -> startGame());
        startGameButton.setBackground(new Color(30, 144, 255));
        startGameButton.setForeground(Color.white);
        startGameButton.setFont(new Font(null, Font.BOLD, 16));

        frame.add(welcomeLabel);
        frame.add(startGameButton);
        frame.getContentPane().setBackground(new Color(240, 240, 240));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void startGame() {
        frame.setVisible(false);
        EventQueue.invokeLater(() -> {
            puzzle puzzle = new puzzle();
            puzzle.setVisible(true);
        });
    }

    public static void main(String[] args) {
        new WelcomePage("Player1");
    }
}
