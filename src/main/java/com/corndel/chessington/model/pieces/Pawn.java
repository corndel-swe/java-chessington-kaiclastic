package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.Board;
import com.corndel.chessington.model.Coordinates;
import com.corndel.chessington.model.Move;
import com.corndel.chessington.model.PlayerColour;
import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractPiece {

  public Pawn(PlayerColour colour) {
      super(PieceType.PAWN,colour);
  }



  @Override
  public List<Move> getAllowedMoves(Coordinates from, Board board) {
    var allowedMoves = new ArrayList<Move>();




// white pawns
    if (getColour().equals(PlayerColour.WHITE)) {
      // initial Pawn movement is two squared
      if (from.getRow() == 6 && board.get(from.plus(-2,0)) == null && board.get(from.plus(-2,-2)) == null ) {
        allowedMoves.add(new Move(from, from.plus(-2, 0)));
      }
        //  diagonal Movement and contained within Board
      if (from.getRow() > 0 && from.getCol() > 0 && board.get(from.plus(-1,0)) == null){
        allowedMoves.add(new Move(from, from.plus (-1, 0)));
        allowedMoves.add(new Move(from, from.plus (-1, -1)));
        allowedMoves.add(new Move(from, from.plus (-1, 1)));
     }

    }
// black Pawns
else{
      if (from.getRow() == 1 &&  board.get(from.plus(2,0)) == null){
        allowedMoves.add(new Move(from, from.plus(2, 0)));
      }

      //  diagonal Movement and contained within Board
        // current pawn is row  & column  less than 7 take move forward
      if (from.getRow() < 7 &&
              from.getCol() < 7 && board.get(from.plus(1,0)) == null ){
      allowedMoves.add(new Move(from, from.plus(1, 0)));
        allowedMoves.add(new Move(from, from.plus (1, 1)));
        allowedMoves.add(new Move(from, from.plus (1, -1)));
      }
    }
    // TODO Implement this!
    return allowedMoves;
  }
}
