
typedef struct 
{
	int num_gumballs ;
	int has_quarter ;
	int current_state ; /* 0 = OUT_OF_GUMBALL,  1 = NO_QTR, 2 = HAS_QTR, 3 = EJECT_GUMBALL */
} GUMBALL ;

extern void init_gumball( GUMBALL *ptr, int size ) ;
extern void turn_crank( GUMBALL *ptr );
extern void insert_quarter( GUMBALL *ptr );
extern void eject_quarter( GUMBALL *ptr );
