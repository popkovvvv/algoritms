public class OrdArray {
    private int size;
    private long[] arr;

    public OrdArray(int max) // Конструктор
    {
        arr = new long[max]; // Создание массива size = 0;
    }

    public int size()
    {
        return size;
    }

    public void add(long value)
    {
        int j;
        for(j=0; j<size; j++) {
            if(arr[j] > value) {
                break;
            }
        }
        for(int k=size; k>j; k--){
            arr[k] = arr[k-1];
        }
        arr[j] = value;
        size++;
    }

    public int find(long searchKey)
    {
        int lowerBound = 0;
        int upperBound = size-1;
        int curIn;
        while(true) {
            curIn = (lowerBound + upperBound ) / 2;
            if(arr[curIn]==searchKey)
                return curIn;              // Элемент найден
            else if(lowerBound > upperBound)
                return size;             // Элемент не найден
            else                          // Деление диапазона
            {
                if(arr[curIn] < searchKey)
                    lowerBound = curIn + 1; // В верхней половине else
                upperBound = curIn - 1; // В нижней половине
            }
        }
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == size) {
            return false;
        } else {
            for (int k = j; k < size; k++) // Перемещение последующих элементов
                arr[k] = arr[k + 1];
            size--; // Уменьшение размера
        }
        return true;
    }

    public void display() // Вывод содержимого массива
    {
        for(int j=0; j<size; j++) // Перебор всех элементов
            System.out.print(arr[j] + " "); // Вывод текущего элемента System.out.println("");
    }


}
