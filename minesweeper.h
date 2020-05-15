//
// Created by kpanic on 15/05/2020.
//

#ifndef UNTITLED_MINESWEEPER_H
#define UNTITLED_MINESWEEPER_H

using namespace std;

class Minesweeper {
public:
    vector<vector<char>> updateBoard(vector<vector<char>>& board, vector<int>& click) {
        if (board.empty() || board[0].empty())
            return {};

        int m = board.size(), n = board[0].size(), row = click[0], col = click[1], count = 0;
        int x, y;

        if (board[row][col] == 'M') {
            board[row][col] = 'X';
        } else {
            vector <vector<int>> neighbors;
            for (int i = -1; i < 2; ++i) {
                for (int j = -1; j < 2; ++j) {
                    x = row + i;
                    y = col + j;

                    if (x < 0 || x >= m || y < 0 || y >= n) continue;
                    else if (board[x][y] == 'M') ++count;
                    else if (count == 0 && board[x][y] == 'E') neighbors.push_back({x, y});
                }
            }
            if (count > 0) {
                board[row][col] = count + '0';
            } else {
                for (auto a : neighbors) {
                    board[a[0]][a[1]] = 'B';
                    updateBoard(board, a);
                }
            }
        }
        return board;
    }
};

#endif //UNTITLED_MINESWEEPER_H
