#include <stdio.h>

int isSparseMatrix(int matrix[][3], int rows, int cols) {
    int zeroCount = 0, totalElements = rows * cols;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] == 0) {
                zeroCount++;
            }
        }
    }

    if (zeroCount > totalElements / 2) {
        return 1; // Sparse matrix
    }
    return 0; // Not sparse matrix
}

int main() {
    int matrix[3][3] = {
        {5, 0, 0},
        {0, 8, 0},
        {0, 0, 6}
    };

    if (isSparseMatrix(matrix, 3, 3)) {
        printf("The matrix is sparse.\n");
    } else {
        printf("The matrix is not sparse.\n");
    }

    return 0;
}
