package leet_code;

import java.util.ArrayList;
import java.util.List;

public class ValidSudokuQ36 {

	public static void main(String[] args) {
		ValidSudokuQ36 valid = new ValidSudokuQ36();
		System.out.println(valid.isValidSudoku(new char[][] {{'5','3','.','.','7','.','.','.','.'}
		,{'6','.','.','1','9','5','.','.','.'}
		,{'.','9','8','.','.','.','.','6','.'}
		,{'8','.','.','.','6','.','.','.','3'}
		,{'4','.','.','8','.','3','.','.','1'}
		,{'7','.','.','.','2','.','.','.','6'}
		,{'.','6','.','.','.','.','2','8','.'}
		,{'.','.','.','4','1','9','.','.','5'}
		,{'.','.','.','.','8','.','.','7','9'}}));
	}
	public boolean isValidSudoku(char[][] board) {
        List<List<Integer>> numList = new ArrayList<>();
        for(int i = 0;i<board.length;i++){
            numList.add(new ArrayList<>());
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(!(board[i][j] == '.')){
                    int index = board[i][j]-'0'-1;
                    List<Integer> previousResults = numList.get(index);
                    int target = i*9+j;
                    if(previousResults.isEmpty()){
                        previousResults.add(target);
                        numList.set(index,previousResults);
                    }else{
                        for(Integer num:previousResults){
                            if(num/board.length == target/board.length){
                                return false;
                            }else if(num%board.length == target%board.length){
                                return false;
                            }else if((i/3 == (num/9)/3) && (j/3 == (num%9)/3)){
                                return false;
                            }
                        }
                        previousResults.add(target);
                        numList.set(index,previousResults);
                    }
                }
            }
        }
        return true;
    }
}
