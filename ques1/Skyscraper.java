package ques1;

import java.util.ArrayList;
import java.util.Arrays;

public class Skyscraper {
	
	public static void BuildingSize(int n, int[] a) {
		int[] key = new int[n];
		System.arraycopy(a, 0, key, 0, n);
		ArrayList res = new ArrayList<String>();
		Arrays.sort(key);
		int MaxVal = key[key.length-1];
		int MaxPosition = key.length-1;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Day : "+ (i+1));
			if(key[MaxPosition] == a[i])
			{
				System.out.print(a[i]+ " ");
				MaxPosition--;
				if(MaxPosition < 0)
				{
					break;
				}
				for(int j=i-1;j>=0;j--)
				{
					if(key[MaxPosition] == a[j])
					{
						System.out.print(a[j]+ " ");
						MaxPosition--;
						if(MaxPosition < 0)
						{
							break;
						}
					}
				}
				System.out.println();
			}
			else
			{
				System.out.println();
			}
		}
	}

}
