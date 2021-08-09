/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventure.game;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Borge
 */
public class Adventure extends javax.swing.JFrame {

    /**
     * Creates new form Adventure
     */
    public Adventure() {
        initComponents();
        }
    
        ArrayList<Heroe> h1 = new ArrayList<>();
        ArrayList<Enemigo> E1 = new ArrayList<>();
        ArrayList<ObjetosMuebles> M1 = new ArrayList<>();
        ArrayList<ObjetosInmuebles> I1 = new ArrayList<>();
    
    public void Guardar(){
        if(txtAtaque.getText().isEmpty()||txtVida.getText().isEmpty()
           ||txtEnergia.getText().isEmpty()||txtNombre.getText().isEmpty()
           ||txtCoordXP.getText().isEmpty()||txtCoordYP.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Completa los campos");
            }else if(Integer.parseInt(txtAtaque.getText())<0||Integer.parseInt(txtVida.getText())<0
            ||Integer.parseInt(txtEnergia.getText())<0||txtNombre.getText().isEmpty()
            ||txtCoordXP.getText().isEmpty()||txtCoordYP.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Completa los Campos con Numeros Enteros");
            
            }else{
            Heroe heroe = new Heroe();
            heroe.setAtaque(Integer.parseInt(txtAtaque.getText()));
            heroe.setVida(Integer.parseInt(txtVida.getText()));
            heroe.setEnergia(Integer.parseInt(txtEnergia.getText()));
            heroe.setNombre(txtNombre.getText());
            heroe.setCoordenadaX(txtCoordXP.getText());
            heroe.setCoordenadaY(txtCoordYP.getText());
       
            JOptionPane.showMessageDialog(this,"Heroe Creado");
            txtAtaque.setText("");txtVida.setText("");txtEnergia.setText("");
            txtNombre.setText("");txtCoordXP.setText("");txtCoordYP.setText("");
            h1.add(heroe);
        }
    }
    
  public void GuardarEnemigo(){
      if(txtAtaque.getText().isEmpty()||txtVida.getText().isEmpty()
           ||txtEnergia.getText().isEmpty()||txtNombre.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Completa los campos")
                   ;
            }else if(Integer.parseInt(txtAtaque.getText())<0||Integer.parseInt(txtVida.getText())<0
            ||Integer.parseInt(txtEnergia.getText())<0||txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Completa los Campos con Numeros Enteros");
            
            }else{
            Enemigo enemigo = new Enemigo();
            enemigo.setAtaque(Integer.parseInt(txtAtaque.getText()));
            enemigo.setVida(Integer.parseInt(txtVida.getText()));
            enemigo.setEnergia(Integer.parseInt(txtEnergia.getText()));
            enemigo.setNombre(txtNombre.getText());
       
            JOptionPane.showMessageDialog(this,"Enemigo Creado");
            txtAtaque.setText("");txtVida.setText("");
            txtEnergia.setText("");txtNombre.setText("");
           E1.add(enemigo);
        }
  
  }
  
  public void objetosMuebles(){
  if(txtCooordX.getText().isEmpty()||txtCoordY.getText().isEmpty()
           ||txtNombreObj.getText().isEmpty()||txtEnergiaObj.getText().isEmpty()
           ||txtPotenciador.getText().isEmpty()||txtDanno.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Completa los campos");
           
            }else if(Integer.parseInt(txtDanno.getText())<0||Integer.parseInt(txtPotenciador.getText())<0
            ||Integer.parseInt(txtEnergiaObj.getText())<0||txtNombreObj.getText().isEmpty()
            ||txtCooordX.getText().isEmpty()||txtCoordY.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Completa los Campos con Numeros Enteros");
            
            }else{
            ObjetosMuebles mueble = new ObjetosMuebles();
            mueble.setCoordenadaX(txtCooordX.getText());
            mueble.setCoordenadaY(txtCoordY.getText());
            mueble.setNombre(txtNombreObj.getText());
            mueble.setDanno(Integer.parseInt(txtDanno.getText()));
            mueble.setEnergia(Integer.parseInt(txtEnergiaObj.getText()));
            mueble.setPotenciador(Integer.parseInt(txtPotenciador.getText()));
            
            JOptionPane.showMessageDialog(this," Mueble Creado");
            txtCooordX.setText("");txtCoordY.setText("");
            txtNombreObj.setText("");txtDanno.setText("");
            txtEnergiaObj.setText(""); txtPotenciador.setText("");
            M1.add(mueble);
        }
  }
  
  public void objetosInmuebles(){
  if(txtCooordX.getText().isEmpty()||txtCoordY.getText().isEmpty()
           ||txtNombreObj.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Completa los campos");
           
            }else{
            ObjetosInmuebles inmueble = new ObjetosInmuebles();
            inmueble.setCoordenadaX(txtCooordX.getText());
            inmueble.setCoordenadaY(txtCoordY.getText());
            inmueble.setNombre(txtNombreObj.getText());
            
            JOptionPane.showMessageDialog(this," Inmueble Creado");
            txtCooordX.setText("");txtCoordY.setText("");txtNombreObj.setText("");
            I1.add(inmueble);
        }
  }

  public void Elementos(){
          String matrizH1 [][] = new String[h1.size()][5];
          String matrizE1 [][] = new String [E1.size()][5];
          String matrizM1 [][] = new String [M1.size()][7];
          String matrizI1 [][] = new String [I1.size()][4];
          
   if(  !h1.isEmpty() && !E1.isEmpty() && !M1.isEmpty() && !I1.isEmpty()){
     tbHeroes.setModel(new javax.swing.table.DefaultTableModel(
              matrizH1,
               new String [] {
                   "No.:", "Nombre", "Energia", "Vida", "Ataque"
               }
       ));
    tbEnemigos.setModel(new javax.swing.table.DefaultTableModel(
              matrizE1,
               new String [] {
                   "No.:", "Nombre", "Energia", "Vida", "Ataque"
               }
       ));
    tbMuebles.setModel(new javax.swing.table.DefaultTableModel(
              matrizM1,
               new String [] {
                   "No.:", "Nombre", "Coordenada X", "Coordenada Y", "Daño", "Energia", "Potenciador"
               }
       ));
    tbInmuebles.setModel(new javax.swing.table.DefaultTableModel(
              matrizI1,
               new String [] {
                   "No.:", "Nombre", "Coordenada X", "Coordenada Y"
               }
       ));
         
   }else{
       for(int i=0; i<h1.size(); i++){
           matrizH1[i][0] =Integer.toString(i+1);
           matrizH1[i][1] = h1.get(i).getNombre();
           matrizH1[i][2] = Integer.toString(h1.get(i).getEnergia());
           matrizH1[i][3] = Integer.toString(h1.get(i).getVida());
           matrizH1[i][4] = Integer.toString(h1.get(i).getAtaque());
          }
          
          tbHeroes.setModel(new javax.swing.table.DefaultTableModel(
              matrizH1,
               new String [] {
                   "No.:", "Nombre", "Energia", "Vida", "Ataque"
               }
       ));
          
          for(int j=0; j<E1.size(); j++){
          matrizE1[j][0] = Integer.toString(j+1);
          matrizE1[j][1] = E1.get(j).getNombre();
          matrizE1[j][2] = Integer.toString(E1.get(j).getEnergia());
          matrizE1[j][3] = Integer.toString(E1.get(j).getVida());
          matrizE1[j][4] = Integer.toString(E1.get(j).getAtaque());
          }
          
          tbEnemigos.setModel(new javax.swing.table.DefaultTableModel(
              matrizE1,
               new String [] {
                   "No.:", "Nombre", "Energia", "Vida", "Ataque"
               }
       ));
          
          for(int x = 0; x<M1.size(); x++){
          matrizM1[x][0] = Integer.toString(x+1);
          matrizM1[x][1] = M1.get(x).getNombre();
          matrizM1[x][2] = M1.get(x).getCoordenadaX();
          matrizM1[x][3] = M1.get(x).getCoordenadaY();
          matrizM1[x][4] = Integer.toString(M1.get(x).getDanno());
          matrizM1[x][5] = Integer.toString(M1.get(x).getEnergia());
          matrizM1[x][6] = Integer.toString(M1.get(x).getPotenciador());
          }
          
          tbMuebles.setModel(new javax.swing.table.DefaultTableModel(
              matrizM1,
               new String [] {
                   "No.:", "Nombre", "Coordenada X", "Coordenada Y", "Daño", "Energia", "Potenciador"
               }
       ));
          
          for(int y = 0; y<I1.size(); y++){
          matrizI1[y][0] = Integer.toString(y);
          matrizI1[y][1] = I1.get(y).getNombre();
          matrizI1[y][2] = I1.get(y).getCoordenadaX();
          matrizI1[y][3] = I1.get(y).getCoordenadaY();
          }
          
           tbInmuebles.setModel(new javax.swing.table.DefaultTableModel(
              matrizI1,
               new String [] {
                   "No.:", "Nombre", "Coordenada X", "Coordenada Y"
               }
       ));   
   }  
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtEnergia = new javax.swing.JTextField();
        txtVida = new javax.swing.JTextField();
        txtAtaque = new javax.swing.JTextField();
        txtCooordX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCoordY = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNombreObj = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEnergiaObj = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPotenciador = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDanno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHeroes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEnemigos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbMuebles = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbInmuebles = new javax.swing.JTable();
        txtCoordXP = new javax.swing.JTextField();
        lbCoordX = new javax.swing.JLabel();
        txtCoordXP1 = new javax.swing.JLabel();
        txtCoordYP = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADVENTURE GAME");

        jLabel2.setText("Objetos Moviles");

        jLabel3.setText("Heroes Y Enemigos");

        jLabel5.setText("Objetos Inmoviles");

        jLabel6.setText("Nombre");

        jLabel7.setText("Energia");

        jLabel8.setText("Vida");

        jLabel9.setText("Ataque");

        jButton1.setText("Crear Heroe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Crear Enemingo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtaqueActionPerformed(evt);
            }
        });

        txtCooordX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCooordXActionPerformed(evt);
            }
        });

        jLabel4.setText("Coordenadas X");

        jLabel10.setText("Coordenadas Y");

        jButton3.setText("Crear Objeto Inmovil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Crear Objeto Movil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel11.setText("Nombre");

        jLabel12.setText("Energia");

        jLabel13.setText("Potenciador");

        jLabel14.setText("Danno");

        tbHeroes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbHeroes);

        tbEnemigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbEnemigos);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        tbMuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tbMuebles);

        tbInmuebles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tbInmuebles);

        lbCoordX.setText("Coordenada X");

        txtCoordXP1.setText("Coordenada Y ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(182, 182, 182))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(7, 7, 7)
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(txtCoordXP1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtCoordYP)))
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lbCoordX)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtCoordXP))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtAtaque))))))
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCooordX)
                                        .addComponent(txtCoordY)
                                        .addComponent(txtNombreObj, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEnergiaObj))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDanno))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPotenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCoordXP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCoordX))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCoordYP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCoordXP1))
                                .addGap(12, 12, 12))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCooordX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtEnergiaObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCoordY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtPotenciador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtNombreObj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtDanno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtaqueActionPerformed

    private void txtCooordXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCooordXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCooordXActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Guardar();
    Elementos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    GuardarEnemigo();
    Elementos();
   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    objetosInmuebles();
    Elementos(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    objetosMuebles();
    Elementos();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adventure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbCoordX;
    private javax.swing.JTable tbEnemigos;
    private javax.swing.JTable tbHeroes;
    private javax.swing.JTable tbInmuebles;
    private javax.swing.JTable tbMuebles;
    private javax.swing.JTextField txtAtaque;
    private javax.swing.JTextField txtCooordX;
    private javax.swing.JTextField txtCoordXP;
    private javax.swing.JLabel txtCoordXP1;
    private javax.swing.JTextField txtCoordY;
    private javax.swing.JTextField txtCoordYP;
    private javax.swing.JTextField txtDanno;
    private javax.swing.JTextField txtEnergia;
    private javax.swing.JTextField txtEnergiaObj;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreObj;
    private javax.swing.JTextField txtPotenciador;
    private javax.swing.JTextField txtVida;
    // End of variables declaration//GEN-END:variables
}
