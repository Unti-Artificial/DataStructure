package com.DataStructure;

public class Array {
      private int[] data;
      private int size;

      public Array(int capacity){
            data = new int[capacity];
            size = 0;
      }
      public Array(){
            this(10);
      }
      public int getSize(){
            return size;
      }
      public int getCapacity(){
            return data.length;
      }
      public boolean isEmpty(){
            return size ==0;
      }

      //Start  Insert element into array
      public void addLast(int e){
//            if (size == data.length) throw new IllegalArgumentException("AddLast failed.Array is full.");
//            data[size] = e;
//            size ++;
            add(size,e);

      }
      public void addFirst(int e){
         add(0,e);
      }
      //向 Index插入元素
      public void add(int index,int e){
            if (size == data.length) throw new IllegalArgumentException("AddLast failed.Array is full.");
            if (index <0 || index>size) throw new IllegalArgumentException("AddLast failed.Required index >=0 and index <=size");
           for (int i = size - 1 ; i >= index ; i--)
                  data[i+1] = data[i];
                  data[index] = e;
                  size++;

      }
      //End  Insert element into array

    //get  the position of element
    int get (int index){
          if (index<0 || index >= size)throw new IllegalArgumentException("Get failed .Index is illegal");
          return data[index];
    }
    //update  the position of element
    int set(int index,int e){
        if (index<0 || index >= size)throw new IllegalArgumentException("Get failed .Index is illegal");
        return data[index] = e;
    }
    //   Does it exist element e by select
    public boolean contains(int e){
          for (int i = 0; i<size; i++){
              if (data[i] ==e){
                  return true;
              }
          }
          return false;
    }
    //select the index of element e in the array  if doesn't exist element e  ,return -1
    public int find(int e){
       for (int i = 0;i<size;i++){
           if (data[i] == e) return i;
       }
        return -1;
    }
   // start remove
    public int remove(int index){
        if (index <0 || index>size) throw new IllegalArgumentException("AddLast failed.Required index >=0 and index <=size");
        int ret = data[index];
        for (int i = index+1;i<size;i++)
            data[i - 1] = data[i];
            size --;
           return ret;
    }

    public int removeFirst(){
          return remove(0);

    }

    public int removeLast(){
          return remove(size - 1);
    }

    public void removeElement(int e){
     int index = find(e);
     if (index !=-1) remove(index);

    }
    // end remove
      @Override
      public String toString(){
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
          stringBuilder.append('[');
          for (int i = 0;i<size ; i++){
                stringBuilder.append(data[i]);
                if (i != size - 1){
                  stringBuilder.append(",");
                }
          }
            stringBuilder.append(']');
            return stringBuilder.toString();
      }
}
