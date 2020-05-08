package com.KnightTour;

public class Square
{
    private boolean _beenVisited = false;

    /** What move number the square was visited*/
    private int _moveVisited = 0;

    /** Constructor for each square*/
    public Square()
    {
    }

    public String toString()
    {
        return String.valueOf(_moveVisited);
    }

    public boolean getBeenVisited()
    {
        return _beenVisited;
    }

    public void setBeenVisited()
    {
        _beenVisited = true;
    }

    public void setMoveVisited(int value)
    {
        _moveVisited = value;
    }

    public int getMoveVisited()
    {
        return _moveVisited;
    }
}
