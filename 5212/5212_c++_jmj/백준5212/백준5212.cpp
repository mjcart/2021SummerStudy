
#include <iostream>
#include<stdlib.h>
using namespace std;

int main()
{
    int row;
    int column;
    cin >> row >> column;
    char**original=(char**)malloc(sizeof(char*)*row);
    for (int i = 0; i < row; i++) {
        original[i] = (char*)malloc(sizeof(char) * column);
    }
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            cin >> original[i][j];
        }
    }

    char** future = (char**)malloc(sizeof(char*) * row);
    for (int i = 0; i < row; i++) {
        future[i] = (char*)malloc(sizeof(char) * column);
    }
    int count = 0;
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            count = 0;
            if (original[i][j] == '.') {
                future[i][j] = '.';
            }
            else {
                if (i == 0)count += 1;
                if (j == 0)count += 1;
                if (i == row-1)count += 1;
                if (j == column-1)count += 1;
                if (i != 0 && original[i - 1][j] == '.')count += 1;
                if (j != 0 && original[i][j - 1] == '.')count += 1;
                if (j != column-1 && original[i ][j + 1] == '.')count += 1;
                if (i != row-1 && original[i + 1][j] == '.')count += 1;
                if (count > 2) {
                    future[i][j] = '.';
                }
                else {
                    future[i][j] = 'X';
                }

            }
        }
    }
    int sea_row = 0;
    int sea_column = 0;
    int sea_row2 = 0;
    int sea_column2 = 0;
    //윗줄 지우기
    for (int i = 0; i < row; i++) {
        count = 0;
        for (int j = 0; j < column; j++) {
            if (future[i][j] == '.') {
                count += 1;
            }
            else {
                break;
            }
        }
        if (count < column) {
            break;
        }
        else {
            sea_row += 1;
        }
    }
    //왼쪽줄 지우기
    for (int j = 0; j < column; j++) {
        count = 0;
        for (int i =0; i < row; i++) {
            if (future[i][j] == '.') {
                count += 1;
            }
            else {
                break;
            }
        }
        if (count < row ) {
            break;
        }
        else {
            sea_column+= 1;
        }
    }
    //아랫줄 지우기
    for (int i = row-1; i > -1; i--) {
        count = 0;
        for (int j = 0; j < column; j++) {
            if (future[i][j] == '.') {
                count += 1;
            }
            else {
                break;
            }
        }
        if (count < column ) {
            break;
        }
        else {
            sea_row2 += 1;
        }
    }
    //오른쪽줄 지우기
    for (int j = column-1; j > -1; j--) {
        count = 0;
        for (int i = 0; i < row; i++) {
            if (future[i][j] == '.') {
                count += 1;
            }
            else {
                break;
            }
        }
        if (count < row ) {
            break;
        }
        else {
            sea_column2 += 1;
        }
    }
    for (int i = sea_row; i < row-sea_row2; i++) {
        for (int j = sea_column; j < column-sea_column2; j++) {
            cout <<future[i][j];
        }
        cout << endl;
    }
}
