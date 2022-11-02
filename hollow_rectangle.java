public class hollow_rectangle{
    public static void hollowrectangle(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(j==1 || j==5 || i==1 || i==4)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        hollowrectangle(4,5);
    }
}