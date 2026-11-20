class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen= new HashSet<>();

        for(int row=0;row<9;row++)
        {
            for(int col=0;col<9;col++)
            {
                char digit=board[row][col];

                if(digit=='.')
                {
                    continue;
                }

                String rowKey="row"+ row + digit;
                String colKey="col"+ col + digit;

                int box=(row/3)*3 +(col/3);

                String boxKey="box" + box+digit;
                if(seen.contains(rowKey)|| seen.contains(colKey) || seen.contains(boxKey) )
                {
                    return false;
                }

                seen.add(rowKey);
                seen.add(colKey);
                seen.add(boxKey);
            }
        }

        return true;
        
    }
}
