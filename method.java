public class maxMethod {
public static int max(intx , inty) {
if (x>y)
 return x;
else
return y;
}
public static void main (string[]args){
int a = 5;
int b = 10;
int m = 0;

m = max(a,b);  // calling method
system.out.printin("max ="+m);
}
}