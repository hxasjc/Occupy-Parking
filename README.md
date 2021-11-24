# Occupy Parking
Problem from DMOJ [here](https://dmoj.ca/problem/ccc18j2)

## Canadian Computing Competition: 2018 Stage 1, Junior #2
You supervise a small parking lot which has  parking spaces.

Yesterday, you recorded which parking spaces were occupied by cars and which were empty.

Today, you recorded the same information.

How many of the parking spaces were occupied both yesterday and today?

## Input Specification
The first line of input contains the integer `N(1 <= N <= 100)` . The second and third lines of input contain `N` characters each. The second line of input records the information about yesterday's parking spaces, and the third line of input records the information about today's parking spaces. Each of these `2N` characters will either be `C` to indicate an occupied space or `.` to indicate it was an empty parking space.

## Output Specification
Output the number of parking spaces which were occupied yesterday and today.

## Sample Input 1
``` Java
5
CC..C
.CC..
```

## Sample Output 1
``` Java
1
```

## Explanation for Sample Output 1
Only the second parking space from the left was occupied yesterday and today.

## Sample Input 2
``` Java
7
CCCCCCC
C.C.C.C
```

## Sample Output 2
``` Java
4
```

## Explanation for Sample Output 2
The first, third, fifth, and seventh parking spaces were occupied yesterday and today.