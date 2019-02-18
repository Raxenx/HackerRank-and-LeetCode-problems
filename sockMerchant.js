/*
John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are n = 7 socks with colors ar = [1,2,1,2,1,3,2]. There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.

sockMerchant has the following parameter(s):

n: the number of socks in the pile
ar: the colors of each sock

Input Format:

The first line contains an integer n, the number of socks represented in ar 
The second line contains  space-separated integers describing the colors ar[i] of the socks in the pile.

Constraints:

1 <= n <= 100
1 <= ar[i] <= 100 where 0 <= i <= n

Sample Input

9
10 20 20 10 10 30 50 10 20

Sample Output

3
*/

// @params Integer n, Array of Integers ar
// @returns An Integer representing the number of pairs of socks with the same color that can be made
function sockMerchant(n, ar) {
    // Get the number of each color in ar
    var seen = {};
    var pairs = 0;
    for (var i = 0; i < n; i++) {
        // if the sock has been seen before increase the count
        if (ar[i] in seen) {
            seen[ar[i]] += 1;
        } else {
            seen[ar[i]] = 1;
        }
    }

    for (const [key, value] of Object.entries(seen)) {
        if (value >= 2) {
            pairs += (value % 2) === 0 ? value / 2 : Math.floor(value / 2);
        }
    }

    return pairs;
}