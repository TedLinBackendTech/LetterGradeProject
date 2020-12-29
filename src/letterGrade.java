

public class letterGrade {
	
	
	public char getScoreLetter(int score) {
		
		if (score < 0 || score > 100)
			r_char = 'X';
        else if (score >= 90 && score <= 100)
        	r_char = 'A';
        else if (score >= 80 && score < 90)
        	r_char = 'B';
        else if (score >= 70 && score < 80)
        	r_char = 'C';
        else if (score >= 60 && score < 70)
        	r_char = 'D';
        else
        	r_char = 'F';
		return r_char;
		
		
	}
	
	private char r_char;

}
