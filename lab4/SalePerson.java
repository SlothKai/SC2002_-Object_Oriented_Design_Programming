public class SalePerson implements Comparable<Object>{

	private java.lang.String lastname, firstname;
	private int totalSales;

	public SalePerson(java.lang.String firstname, java.lang.String lastname, int totalSales) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.totalSales = totalSales;
	}

    public java.lang.String toString(){
        return (this.firstname + ", " + this.lastname + ": " + this.totalSales); 
    }

    public java.lang.String getFirst(){
        return this.firstname;
    }

    public java.lang.String getLast(){
        return this.lastname;
    }

    public int getSales(){
        return this.totalSales;
    }

    public boolean equals(Object o) {
        if (o instanceof SalePerson) {
            SalePerson newperson = (SalePerson) o;

            if (newperson.getFirst() == this.firstname && newperson.getLast() == this.lastname){
                return true;
            }
        }
        return false;
    }

    public int compareTo(Object o){
        if(o instanceof SalePerson){
            SalePerson newperson = (SalePerson) o;
            if(this.totalSales > newperson.getSales()){
                return 1;
            } else if (this.totalSales < newperson.getSales()){
                return -1;
            }
            else {
                if (this.totalSales == newperson.totalSales){
                    return this.lastname.compareTo(newperson.getLast());
                }
            }
        }
        return -1;
    }
}
