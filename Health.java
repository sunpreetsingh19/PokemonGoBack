package health;

import javax.swing.JFrame;

public class Health {

    public static void main(String[] args) {
//start of index.java
        Index index = new Index();
        index.setSize(500, 500);
        index.setVisible(true);
        index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        index.textFields();

//end of index.java
    }

}
