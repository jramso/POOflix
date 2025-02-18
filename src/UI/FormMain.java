/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import CDU.CDUMain;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.Console;
import javax.swing.ImageIcon;

/**
 *
 * @author josue
 */
public class FormMain extends javax.swing.JFrame implements Form {

    private CDUMain cdumain;
    private String op = "";

    public CDUMain getCdumain() {
        return cdumain;
    }

    public void setcdu(CDUMain cdu) {
        this.cdumain = cdu;
    }

    public void exibe() {

        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" try catch do Jframe ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormMain().setVisible(true);
        });

        // String opcao;
        // Console c = System.console();
        // boolean termina = false;

        System.out.println("POOFlix\n");

        // while (!termina) {
        // System.out.println("1. Cadastrar Série\n");
        // System.out.println("2. Cadastrar Episódio\n");
        // System.out.println("3. Cadastrar Personagem\n");
        // System.out.println("4. Cadastrar Ator\n");
        // System.out.println("5. Sair\n");

        // opcao = (String) c.readLine("Digite a opção desejada: ");
        // System.out.println(opcao);

        // termina = opcao.equals("5");

        // if (!termina) {
        // cdumain.processaOpcao(opcao);
        // telaCadastro.setVisible(false);
        // }
        // }
    }

    /**
     * Creates new form formMainTela
     */
    public FormMain() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        cadastra.setVisible(false);
        cdumain = new CDUMain(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_bemVindo = new javax.swing.JLabel();
        btn_red_icon = new javax.swing.JButton();
        btn_green_icon = new javax.swing.JButton();
        btn_yellow_icon = new javax.swing.JButton();
        cadastra = new java.awt.Panel();
        cadSerie = new javax.swing.JButton();
        cadEp = new javax.swing.JButton();
        cadPerson = new javax.swing.JButton();
        cadAtor = new javax.swing.JButton();
        cadPerfo = new javax.swing.JButton();
        sairCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POOFlix");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(950, 650));
        setName("Tela_FormMain"); // NOI18N
        setPreferredSize(new java.awt.Dimension(950, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_bemVindo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        LB_bemVindo.setForeground(new java.awt.Color(255, 0, 51));
        LB_bemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LB_bemVindo.setText("POOflix");
        getContentPane().add(LB_bemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        btn_red_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/img/red_icon.png"))); // NOI18N
        btn_red_icon.setBorderPainted(false);
        btn_red_icon.setDoubleBuffered(true);
        btn_red_icon.setMaximumSize(new java.awt.Dimension(50, 50));
        btn_red_icon.setMinimumSize(new java.awt.Dimension(50, 50));
        btn_red_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_red_iconMouseClicked(evt);
            }
        });
        btn_red_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_red_iconActionPerformed(evt);
            }
        });
        getContentPane().add(btn_red_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 150, 150));

        btn_green_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/img/green_icon.png"))); // NOI18N
        btn_green_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_green_iconMouseClicked(evt);
            }
        });
        btn_green_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_green_iconActionPerformed(evt);
            }
        });
        getContentPane().add(btn_green_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 150, 150));

        btn_yellow_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/img/yellow_icon.png"))); // NOI18N
        btn_yellow_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_yellow_iconMouseClicked(evt);
            }
        });
        btn_yellow_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yellow_iconActionPerformed(evt);
            }
        });
        getContentPane().add(btn_yellow_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 150, 150));

        cadastra.setBackground(new java.awt.Color(0, 0, 0));

        cadSerie.setBackground(new java.awt.Color(153, 153, 153));
        cadSerie.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cadSerie.setForeground(new java.awt.Color(255, 255, 255));
        cadSerie.setText("1. Cadastrar Série");
        cadSerie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cadSerie.setContentAreaFilled(false);
        cadSerie.setFocusPainted(false);
        cadSerie.setFocusable(false);
        cadSerie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadSerieMouseClicked(evt);
            }
        });
        cadSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadSerieActionPerformed(evt);
            }
        });

        cadEp.setBackground(new java.awt.Color(153, 153, 153));
        cadEp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cadEp.setForeground(new java.awt.Color(255, 255, 255));
        cadEp.setText("2. Cadastrar Episódio");
        cadEp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cadEp.setContentAreaFilled(false);
        cadEp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadEpMouseClicked(evt);
            }
        });
        cadEp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadEpActionPerformed(evt);
            }
        });

        cadPerson.setBackground(new java.awt.Color(153, 153, 153));
        cadPerson.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cadPerson.setForeground(new java.awt.Color(255, 255, 255));
        cadPerson.setText("3. Cadastrar Personagem");
        cadPerson.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cadPerson.setContentAreaFilled(false);
        cadPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPersonActionPerformed(evt);
            }
        });

        cadAtor.setBackground(new java.awt.Color(153, 153, 153));
        cadAtor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cadAtor.setForeground(new java.awt.Color(255, 255, 255));
        cadAtor.setText("4. Cadastrar Ator");
        cadAtor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cadAtor.setContentAreaFilled(false);
        cadAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadAtorActionPerformed(evt);
            }
        });

        cadPerfo.setBackground(new java.awt.Color(153, 153, 153));
        cadPerfo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cadPerfo.setForeground(new java.awt.Color(255, 255, 255));
        cadPerfo.setText("5. Cadastrar Performance");
        cadPerfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cadPerfo.setContentAreaFilled(false);
        cadPerfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadPerfoActionPerformed(evt);
            }
        });

        sairCad.setBackground(new java.awt.Color(153, 153, 153));
        sairCad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sairCad.setForeground(new java.awt.Color(255, 255, 255));
        sairCad.setText("6. Sair");
        sairCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        sairCad.setContentAreaFilled(false);
        sairCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastraLayout = new javax.swing.GroupLayout(cadastra);
        cadastra.setLayout(cadastraLayout);
        cadastraLayout.setHorizontalGroup(
                cadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastraLayout.createSequentialGroup()
                                .addContainerGap(107, Short.MAX_VALUE)
                                .addGroup(cadastraLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(cadastraLayout.createSequentialGroup()
                                                .addGroup(cadastraLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(cadSerie, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cadPerson))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(cadastraLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cadEp, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cadAtor, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(cadastraLayout.createSequentialGroup()
                                                .addGap(101, 101, 101)
                                                .addComponent(sairCad, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(101, 101, 101))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastraLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cadPerfo, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        cadastraLayout.setVerticalGroup(
                cadastraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastraLayout.createSequentialGroup()
                                .addContainerGap(27, Short.MAX_VALUE)
                                .addGroup(cadastraLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cadSerie, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cadEp, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(cadastraLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cadPerson, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cadAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(cadPerfo, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sairCad, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)));

        getContentPane().add(cadastra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 600, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    protected void cadAtorActionPerformed(ActionEvent evt) {
        op = "4";
        cdumain.processaOpcao(op);
    }

    protected void cadPersonActionPerformed(ActionEvent evt) {
        op = "3";
        cdumain.processaOpcao(op);
    }

    protected void cadSerieActionPerformed(ActionEvent evt) {
        // cadSerieMouseClicked(null);
    }

    protected void cadEpActionPerformed(ActionEvent evt) {
        // cadEpMouseClicked(null);
    }

    protected void cadPerfoActionPerformed(ActionEvent evt) {
        op = "5";
        cdumain.processaOpcao(op);
    }

    protected void sairCadActionPerformed(ActionEvent evt) {
        op = "6";
        cdumain.processaOpcao(op);
    }

    private void cadEpMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cadEp1MouseClicked
        op = "2";
        cdumain.processaOpcao(op);

    }

    private void btn_yellow_iconMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_yellow_iconMouseClicked
        btn_red_iconMouseClicked(evt);
    }

    private void cadSerieMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_cadSerieMouseClicked
        op = "1";
        cdumain.processaOpcao(op);
    }

    private void btn_yellow_iconActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_yellow_iconActionPerformed
        btn_yellow_iconMouseClicked(null);
    }

    private void btn_red_iconActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_red_iconActionPerformed
        btn_red_iconMouseClicked(null);
    }

    private void btn_green_iconActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_green_iconActionPerformed
        btn_green_iconMouseClicked(null);
    }

    private void btn_red_iconMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_red_iconMouseClicked
        btn_red_icon.setVisible(false);
        btn_green_icon.setVisible(false);
        btn_yellow_icon.setVisible(false);
        cadastra.setVisible(true);

    }

    private void btn_green_iconMouseClicked(java.awt.event.MouseEvent evt) {
        btn_red_iconMouseClicked(evt);
    }

    public java.awt.Panel getCadastra() {
        return cadastra;
    }

    public javax.swing.JButton getBtn_green_icon() {
        return btn_green_icon;
    }

    public javax.swing.JButton getBtn_red_icon() {
        return btn_red_icon;
    }

    public javax.swing.JButton getBtn_yellow_icon() {
        return btn_yellow_icon;
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_bemVindo;
    private javax.swing.JButton btn_green_icon;
    private javax.swing.JButton btn_red_icon;
    private javax.swing.JButton btn_yellow_icon;
    private javax.swing.JButton cadAtor;
    private javax.swing.JButton cadEp;
    private javax.swing.JButton cadPerfo;
    private javax.swing.JButton cadPerson;
    private javax.swing.JButton cadSerie;
    private java.awt.Panel cadastra;
    private javax.swing.JButton sairCad;
    // End of variables declaration//GEN-END:variables

}
