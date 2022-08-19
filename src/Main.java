public class Main {
    static String[][] letterA(String[][] array){
        for (int i=0;i < array.length;i++){
            for (int j=0;j <array[i].length;j++){
                if (i ==0 || i == 3){
                    array[i][j]=" * ";
                }else if (j==0 || j==3){
                    array[i][j]=" * ";
                }else {
                    array[i][j]="   ";
                }
            }
        }
        return array;
    }
    static String[][] letterB(String[][] array){
        for (int i=0;i < array.length;i++){
            for (int j=0;j <array[i].length;j++){
                if (i ==6 || i == 3 || i==0){
                    array[i][j]=" * ";
                }else if (j==0 || j==3){
                    array[i][j]=" * ";
                }else {
                    array[i][j]="   ";
                }
            }
        }
        return array;
    }
    static void print(String[][] array){
        for (String[] row:array){
            for (String col:row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String[][] letter = new String[7][4];
        print(letterB(letter));




    }
}
