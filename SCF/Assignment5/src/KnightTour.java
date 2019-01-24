import java.util.Random;

class KnightTour { 
    static int N = 8; 
    static int last_x;
	static int last_y;
    /*
     * @param sol is the solution matrix
     * @param x and y are the coordinates at chess board
     * @returns return true if knight can move to that place 
     */
    static boolean isSafe(int x, int y, int sol[][]) { 
        return (x >= 0 && x < N && y >= 0 &&  y < N && sol[x][y] == -1); 
    } 
  
    /*
     * @param sol is the solution matrix that has to be printed
     */
    static void printSolution(int sol[][]) { 
        for (int x = 0; x < N; x++) { 
            for (int y = 0; y < N; y++) 
                System.out.print(sol[x][y] + " "); 
            System.out.println();
        } 
    } 
  
    static boolean knightTourSolution() { 
        int sol[][] = new int[8][8],next_x,next_y; 
        boolean status= false;
        for (int x = 0; x < N; x++) 
            for (int y = 0; y < N; y++) 
                sol[x][y] = -1; 
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1}; 
        sol[0][0] = 0; 
        Random rand = new Random();
        if (!nextStepKT(rand.nextInt(N),rand.nextInt(N), 1, sol, xMove, yMove)) { 
            System.out.println("Solution does not exist"); 
            return false; 
        }
        else {
        	
            printSolution(sol);
            for (int k = 0; k < 8; k++) { 
            	next_x = last_x + xMove[k]; 
                next_y = last_y + yMove[k]; 
                
                if (next_x >= 0 && next_x < N && next_y >= 0 &&  next_y < N && sol[next_x][next_y] == 1)
                	status=true;
                }  
            if (status)
         	   System.out.println(" Closed Path "); 
            else
         	   System.out.println(" Open Path ");
            
        }
        return true; 
    } 
  
    static boolean nextStepKT(int x, int y, int step, int sol[][], int xMove[], int yMove[]) { 
        int k, next_x, next_y; 
        if (step == N * N) 
            return true; 
        
        for (k = 0; k < 8; k++) { 
            next_x = x + xMove[k]; 
            next_y = y + yMove[k]; 
            if (isSafe(next_x, next_y, sol)) { 
            	if(step == N * N -1 )
                {
                	last_x= next_x;
                	last_y= next_y;
                }
            	sol[next_x][next_y] = step; 
                if (nextStepKT(next_x, next_y, step + 1, 
                                sol, xMove, yMove)) 
                    return true; 
                else
                    sol[next_x][next_y] = -1;// backtracking 
            } 
        } 
        return false; 
    } 
    public static void main(String args[]) { 
        knightTourSolution(); 
    } 
} 