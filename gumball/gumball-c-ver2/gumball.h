
typedef struct 
{
	int num_gumballs ;
	int has_quarter ;
} GUMBALL ;

extern void init_gumball( GUMBALL *ptr, int size ) ;
extern void turn_crank( GUMBALL *ptr );
extern void insert_quarter( GUMBALL *ptr );
extern void eject_quarter( GUMBALL *ptr );