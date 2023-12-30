package firstZK;


import org.zkoss.zk.ui.event.Events;

import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;

public class TTTIK extends SelectorComposer<Window> {
	private static final long serialVersionUID=1L;
	@Wire
	private Button b1;
	@Wire
	private Button b2;
	@Wire
	private Button b3;
	@Wire
	private Button b4;
	@Wire
	private Button b5;
	@Wire
	private Button b6;
	@Wire
	private Button b7;
	@Wire
	private Button b8;
	@Wire
	private Button b9;

	
	
	
	 private Button[][] buttons;
	    private char currentPlayer;
	    private boolean gameOver;

	    public void doAfterCompose(Window comp) throws Exception {
	        super.doAfterCompose(comp);

	        // Initialize the game
	        initializeGame();
	    }

	    private void initializeGame() {
	        buttons = new Button[][] {
	            { b1, b2, b3 },
	            { b4, b5, b6 },
	            { b7, b8, b9 }
	        };

	        currentPlayer = 'X';
	        gameOver = false;

	        // Attach event listeners to buttons
	        for (int i = 0; i < buttons.length; i++) {
	            for (int j = 0; j < buttons[i].length; j++) {
	                Button button = buttons[i][j];
	                button.addEventListener(Events.ON_CLICK, e -> onButtonClick(e, button));
	            }
	        }
	    }

	    private void onButtonClick(Event event, Button button) {
	        if (!gameOver && button.getLabel().isEmpty()) {
	            button.setLabel(String.valueOf(currentPlayer));
	            if (checkForWinner()) {
	                gameOver = true;
	                // Handle game over, display winner or tie
	            } else {
	                switchPlayer();
	            }
	        }
	    }

	    private void switchPlayer() {
	        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	    }

	    private boolean checkForWinner() {
	        // Implement logic to check for a winning condition
	        // You'll need to check rows, columns, and diagonals for three in a row
	        // Return true if there's a winner, false otherwise
	        return false;
	    }

	    // Additional methods for resetting the game, checking for ties, etc.
	}
	
	


