package startup;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;


import gui.frame.MainFrame;

public class BillInit {
    public static void main(String[] args) throws InvocationTargetException, InterruptedException{
        // TODO: Runnable -> lambda
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                MainFrame.instance.setVisible(true);
            }
        });
    }
}
