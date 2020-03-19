
package serialisasi;


public class Implementasi {
    public static void main(String[] args) {
        //jika masih dalam satu package dapat memanggil kelas lain
        //namun terdapat perbedaan tampilan antara Implementasi.java dengan MainForm.java
        MainForm mf = new MainForm();
        mf.setVisible(true);
    }
    
}
