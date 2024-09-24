package com.corndel.chessington.model.pieces;

import com.corndel.chessington.model.PlayerColour;

public abstract class AbstractPiece implements Piece {

  private final Piece.PieceType type;
  protected final PlayerColour colour;

  protected AbstractPiece(Piece.PieceType type, PlayerColour colour) {
    this.type = type;
    this.colour = colour;
  }


  public PieceType getType() {
    return type;
  }


  public PlayerColour getColour() {
    return colour;
  }

  public String toString() {
    return colour.toString() + " " + type.toString();
  }

}
