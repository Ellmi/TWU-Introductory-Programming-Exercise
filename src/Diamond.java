/**
 * Created by ymxing on 2/20/15.
 */
public class Diamond {
    public void drawIsoscelesTriangle(int n){
        drawUpTriangle(n);
        DrawAsterisks(n);
    }

    public void drawDiamond(int n){
        drawIsoscelesTriangle(n);
        drawDownTriangle(n);
    }

    public void DiamondWithName(int n,String name){
        drawUpTriangle(n);
        System.out.println(name);
        drawDownTriangle(n);
    }

    private void drawDownTriangle(int n) {
        for(int restRow=n-1;restRow>0;restRow--){
            for(int i=0;i<n-restRow;i++){
                System.out.print(" ");
            }
            DrawAsterisks(restRow);
        }
    }

    private void drawUpTriangle(int n) {
        for(int row=1;row<n;row++){
            for(int i=0;i<n-row;i++){
                System.out.print(" ");
            }
            DrawAsterisks(row);
        }
    }

    private void DrawAsterisks(int row) {
        for(int i=0;i<2*row-1;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
