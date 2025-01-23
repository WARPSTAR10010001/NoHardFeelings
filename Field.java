//Boo!!

public class Field {
    //Visual representation of the field
    private static char[][] field = blueprint();

    public static char[][] blueprint(){
        char[][] f = new char[23][51];

        //i represents the x-axis, j represents the y-axis
        for(int i = 0; i < f.length; i++){
            for(int j = 0; j < f[i].length; j++){
                if(i == 0 || i == 22){
                    if(j == 0 || j == 50){
                        f[i][j] = 'o';
                    } else {
                        f[i][j] = '-';
                    }
                } else {
                    if(j == 0 || j == 50){
                        f[i][j] = '|';
                    } else {
                        f[i][j] = ' ';
                    }
                }
            }
        }

        return f;
    }

    public static void print() {
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}