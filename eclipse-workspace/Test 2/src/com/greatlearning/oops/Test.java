package com.greatlearning.oops;

class Recursion{
    int function (int n){
        int result;
        if (n == 2) { return n--; }  //your code comes here
        result = function (n - 1);
        return result;
  }
}
class RecursionImplementation{
    public static void main(String args[]){
        Recursion obj = new Recursion() ;
        System.out.print(obj.function(12));
     }
}