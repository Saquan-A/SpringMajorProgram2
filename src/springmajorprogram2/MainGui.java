/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author saqua
 */
public class MainGui extends javax.swing.JFrame {
    Department depart = new Department(); //creates new department object
    
    
    /**
     * Creates new form MainGui
     */
    public MainGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton5 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Load");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Course Tracker");

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jButton5.setText("Save");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //String names = depart.getstudent(0).toString();
        //used to add all my Strings to a list mdodel
        DefaultListModel lista = new DefaultListModel();
       
        //Array of Strings so I can add buttons to a JOptionPane
         String[] options = new String[] {"Student", "Grad", "Faculty", "Staff"};
    int response = JOptionPane.showOptionDialog(null, "Select information you would like to view", "Person Selector",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);//JOptionPane setup
    
    
    //Student button   
    if(response == 0){
        //for loop that goes through the Student arrayList and sees if the gotten class from the arraylist matches, the student class
        for(int i = 0; i<depart.getStudent(); i++){
            
            if(depart.getstudent(i).getClass().equals(Student.class)){
            String name = depart.getstudent(i).getFirstname()+" "+depart.getstudent(i).getLastname();
          //Adds name to a list and that list is then added to the JList
            lista.addElement(name);
            jList1.setModel(lista);
            
            
            }
        }
         
    }
    //Graduate Button
    if(response == 1){
        //goes through the student arraylist and sees if the gotten class is of the GraduateStudent class
        for(int i = 0; i<depart.getStudent(); i++){
            
            if(depart.getstudent(i).getClass().equals(GraduateStudent.class)){
            String name = depart.getstudent(i).getFirstname()+" "+depart.getstudent(i).getLastname();
          
            lista.addElement(name);
            jList1.setModel(lista);
            
            }
        }
    }
    //faculty button
    if(response == 2){
        //for loop that goes through the employee arraylist, and see if the gotten class matches Faculty
            for(int i = 0; i<depart.getEmployee(); i++){
            
            if(depart.getemployee(i).getClass().equals(Faculty.class)){
            String name = depart.getemployee(i).getFirstname()+" "+depart.getemployee(i).getLastname();
          
            lista.addElement(name);
            jList1.setModel(lista);
            }
        }
        
    }
    //Staff button
    if(response == 3){
        //for loop that goes through the employee arraylist and sees if the gotten class is of the Staff class
            for(int i = 0; i<depart.getEmployee(); i++){
            
            if(depart.getemployee(i).getClass().equals(Staff.class)){
            String name = depart.getemployee(i).getFirstname()+" "+depart.getemployee(i).getLastname();
          
            lista.addElement(name);
            jList1.setModel(lista);
            }
        }
//            jList1.addListSelectionListener(new ListSelectionListener(){
//             
//             @Override
//             public void valueChanged(ListSelectionEvent e){
//                 if(!e.getValueIsAdjusting()){
//                     System.out.println("It worked")
//                 }
//             }
//            });
        
    }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //creates a Joption pane of two buttons
          String[] options = new String[] {"Add Student", "Add Employee"};
    int response = JOptionPane.showOptionDialog(null, "Select information you would like to view add", "Person Adder",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
        //Add Student
       if(response == 0){
        
        JFrame s = new JFrame();
        AddStudent g = new AddStudent(s, true, depart);
        g.setVisible(true);
        g.setLocationRelativeTo(null);
       }
       //Add Employee
        if(response == 1){
        
        JFrame s = new JFrame();
        AddFalculty g = new AddFalculty(s, true, depart);
        g.setVisible(true);
        g.setLocationRelativeTo(null);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                //Load client method using a JFileChooser
         JFileChooser chooser = new JFileChooser();
         //Filters anything that isnt a Textfile making it easier to find the input text you want
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Text File", "txt");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(null);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
          try {
              System.out.println("You chose to open this file: " +
                      chooser.getSelectedFile().getName());
              File loc = chooser.getSelectedFile();
              String loc1 = loc.getPath();
              depart.readDepartment(loc1);
          } catch (Exception ex) {
              Logger.getLogger(MainGui.class.getName()).log(Level.SEVERE, null, ex);
          }

       
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed
//Event handeling for when an option is clicked on the JList, not set to when double-clicked however
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
         //TODO add your handling code here:
//        String thing = "fun";
//       int[] selected = this.jList1.getSelectedIndices();
//       for(int i = 0; i< selected.length; i++){
//           thing = (String) jList1.getModel().getElementAt(selected[i]);
//               for(int k = 0; i<depart.getStudent(); k++){
//                 
//           String name = depart.getstudent(k).getFirstname()+" "+depart.getstudent(k).getLastname();
//            if(thing == name){
//                jTextArea1.setText("It worked");
//            }
//            
//        }
//       }
//      
//      //jTextArea1.setText("Hello world");
//      System.out.println(thing);
      
      String item = (String) jList1.getSelectedValue();
      //For loop that goes through and sees if the name matches the name in an arraylist and then prints out everything that was stored in that arraylist releated to said name.
      for(int i = 0; i<depart.getStudent(); i++){
          
             String name = depart.getstudent(i).getFirstname()+" "+depart.getstudent(i).getLastname();
            if(name.equals(item)){
            jTextArea1.setText(depart.getstudent(i).toString());

            
            } else for(int k = 0; k<depart.getEmployee(); k++){
                name = depart.getemployee(k).getFirstname()+" "+depart.getemployee(k).getLastname();
            if(name.equals(item)){
            jTextArea1.setText(depart.getemployee(k).toString());

            
            } 
            }
        }
      
      //System.out.println(item);
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                JFrame parentFrame = new JFrame();
     String veryLargeString = "";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        int userSelection = fileChooser.showSaveDialog(parentFrame);
        
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            System.out.println("Save as file: " + fileToSave.getAbsolutePath() );
                try {
                     PrintStream output = new PrintStream(new File(fileChooser.getSelectedFile()+".txt"));
                    System.setOut(output);
                    veryLargeString = depart.writeDepartment();
                     output.print(veryLargeString);
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
