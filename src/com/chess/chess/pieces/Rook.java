package com.chess.chess.pieces;

import com.chess.boardgame.Board;
import com.chess.chess.ChessPiece;
import com.chess.chess.Color;

public class Rook extends ChessPiece {


    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
