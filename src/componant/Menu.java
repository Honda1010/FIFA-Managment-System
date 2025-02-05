
package componant;

import event.EventMenuSelected;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import model.Model_menu;

/**
 *
 * @author mohaned
 */
public class Menu extends javax.swing.JPanel {
    private EventMenuSelected event;
     public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listmenu1.addEventMenuSelected(event);
    }
    public Menu() {
        initComponents();
        setOpaque(false);
        listmenu1.setOpaque(false);
        inti();
    }
    private void inti(){
        listmenu1.additem(new Model_menu("1", "Home Page", Model_menu.menutype.MENU));
        listmenu1.additem(new Model_menu("2", "Football Team", Model_menu.menutype.MENU));
        listmenu1.additem(new Model_menu("3", "Coach", Model_menu.menutype.MENU));
        listmenu1.additem(new Model_menu("4", "Staff", Model_menu.menutype.MENU));
        listmenu1.additem(new Model_menu("5", "matches", Model_menu.menutype.MENU));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelmoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listmenu1 = new swing.Listmenu<>();

        Panelmoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-fifa-40.png"))); // NOI18N
        jLabel1.setText("Managment System");

        javax.swing.GroupLayout PanelmovingLayout = new javax.swing.GroupLayout(Panelmoving);
        Panelmoving.setLayout(PanelmovingLayout);
        PanelmovingLayout.setHorizontalGroup(
            PanelmovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelmovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelmovingLayout.createSequentialGroup()
                .addComponent(listmenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelmovingLayout.setVerticalGroup(
            PanelmovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelmovingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listmenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelmoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelmoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 =(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON );
        GradientPaint gg= new GradientPaint(0,0,Color.decode("#021B79"),0,getHeight(), Color.decode("#0575E6")); // dragat el blue
        g2.setPaint(gg);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth()- 20, 0, getWidth(),getHeight());
        super.paintChildren(g);
    }
    private int x;
    private int y;
    
    public void inti_moving(JFrame fram){ // to move frame when press mouse on menu
        Panelmoving.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                x=e.getX();
                y=e.getY();
            }
        });
        Panelmoving.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent e) {
                fram.setLocation(e.getXOnScreen()- x,e.getYOnScreen()- y);
            }
        
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelmoving;
    private javax.swing.JLabel jLabel1;
    private swing.Listmenu<String> listmenu1;
    // End of variables declaration//GEN-END:variables
}
