
package componant;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import model.Model_card;

/**
 *
 * @author mohaned
 */
public class Card extends javax.swing.JPanel {
    private Color color1;
    private Color color2;

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Card(Color color1, Color color2, JLabel IbDescription, JLabel IbTitle, JLabel IbValue, JLabel IcIcon) {
        this.color1 = color1;
        this.color2 = color2;
        this.IbDescription = IbDescription;
        this.IbTitle = IbTitle;
        this.IbValue = IbValue;
        this.IcIcon = IcIcon;
    }
    
    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.decode("#021B79");
        color2=Color.decode("#0575E6");
    }
    public void setData(Model_card data) {
        IcIcon.setIcon(data.getIcon());
        IbTitle.setText(data.getTitle());
        IbValue.setText(data.getValue());
        IbDescription.setText(data.getDescription());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IcIcon = new javax.swing.JLabel();
        IbValue = new javax.swing.JLabel();
        IbTitle = new javax.swing.JLabel();
        IbDescription = new javax.swing.JLabel();

        IcIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stock.png"))); // NOI18N

        IbValue.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        IbValue.setForeground(new java.awt.Color(255, 255, 255));
        IbValue.setText("Value");

        IbTitle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        IbTitle.setForeground(new java.awt.Color(255, 255, 255));
        IbTitle.setText("Title");

        IbDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IbDescription.setForeground(new java.awt.Color(255, 255, 255));
        IbDescription.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IcIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IbValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IbDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IcIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IbValue)
                .addGap(5, 5, 5)
                .addComponent(IbDescription)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 =(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON );
        GradientPaint gg= new GradientPaint(0,0,color1,0,getHeight(),color2); 
        g2.setPaint(gg);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IbDescription;
    private javax.swing.JLabel IbTitle;
    private javax.swing.JLabel IbValue;
    private javax.swing.JLabel IcIcon;
    // End of variables declaration//GEN-END:variables
}
