/**
 * swing
 */


import javax.swing.*;

 public class swing {

    public static void main(String[] args) {
        JFrame obj = new JFrame("JAfar");
        JButton ne = new JButton(new ImageIcon("CLick"));
        // final JTextField tf=new JTextField();  
        // ne.setBounds(50,100,95,30);
        // ne.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent e)
        //     {

        //     }
        // });
        obj.add(ne);
        obj.setSize(400,400);
        obj.setLayout(null);
        obj.setVisible(true);
       
    }
}