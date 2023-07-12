package com.in;

public class Main {

    public static void main(String[] args) {
        int n=97;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                count = i;
                System.out.println(count);
            }
        }
	// write your code here
    }
}
