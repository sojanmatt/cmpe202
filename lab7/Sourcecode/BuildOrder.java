  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
     

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        //Premium cheese options
        PremiumCheese pc= new PremiumCheese("Premium Cheese options");
        String[] pco= {"Danish Blue Cheese"};
        pc.setOptions(pco);
        pc.wrapDecorator(c);
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( pc ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise" ,"Thai Peanut Sauce"} ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;
        
        //Set up bun options
        Bun bun = new Bun("Bun Options");
       String[] buno= {"Ciabatta(Vegan)"};
       bun.setOptions(buno);
       bun.wrapDecorator(s);
       
       //Set up side options
       Side side = new Side("Side Options");
     
       String[] sideo = {"Shoestring Fries"};
       side.setOptions(sideo);
       side.wrapDecorator(bun);
      
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;    
        customBurger.addChild( c ) ;
        customBurger.addChild(pc);
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;
       
        
        
        // Add Custom Burger to the ORder
       // order.addChild( customBurger );
     //   return order ;
////        
    	 Composite secondorder = new Composite( "Second Order" ) ;
//         
//
         CustomBurger secondcustomBurger = new CustomBurger( "Build Your Own Burger" ) ;
         // base price for 1/3 lb
         Burger sb = new Burger( "Burger Options" ) ;
         String[] sbo = { "Hormone & Antibiotic Free Beef", "1/3lb.", "On A Bun" } ;
         sb.setOptions( sbo ) ;
         // 1 cheese free, extra cheese +1.00
         Cheese sc = new Cheese( "Cheese Options" ) ;
         String[] sco = { "Smoked Gouda","Greek Feta" } ;
         sc.setOptions( sco ) ;
         sc.wrapDecorator( sb ) ;
         //Premium cheese options
         PremiumCheese spc= new PremiumCheese("Premium Cheese options");
         String[] spco= {"Fresh Mozzarella"};
         spc.setOptions(spco);
         spc.wrapDecorator(sc);
         
         // 4 toppings free, extra +.75
         Toppings st = new Toppings( "Toppings Options" ) ;
         String[] sto = { "Crushed Peanuts" } ;
         st.setOptions( sto ) ;
         st.wrapDecorator( spc ) ;
         // premium topping +1.50
         Premium sp = new Premium( "Premium Options" ) ;
         String[] spo = { "Sunny Side Up Egg*","Marinated Tomatoes" } ;
         sp.setOptions( spo ) ;
         sp.wrapDecorator( st ) ;
         // 1 sauce free, extra +.75
         Sauce ss = new Sauce( "Sauce Options" ) ;
         String[] sso = { "Habanero Salsa"} ;
         ss.setOptions( sso ) ;
         ss.wrapDecorator( sp ) ;
         
         //Set up bun options
         Bun sbun = new Bun("Bun Options");
        String[] sbuno= {"Gluten-Free Bun"};
        sbun.setOptions(sbuno);
        sbun.wrapDecorator(ss);
        
        //Set up side options
        Side sside = new Side("Side Options");
      
        String[] ssideo = {"Shoestring Fries"};
        sside.setOptions(ssideo);
        sside.wrapDecorator(sbun);
       
         // Setup Custom Burger Ingredients
        secondcustomBurger.setDecorator( sside ) ;
        secondcustomBurger.addChild( sb ) ;    
        secondcustomBurger.addChild( sc ) ;
        secondcustomBurger.addChild(spc);
         secondcustomBurger.addChild( ss ) ;
         secondcustomBurger.addChild( st ) ;
         secondcustomBurger.addChild( sp ) ;
         secondcustomBurger.addChild( sbun ) ;
         secondcustomBurger.addChild( sside ) ;
        
         
         
         // Add Custom Burger to the ORder
         order.addChild(customBurger);
         order.addChild( secondcustomBurger );
         return order ;
         
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/