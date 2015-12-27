package javase01.t06;
import javase01.t06.Note;

/**
 * Class NotePade
 *
 * @author Meltir
 * Класс использует объект класса Note (String - массив) согласно заданию
 */
public class NotePad {
    
    Note note = new Note();
        
    // Добавить запись 
    void addString(String str) {
/**
 * addString
 *
 * Метод добавляет в конец массива объекта Note новый элемент типа String
 * @param str передаваемая строка
 */
        for (int i = 0; i < note.arr.length; i++) {
            if (note.arr[i] == null) {
                note.arr[i] = str;
                break;
            }
        }
    }
    
    // Удалить запись
    void delString(int index) {
/**
 * Метод удаляет из массива объекта Note элемент со смещением остальных элементов
 * @param index номер строки, требующей удаления. Подразумевается, что пользователь
                использует нумерацию строк начиная с 1, а не с 0.
 */
        index--;
        for (int i = index; i < note.arr.length; i++) {
            note.arr[i] = note.arr[i + 1];
            if (note.arr[i] == null) break;
        }
    }
    
    // Редактировать запись    
    void editString(int index, String str) {
/**
 * Метод заменяет элемент массива объекта Note
 * @param index номер строки, требующей замены. Подразумевается, что пользователь
                использует нумерацию строк начиная с 1, а не с 0.
 * @param str передаваемая пользователем строка, помещаемая взамен указанной
 */
        index--;
        note.arr[index] = str;
    }
  
    // Просмотреть все записи
    void showText() {
/**
 * Метод выводит в консоль содержимое массива объекта Note.
 * Указывается нумерация строк начиная с 1, а не с 0.
 */
        System.out.println("Notepad:\n__________\n");
        for (int i = 0; i < note.arr.length; i++) {
            if (note.arr[i] == null) break;
            System.out.println("(" + (i+1) + ")\t" + note.arr[i]);            
        }
        System.out.println();
    }
}