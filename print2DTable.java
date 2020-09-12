/*
Prints 2D table.
*/
static void print2DTable(String[][] table2D) {
        for (int i = 0; i < table2D.length; i++) {
            for (int j = 0; j < table2D[i].length; j++) {
                System.out.print(table2D[i][j]);
            }
            System.out.println();
        }
    }
