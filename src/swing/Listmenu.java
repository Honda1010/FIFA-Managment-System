
package swing;

import event.EventMenuSelected;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import model.Model_menu;

/**
 *
 * @author mohaned
 */
public class Listmenu <E extends Object> extends JList<E>{
        private final DefaultListModel model;
        private int selected_index =-1;
        private int overIndex = -1;
        private EventMenuSelected event;
     public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
    }
    public Listmenu() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int index = locationToIndex(e.getPoint());
                    Object o = model.getElementAt(index); // 3aiz 24of ana dost 3la eh
                    if (o instanceof Model_menu) { // model_menu 2takd 2no menu m4 title 2w empty
                        Model_menu menu = (Model_menu)o; // casting to model_menu then asign it
                        if (menu.getType()==Model_menu.menutype.MENU) {
                            selected_index=index;
                             if (event != null) {
                                event.selected(index);
                            }
                        }
                    }
                    else{
                        selected_index=index;
                    }
                    repaint();
                }
            } 
            @Override
            public void mouseExited(MouseEvent e) {
                overIndex = -1;
                repaint();
            }
        });
              addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                int index = locationToIndex(me.getPoint());
                if (index != overIndex) {
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_menu) {
                        Model_menu menu = (Model_menu) o;
                        if (menu.getType() == Model_menu.menutype.MENU) {
                            overIndex = index;
                        } else {
                            overIndex = -1;
                        }
                        repaint();
                    }
                }
            }
        });  
    }
    @Override
    public ListCellRenderer<? super E> getCellRenderer() { // bl3b fe configration bla3 listmenu 34an lw d5l menu_model 2w l2 23rf
        return new DefaultListCellRenderer() {             // w 3ashan ama press 23mal render l label 
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_menu data;
                if (o instanceof Model_menu) { // lw hwa model menu model asign it in data
                    data = (Model_menu) o;
                } else {
                    data = new Model_menu("", o + "", Model_menu.menutype.EMPTY); // lw l2 5leh empty data
                }
                Menuitem item =new Menuitem(data);
                item.setSelected(selected_index == index); // if selected index = index set true for selected attribute in items
                item.setOver(overIndex == index);
                return item;
            }

        };
        }
    public void additem(Model_menu data){ // add item to list_menu 
        model.addElement(data);
    }
}
