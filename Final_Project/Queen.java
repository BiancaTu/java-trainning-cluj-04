package com.company;

public class Queen extends Piece {
    public Queen(boolean available, int x, int y) {
        super(available, x, y);
    }

    @Override
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if(super.isValid(board, fromX, fromY, toX, toY) == false)
            return false;
        //diagonal
        if(toX - fromX == toY - fromY)
            return true;
        if(toX == fromX)
            return true;
        if(toY == fromY)
            return true;

        return false;
    }
}
