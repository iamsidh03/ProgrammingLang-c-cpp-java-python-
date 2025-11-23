package generics;
/*
 * bounded parameter: a bounded parameter is a type parameter that has a upper bound limit on the type that can be used in place of the parameter
 * parameter can be bounded by some range using "extends " keyword.
 * syntax
 * class className<T extends typeName> {...}
 * class className<T extends typeName&typeName2> {...}
 * 
 * 
 * Naming convension for type parameter
 * T: TypeVariable, used as a placeholder for any type
 * K: Key, used to represent the key in Map
 * E: Element, used to represent an element of a collection
 * V: Value, used to represent
 * N:Number
 * 
 */

 class Bank<T extends Number>{
    public void display(T[] t){
        for(T i:t) 
        System.out.print(i+" ");
    }

 }
public class TypeParameterGenerics {

    public static void main(String[] args) {
       //  Bank<Integer> acc = new Bank<>();
         Bank<Number> acc = new Bank<>();
         Integer[] a={234,45,45,67,68879,534,35};
         Double[] d={23.4,4.5,45.4,6.7,6.8879,53.4,3.5};
         acc.display(a);
         acc.display(d);
    
    }
}
