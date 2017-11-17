class DynamicArray {
    
      
    public OpCounter counter = new OpCounter();
    int [] storage; 
    int nitems;
 

    public DynamicArray(int size) {
        storage = new int[size];
        nitems = 0; 
     
    }

    public int length() {
        return nitems;
    }
    public int select(int k) {
        return storage[k];
    }
    public void store(int o, int k) {
        storage[k] = o;
    }
    public void push(int o) {
        if(nitems >= storage.length){
            extend();
        }
        storage[nitems] = o;
        nitems++;
        counter.add(1);
    }
    public int pop() {
        nitems--;
        return storage[nitems];
    }
    private void extend() {
    
           int lenNew = storageLengthNew();
           int storageNew [] = new int[lenNew];
        for (int j = 0; j < storage.length; j++ ){
         storageNew[j] = storage[j];
    counter.add(1);
        }
        
        storage = storageNew;
    
}
    
    private int storageLengthNew() {
    int len = nitems * 2;
    return len;
    }
    }
