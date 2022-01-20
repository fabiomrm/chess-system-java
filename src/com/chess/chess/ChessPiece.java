package com.chess.chess;

import com.chess.boardgame.Board;
import com.chess.boardgame.Piece;

public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
