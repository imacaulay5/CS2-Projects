package com.KnightTour;


public class Knight
{
    private int[] _horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] _vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

    public Knight()
    {
    }

    public int getRowChange(int moveNumber)
    {
        return _horizontal[moveNumber];
    }

    public int getColumnChange(int moveNumber)
    {
        return _vertical[moveNumber];
    }
}
