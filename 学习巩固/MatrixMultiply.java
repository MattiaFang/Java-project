package com.packone;
//矩阵相乘
public class MatrixMultiply {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,1},
                {-2,4,1}
        };
        int b[][] ={
                {4,3,0,-1},
                {2,3,5,2},
                {1,0,6,3}
        };
        int c[][] = new int[2][4];

        for(int i =0;i<2;i++)
            for(int j = 0;j<4;j++)
                for(int k = 0;k<3;k++)
                    c[i][j] = c[i][j]+a[i][k]*b[k][j];
        for(int i =0;i<2;i++){
            for(int j=0;j<4;j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
