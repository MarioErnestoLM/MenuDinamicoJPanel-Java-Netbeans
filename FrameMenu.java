package sistemaventas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrameMenu extends javax.swing.JFrame {
    
    //DECLARACION DE PANELES
    
    //Paneles de Productos
    PanelSubmenu1Menu1 submenu1menu1 = new PanelSubmenu1Menu1();
    PanelSubmenu2Menu1 submenu2menu1 = new PanelSubmenu2Menu1();
    PanelSubmenu3Menu1 submenu3menu1 = new PanelSubmenu3Menu1();
    PanelSubmenu4Menu1 submenu4menu1 = new PanelSubmenu4Menu1();
    //Paneles de Proveedor
    PanelSubmenu1Menu2 submenu1menu2 = new PanelSubmenu1Menu2();
    PanelSubmenu2Menu2 submenu2menu2 = new PanelSubmenu2Menu2();
    PanelSubmenu3Menu2 submenu3menu2 = new PanelSubmenu3Menu2();
    PanelSubmenu4Menu2 submenu4menu2 = new PanelSubmenu4Menu2();
    //Paneles de Consumir
    //LOS PANELES DE CONSUMIR AUN NO HAN SIDO CREADOS
    
    //METODOS/FUNCIONES
    
    //ESTA FUNCION FUNCION/METODO COLOCA EL COLOR-HOVER A LOS MENUS
    public void colorHoverMenus(JButton b){
        b.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                b.setBackground((Color.GRAY));
            }
            public void mouseExited(MouseEvent e){
                b.setBackground((Color.LIGHT_GRAY));
            }
        });
    }
    
    //ESTA FUNCION FUNCION/METODO COLOCA EL COLOR-HOVER A LOS SUBMENUS
    public void colorHoverSubMenus(JButton b){
        b.addMouseListener(new MouseAdapter(){
            public void mouseEntered(MouseEvent e){
                b.setBackground((Color.DARK_GRAY));
            }
            public void mouseExited(MouseEvent e){
                b.setBackground((Color.GRAY));
            }
        });
    }
    
    //ESTA FUNCION FUNCION/METODO MUESTRA LOS SUBMENUS
    public void mostrarSubMenus(JButton b, JPanel p){
        if (b.isShowing() == false) {
            p.setVisible(true);
        }else if (b.isShowing() == true) {
            p.setVisible(false);
        }
    }
    
    //ESTA FUNCION FUNCION/METODO MUESTRA LOS PANELES
    public void mostrarPaneles(JPanel j1, JPanel j2, JPanel j3, JPanel j4, JPanel j5, JPanel j6, JPanel j7, JPanel mostrar){
        panel_submenu_menu1.setVisible(false);
        panel_submenu_menu3.setVisible(false);
        panel_submenu_menu2.setVisible(false);
        panel_contenedor.remove(j1);
        panel_contenedor.remove(j2);
        panel_contenedor.remove(j3);
        panel_contenedor.remove(j4);
        panel_contenedor.remove(j5);
        panel_contenedor.remove(j6);
        panel_contenedor.remove(j7);
        btn_menu1.setVisible(false);
        btn_menu2.setVisible(false);
        btn_menu3.setVisible(false);
        panel_contenedor.add(mostrar);
        panel_contenedor.revalidate();
        panel_contenedor.repaint();
        
    }
    
    
    public FrameMenu() {
        initComponents();
        setTitle("Sistema");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //PLACEHOLDER
        TextPrompt placeholder = new TextPrompt("PlaceHolder", txt_buscar);
        placeholder.changeAlpha(0.75f);
        placeholder.changeStyle(Font.ITALIC);
        //TAMAÑO DE PANELES
        submenu1menu1.setSize(1014, 622);
        submenu2menu1.setSize(1014, 622);
        submenu3menu1.setSize(1014, 622);
        submenu4menu1.setSize(1014, 622);
        submenu1menu2.setSize(1014, 622);
        submenu3menu2.setSize(1014, 622);
        submenu2menu2.setSize(1014, 622);
        submenu4menu2.setSize(1014, 622);
        //PRODUCTOS
        panel_submenu_menu1.setVisible(false);
        btn_menu1.setBorder(null);
        btn_menu1.setVisible(false);
        btn_submenu1_menu1.setBorder(null);
        btn_submenu2_menu1.setBorder(null);
        btn_submenu3_menu1.setBorder(null);
        btn_submenu4_menu1.setBorder(null);
        //PROVEEDOR
        panel_submenu_menu2.setVisible(false);
        btn_menu2.setBorder(null);
        btn_menu2.setVisible(false);
        btn_submenu1_menu2.setBorder(null);
        btn_submenu2_menu2.setBorder(null);
        btn_submenu3_menu2.setBorder(null);
        btn_submenu4_menu2.setBorder(null);
        //CONSUMIR
        panel_submenu_menu3.setVisible(false);
        btn_menu3.setVisible(false);
        btn_menu3.setBorder(null);
        btn_submenu1_menu3.setBorder(null);
        btn_submenu2_menu3.setBorder(null);
        btn_submenu3_menu3.setBorder(null);
        btn_submenu4_menu3.setBorder(null);
        
        btn_menu.setBorder(null);
        
        //ASIGNAMOS COLOR-HOVER A LOS MENUS
        this.colorHoverMenus(btn_menu1);
        this.colorHoverMenus(btn_menu2);
        this.colorHoverMenus(btn_menu3);
        
        
        //ASIGNAMOS COLOR-HOVER A LOS SUBMENUS
        //MENU 1
        this.colorHoverSubMenus(btn_submenu1_menu1);
        this.colorHoverSubMenus(btn_submenu2_menu1);
        this.colorHoverSubMenus(btn_submenu3_menu1);
        this.colorHoverSubMenus(btn_submenu4_menu1);
        //MENU 2
        this.colorHoverSubMenus(btn_submenu1_menu2);
        this.colorHoverSubMenus(btn_submenu2_menu2);
        this.colorHoverSubMenus(btn_submenu3_menu2);
        this.colorHoverSubMenus(btn_submenu4_menu2);
        //MENU 3
        this.colorHoverSubMenus(btn_submenu1_menu3);
        this.colorHoverSubMenus(btn_submenu2_menu3);
        this.colorHoverSubMenus(btn_submenu3_menu3);
        this.colorHoverSubMenus(btn_submenu4_menu3);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        panel_contenedor = new javax.swing.JPanel();
        btn_menu1 = new javax.swing.JButton();
        panel_submenu_menu1 = new javax.swing.JPanel();
        btn_submenu1_menu1 = new javax.swing.JButton();
        btn_submenu2_menu1 = new javax.swing.JButton();
        btn_submenu3_menu1 = new javax.swing.JButton();
        btn_submenu4_menu1 = new javax.swing.JButton();
        btn_menu2 = new javax.swing.JButton();
        panel_submenu_menu2 = new javax.swing.JPanel();
        btn_submenu1_menu2 = new javax.swing.JButton();
        btn_submenu2_menu2 = new javax.swing.JButton();
        btn_submenu3_menu2 = new javax.swing.JButton();
        btn_submenu4_menu2 = new javax.swing.JButton();
        btn_menu3 = new javax.swing.JButton();
        panel_submenu_menu3 = new javax.swing.JPanel();
        btn_submenu1_menu3 = new javax.swing.JButton();
        btn_submenu2_menu3 = new javax.swing.JButton();
        btn_submenu3_menu3 = new javax.swing.JButton();
        btn_submenu4_menu3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        panel_contenedor.setBackground(new java.awt.Color(51, 51, 51));

        btn_menu1.setBackground(new java.awt.Color(204, 204, 204));
        btn_menu1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        btn_menu1.setForeground(new java.awt.Color(0, 0, 0));
        btn_menu1.setText("Menu 1");
        btn_menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_menu1.setFocusPainted(false);
        btn_menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu1ActionPerformed(evt);
            }
        });

        panel_submenu_menu1.setBackground(new java.awt.Color(255, 255, 255));

        btn_submenu1_menu1.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu1_menu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu1_menu1.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu1_menu1.setText("Submenu 1");
        btn_submenu1_menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu1_menu1.setFocusPainted(false);
        btn_submenu1_menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu1_menu1ActionPerformed(evt);
            }
        });

        btn_submenu2_menu1.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu2_menu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu2_menu1.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu2_menu1.setText("Submenu 2");
        btn_submenu2_menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu2_menu1.setFocusPainted(false);
        btn_submenu2_menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu2_menu1ActionPerformed(evt);
            }
        });

        btn_submenu3_menu1.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu3_menu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu3_menu1.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu3_menu1.setText("Submenu 3");
        btn_submenu3_menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu3_menu1.setFocusPainted(false);
        btn_submenu3_menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu3_menu1ActionPerformed(evt);
            }
        });

        btn_submenu4_menu1.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu4_menu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu4_menu1.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu4_menu1.setText("Submenu 4");
        btn_submenu4_menu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu4_menu1.setFocusPainted(false);
        btn_submenu4_menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu4_menu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_submenu_menu1Layout = new javax.swing.GroupLayout(panel_submenu_menu1);
        panel_submenu_menu1.setLayout(panel_submenu_menu1Layout);
        panel_submenu_menu1Layout.setHorizontalGroup(
            panel_submenu_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_submenu_menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_submenu_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_submenu4_menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_submenu3_menu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_submenu2_menu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_submenu1_menu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_submenu_menu1Layout.setVerticalGroup(
            panel_submenu_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_submenu_menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_submenu1_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_submenu2_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_submenu3_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_submenu4_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_menu2.setBackground(new java.awt.Color(204, 204, 204));
        btn_menu2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        btn_menu2.setForeground(new java.awt.Color(0, 0, 0));
        btn_menu2.setText("Menu 2");
        btn_menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_menu2.setFocusPainted(false);
        btn_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu2ActionPerformed(evt);
            }
        });

        panel_submenu_menu2.setBackground(new java.awt.Color(255, 255, 255));

        btn_submenu1_menu2.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu1_menu2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu1_menu2.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu1_menu2.setText("Submenu 1");
        btn_submenu1_menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu1_menu2.setFocusPainted(false);
        btn_submenu1_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu1_menu2ActionPerformed(evt);
            }
        });

        btn_submenu2_menu2.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu2_menu2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu2_menu2.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu2_menu2.setText("Submenu 2");
        btn_submenu2_menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu2_menu2.setFocusPainted(false);
        btn_submenu2_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu2_menu2ActionPerformed(evt);
            }
        });

        btn_submenu3_menu2.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu3_menu2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu3_menu2.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu3_menu2.setText("Submenu 3");
        btn_submenu3_menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu3_menu2.setFocusPainted(false);
        btn_submenu3_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu3_menu2ActionPerformed(evt);
            }
        });

        btn_submenu4_menu2.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu4_menu2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu4_menu2.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu4_menu2.setText("Submenu 4");
        btn_submenu4_menu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu4_menu2.setFocusPainted(false);
        btn_submenu4_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu4_menu2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_submenu_menu2Layout = new javax.swing.GroupLayout(panel_submenu_menu2);
        panel_submenu_menu2.setLayout(panel_submenu_menu2Layout);
        panel_submenu_menu2Layout.setHorizontalGroup(
            panel_submenu_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_submenu_menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_submenu_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_submenu4_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_submenu3_menu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_submenu2_menu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_submenu1_menu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_submenu_menu2Layout.setVerticalGroup(
            panel_submenu_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_submenu_menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_submenu1_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_submenu2_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_submenu3_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_submenu4_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_menu3.setBackground(new java.awt.Color(204, 204, 204));
        btn_menu3.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        btn_menu3.setForeground(new java.awt.Color(0, 0, 0));
        btn_menu3.setText("Menu 3");
        btn_menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_menu3.setFocusPainted(false);
        btn_menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu3ActionPerformed(evt);
            }
        });

        panel_submenu_menu3.setBackground(new java.awt.Color(255, 255, 255));

        btn_submenu1_menu3.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu1_menu3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu1_menu3.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu1_menu3.setText("Submenu 1");
        btn_submenu1_menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu1_menu3.setFocusPainted(false);
        btn_submenu1_menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu1_menu3ActionPerformed(evt);
            }
        });

        btn_submenu2_menu3.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu2_menu3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu2_menu3.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu2_menu3.setText("Submenu 2");
        btn_submenu2_menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu2_menu3.setFocusPainted(false);
        btn_submenu2_menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu2_menu3ActionPerformed(evt);
            }
        });

        btn_submenu3_menu3.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu3_menu3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu3_menu3.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu3_menu3.setText("Submenu 3");
        btn_submenu3_menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu3_menu3.setFocusPainted(false);
        btn_submenu3_menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu3_menu3ActionPerformed(evt);
            }
        });

        btn_submenu4_menu3.setBackground(new java.awt.Color(102, 102, 102));
        btn_submenu4_menu3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_submenu4_menu3.setForeground(new java.awt.Color(255, 255, 255));
        btn_submenu4_menu3.setText("Submenu 4");
        btn_submenu4_menu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_submenu4_menu3.setFocusPainted(false);
        btn_submenu4_menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submenu4_menu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_submenu_menu3Layout = new javax.swing.GroupLayout(panel_submenu_menu3);
        panel_submenu_menu3.setLayout(panel_submenu_menu3Layout);
        panel_submenu_menu3Layout.setHorizontalGroup(
            panel_submenu_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_submenu_menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_submenu_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_submenu4_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_submenu3_menu3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_submenu2_menu3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_submenu1_menu3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_submenu_menu3Layout.setVerticalGroup(
            panel_submenu_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_submenu_menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_submenu1_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_submenu2_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_submenu3_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_submenu4_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_contenedorLayout = new javax.swing.GroupLayout(panel_contenedor);
        panel_contenedor.setLayout(panel_contenedorLayout);
        panel_contenedorLayout.setHorizontalGroup(
            panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(panel_submenu_menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(panel_submenu_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(panel_submenu_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(385, 385, 385))
        );
        panel_contenedorLayout.setVerticalGroup(
            panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contenedorLayout.createSequentialGroup()
                        .addComponent(btn_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_submenu_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_contenedorLayout.createSequentialGroup()
                        .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_submenu_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_submenu_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(296, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btn_menu.setBackground(new java.awt.Color(153, 153, 153));
        btn_menu.setForeground(new java.awt.Color(60, 63, 65));
        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono-Menu.png"))); // NOI18N
        btn_menu.setBorder(null);
        btn_menu.setBorderPainted(false);
        btn_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_menu.setFocusPainted(false);
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscador:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btn_menu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_menu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu1ActionPerformed
        panel_submenu_menu2.setVisible(false);
        panel_submenu_menu3.setVisible(false);
        this.mostrarSubMenus(btn_submenu1_menu1, panel_submenu_menu1);
    }//GEN-LAST:event_btn_menu1ActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        if (btn_menu1.isShowing() == true) {
            btn_menu1.setVisible(false);
            btn_menu2.setVisible(false);
            btn_menu3.setVisible(false);
            panel_submenu_menu1.setVisible(false);
            panel_submenu_menu2.setVisible(false);
            panel_submenu_menu3.setVisible(false);
        }else if (btn_menu1.isShowing() == false) {
            btn_menu1.setVisible(true);
            btn_menu2.setVisible(true);
            btn_menu3.setVisible(true);
            panel_submenu_menu1.setVisible(false);
            panel_submenu_menu2.setVisible(false);
            panel_submenu_menu3.setVisible(false);
        }
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu2ActionPerformed
        panel_submenu_menu1.setVisible(false);
        panel_submenu_menu3.setVisible(false);
        this.mostrarSubMenus(btn_submenu1_menu2, panel_submenu_menu2);
    }//GEN-LAST:event_btn_menu2ActionPerformed

    private void btn_submenu1_menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu1_menu1ActionPerformed
        this.mostrarPaneles(submenu2menu1, submenu4menu1, submenu3menu1, submenu1menu2,
                submenu3menu2, submenu4menu2, submenu2menu2, submenu1menu1);
    }//GEN-LAST:event_btn_submenu1_menu1ActionPerformed

    private void btn_submenu2_menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu2_menu1ActionPerformed
        this.mostrarPaneles(submenu1menu1, submenu3menu1, submenu4menu1, submenu1menu2,
                submenu3menu2, submenu4menu2, submenu2menu2, submenu2menu1);
    }//GEN-LAST:event_btn_submenu2_menu1ActionPerformed

    private void btn_submenu3_menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu3_menu1ActionPerformed
        this.mostrarPaneles(submenu1menu1, submenu2menu1, submenu4menu1, submenu1menu2,
                submenu3menu2, submenu4menu2, submenu2menu2, submenu3menu1);
    }//GEN-LAST:event_btn_submenu3_menu1ActionPerformed

    private void btn_submenu4_menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu4_menu1ActionPerformed
        this.mostrarPaneles(submenu1menu1, submenu2menu1, submenu3menu1, submenu1menu2,
                submenu3menu2, submenu4menu2, submenu2menu2, submenu4menu1);
    }//GEN-LAST:event_btn_submenu4_menu1ActionPerformed

    private void btn_submenu1_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu1_menu2ActionPerformed
        this.mostrarPaneles(submenu1menu1, submenu2menu1, submenu3menu1, submenu4menu1,
                submenu3menu2, submenu4menu2, submenu2menu2, submenu1menu2);
    }//GEN-LAST:event_btn_submenu1_menu2ActionPerformed

    private void btn_submenu2_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu2_menu2ActionPerformed
        this.mostrarPaneles(submenu1menu1, submenu2menu1, submenu3menu1, submenu4menu1,
                submenu3menu2, submenu4menu2, submenu1menu2, submenu2menu2);
    }//GEN-LAST:event_btn_submenu2_menu2ActionPerformed

    private void btn_submenu3_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu3_menu2ActionPerformed
        this.mostrarPaneles(submenu1menu1, submenu2menu1, submenu3menu1, submenu4menu1,
                submenu2menu2, submenu4menu2, submenu1menu2, submenu3menu2);
    }//GEN-LAST:event_btn_submenu3_menu2ActionPerformed

    private void btn_submenu4_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu4_menu2ActionPerformed
        this.mostrarPaneles(submenu1menu1, submenu2menu1, submenu3menu1, submenu4menu1,
                submenu3menu2, submenu2menu2, submenu1menu2, submenu4menu2);
    }//GEN-LAST:event_btn_submenu4_menu2ActionPerformed

    private void btn_menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu3ActionPerformed
        panel_submenu_menu2.setVisible(false);
        panel_submenu_menu1.setVisible(false);
        this.mostrarSubMenus(btn_submenu1_menu3, panel_submenu_menu3);
    }//GEN-LAST:event_btn_menu3ActionPerformed

    private void btn_submenu1_menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu1_menu3ActionPerformed
        //NO A SIDO CREADO
    }//GEN-LAST:event_btn_submenu1_menu3ActionPerformed

    private void btn_submenu2_menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu2_menu3ActionPerformed
        //NO A SIDO CREADO
    }//GEN-LAST:event_btn_submenu2_menu3ActionPerformed

    private void btn_submenu3_menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu3_menu3ActionPerformed
        //NO A SIDO CREADO
    }//GEN-LAST:event_btn_submenu3_menu3ActionPerformed

    private void btn_submenu4_menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submenu4_menu3ActionPerformed
        //NO A SIDO CREADO
    }//GEN-LAST:event_btn_submenu4_menu3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_menu1;
    private javax.swing.JButton btn_menu2;
    private javax.swing.JButton btn_menu3;
    private javax.swing.JButton btn_submenu1_menu1;
    private javax.swing.JButton btn_submenu1_menu2;
    private javax.swing.JButton btn_submenu1_menu3;
    private javax.swing.JButton btn_submenu2_menu1;
    private javax.swing.JButton btn_submenu2_menu2;
    private javax.swing.JButton btn_submenu2_menu3;
    private javax.swing.JButton btn_submenu3_menu1;
    private javax.swing.JButton btn_submenu3_menu2;
    private javax.swing.JButton btn_submenu3_menu3;
    private javax.swing.JButton btn_submenu4_menu1;
    private javax.swing.JButton btn_submenu4_menu2;
    private javax.swing.JButton btn_submenu4_menu3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_contenedor;
    private javax.swing.JPanel panel_submenu_menu1;
    private javax.swing.JPanel panel_submenu_menu2;
    private javax.swing.JPanel panel_submenu_menu3;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
