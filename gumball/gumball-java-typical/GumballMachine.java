public class GumballMachine
{

    private int num_gumballs;
    private int totalAmount;
    private boolean has_quarter;
    private int gum_machine;
    

    public GumballMachine( int size, int gum_machine)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.gum_machine=gum_machine;
        
    }
   
	

    public void insertQuarter(int coin)
    {
        if ( coin == 25 && gum_machine==1 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
        if (coin==25 && gum_machine==2)
        {
        	this.totalAmount+=coin;
        	
        	if(this.totalAmount==50)
        	{
        		this.has_quarter = true ;
        		}
        	else
        		this.has_quarter = false ;
        		
        	
        }
       
        if (gum_machine==3)
        {
        	this.totalAmount+=coin;
        	if(this.totalAmount>=50)
        	{
        		this.has_quarter = true ;
        		}
        	else
        		this.has_quarter = false ;
        		
        	
        }
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}




