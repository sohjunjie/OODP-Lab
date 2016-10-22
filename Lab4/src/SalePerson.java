
public class SalePerson implements Comparable<Object>{

	private String	firstName;
	private String	lastName;
	private int 	totalSales;
	
	public SalePerson(String firstName, String lastName, int totalSales)
	{
		super();
		this.firstName	= firstName;
		this.lastName 	= lastName;
		this.totalSales	= totalSales;
	}
	
	public String 	getFirstName()	{ return this.firstName	; 	}
	public String 	getLastName()	{ return this.lastName	; 	}
	public int 		getTotalSales()	{ return this.totalSales;	}
	
	public boolean equals(Object o)
	{
		if(o == null) return false;
		if(!(o instanceof SalePerson)) return false;

		SalePerson oSP = (SalePerson) o;
		return (this.firstName == oSP.firstName && this.lastName == oSP.lastName);
	}
	
	public String toString(){
		return this.lastName + ", " + this.firstName + " : " + this.totalSales;
	}
	
	@Override
	public int compareTo(Object o)
	{
		if(o instanceof SalePerson){
			SalePerson oSP = (SalePerson) o;
			if(oSP.totalSales != this.totalSales)
				return this.totalSales - oSP.totalSales;
			else
				return oSP.lastName.compareTo(this.lastName);
		}
		else{ 
			// TODO: some other comparison for other object instance
			return 0;
		}
	}

	
}
