package source;

public class Field {
    public int row, col;
    public char [][] field;

    public Field() {}

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

    void dsb_Field(int change_row, int change_col){
        int i, j;
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                System.out.print(" ");
                field[change_row][change_col]='X';
                System.out.print(field[i][j]);
            }
            System.out.println(" ");
        }
    }

    void sim_Field(){
        Field change_Field = new Field();

        int i, j;
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                System.out.print(" ");
                System.out.print(field[i][j]);
                if (field[0][0]=='X' && field[0][2]!='X'){
                    field[0][2]='O';


                    change_Field.sim_Field();
                }
                if (field[2][0]=='X' && field[1][0]!='X'){
                    field[1][0]='O';


                    change_Field.sim_Field();
                }
                if (field[2][0]=='X' && field[1][0]!='X' && field[2][2]=='X'){
                    field[2][1]='O';


                    change_Field.sim_Field();
                }
                if (field[2][2]=='X' && field[1][1]!='X'){
                    field[1][1]='O';


                    change_Field.sim_Field();
                }
                if (field[1][0]=='X' && field[2][0]!='X'){
                    field[2][0]='O';


                    change_Field.sim_Field();
                }
                if (field[1][1]=='X' && field[2][0]!='X'){
                    field[2][0]='O';


                    change_Field.sim_Field();
                }
                if (field[0][2]=='X' && field[1][1]!='X'){
                    field[1][1]='O';


                    change_Field.sim_Field();
                }
            }
            System.out.println(" ");
        }

    }

    public void Detektor(){
        int i, j;
        for (i=0;i<row;i++){
            for (j=0;j<col;j++){
                if (field[0][0]=='X' && field[1][1]=='X' && field[2][2]=='X'){
                    System.out.println("You Win");
                }
                if (field[0][2]=='X' && field[1][1]=='X' && field[2][0]=='X'){
                    System.out.println("You Win");
                }
                if (field[0][0]=='X' && field[1][0]=='X' && field[2][0]=='X'){
                    System.out.println("You Win");
                }
                if (field[0][0]=='X' && field[1][0]=='X' && field[2][0]=='X'){
                    System.out.println("You Win");
                }
                if (field[0][0]=='X' && field[0][1]=='X' && field[0][2]=='X'){
                    System.out.println("You Win");
                }
                if (field[1][0]=='X' && field[1][1]=='X' && field[1][2]=='X'){
                    System.out.println("You Win");
                }
                if (field[2][0]=='X' && field[2][1]=='X' && field[2][2]=='X'){
                    System.out.println("You Win");
                }
                if (field[2][2]=='X' && field[1][2]=='X' && field[0][2]=='X'){
                    System.out.println("You Win");
                }

                if (field[0][0]=='O' && field[1][1]=='O' && field[2][2]=='O'){
                    System.out.println("AI is better then you");
                }
                if (field[0][2]=='O' && field[1][1]=='O' && field[2][0]=='O'){
                    System.out.println("AI is better then you");
                }
                if (field[0][0]=='О' && field[1][0]=='О' && field[2][0]=='O'){
                    System.out.println("AI is better then you");
                }
                if (field[0][0]=='O' && field[1][0]=='O' && field[2][0]=='O'){
                    System.out.println("AI is better then you");
                }
                if (field[0][0]=='O' && field[0][1]=='O' && field[0][2]=='O'){
                    System.out.println("AI is better then you");
                }
                if (field[1][0]=='O' && field[1][1]=='O' && field[1][2]=='O'){
                    System.out.println("AI is better then you");
                }
                if (field[2][0]=='O' && field[2][1]=='O' && field[2][2]=='O'){
                    System.out.println("AI is better then you");
                }
                if (field[2][2]=='O' && field[1][2]=='O' && field[0][2]=='O'){
                    System.out.println("AI is better then you");
                }

            }
        }
    }
}

