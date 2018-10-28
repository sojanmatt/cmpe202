
public  class CardDecorator {
	 CardDecorator wrapped;
	 public String carddetails="";
	
	 public void wrapDecorator( CardDecorator w ) 
	   {
		 System.out.println("wrap decorator"+this.wrapped);
	       this.wrapped = w ;
	       
	   }
	 
	 public void setCardDetails(String carddetails) {
		
		 
		 
	 };

	public String getDetails(String cardnumber) {
		System.out.println("Inside get details");
		StringBuffer card= new StringBuffer();
		
		for (int i = 0; i < cardnumber.length(); i++){
			if(i%4==0&&i>0) {
				card.append(" "+cardnumber.charAt(i));
			}
				else
					card.append(cardnumber.charAt(i));
			
			
		}
		this.carddetails=card.toString();

        return this.carddetails;
    }
	 
}
