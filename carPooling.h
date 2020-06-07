//
// Created by kpanic on 07/06/2020.
//

#ifndef UNTITLED_CARPOOLING_H
#define UNTITLED_CARPOOLING_H

#include <bits/stdc++.h>

using namespace std;

class CarPooling {
    bool carPooling(vector<vector<int>>& trips, int capacity) {
        int n = trips.size();
        int tracking[1001] = {0};

        for (auto p : trips) {
            int numPassenger = p[0];
            int startPoint = p[1];
            int endPoint = p[2];

            tracking[startPoint] += numPassenger;
            tracking[endPoint] -= numPassenger;
        }

        int currentPassenger = 0;
        for (int i = 0; i < 1001; ++i) {
            currentPassenger += tracking[i];
            if (currentPassenger >= capacity)
                return false;
        }

        return true;
    }
};

#endif //UNTITLED_CARPOOLING_H
