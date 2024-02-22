package homeAssignment_1;

public class flymetothemoon {

	public static void main(String[] args) {
		String s =    "fly me to the moon";
		{
			System.out.println(lengthoflastword(s));
		}
	}
	public static int lengthoflastword(String s)
	{
	int count = 0;
	for (int i = s.length()-1; i>=0; i--)
	{
		if (s.charAt(i) != ' ')
		{
			count++;
		}
		else
		{
			break;
		}
	}
		{
			return count;
		}
	}
}