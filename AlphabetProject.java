package project;

import java.util.Scanner;

public class AlphabetProject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Text: ");
		String text = sc.nextLine();
		String text1 = text.toLowerCase();
		String letters = "";
		for (int i = 1; i <= 7; i++) {
			String space = " ";
			String nextLine = "\n";
			for (int l = 0; l < text1.length(); l++) {
				switch (text1.charAt(l)) {
				case 'a':
					for(int j=1;j<=7;j++){
						if(i!=1 && (j==1 || j==7)||(i==1 && j%2==0)|| (i==4 && j%2!=0)){
					 		letters += "A";
					 	}else{
					 		letters += space;
						    }
					 	}
						break;
				case 'b':
					for(int j=1;j<=7;j++) {
						if( (i==1  && j!=7 || j==1) || (i==4 &&  j!=7) || (i==7 && j!=7) || (i==2 && j==7) || (i==3 && j==7)||(i==5 && j==7)||(i==6 && j==7)){
							letters += "B";
						}else{
							letters += space;
							 }
				 }
					break;
				case 'c':
					for(int j=1;j<=7;j++) {
					  	 if((i!=1  && j==1 )  & (i!=7 && j==1 ) ||(i==1 && j!=1 & j!=7) || (i==7 && j!=1 & j!=7 )|| (i==6 && j==7) || (i==2 && j==7)){
					    	 letters += "C";
					    }else{
							 letters += space;
					     }
					}
					break;
				case 'd':
					 for(int j=1;j<=7; j++) {
						 if((i==1 && j==1 & j==2 & j==3 & j==4 & j==5 & j==6) || (i==2  && j==1 )||(i==3 && j==1)|| (i==4 && j==1)|| (i==5 && j==1)|| (i==6 && j==1)|| (i==2 && j==7) || (i==3 && j==7)|| (i==4 && j==7) || (i==5 && j==7)|| (i==6 && j==7)|| (i==2 && j==1 & j==7) || (i==1 && j!=7 )|| (i==7 && j!=7) ){
					    	 letters += "D";
					     }else{
					    	 letters += space;
					    	 }
					    }
					 break;
				case 'e':
					for(int j=1;j<=7;j++){
				 		if((i==1||i==7||(i==4&&j!=7)||j==1) ){
							letters += "E";
				 		}else{
				 			letters += space;
				 		    }
				 		}
					break;
				case 'f':
					for(int j=1;j<=7;j++) {
					 	 if((i==1||(i==4&&j!=7)||j==1)){
					    	 letters += "F";
					 	 }else{
					    	 letters += space;
						 }
		    		 }
					break;
				case 'g':
					for(int j=1;j<=7;j++) {
						if((i!=1  && j==1 )  & (i!=7 && j==1 ) ||(i==1 && j!=1 & j!=7) ||(i==4 && j!=2)|| (i==7 && j!=1 & j!=5 & j!=6 )|| (i==5 &&( j==5||j==7) ) ||(i==6 &&( j==5||j==7)|| (i==2 && j==7))){
					    	 letters += "G";
					    }else{
					    	letters += space;
					 }
				 }
					break;
				case 'h':
					for(int j = 1; j <= 7;j++) {
						if (((i>0) && (j == 1  || j == 7)) ||(i == 4) && (j>0)) {
							letters += "H";
						}else {
							letters += space;
									}
								}
					break;
				case 'i':
					for(int j = 1; j <= 7;j++) {
						if ((i == 1||i==7) && (j > 0) ||((j == 4) && i>0)) {
							letters += "I";
						}else {
							letters += space;
									}
								}
					break;
				case 'j' :
					for(int j = 1; j <= 7;j++) {
						if (((i==5||i==6) && (j==1)) ||(i==1)&&j>2||(j==5&&i<7)||(i==7&&(j==2||j==3||j==4))) {
							letters += "J";
						}else {
							letters += space;
								}
							}
					break;
				case 'k':
					for(int j=1;j<=7;j++) {
						if (((j==1) && (i>0))||((i==1 || i==7) && j==6)||((i==2 || i==6) && j==5)||((i==3 || i==5) && j==4)||((i==4 && j==3))) {
							letters += "K";
						}else {
							letters += space;
						}
					}
					break;
				case 'l':
					for(int j=1;j<=7;j++) {
						if(j==1||(i==7&&j%2==0)) {
							letters += "L";
						}else {
							letters += space;
						}
					}
					break;
				case 'm':
					for(int j=1;j<=7;j++) {
						if((j==1||j==7)||(i==4 && j==4)||(i==3 && j==4)||(i==1&&(j==2||j==6))||(i==2&&(j%2!=0))) {
							letters += "M";
						}else {
							letters += space;
									}
								}
					break;
				case 'n':
					for(int j=1;j<=7;j++) {
						if((j==1 || j==7)||(i==4&&j==4)||(i==2&&j==2)||(i==3&&j==3)||(i==5&&j==5)||(i==6&&j==6)) {
							letters += "N";
						}else {
							letters += space;
									}
								}
					break;
				case 'o':
					for(int j=1;j<=7;j++) {
						if(((i!=1&&i!=7)&&(j==1||j==7))||((j!=1&&j!=7)&&(i==1||i==7))){
							letters += "O";
						}else {
							letters += space;
									}
								}
					break;
				case 'p':
					for(int j=1;j<=7;j++) {
						if((j==1)||(j!=7&&(i==1||i==4))||(j==7&&(i==2||i==3))) {
							letters += "P";
						}else {
							letters += space;
									}
								}
					break;
				case 'q':
					for(int j=1;j<=7;j++) {
						if((i==1&&(j==2||j==6||j==3||j==4||j==5))||(i==2 &&(j==1||j==7)||(i==3&&(j==1||j==7)||(i==4&&(j==1||j==7)||(i==5&&(j==1||j==5||j==7)||(i==6&(j==1||j==6)||(i==7&&(j==2||j==3||j==4||j==5||j==7)))))))) {
							letters += "Q";
						}else {	
							letters += space;
						}
					}
					break;
				case 'r':
					for(int j=1;j<=7;j++){
						if (((i == 1) && (j!=7))||((i == 2) && (j == 1 || j == 7))||(i == 3&&(j==1 ||j==7))||(i==4&&(j<7))||(i == 5 &&(j == 1 || j == 5))||(i == 6 && (j == 1 || j == 6))||(i == 7 && (j == 1 || j == 7))) {
							letters += "R";
		 				}else{
		 					letters += space;
		 				    }
		 			}
					break;
				case 's':
					for(int j=1;j<=7;j++) {
						if(((i==1||i==7||i==4)&&(j>1&&j<7))||(((i==2||i==6))&&(j==1||j==7))||((i==3&&j==1)||(i==5&&j==7))){				
							letters += "S";
						}else {
							letters += space;
									}
								}
					break;
				case 't':
					for(int j=1;j<=7;j++) {
						if((((i<=1)&&(j>0))||(j==4))||((j==1)||(j==7))&&(i<=2)){
							letters += "T";
						}else {
							letters += space;
									}
								}
					break;
				case'u':
					for(int j=1;j<=7;j++)	{
						if((j==1||j==7)&& i<7||i==7&&(j!=i&&j!=1)) 
							letters += "U";
						else 
							letters += space;
									}
					break;
				case 'v':
					for(int j=1;j<=7;j++) {
		    			 if ((((i<=4) && (j==1 || j==7))||(i==5)&&(j==2 ||j==6)||(i==6&&(j==3 || j==5)) ||(i==7&&j==4)))
		    				 letters += "V";
		    			 else{
		    				 letters += space;
		    			 }
		    		 }
					break;
				case 'w':
					for(int j=1;j<=7;j++) {
						if (((i<=7)&&(j==1 || j==7)) || ((i==3)&&(j==4)) || ((i==4)&&(j==4)) || ((i==5)&&(j==3 || j==5)) || ((i==6)&&(j==2 || j==6))){
		    				 letters += "W";
		    			 }else{
		    				 letters += space;
		    			 }
		    		 }
					break;
				case 'x':
					for (int j = 1; j <= 7; j++) {
						if ((i + j == 8) || (i == j)) {
							letters += "X";
						} else {
							letters += space;
									}
								}
					break;
				case 'y':
					for (int j = 1; j <= 7; j++) {
						if ((i + j == 8) && (i <= 4) || (j == 4) && (i >= 4) || ((i == j) && (i <= 4))) {
							letters += "Y";
						} else {
							letters += space;
									}
								}
					break;
				case 'z':
					for (int j = 1; j <= 7; j++) {
						if ((i == 1) || (i == 7) || (i + j == 8) && (i != 7 && j != 7)) {
							letters += "Z";
						}else {
							letters += space;
									}
								}
					break;
				case ' ':
					for (int j = 1; j <= 7; j++) {
						letters += space;
						}
					break;
							}
						}
					letters += nextLine;
					}
		String[] para = letters.split("\n");
		for (int i = 0; i < para.length; i++) {
			System.out.println(para[i]);
					}
		}
}