package com.bridgelabz.generics;
class MaxInt{
	
int a,b,c;
MaxInt(int a, int b , int c){
    this.a =a ;
    this.b = b;
    this.c = c;
    System.out.println("The Numbers are : " + a + " " + b + " " +c);

    if((this.a > this.b) && (this.a > this.c))
    {
        System.out.println(a + " is the greatest");
    }
    else if( this.b > this.c)
    {
        System.out.println(b + " is the greatest");
    }
    else
    {
        System.out.println(c + " is the greatest");
    }

}


 
public static void main(String[] args) {
    MaxInt m1 = new MaxInt(10,52,99);


}
}
