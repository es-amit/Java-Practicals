public class question15 {
    
    public static void main(String[] args) {
        int m1[][]={{1,2},{3,4}};
        int m2[][]={{5,6},{7,8}};
        int ans[][]=new int[2][2];
        //Mutliplication
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    ans[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }

        //printing
        for(int i=0;i<2;i++){
            System.out.print("| ");
            for(int j=0;j<2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(" |");
        }
    }
}
