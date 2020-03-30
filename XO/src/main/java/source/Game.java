/*JUST FOR 3x3 */

package source;

import java.util.*;

public class Game {
    public static void main(String[] args) {
      System.out.println("Write a size of field");

      Scanner size_1 = new Scanner(System.in);
      Scanner size_2 = new Scanner(System.in);

      int size_row = size_1.nextInt();
      int size_column = size_2.nextInt();

      Field new_field = new Field(size_row, size_column);
      new_field.cnt_Field();
      new_field.dsb_Field();

      System.out.println("");
      System.out.println("Where you want to make changes?");
    }
}

class Field{

    public int row, col;
    public char [][] field;

    Field(int length_row, int length_column){

        this.row=length_row;
        this.col=length_column;

        field= new char[length_row][length_column];
    }


    void cnt_Field(){
        int i, j;

        for (i=0;i<row;i++){
             for (j=0;j<col;j++){

                 field[i][j]='W';

             }
         }

    }

    void dsb_Field(){
        int i, j;

        for (i=0;i<row;i++){

            for (j=0;j<col;j++){

                System.out.print(" ");
                System.out.print(field[i][j]);

            }
            System.out.println(" ");
        }

    }
}
