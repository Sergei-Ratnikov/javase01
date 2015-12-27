package javase01.t06;
import javase01.t06.Note;
import javase01.t06.NotePad;

class Main {
    
    public static void main(String[] args) {
        
        NotePad notepad = new NotePad();
        //Note note1 = new Note();
        //notepad.note = note1;

        notepad.addString("one");
        notepad.addString("two");
        notepad.addString("three");
        notepad.addString("five");
        notepad.addString("four");
        notepad.showText(); 
                    
        notepad.editString(4, "oups!!");
        notepad.showText();
                    
        notepad.delString(4);        
        notepad.showText();       
        }
}