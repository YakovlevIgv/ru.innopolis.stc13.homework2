package stc13.generic.main;


import java.util.*;

public class MathBox {
    private Integer[] array_input;
    private Integer[] array_out;
    private Integer[] arrcollect;
    private static List<Object> arrayList;


    //public Set<Integer> set;
    /**
     *
     * Конструктор на вход получает массив Integer.
     * Элементы не могут повторяться.
     * Элементы массива внутри конструктора раскладываются в подходящую коллекцию (выбрать самостоятельно),
     * являющуюся полем MathBox.
     * Элементы должны отсортироваться
     *
     */


    public MathBox(Integer[] array_input) {
        this.array_input = array_input;
        List list = Arrays.asList(array_input);
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList);
//        if (array_out[i].equals(array_out[i-1])){
//                System.out.println("Во входном массиве есть совпадения");
//                break;
//            }

        Set<Integer> set= new LinkedHashSet<>(arrayList);
        List<Integer> listWithoutDups = new ArrayList<>(set);
        if (set.size()< arrayList.size()){
            System.out.println("Во входном массиве есть совпадения");
        }
        else {
            System.out.println(arrayList);
            System.out.println(summator(arrayList));
            //System.out.println(equals.);
        }
    }

    /**
     * Есть метод, который получает на вход Integer и если такое значение есть в коллекции, удаляет его.
     *
     * @param inValue
     * @param listCol
     * @return
     */

    public Collection delElement(Integer inValue,Collection <Integer> listCol) {
        listCol.add(inValue);
        Set<Integer> set= new LinkedHashSet<>(listCol);
        List<Integer> listWithoutDups = new ArrayList<>(set);
        return set;
    }


    /**
     * Существует метод summator, возвращающий сумму всех элементов коллекции
     *
     *
     * @return
     */
    //public
    public Integer summator(Collection <Integer> listCol) {
        Integer sum = 0;

        for (int i : listCol)
            sum = sum + i;

        return sum;
    }

    /**
     * Существует метод splitter, выполняющий поочередное деление всех хранящихся в объекте элементов на делитель,
     * являющийся аргументом метода.
     * Метод возвращает коллекцию с результатами деления. Коллекция внутри mathbox при этом не меняется
     * @return
     */
    public int splitter() {
        int result = 0;
        {

        }
        return result;
    }

    @Override
    public String toString() {
        System.out.println(Arrays.toString(array_input)+arrayList);
        System.out.println();
        return "MathBox{" +
                "array_input=" + Arrays.toString(array_input) +
                ", array_out=" + Arrays.toString(array_out) +
                ", arrcollect=" + Arrays.toString(arrcollect) +
                '}';
    }

    /**
     * Необходимо правильно переопределить методы toString , hashCode, equals,
     * чтобы можно было использовать MathBox для вывода данных на экран и
     * хранение объектов этого класса в коллекциях (например, hashMap ).
     * Выполнение контракта обязательно!
     * @return
     */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MathBox)) return false;
        MathBox mathBox = (MathBox) o;
        System.out.println(MathBox.arrayList);
        return Arrays.equals(array_input, mathBox.array_input) &&
                Arrays.equals(array_out, mathBox.array_out) &&
                Arrays.equals(arrcollect, mathBox.arrcollect);

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(array_input);
        result = 31 * result + Arrays.hashCode(array_out);
        result = 31 * result + Arrays.hashCode(arrcollect);
        System.out.println(result);
        return result;

    }

    /**
     * Есть метод, который получает на вход Integer и если такое значение есть в коллекции, удаляет его.
     */



}
