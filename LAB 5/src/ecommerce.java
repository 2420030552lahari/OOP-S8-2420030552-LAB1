class order{
	String customerid ="ORDER123";
	String name= "lahari";
	 public void printdetails() {
		System.out.println("________order details ________");
		System.out.println("Order id: "+customerid);
		System.out.println("customer name: "+name);
		
	}
		
}

class onlineorder extends order{
	@Override
	public void printdetails() {
		super.printdetails();
		System.out.println("delivery address: allywn colony,kuktapally");
	}


}

	public class ecommerce{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             onlineorder  order =new onlineorder();
             order.printdetails();
             
             
	}

	}
