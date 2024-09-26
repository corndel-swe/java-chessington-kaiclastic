package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.Board;
import com.corndel.chessington.model.Coordinates;
import com.corndel.chessington.model.Move;
import com.corndel.chessington.model.PlayerColour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rook extends AbstractPiece  {



  public Rook(PlayerColour colour) {
    super(PieceType.ROOK, colour);


  }

  @Override
  public List<Move> getAllowedMoves(Coordinates from, Board board) {
    var allowedMoves = new ArrayList<Move>();
    // TODO Implement this!
    // White Rook
    if (getColour().equals(PlayerColour.WHITE)) {



      // black Rook
//      else {
//
//
//      }
    }

    return allowedMoves;
  }
}
