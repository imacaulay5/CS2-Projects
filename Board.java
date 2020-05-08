package com.KnightTour;

import java.util.Arrays;

public class Board
{
    private int _currentRow;
    private int _currentColumn;
    private int _boardSize;
    private Square[][] _board;

    public Board(int boardSize, int startRow, int startColumn)
    {
        _boardSize = boardSize;
        _board = new Square[boardSize][boardSize];
        _currentRow = startRow;
        _currentColumn = startColumn;

        // Initialize each square on board
        for (int x = 0; x < _boardSize; x++)
        {
            for (int y = 0; y < _boardSize; y++)
            {
                _board[x][y] = new Square();
            }
        }
    }

    public int getBoardSize()
    {
        return _boardSize;
    }

    public int getRow()
    {
        return _currentRow;
    }

    public void setRow(int rowChange)
    {
        _currentRow += rowChange;
    }

    public int getColumn()
    {
        return _currentColumn;
    }

    public void setColumn(int columnChange)
    {
        _currentColumn += columnChange;
    }

    public Square getSquare(int row, int column)
    {
        return _board[row][column];
    }
    /** Determines if move is on the board */
    public boolean isOnBoard(int nextRow, int nextColumn)
    {
        return (nextRow < _boardSize && nextRow > 0) && (nextColumn < _boardSize && nextColumn > 0);
    }

    /** Determines if square has been visited */
    public boolean hasBeenVisited(int nextRow, int nextColumn)
    {
        return _board[nextRow][nextColumn].getBeenVisited();
    }

    /** Determines if move is valid */
    public boolean isValidMove(int nextRow, int nextColumn)
    {
        return isOnBoard(nextRow, nextColumn) && !hasBeenVisited(nextRow, nextColumn);
    }

    public void printBoard()
    {
        System.out.println(Arrays.deepToString(_board));
    }


}
