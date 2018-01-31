/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.quintor.solitaire.ui;

import com.sun.xml.internal.ws.api.message.saaj.SAAJFactory;
import java.util.Collection;
import java.util.Scanner;
import nl.quintor.solitaire.game.moves.Move;
import nl.quintor.solitaire.models.state.GameState;

/**
 *
 * @author Ben
 */
public class GameUI implements UI {

    /**
     * Set a message to show the player the next time {@link #refresh(GameState)} is called. This message
     * should be shown as a non-error message.
     *
     * @param message message to show the player
     */
    @Override
    public void setMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Set an error message to show the player the next time {@link #refresh(GameState)} is called. This
     * message should be shown as an error.
     *
     * @param message error message to show the player
     */
    @Override
    public void setErrorMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Signals to the UI implementation that the game state has changed. The UI may or may not refresh more often.
     *
     * @param gameState the game state to be visualized by the UI
     */
    @Override
    public void refresh(GameState gameState) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    /**
     * Signals to the UI implementation that the game state has changed, and that player input is expected. The UI may
     * or may not refresh more often.
     *
     * @param gameState the game state to be visualized by the UI
     * @param moves the moves that are possible in this game state
     * @return String representation of the player request
     */
    @Override
    public String refreshAndRequestMove(GameState gameState, Collection<Move> moves) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("What do you want to do?");
        Scanner input = new Scanner(System.in);
        
        String request = input.nextLine(); 
        
        return request;
    }
}
