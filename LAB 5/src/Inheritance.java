
		class Transport {
		   
		    void ticketPrice() {
		        System.out.println("Ticket price not defined.");
		    }
		}

	
		class Bus extends Transport {
		    
		    void ticketPrice() {
		        System.out.println("Bus ticket price: ₹50");
		    }
		}

	
		class Train extends Transport {
		   
		    void ticketPrice() {
		        System.out.println("Train ticket price: ₹120");
		    }
		}

		
		public class Inheritance {

			public static void main(String[] args) {
		       
		        Transport t1 = new Bus();   
		        Transport t2 = new Train();     
		        t1.ticketPrice(); 
		        t2.ticketPrice();  
		    } 
		

	}


