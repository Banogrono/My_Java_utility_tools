/*
Function that fills indicated spot in 2D array with X.
[1][2][3]                          [1][2][3]
[4][5][6] -> fillSpot(5, table) -> [5][X][6]
[7][8][9]                          [7][8][9]
*/

 static String[][] fillSpot (int spot, String[][] table2D) {
        int place = 1;
        boolean isSpotFound = false;

        for (int i = 0; i < table2D.length; i++) {
            if (isSpotFound){
                break;
            }
            for (int j = 0; j < table2D[i].length; j++) {
                if (place == spot) {
                    table2D[i][j] = " X ";
                    isSpotFound = true;
                    break;
                } else {
                    place++;
                }
            }

        }
        return table2D;
    }
