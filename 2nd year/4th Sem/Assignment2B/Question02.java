import java.util.*;
public class Question02 {

	static class Address{
		static int plot;
		static String at;
		static String postOffice;
		
		Address(int plot, String at, String postOffice){
			this.plot=plot;
			this.at=at;
			this.postOffice=postOffice;
		}
		public String toString() {
			return "Address[plot ="+plot+" at = "+at+" postOffice = "+postOffice+"]";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Address> person=new TreeMap<String, Address>();
		person.put("Steve Rogers", new Address(569, "Leaman_Place", "Brooklyn_Heights"));
		person.put("Thor Odinson", new Address(616, "Norway", "Asgard"));
		person.put("Tont Stark", new Address(10880, "Malibu_Point", "LA"));
		person.put("Bruce Banner", new Address(616, "Dayton", "Ohio"));
		
		System.out.println(person);
	}

}
