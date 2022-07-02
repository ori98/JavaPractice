import java.lang.*;

public class Polynomial {
	int size = 5;
	int poly[] = new int[size];

    // the index will be the degree of the polynomial and will store the coefficient
	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
    
    // array reconstruction function
    public void reconstruct(int degree){
        int[] temp = poly;
        this.size = degree + 2;
        poly = new int[this.size];
        
        // copying the elements in the array
        for(int i = 0; i < temp.length; i++){
            poly[i] = temp[i];
        }
    }

    // array reconstruction function
    public Polynomial reconstruct(Polynomial polyTerm, int degree){
        int[] temp = polyTerm.poly;
        int size = degree + 2;
        polyTerm.poly = new int[size];
        
        // copying the elements in the array
        for(int i = 0; i < temp.length; i++){
            polyTerm.poly[i] = temp[i];
        }

	return polyTerm;
    }
    
	public void setCoefficient(int degree, int coeff){
		
        // if outside current array index
		if(degree >= size){
            reconstruct(degree);
        }
        
        poly[degree] = coeff;
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i = 0; i < poly.length; i++){
            if(poly[i] != 0){
                System.out.print(poly[i] + "x" + i + " ");
            }
        }
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
	int max = Math.max(p.poly.length, poly.length);
        if(max >= this.size){
            reconstruct(max);
        }
        
        // once poly has been reconsctructed
        for(int i = 0; i < p.poly.length; i++){
            poly[i] += p.poly[i];
        }
        
	Polynomial poly1 = new Polynomial();
	poly1.poly = poly;
        return poly1;
    }
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		int max = Math.max(p.poly.length, poly.length);
        if(max >= this.size){
            reconstruct(max);
        }
        
        // once poly has been reconsctructed
        for(int i = 0; i < p.poly.length; i++){
            poly[i] -= p.poly[i];
        }
        
	Polynomial poly1 = new Polynomial();
	poly1.poly = poly;
        return poly1;

	}
	
	// Multiple two polynomials and returns a new polynomial which has a result
	public Polynomial multiply(Polynomial p){

		// creating a new polynomial having size equal to the sum of degrees of the two polynomials
		Polynomial resPol = new Polynomial();
		resPol.poly = new int[poly.length + p.poly.length];
		
		// multiplying  each term of original polynomial with the given polynomial p

			for(int j = 0; j < poly.length; j++){
	
				if(poly[j] == 0)
					continue;

				for(int k = 0; k < p.poly.length; k++){
					
					if(p.poly[k] == 0)
						continue;

					int coeff = poly[j] * p.poly[k];
					int degree = j + k;
					
				resPol.poly[degree] += coeff;
					
				}
			}		

		return resPol;

	}

}
