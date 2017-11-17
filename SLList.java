class SLList {
    Object firstOne;
    SLList otherOnes;
    
    
    public SLList(Object f, SLList r) {
        firstOne =  f;
        otherOnes = r;
    }
    public static final SLList NIL = new SLList(0, null);

    public Object first() {
        
	return firstOne;
    }
    public SLList rest() {
        return otherOnes;
    }
    public void setFirst(Object f) {
        firstOne = f;
    }
    public void setRest(SLList r) {
    otherOnes = r;
    }

    public Object nth(int i) {
        if(i == 0){
            return this.firstOne;
        }
        return this.otherOnes.nth(i - 1);
    }
    public SLList nthRest(int i) {
        if (i == 0){
            return this;
        }
        return this.otherOnes.nthRest(i - 1);
    }
    // no such thing as `unsigned' in Java
    public int length() {
    //    for(i = 0; )
        return -1;
    }

    public SLList remove(Object o) {
        return null;
    }
    public SLList reverse() {
        return null;
    }
    public SLList sublist(int start, int end) {
    	if(start > 0){
    		return this.rest().sublist(start-1, end-1);
    	}
    	else if(end > 0){
    		return new SLList(this.first(), this.rest().sublist(0, end-1));
    	}
    	else {
    		return NIL;
    	}
    }
    public SLList merge(SLList b) {
        
        int i = (int)this.first();
        int j = (int)b.first();
       
        
        	   if ( b == NIL && this.first() == NIL ) {
        		   return NIL;
        	   }
        	   else if(b.length() == 0) {
        		   return this;
        	   }
        	   else if(this.length() == 0) {
        		   return b;
        	   }
        	 	else if(i <= j){
            		return new SLList(this.first(), this.rest().merge(b));
            	}
        	   else {
        	return new SLList(b.first(), b.rest().merge(this));
        	   }
       
    }
    
}
