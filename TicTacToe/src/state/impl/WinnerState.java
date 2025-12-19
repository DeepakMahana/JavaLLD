package state.impl;

import exceptions.InvalidMoveException;
import main.Game;
import models.Player;
import state.GameState;

public class WinnerState implements GameState {
    @Override
    public void handleMove(Game game, Player player, int row, int col) {
        throw new InvalidMoveException("Game is already over. " + game.getWinner().getName() + " has won.");
    }
}
