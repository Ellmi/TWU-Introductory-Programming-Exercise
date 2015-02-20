/**
 * Created by ymxing on 2/20/15.
 */
public class Triangle {
    public void PrintOneAsterisk(){
        System.out.println("*");
    }

    public void DrawAHorizontalLine(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void DrawAVerticalLine(int n){
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
    }

    public void DrawARightTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
