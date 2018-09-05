
#include <stdio.h>
#include "gumball.h"

void OUT_OF_GUMBALL( GUMBALL *ptr )
{
	printf( "No More Gumballs! \n" ) ;
	ptr->current_state = 0 ; /* No Gumballs! */
}

void NO_QTR( GUMBALL *ptr )
{
	printf( "No Quarter Inserted! \n" ) ;
	ptr->current_state = 2 ; /* No Quarter! */
}

void HAS_QTR( GUMBALL *ptr )
{
	printf( "Quarter Inserted! \n" ) ;
	ptr->current_state = 1 ; /* Has Quarter! */
	ptr->has_quarter = 1 ;
}

void EJECT_GUMBALL( GUMBALL *ptr )
{
	if( ptr->num_gumballs>0 )
	{
		printf( "Your Gumball has been ejected!\n" ) ;
		ptr->has_quarter = 0 ;
		ptr->num_gumballs-- ;
	}
	if( ptr->num_gumballs <= 0 )
		ptr->current_state = 0 ; /* Out of Gumballs! */
	else
		ptr->current_state = 2 ; /* No Quarter */
}

void (*machine[3][4]) (GUMBALL *ptr) = {
						/* OUT_OF_GUMBALL,   	HAS_QTR,  		NO_QTR,  	EJECT_GUMBALL  */
	/* crank */			{OUT_OF_GUMBALL, 		EJECT_GUMBALL,	NO_QTR, 	0			},
	/* insert qtr */	{OUT_OF_GUMBALL, 		HAS_QTR, 		HAS_QTR, 	0			},
	/* eject qtr */		{OUT_OF_GUMBALL, 		NO_QTR, 		NO_QTR, 	0 			}		
} ;


void init_gumball( GUMBALL *ptr, int size ) 
{
	ptr->num_gumballs = size ;
	ptr->has_quarter = 0 ;
	ptr->current_state = 2 ; /* No Quarter */
}

void turn_crank( GUMBALL *ptr )
{
	machine[0][ptr->current_state](ptr) ;
}

void insert_quarter( GUMBALL *ptr )
{
	machine[1][ptr->current_state](ptr) ;
}

void eject_quarter( GUMBALL *ptr )
{
	machine[2][ptr->current_state](ptr) ;
}

