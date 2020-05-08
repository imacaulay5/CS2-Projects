package com.KnightTour;

public class Main
{
    public static void main(String[] args)
    {
        // Construct 8x8 Board
        Board knightBoard = new Board(8, 0, 0);

        // Construct Knight
        Knight knight = new Knight();

        // Construct Move Selector
        MoveSelector move = new MoveSelector();

        // Initialize variable to determine if no more valid moves
        boolean noValidMoves = false;
        // Continue knight tour until no more valid moves
        while (move.getCount() < knightBoard.getBoardSize() * knightBoard.getBoardSize())
        {
            // Which of the 8 possible moves are valid
            for (int i = 0; i < knightBoard.getBoardSize(); i++)
            {
                // If position is on board and hasn't been visited, then position is valid
                if (knightBoard.isValidMove(knightBoard.getRow() +
                                                        knight.getRowChange(i),
                                            knightBoard.getColumn() +
                                                        knight.getColumnChange(i)))
                {
                    // Set move number
                    move.setMoveNumber(i);
                    break;
                }
                // If we've gone through all of the moves and none are valid
                else if ( i == knightBoard.getBoardSize() - 1 )
                {
                    noValidMoves = true;
                }
            }
            // If no more valid moves, end tour
            if( noValidMoves)
            {
                break;
            }
            // Else, move knight to selected position
            else
            {
                // Move the knight to selected position
                knightBoard.setRow( knight.getRowChange(move.getMoveNumber()) );
                knightBoard.setColumn( knight.getColumnChange(move.getMoveNumber()) );

                // Update square with the move visited
                knightBoard.getSquare( knightBoard.getRow(), knightBoard.getColumn()).setMoveVisited( move.getCount() );
                // Update square has been visited
                knightBoard.getSquare(knightBoard.getRow(), knightBoard.getColumn()).setBeenVisited();

                // Increment move counter
                move.setCount( move.getCount() + 1 );
            }
        }
        // Print board at end of tour
        knightBoard.printBoard();
    }
}

