package javaapplication35;


import entidad.alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ejemploRecorrerColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * LISTA remove(int índice);Este método remueve un elemento de un índice
         * especifico. remove(elemento); Este método remueve la primera
         * aparición de un elemento a borrar en una lista.
         */
        ArrayList<Integer> numerosA = new ArrayList();
        Integer x = 20;
        Integer a = 2;
        Integer c = 3;
        Integer al = 4;
        Integer sl = 5;
        numerosA.add(x);//este numero se encuentra en el indice 0
        numerosA.add(a);
        numerosA.add(c);
        numerosA.add(al);
        numerosA.add(sl);
        
        Iterator iterador = numerosA.iterator();
        System.out.println("Prueba iterator: Lista");
        while (iterador.hasNext()){
            System.out.print(iterador.next()+" ");
        }
        System.out.println("");
        /**
         * EJEMPLO numerosA.remove(c);//eliminamos el valor que esté en la
         * variable C numerosA.remove(Integer.valueOf(20));//eliminamos el
         * numero 3 o el primer 3 que aparezca.
         */
//        System.out.println("Prueba: Lista");
//        for (Integer arreglo : numerosA) {
//            System.out.print(arreglo + " ");
//        }
//        System.out.println("");

        /**
         * CONJUNTOS Ya que los conjuntos no constan de índices, solo se puede
         * borrar por elemento "remove(elemento);". Este método remueve la primera
         * aparición de un elemento a borrar en un conjunto.
         */
        HashSet<Character> letras = new HashSet();
        Character y = 'a';
        Character q = 'o';
        Character w = 'c';
        Character e = 'o';
        Character r = 'p';
        letras.add(y);
        letras.add(q);
        letras.add(w);
        letras.add(e);
        letras.add(r);
        /**
         * para ordenar un Conjunto, primero debemos convertirlo 
         * a lista y luego utilizamos la función sort().
         */
        ArrayList<Character> LetrasLista = new ArrayList(letras);
        Collections.sort(LetrasLista);
        /**
         * EJEMPLO letras.remove(w);//eliminamos la letra C.
         */
        Iterator it = LetrasLista.iterator();
        System.out.println("Prueba1: Conjuntos");
        
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("");

        /**
         * Mapas en los mapas solo podemos remover un elemento por su llave
         * remove(llave); Este método remueve la primera aparición de la llave
         * de un elemento a borrar en un mapa.
         */
        HashMap<String, alumno> alumnos = new HashMap();
        
        alumnos.put("1",new alumno("mario luis", 12123232));
        alumnos.put("2",new alumno("pepa", 12123232));
        alumnos.put("3",new alumno("juan carlos", 11111233));
        alumnos.put("4",new alumno("maria", 33333333));
        
        /**
         * Para recorrer mapas vamos a tener que usar el objeto Map.Entry en el
         * ForEach.
         */
        System.out.println("Prueba: Mapa");
        for (Map.Entry<String, alumno> aux : alumnos.entrySet()) {
            String key = aux.getKey();
            alumno value = aux.getValue();
            
            System.out.println("alumno "+value.getNombre()+" Documento"+value.getDni());
        }
      
        TreeMap<Integer,String> alumnosTree = new TreeMap();
        
          alumnosTree.put(12123122, "mario");
          alumnosTree.put(12333222, "karen");

//      Recorrer TreeMap 
        System.out.println("Prueba: TreeMap"); 
        for (Map.Entry<Integer, String> entry : alumnosTree.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("Documento "+ key+" alumno, "+ value);
        }

        //sin Map.Entry:
//        mostrar solo las llaves
//        for (Integer documento : alumnos.keySet()) {
//            System.out.println("Documento: " + documento);
//        }

        //mostrar solo los valores
//        for (String nombres : alumnos.values()) {
//            System.out.println("Nombre: " + nombres);
//        }

        ArrayList<String> hojas = new ArrayList<>();
        hojas.add("Auto");
        hojas.add("Bomba");
        hojas.add("Coche");
        hojas.add("hola");
        
        Collections.sort(hojas);//el sort() nor permite ordenar los elementos de forma ascendente.
        Iterator iterator = hojas.iterator();
        System.out.println("Elementos de la lista: ");
        
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("");
        
         
    }

}
