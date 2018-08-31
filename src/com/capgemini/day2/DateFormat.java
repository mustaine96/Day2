package com.capgemini.day2;

public class DateFormat {

	public static String alterDate(String date) {
		//String month=null;
		String da[]=date.split(",");
		switch(da[1]) {
		default : return"Enter proper Date";
		case "01": 
		{return(da[0]+"/January/"+da[2]);
			
		       }
		case "02": {return (da[0]+"/February/"+da[2]);
		}
		case "03": {return (da[0]+"/March/"+da[2]);
		}
		case "04": {return(da[0]+"/April/"+da[2]);
		}
		case "05": {return(da[0]+"/May/"+da[2]);
		}
		case "06": {return(da[0]+"/June/"+da[2]);
	    }
		case "07": {return(da[0]+"/July/"+da[2]);
		}
		case "08": {return(da[0]+"/August/"+da[2]);
		}
		case "09": {return(da[0]+"/September/"+da[2]);
		}
		case "10": {return(da[0]+"/October/"+da[2]);
		}
		case "11": {return(da[0]+"/November/"+da[2]);
		}
		case "12": {return(da[0]+"/December/"+da[2]);
		}
		
		
		
		}
		
	}

}
