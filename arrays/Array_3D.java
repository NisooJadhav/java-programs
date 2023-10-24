public class Array_3D{
    public static void main(String[] args){
        int [][][] arr={{{2,4},{5,6}},{{7,9}}};

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    System.out.println(i+", "+j+", "+k+" = "+arr[i][j][k]);
                }
            }
        }
    }
}