public class SuperArray{
	  private int size=0;
	  private String[] data;


	  public SuperArray(){
	    data = new String[10];
	  }

	  public void clear(){
	    size=0;
	  }

	  public int size(){
	    return size;
	  }

	  public boolean isEmpty(){
	    return size ==0;
	  }

	  public boolean add(String str){
			if (data.length <= size) resize();
	    data[size()] = str;
	    size++;
			return true;
	  }

	  public String toString(){
	    String out = "{";
	    for(int i =0; i < size(); i++){
	      out += data[i];
	      if (i != size()-1) out +=  ",";
	    }
	    return out + "}";
	  }

	  public String get(int index){
	    if (index < 0 || index >= size()) return null;
	    return ""+ data[index];
	  }

	  public String set(int index, String str){
	    if (index < 0 || index >= size()) return null;
	    data[index] = str;
			return "Yay! \n index: " + index + " \n value: " + str;
	  }

		private void resize() {
			String[] newData = new String[(size + 1) * 2];
			for (int i = 0; i < size(); i++){
				newData[i] = data[i];
			}
			this.data = newData;
    }

		public boolean contains(String target){
			for (int  i = 0; i < size(); i++){
      if (get(i).equals(target)){
        return true;
      }
    }
    return false;
		}

		public int indexOf(String target){
			if (this.contains(target)){
				for (int  i = 0; i < size(); i++){
					if (get(i).equals(target)){
		        return i;
		      }
				}
			}
			return -1;

		}

		public int lastIndexOf(String target){
			if (this.contains(target)){
				for (int  i = size()-1; i > -1; i--){
					if (get(i).equals(target)){
		        return i;
		      }
				}
			}
			return -1;
		}

		public void add(int index ,String str){
			if (data.length == size()) resize();
	    if (index < 0 || index > size()){
				System.out.println("Error: index out of bounds");
	    }else{
	      for (int i = size(); i > 0; i--){
	        if (i > index) data[i] = data[i - 1];
	      }
			}
	      data[index] = str;
	      size++;
	    }




		/*public String remove(int){

		}

		public boolean remove(String){

		}*/

	}
