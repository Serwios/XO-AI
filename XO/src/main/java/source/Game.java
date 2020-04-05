package source;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        System.out.println("Write a size of field [x][y]");

        Scanner enter_row = new Scanner(System.in);
        Scanner enter_column = new Scanner(System.in);

        int size_row = enter_row.nextInt();
        int size_column = enter_column.nextInt();

        Field new_field = new Field(size_row, size_column);
        new_field.cnt_Field();
        new_field.sim_Field();

        System.out.println();

        while (true) {

            System.out.println("Where you want to make changes?");

            Scanner position_row = new Scanner(System.in);
            Scanner position_col = new Scanner(System.in);
            int box_col = position_row.nextInt();
            int box_row = position_col.nextInt();

            new_field.dsb_Field(box_col, box_row);
            System.out.println("My turn");
            new_field.sim_Field();
            new_field.Detektor();

        }
    }
}