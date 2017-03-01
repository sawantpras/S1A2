class S1A2
{
public static void main(String []args)
{
	int a=20, b=10, c, d, e;
	b=(a--)-(--a);
	c=a--;
	d=a>>2;
	e=a&b;
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
}
}