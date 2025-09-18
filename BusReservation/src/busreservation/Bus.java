package busreservation;

public class Bus {

   private int B_no;
   private boolean Ac_c;
   private int Capacity;

    // ✅ Constructor must be public
    public Bus(int no, boolean ac, int c) {
        B_no = no;
        Ac_c = ac;
        Capacity = c;
    }
    public int getB_no(){
    	return B_no;
    }
    public boolean getAc_c(){
    	return Ac_c;
    }public int getCapacity(){
    	return Capacity;
    }   
    public void setAc_c(boolean ac){
    	 Ac_c=ac;
    }
    public void setCapacity(int c){
    	 Capacity=c;
}
    public void displayBusInfo() {
    	System.out.println("Bus No: "+B_no+" Ac : "+Ac_c+" Capacity : "+Capacity);
    }
}