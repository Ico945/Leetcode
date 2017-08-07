package GameofLife;

public class GameofLife {
    public void gameOfLife(int[][] board) {
        int length = board.length;
        for(int i = 0;i<length;i++)
        {
            for(int j = 0;j<board[i].length;j++)
            {
                int temp = 0;
                if(i>0&&i<length-1&&j>0&&j<board.length-1)
                    temp = board[i-1][j-1]+board[i-1][j]+board[i-1][j+1]+board[i][j-1]+board[i][j+1]+board[i+1][j-1]+board[i+1][j]+board[i+1][j+1];
                if(i==0&&j==0)
                    temp = board[i+1][j]+board[i+1][j+1]+board[i][j+1];
                if(i==0&&j==board.length-1)
                    temp = board[i][j-1]+board[i+1][j-1]+board[i+1][j];
                if(i==length-1&&j==0)
                    temp = board[i-1][j]+board[i-1][j+1]+board[i][j+1];
                if(i==length-1&&j==0)
                    temp = board[i][j-1]+board[i-1][j-1]+board[i-1][j];

                if(i==0&&j>0&&j<board[i].length-1)
                    temp = board[i][j-1]+board[i+1][j-1]+board[i+1][j]+board[i+1][j+1]+board[i][j+1];
                if(i==length-1&&j>0&&j<board[i].length-1)
                    temp = board[i][j-1]+board[i-1][j-1]+board[i-1][j]+board[i-1][j+1]+board[i][j+1];
                if(i>0&&i<length-1&&j==0)
                    temp = board[i-1][j]+board[i-1][j+1]+board[i][j+1]+board[i+1][j]+board[i+1][j+1];
                if(i>0&&i<length-1&&j==board.length-1)
                    temp = board[i][j-1]+board[i-1][j-1]+board[i-1][j]+board[i+1][j-1]+board[i+1][j];

                if(board[i][j]==1)
                {
                    if(temp<2||temp>3)
                        board[i][j] = 0;
                }
                else if(temp==3)
                        board[i][j] = 1;
            }
        }

    }
}
