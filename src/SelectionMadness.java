public class SelectionMadness {

    public boolean flipCoin(){
        int headTail = (int)(Math.random()*2)+1;
        return(headTail ==1);
    }
    public int largest(int num1, int num2, int num3){
        int large = num1;
        if (num2>large){
            large=num2;
        }
        if(num3>large){
            large=num3;
        }
        return large;
    }
    public boolean rightTriangle(int side1, int side2, int side3){
        int hypotenuse = largest(side1, side2, side3);
        int a = 0;
        int b = 0;
        if (side1<hypotenuse && side2<hypotenuse){
            a=side1;
            b=side2;
        }else if(side2<hypotenuse && side3<hypotenuse){
            a=side2;
            b=side3;
        }else{
            a=side1;
            b=side3;
        }
        return (Math.pow(hypotenuse,2)==(Math.pow(a,2)+Math.pow(b,2)));
    }

}

