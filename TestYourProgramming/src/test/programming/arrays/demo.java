package test.programming.arrays;
//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class HelloWorld {
	public static void main(String[] args) {
		String given = "Jana gana mana adhinayaka Jaya he Bharata bhagya vidhata Punjab Sindh Gujarat Maratha Dravida Utkala Banga Vindhya Himachala Yamuna Ganga Uchchala Jaladhi taranga Tava shubha name jage Tava shubha asisa mageGahe tava Jaya gathaJana gana mangala dayaka Jaya heBharata bhagya vidhataJaya he Jaya he Jaya he Jaya Jaya Jaya Jaya he";

		String given2 = given.trim();
		int count =0;
		String [] strarr = given2.split("\\s+");

		for(int i=0;i<strarr.length-1;i++){
			if(strarr[i].equals("Jaya")){
				count++;
			}
		}

		System.out.println("No of count of Jaya :"+ count);
	}
}