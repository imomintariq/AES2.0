
public class InverseSubBoxEnc {
    Hexa invSBox[][] = new Hexa[16][16]; // [row][col]

    InverseSubBoxEnc(){
        for(int i=0; i<16; i++){
            for(int j=0; j<16; j++){
                invSBox[i][j] = new Hexa();
            }
        }
    }

    void setInvSBox() {
        //first row
        invSBox[0][0].firstChar = '5';
        invSBox[0][0].secondChar = '2';

        invSBox[0][1].firstChar = '0';
        invSBox[0][1].secondChar = '9';

        invSBox[0][2].firstChar = '6';
        invSBox[0][2].secondChar = 'A';

        invSBox[0][3].firstChar = 'D';
        invSBox[0][3].secondChar = '5';

        invSBox[0][4].firstChar = '3';
        invSBox[0][4].secondChar = '0';

        invSBox[0][5].firstChar = '3';
        invSBox[0][5].secondChar = '6';

        invSBox[0][6].firstChar = 'A';
        invSBox[0][6].secondChar = '5';

        invSBox[0][7].firstChar = '3';
        invSBox[0][7].secondChar = '8';

        invSBox[0][8].firstChar = 'B';
        invSBox[0][8].secondChar = 'F';

        invSBox[0][9].firstChar = '4';
        invSBox[0][9].secondChar = '0';

        invSBox[0][10].firstChar = 'A';
        invSBox[0][10].secondChar = '3';

        invSBox[0][11].firstChar = '9';
        invSBox[0][11].secondChar = 'E';

        invSBox[0][12].firstChar = '8';
        invSBox[0][12].secondChar = '1';

        invSBox[0][13].firstChar = 'F';
        invSBox[0][13].secondChar = '3';

        invSBox[0][14].firstChar = 'D';
        invSBox[0][14].secondChar = '7';

        invSBox[0][15].firstChar = 'F';
        invSBox[0][15].secondChar = 'B';

        //second row
        invSBox[1][0].firstChar = '7';
        invSBox[1][0].secondChar = 'C';

        invSBox[1][1].firstChar = 'E';
        invSBox[1][1].secondChar = '3';

        invSBox[1][2].firstChar = '3';
        invSBox[1][2].secondChar = '9';

        invSBox[1][3].firstChar = '8';
        invSBox[1][3].secondChar = '2';

        invSBox[1][4].firstChar = '9';
        invSBox[1][4].secondChar = 'B';

        invSBox[1][5].firstChar = '2';
        invSBox[1][5].secondChar = 'F';

        invSBox[1][6].firstChar = 'F';
        invSBox[1][6].secondChar = 'F';

        invSBox[1][7].firstChar = '8';
        invSBox[1][7].secondChar = '7';

        invSBox[1][8].firstChar = '3';
        invSBox[1][8].secondChar = '4';

        invSBox[1][9].firstChar = '8';
        invSBox[1][9].secondChar = 'E';

        invSBox[1][10].firstChar = '4';
        invSBox[1][10].secondChar = '3';

        invSBox[1][11].firstChar = '4';
        invSBox[1][11].secondChar = '4';

        invSBox[1][12].firstChar = 'C';
        invSBox[1][12].secondChar = '4';

        invSBox[1][13].firstChar = 'D';
        invSBox[1][13].secondChar = 'E';

        invSBox[1][14].firstChar = 'E';
        invSBox[1][14].secondChar = '9';

        invSBox[1][15].firstChar = 'C';
        invSBox[1][15].secondChar = 'B';

        //third row
        invSBox[2][0].firstChar = '5';
        invSBox[2][0].secondChar = '4';

        invSBox[2][1].firstChar = '7';
        invSBox[2][1].secondChar = 'B';

        invSBox[2][2].firstChar = '9';
        invSBox[2][2].secondChar = '4';

        invSBox[2][3].firstChar = '3';
        invSBox[2][3].secondChar = '2';

        invSBox[2][4].firstChar = 'A';
        invSBox[2][4].secondChar = '6';

        invSBox[2][5].firstChar = 'C';
        invSBox[2][5].secondChar = '2';

        invSBox[2][6].firstChar = '2';
        invSBox[2][6].secondChar = '3';

        invSBox[2][7].firstChar = '3';
        invSBox[2][7].secondChar = 'D';

        invSBox[2][8].firstChar = 'E';
        invSBox[2][8].secondChar = 'E';

        invSBox[2][9].firstChar = '4';
        invSBox[2][9].secondChar = 'C';

        invSBox[2][10].firstChar = '9';
        invSBox[2][10].secondChar = '5';

        invSBox[2][11].firstChar = '0';
        invSBox[2][11].secondChar = 'B';

        invSBox[2][12].firstChar = '4';
        invSBox[2][12].secondChar = '2';

        invSBox[2][13].firstChar = 'F';
        invSBox[2][13].secondChar = 'A';

        invSBox[2][14].firstChar = 'C';
        invSBox[2][14].secondChar = '3';

        invSBox[2][15].firstChar = '4';
        invSBox[2][15].secondChar = 'E';

        //fourth row
        invSBox[3][0].firstChar = '0';
        invSBox[3][0].secondChar = '8';

        invSBox[3][1].firstChar = '2';
        invSBox[3][1].secondChar = 'E';

        invSBox[3][2].firstChar = 'A';
        invSBox[3][2].secondChar = '1';

        invSBox[3][3].firstChar = '6';
        invSBox[3][3].secondChar = '6';

        invSBox[3][4].firstChar = '2';
        invSBox[3][4].secondChar = '8';

        invSBox[3][5].firstChar = 'D';
        invSBox[3][5].secondChar = '9';

        invSBox[3][6].firstChar = '2';
        invSBox[3][6].secondChar = '4';

        invSBox[3][7].firstChar = 'B';
        invSBox[3][7].secondChar = '2';

        invSBox[3][8].firstChar = '7';
        invSBox[3][8].secondChar = '6';

        invSBox[3][9].firstChar = '5';
        invSBox[3][9].secondChar = 'B';

        invSBox[3][10].firstChar = 'A';
        invSBox[3][10].secondChar = '2';

        invSBox[3][11].firstChar = '4';
        invSBox[3][11].secondChar = '9';

        invSBox[3][12].firstChar = '6';
        invSBox[3][12].secondChar = 'D';

        invSBox[3][13].firstChar = '8';
        invSBox[3][13].secondChar = 'B';

        invSBox[3][14].firstChar = 'D';
        invSBox[3][14].secondChar = '1';

        invSBox[3][15].firstChar = '2';
        invSBox[3][15].secondChar = '5';

        //fifth row
        invSBox[4][0].firstChar = '7';
        invSBox[4][0].secondChar = '2';

        invSBox[4][1].firstChar = 'F';
        invSBox[4][1].secondChar = '8';

        invSBox[4][2].firstChar = 'F';
        invSBox[4][2].secondChar = '6';

        invSBox[4][3].firstChar = '6';
        invSBox[4][3].secondChar = '4';

        invSBox[4][4].firstChar = '8';
        invSBox[4][4].secondChar = '6';

        invSBox[4][5].firstChar = '6';
        invSBox[4][5].secondChar = '8';

        invSBox[4][6].firstChar = '9';
        invSBox[4][6].secondChar = '8';

        invSBox[4][7].firstChar = '1';
        invSBox[4][7].secondChar = '6';

        invSBox[4][8].firstChar = 'D';
        invSBox[4][8].secondChar = '4';

        invSBox[4][9].firstChar = 'A';
        invSBox[4][9].secondChar = '4';

        invSBox[4][10].firstChar = '5';
        invSBox[4][10].secondChar = 'C';

        invSBox[4][11].firstChar = 'C';
        invSBox[4][11].secondChar = 'C';

        invSBox[4][12].firstChar = '5';
        invSBox[4][12].secondChar = 'D';

        invSBox[4][13].firstChar = '6';
        invSBox[4][13].secondChar = '5';

        invSBox[4][14].firstChar = 'B';
        invSBox[4][14].secondChar = '6';

        invSBox[4][15].firstChar = '9';
        invSBox[4][15].secondChar = '2';

        //sixth row
        invSBox[5][0].firstChar = '6';
        invSBox[5][0].secondChar = 'C';

        invSBox[5][1].firstChar = '7';
        invSBox[5][1].secondChar = '0';

        invSBox[5][2].firstChar = '4';
        invSBox[5][2].secondChar = '8';

        invSBox[5][3].firstChar = '5';
        invSBox[5][3].secondChar = '0';

        invSBox[5][4].firstChar = 'F';
        invSBox[5][4].secondChar = 'D';

        invSBox[5][5].firstChar = 'E';
        invSBox[5][5].secondChar = 'D';

        invSBox[5][6].firstChar = 'B';
        invSBox[5][6].secondChar = '9';

        invSBox[5][7].firstChar = 'D';
        invSBox[5][7].secondChar = 'A';

        invSBox[5][8].firstChar = '5';
        invSBox[5][8].secondChar = 'E';

        invSBox[5][9].firstChar = '1';
        invSBox[5][9].secondChar = '5';

        invSBox[5][10].firstChar = '4';
        invSBox[5][10].secondChar = '6';

        invSBox[5][11].firstChar = '5';
        invSBox[5][11].secondChar = '7';

        invSBox[5][12].firstChar = 'A';
        invSBox[5][12].secondChar = '7';

        invSBox[5][13].firstChar = '8';
        invSBox[5][13].secondChar = 'D';

        invSBox[5][14].firstChar = '9';
        invSBox[5][14].secondChar = 'D';

        invSBox[5][15].firstChar = '8';
        invSBox[5][15].secondChar = '4';

        //seventh row
        invSBox[6][0].firstChar = '9';
        invSBox[6][0].secondChar = '0';

        invSBox[6][1].firstChar = 'D';
        invSBox[6][1].secondChar = '8';

        invSBox[6][2].firstChar = 'A';
        invSBox[6][2].secondChar = 'B';

        invSBox[6][3].firstChar = '0';
        invSBox[6][3].secondChar = '0';

        invSBox[6][4].firstChar = '8';
        invSBox[6][4].secondChar = 'C';

        invSBox[6][5].firstChar = 'B';
        invSBox[6][5].secondChar = 'C';

        invSBox[6][6].firstChar = 'D';
        invSBox[6][6].secondChar = '3';

        invSBox[6][7].firstChar = '0';
        invSBox[6][7].secondChar = 'A';

        invSBox[6][8].firstChar = 'F';
        invSBox[6][8].secondChar = '7';

        invSBox[6][9].firstChar = 'E';
        invSBox[6][9].secondChar = '4';

        invSBox[6][10].firstChar = '5';
        invSBox[6][10].secondChar = '8';

        invSBox[6][11].firstChar = '0';
        invSBox[6][11].secondChar = '5';

        invSBox[6][12].firstChar = 'B';
        invSBox[6][12].secondChar = '8';

        invSBox[6][13].firstChar = 'B';
        invSBox[6][13].secondChar = '3';

        invSBox[6][14].firstChar = '4';
        invSBox[6][14].secondChar = '5';

        invSBox[6][15].firstChar = '0';
        invSBox[6][15].secondChar = '6';

        //eighth row
        invSBox[7][0].firstChar = 'D';
        invSBox[7][0].secondChar = '0';

        invSBox[7][1].firstChar = '2';
        invSBox[7][1].secondChar = 'C';

        invSBox[7][2].firstChar = '1';
        invSBox[7][2].secondChar = 'E';

        invSBox[7][3].firstChar = '8';
        invSBox[7][3].secondChar = 'F';

        invSBox[7][4].firstChar = 'C';
        invSBox[7][4].secondChar = 'A';

        invSBox[7][5].firstChar = '3';
        invSBox[7][5].secondChar = 'F';

        invSBox[7][6].firstChar = '0';
        invSBox[7][6].secondChar = 'F';

        invSBox[7][7].firstChar = '0';
        invSBox[7][7].secondChar = '2';

        invSBox[7][8].firstChar = 'C';
        invSBox[7][8].secondChar = '1';

        invSBox[7][9].firstChar = 'A';
        invSBox[7][9].secondChar = 'F';

        invSBox[7][10].firstChar = 'B';
        invSBox[7][10].secondChar = 'D';

        invSBox[7][11].firstChar = '0';
        invSBox[7][11].secondChar = '3';

        invSBox[7][12].firstChar = '0';
        invSBox[7][12].secondChar = '1';

        invSBox[7][13].firstChar = '1';
        invSBox[7][13].secondChar = '3';

        invSBox[7][14].firstChar = '8';
        invSBox[7][14].secondChar = 'A';

        invSBox[7][15].firstChar = '6';
        invSBox[7][15].secondChar = 'B';

        //nineth row
        invSBox[8][0].firstChar = '3';
        invSBox[8][0].secondChar = 'A';

        invSBox[8][1].firstChar = '9';
        invSBox[8][1].secondChar = '1';

        invSBox[8][2].firstChar = '1';
        invSBox[8][2].secondChar = '1';

        invSBox[8][3].firstChar = '4';
        invSBox[8][3].secondChar = '1';

        invSBox[8][4].firstChar = '4';
        invSBox[8][4].secondChar = 'F';

        invSBox[8][5].firstChar = '6';
        invSBox[8][5].secondChar = '7';

        invSBox[8][6].firstChar = 'D';
        invSBox[8][6].secondChar = 'C';

        invSBox[8][7].firstChar = 'E';
        invSBox[8][7].secondChar = 'A';

        invSBox[8][8].firstChar = '9';
        invSBox[8][8].secondChar = '7';

        invSBox[8][9].firstChar = 'F';
        invSBox[8][9].secondChar = '2';

        invSBox[8][10].firstChar = 'C';
        invSBox[8][10].secondChar = 'F';

        invSBox[8][11].firstChar = 'C';
        invSBox[8][11].secondChar = 'E';

        invSBox[8][12].firstChar = 'F';
        invSBox[8][12].secondChar = '0';

        invSBox[8][13].firstChar = 'B';
        invSBox[8][13].secondChar = '4';

        invSBox[8][14].firstChar = 'E';
        invSBox[8][14].secondChar = '6';

        invSBox[8][15].firstChar = '7';
        invSBox[8][15].secondChar = '3';

        //tenth row
        invSBox[9][0].firstChar = '9';
        invSBox[9][0].secondChar = '6';

        invSBox[9][1].firstChar = 'A';
        invSBox[9][1].secondChar = 'C';

        invSBox[9][2].firstChar = '7';
        invSBox[9][2].secondChar = '4';

        invSBox[9][3].firstChar = '2';
        invSBox[9][3].secondChar = '2';

        invSBox[9][4].firstChar = 'E';
        invSBox[9][4].secondChar = '7';

        invSBox[9][5].firstChar = 'A';
        invSBox[9][5].secondChar = 'D';

        invSBox[9][6].firstChar = '3';
        invSBox[9][6].secondChar = '5';

        invSBox[9][7].firstChar = '8';
        invSBox[9][7].secondChar = '5';

        invSBox[9][8].firstChar = 'E';
        invSBox[9][8].secondChar = '2';

        invSBox[9][9].firstChar = 'F';
        invSBox[9][9].secondChar = '9';

        invSBox[9][10].firstChar = '3';
        invSBox[9][10].secondChar = '7';

        invSBox[9][11].firstChar = 'E';
        invSBox[9][11].secondChar = '8';

        invSBox[9][12].firstChar = '1';
        invSBox[9][12].secondChar = 'C';

        invSBox[9][13].firstChar = '7';
        invSBox[9][13].secondChar = '5';

        invSBox[9][14].firstChar = 'D';
        invSBox[9][14].secondChar = 'F';

        invSBox[9][15].firstChar = '6';
        invSBox[9][15].secondChar = 'E';

        //eleventh row
        invSBox[10][0].firstChar = '4';
        invSBox[10][0].secondChar = '7';

        invSBox[10][1].firstChar = 'F';
        invSBox[10][1].secondChar = '1';

        invSBox[10][2].firstChar = '1';
        invSBox[10][2].secondChar = 'A';

        invSBox[10][3].firstChar = '7';
        invSBox[10][3].secondChar = '1';

        invSBox[10][4].firstChar = '1';
        invSBox[10][4].secondChar = 'D';

        invSBox[10][5].firstChar = '2';
        invSBox[10][5].secondChar = '9';

        invSBox[10][6].firstChar = 'C';
        invSBox[10][6].secondChar = '5';

        invSBox[10][7].firstChar = '8';
        invSBox[10][7].secondChar = '9';

        invSBox[10][8].firstChar = '6';
        invSBox[10][8].secondChar = 'F';

        invSBox[10][9].firstChar = 'B';
        invSBox[10][9].secondChar = '7';

        invSBox[10][10].firstChar = '6';
        invSBox[10][10].secondChar = '2';

        invSBox[10][11].firstChar = '0';
        invSBox[10][11].secondChar = 'E';

        invSBox[10][12].firstChar = 'A';
        invSBox[10][12].secondChar = 'A';

        invSBox[10][13].firstChar = '1';
        invSBox[10][13].secondChar = '8';

        invSBox[10][14].firstChar = 'B';
        invSBox[10][14].secondChar = 'E';

        invSBox[10][15].firstChar = '1';
        invSBox[10][15].secondChar = 'B';

        //Twelveth row
        invSBox[11][0].firstChar = 'F';
        invSBox[11][0].secondChar = 'C';

        invSBox[11][1].firstChar = '5';
        invSBox[11][1].secondChar = '6';

        invSBox[11][2].firstChar = '3';
        invSBox[11][2].secondChar = 'E';

        invSBox[11][3].firstChar = '4';
        invSBox[11][3].secondChar = 'B';

        invSBox[11][4].firstChar = 'C';
        invSBox[11][4].secondChar = '6';

        invSBox[11][5].firstChar = 'D';
        invSBox[11][5].secondChar = '2';

        invSBox[11][6].firstChar = '7';
        invSBox[11][6].secondChar = '9';

        invSBox[11][7].firstChar = '2';
        invSBox[11][7].secondChar = '0';

        invSBox[11][8].firstChar = '9';
        invSBox[11][8].secondChar = 'A';

        invSBox[11][9].firstChar = 'D';
        invSBox[11][9].secondChar = 'B';

        invSBox[11][10].firstChar = 'C';
        invSBox[11][10].secondChar = '0';

        invSBox[11][11].firstChar = 'F';
        invSBox[11][11].secondChar = 'E';

        invSBox[11][12].firstChar = '7';
        invSBox[11][12].secondChar = '8';

        invSBox[11][13].firstChar = 'C';
        invSBox[11][13].secondChar = 'D';

        invSBox[11][14].firstChar = '5';
        invSBox[11][14].secondChar = 'A';

        invSBox[11][15].firstChar = 'F';
        invSBox[11][15].secondChar = '4';

        //Thirteenth row
        invSBox[12][0].firstChar = '1';
        invSBox[12][0].secondChar = 'F';

        invSBox[12][1].firstChar = 'D';
        invSBox[12][1].secondChar = 'D';

        invSBox[12][2].firstChar = 'A';
        invSBox[12][2].secondChar = '8';

        invSBox[12][3].firstChar = '3';
        invSBox[12][3].secondChar = '3';

        invSBox[12][4].firstChar = '8';
        invSBox[12][4].secondChar = '8';

        invSBox[12][5].firstChar = '0';
        invSBox[12][5].secondChar = '7';

        invSBox[12][6].firstChar = 'C';
        invSBox[12][6].secondChar = '7';

        invSBox[12][7].firstChar = '3';
        invSBox[12][7].secondChar = '1';

        invSBox[12][8].firstChar = 'B';
        invSBox[12][8].secondChar = '1';

        invSBox[12][9].firstChar = '1';
        invSBox[12][9].secondChar = '2';

        invSBox[12][10].firstChar = '1';
        invSBox[12][10].secondChar = '0';

        invSBox[12][11].firstChar = '5';
        invSBox[12][11].secondChar = '9';

        invSBox[12][12].firstChar = '2';
        invSBox[12][12].secondChar = '7';

        invSBox[12][13].firstChar = '8';
        invSBox[12][13].secondChar = '0';

        invSBox[12][14].firstChar = 'E';
        invSBox[12][14].secondChar = 'C';

        invSBox[12][15].firstChar = '5';
        invSBox[12][15].secondChar = 'F';

        //Fourtheenth row
        invSBox[13][0].firstChar = '6';
        invSBox[13][0].secondChar = '0';

        invSBox[13][1].firstChar = '5';
        invSBox[13][1].secondChar = '1';

        invSBox[13][2].firstChar = '7';
        invSBox[13][2].secondChar = 'F';

        invSBox[13][3].firstChar = 'A';
        invSBox[13][3].secondChar = '9';

        invSBox[13][4].firstChar = '1';
        invSBox[13][4].secondChar = '9';

        invSBox[13][5].firstChar = 'B';
        invSBox[13][5].secondChar = 'F';

        invSBox[13][6].firstChar = '4';
        invSBox[13][6].secondChar = 'A';

        invSBox[13][7].firstChar = '0';
        invSBox[13][7].secondChar = 'D';

        invSBox[13][8].firstChar = '2';
        invSBox[13][8].secondChar = 'D';

        invSBox[13][9].firstChar = 'E';
        invSBox[13][9].secondChar = '5';

        invSBox[13][10].firstChar = '7';
        invSBox[13][10].secondChar = 'A';

        invSBox[13][11].firstChar = '9';
        invSBox[13][11].secondChar = 'F';

        invSBox[13][12].firstChar = '9';
        invSBox[13][12].secondChar = '3';

        invSBox[13][13].firstChar = 'C';
        invSBox[13][13].secondChar = '9';

        invSBox[13][14].firstChar = '9';
        invSBox[13][14].secondChar = 'C';

        invSBox[13][15].firstChar = 'E';
        invSBox[13][15].secondChar = 'F';

        //Fifteenth row
        invSBox[14][0].firstChar = 'A';
        invSBox[14][0].secondChar = '0';

        invSBox[14][1].firstChar = 'E';
        invSBox[14][1].secondChar = '0';

        invSBox[14][2].firstChar = '3';
        invSBox[14][2].secondChar = 'B';

        invSBox[14][3].firstChar = '4';
        invSBox[14][3].secondChar = 'D';

        invSBox[14][4].firstChar = 'A';
        invSBox[14][4].secondChar = 'E';

        invSBox[14][5].firstChar = '2';
        invSBox[14][5].secondChar = 'A';

        invSBox[14][6].firstChar = 'F';
        invSBox[14][6].secondChar = '5';

        invSBox[14][7].firstChar = 'B';
        invSBox[14][7].secondChar = '0';

        invSBox[14][8].firstChar = 'C';
        invSBox[14][8].secondChar = '8';

        invSBox[14][9].firstChar = 'E';
        invSBox[14][9].secondChar = 'B';

        invSBox[14][10].firstChar = 'B';
        invSBox[14][10].secondChar = 'B';

        invSBox[14][11].firstChar = '3';
        invSBox[14][11].secondChar = 'C';

        invSBox[14][12].firstChar = '8';
        invSBox[14][12].secondChar = '3';

        invSBox[14][13].firstChar = '5';
        invSBox[14][13].secondChar = '3';

        invSBox[14][14].firstChar = '9';
        invSBox[14][14].secondChar = '9';

        invSBox[14][15].firstChar = '6';
        invSBox[14][15].secondChar = '1';

        //Sixteenth row
        invSBox[15][0].firstChar = '1';
        invSBox[15][0].secondChar = '7';

        invSBox[15][1].firstChar = '2';
        invSBox[15][1].secondChar = 'B';

        invSBox[15][2].firstChar = '0';
        invSBox[15][2].secondChar = '4';

        invSBox[15][3].firstChar = '7';
        invSBox[15][3].secondChar = 'E';

        invSBox[15][4].firstChar = 'B';
        invSBox[15][4].secondChar = 'A';

        invSBox[15][5].firstChar = '7';
        invSBox[15][5].secondChar = '7';

        invSBox[15][6].firstChar = 'D';
        invSBox[15][6].secondChar = '6';

        invSBox[15][7].firstChar = '2';
        invSBox[15][7].secondChar = '6';

        invSBox[15][8].firstChar = 'E';
        invSBox[15][8].secondChar = '1';

        invSBox[15][9].firstChar = '6';
        invSBox[15][9].secondChar = '9';

        invSBox[15][10].firstChar = '1';
        invSBox[15][10].secondChar = '4';

        invSBox[15][11].firstChar = '6';
        invSBox[15][11].secondChar = '3';

        invSBox[15][12].firstChar = '5';
        invSBox[15][12].secondChar = '5';

        invSBox[15][13].firstChar = '2';
        invSBox[15][13].secondChar = '1';

        invSBox[15][14].firstChar = '0';
        invSBox[15][14].secondChar = 'C';

        invSBox[15][15].firstChar = '7';
        invSBox[15][15].secondChar = 'D';

    }

    char[] getVal(char row, char col) {
        InverseSubBoxEnc sb = new InverseSubBoxEnc();
        char invSubValues[] = new char[2];

        int rowNum = 0, colNum = 0;

        if (row <= 57) {
            rowNum = row;
            rowNum -= 48;
        }

        if(col <= 57) {
            colNum = col;
            colNum -= 48;
        }

        if(row=='A'){
            rowNum=10;
        }
        else if(row=='B'){
            rowNum=11;
        }
        else if(row=='C'){
            rowNum=12;
        }
        else if(row=='D'){
            rowNum=13;
        }
        else if(row=='E'){
            rowNum=14;
        }
        else if(row=='F'){
            rowNum=15;
        }

        if(col=='A'){
            colNum=10;
        }
        else if(col=='B'){
            colNum=11;
        }
        else if(col=='C'){
            colNum=12;
        }
        else if(col=='D'){
            colNum=13;
        }
        else if(col=='E'){
            colNum=14;
        }
        else if(col=='F'){
            colNum=15;
        }
        sb.setInvSBox();
        Hexa temp = sb.invSBox[rowNum][colNum];

        invSubValues[0] = temp.firstChar;
        invSubValues[1] = temp.secondChar;

        return invSubValues;
    }
    public void displayInvSubBox(){
        InverseSubBoxEnc sb = new InverseSubBoxEnc();
        sb.setInvSBox();
        for(int i =0; i < 16 ; i++){
            for(int j = 0; j < 16; j++){
                System.out.print(sb.invSBox[i][j].firstChar+""+ sb.invSBox[i][j].secondChar+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        InverseSubBoxEnc sb = new InverseSubBoxEnc();
        sb.displayInvSubBox();
    }	
}
