package com.KnightTour;

public class MoveSelector
{
    private int _counter = 1;
    private int _moveNumber = 0;

    public MoveSelector()
    {

    }

    public int getCount()
    {
        return _counter;
    }

    public void setCount(int count)
    {
        _counter = count;
    }

    public int getMoveNumber()
    {
        return _moveNumber;
    }

    public void setMoveNumber(int moveNumber)
    {
        _moveNumber = moveNumber;
    }
}
