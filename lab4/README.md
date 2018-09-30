CRC Cards

1) Customer

Knows a.) name
      b.) phone number
      c.) no. of people in the group
Responsibilities
      a.) Accecpt invitation
      b.) Leave
Collaborators
      a.) Cellphone/Restaurant
      

2) CellPhone/Restaurant

  Responsibilities
                a.) Register(Customer c)
                b.) Unregister(Customer c)
                c.) notify()
  Collaborators
              Table
              
              
3) Table

  Knows
        a.) no_of_seats
        b.)table_number

  Responsibilities
        a.) update table status

Collaborators
        Cellphone/Restaurant and waitlist
  
  
4) Waitlist
  Knows
        a.) waitlist_number
Responsibilities
        a.)add customer
        b.)remove customer
        c.) check if the current group is eligible for the table
        

I will implement the Observer design pattern for this restaurant system. Here Customer will be the observer and restaurant will be the subject. Any change in the table status will be communicated to the Restaurant(Subject) which in turn will broadcast it to the customer(Observer).
        
              
The Second design pattern that will fit this system is State design pattern. The table will have two states at any point of time i.e. vacant and occupied. These states will define the actions taken by the restaurant.
              
              
       
      
