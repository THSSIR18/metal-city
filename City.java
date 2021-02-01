public class City
{
	private String [] city = new String[20];
	private int[] x = new int [20];
	private int[] y = new int [20];
	private String[] metal = new String [20];
	private int[] price = new int [20];
	public City()
	{
		city[0]= "Zion";
		city[1]= "Haddonfield";
		city[2]= "Smallville";
		city[3]= "Metropolis";
		city[4]= "Mos Eisley";
		city[5]= "District X";
		city[6]= "Hill Valley";
		
		x[0]= -234;
		x[1]= 65;
		x[2]= 14;
		x[3]= -47;
		x[4]= 37;
		x[5]= 136;
		x[6] = -85;
		
		y[0]= 7;
		y[1]= 48;
		y[2]= -35;
		y[3]= 76;
		y[4]= 98;
		y[5]= -12;
		y[6] = -147;
		
		metal[0]= "Gold";
		metal[1]= "Silver";
		metal[2]= "Bronze";
		metal[3]= "Gold";
		metal[4]= "Silver";
		metal[5]= "Gold";
		metal[6] = "Bronze";
		
		price[0]= 300;
		price[1]= 210;
		price[2]= 65;
		price[3]= 290;
		price[4]= 190;
		price[5]= 275;
		price[6] = 70;
	}
	public double calculateDistance(String city1, String city2)
	{
		int num = 0;
		int num1 = 0;
		for(int k=0; k<city.length-1; k++)
		{
			if(city1.equals(city[k]))
			{
				num=k;
			}
			if(city2.equals(city[k]))
			{
				num1=k;
			}
		}
		int x1=x[num];
		int y1=y[num];
		int x2=x[num1];
		int y2=y[num1];
	
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(x2);
		System.out.println(y2);
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
	public String getExport(String x)
	{

		int index = 0;
		for(int k=0; k<city.length-1; k++)
		{
			if(x== city[k])
				index = k;
		}
		return metal[index];
	}
	public Boolean addCity(String a, int b, int c, String d, int e)
	{ 
		int sub =0;
		boolean nap = false;
		for(int k=0; k<city.length-1; k++)
		{
			if (x[k]==0)
			{
				sub = k;
				city[sub] = a;
				x[sub] = b;
				y[sub] = c;
				metal[sub] = d;
				price[sub] = e;
				nap = true;
				break;
			}
			
		}
		return nap;
	}
	public String toString()
	{
		String str= "";
		
		for(int k=0; k<city.length-1; k++)
		{
			if(city[k] != null)
			{
			 str += city[k] + " Located at " + x[k] + ", "+ y[k] + " Export " + metal[k] + " Price " + price[k] + "\n";
			}
			else
			{
				break;
			}
		}
		return str;
	}
	public void changePrice(String x, int y)
	{
		
		for(int k=0; k<city.length-1; k++)
		{
			if(metal[k]== x)
			{
				price[k]=y;
			}	
		}
	}
	public String findcityExport(String x)
	{
		String str = "";
		for(int k=0; k<city.length-1; k++)
		{
			if(x.equals(metal[k]))
			{
				str += city[k] + "\n";
			}	
			
		}
		return str;
	}     
}