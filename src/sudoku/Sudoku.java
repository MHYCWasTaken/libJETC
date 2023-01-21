package sudoku;

/**
 * Sudoku
 * @author MHYC133
 * @date 2023/01/13 12:03
 */
public class Sudoku implements Cloneable {

    public int[][] sudoku = new int[9][9];

    public boolean[][][] possible = new boolean[9][9][10];

    /**
     * Set number of sudoku[i][j] to num
     * @author MHYC133
     * @date 2023/01/13 12:03
     * @param i int
     * @param j int
     * @param num int
     * @return boolean if set is success
     */
    public boolean setNum(int i, int j, int num) {
        if(i < 0 || j < 0 || i > 8 || j > 8 || num < 1 || num > 9) {
            return false;
        }
        this.sudoku[i][j] = num;
        return true;
    }

    /**
     * Init sudoku and possible
     * should be only called before solve
     * will clear sudoku and possible
     * @author MHYC133
     * @date 2023/01/13 12:06
     */
    public void init() {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                for(int k = 1; k <= 9; k++) {
                    this.possible[i][j][k] = true;
                }
                this.sudoku[i][j] = 0;
            }
        }
    }

    /**
     * Mark possible, should be called when solving
     * @author MHYC133
     * @date 2023/01/13 12:07
     */
    public void markPossible() {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {

            }
        }
    }

    public Sudoku solve() {
        Sudoku solution = (Sudoku) this.clone();
        this.init();
        this.markPossible();
    }

    @Override
    public Object clone() {
        Sudoku s = null;  
        try{  
            s = (Sudoku) super.clone();  
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return s;  
    }
    
}
