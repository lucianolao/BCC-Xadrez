
package xadrez;

public class Tabuleiro extends javax.swing.JFrame
{
    private Casa casa[][] = new Casa[8][8];
    private boolean vezJogadorBranco; //false-> vez do jogador preto
    private boolean existeBotaoClicado; //botão que irá se movimentar
    private int linhaBotaoClicado;
    private int colunaBotaoClicado;
    private int reiBrancoLin;
    private int reiBrancoCol;
    private int reiPretoLin;
    private int reiPretoCol;


    public Tabuleiro()
    {
        initComponents();
        instanciandoMatriz();
        vezJogadorBranco = true;
        existeBotaoClicado = false;
        reiBrancoLin = 0;
        reiBrancoCol = 4;
        reiPretoLin = 7;
        reiPretoCol = 4;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton30 = new javax.swing.JToggleButton();
        jToggleButton31 = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jToggleButton37 = new javax.swing.JToggleButton();
        jToggleButton38 = new javax.swing.JToggleButton();
        jToggleButton39 = new javax.swing.JToggleButton();
        jToggleButton40 = new javax.swing.JToggleButton();
        jToggleButton41 = new javax.swing.JToggleButton();
        jToggleButton42 = new javax.swing.JToggleButton();
        jToggleButton43 = new javax.swing.JToggleButton();
        jToggleButton44 = new javax.swing.JToggleButton();
        jToggleButton45 = new javax.swing.JToggleButton();
        jToggleButton46 = new javax.swing.JToggleButton();
        jToggleButton47 = new javax.swing.JToggleButton();
        jToggleButton48 = new javax.swing.JToggleButton();
        jToggleButton49 = new javax.swing.JToggleButton();
        jToggleButton50 = new javax.swing.JToggleButton();
        jToggleButton51 = new javax.swing.JToggleButton();
        jToggleButton52 = new javax.swing.JToggleButton();
        jToggleButton53 = new javax.swing.JToggleButton();
        jToggleButton54 = new javax.swing.JToggleButton();
        jToggleButton55 = new javax.swing.JToggleButton();
        jToggleButton56 = new javax.swing.JToggleButton();
        jToggleButton57 = new javax.swing.JToggleButton();
        jToggleButton58 = new javax.swing.JToggleButton();
        jToggleButton59 = new javax.swing.JToggleButton();
        jToggleButton60 = new javax.swing.JToggleButton();
        jToggleButton61 = new javax.swing.JToggleButton();
        jToggleButton62 = new javax.swing.JToggleButton();
        jToggleButton63 = new javax.swing.JToggleButton();
        jToggleButton64 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/torre branco casa preta.png"))); // NOI18N
        jToggleButton1.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/cavalo branco casa branca.png"))); // NOI18N
        jToggleButton2.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/bispo branco casa preta.png"))); // NOI18N
        jToggleButton3.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/rainha branco casa branca.png"))); // NOI18N
        jToggleButton4.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/rei branco casa preta.png"))); // NOI18N
        jToggleButton5.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/bispo branco casa branca.png"))); // NOI18N
        jToggleButton6.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/cavalo branco casa preta.png"))); // NOI18N
        jToggleButton7.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/torre branco casa branca.png"))); // NOI18N
        jToggleButton8.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão branco casa branca.png"))); // NOI18N
        jToggleButton9.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão branco casa preta.png"))); // NOI18N
        jToggleButton10.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão branco casa branca.png"))); // NOI18N
        jToggleButton11.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão branco casa preta.png"))); // NOI18N
        jToggleButton12.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão branco casa branca.png"))); // NOI18N
        jToggleButton13.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });

        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão branco casa preta.png"))); // NOI18N
        jToggleButton14.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão branco casa branca.png"))); // NOI18N
        jToggleButton15.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão branco casa preta.png"))); // NOI18N
        jToggleButton16.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        jToggleButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton17.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });

        jToggleButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton18.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jToggleButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton19.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton19ActionPerformed(evt);
            }
        });

        jToggleButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton20.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton20ActionPerformed(evt);
            }
        });

        jToggleButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton21.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton21ActionPerformed(evt);
            }
        });

        jToggleButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton22.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton22ActionPerformed(evt);
            }
        });

        jToggleButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton23.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton23ActionPerformed(evt);
            }
        });

        jToggleButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton24.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton24ActionPerformed(evt);
            }
        });

        jToggleButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton25.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton25ActionPerformed(evt);
            }
        });

        jToggleButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton26.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton26ActionPerformed(evt);
            }
        });

        jToggleButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton27.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton27ActionPerformed(evt);
            }
        });

        jToggleButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton28.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton28ActionPerformed(evt);
            }
        });

        jToggleButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton29.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton29ActionPerformed(evt);
            }
        });

        jToggleButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton30.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton30ActionPerformed(evt);
            }
        });

        jToggleButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton31.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton31ActionPerformed(evt);
            }
        });

        jToggleButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton32.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton32ActionPerformed(evt);
            }
        });

        jToggleButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton33.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton33ActionPerformed(evt);
            }
        });

        jToggleButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton34.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton34ActionPerformed(evt);
            }
        });

        jToggleButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton35.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton35ActionPerformed(evt);
            }
        });

        jToggleButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton36.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton36ActionPerformed(evt);
            }
        });

        jToggleButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton37.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton37ActionPerformed(evt);
            }
        });

        jToggleButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton38.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton38ActionPerformed(evt);
            }
        });

        jToggleButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton39.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton39ActionPerformed(evt);
            }
        });

        jToggleButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton40.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton40ActionPerformed(evt);
            }
        });

        jToggleButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton41.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton41ActionPerformed(evt);
            }
        });

        jToggleButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton42.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton42ActionPerformed(evt);
            }
        });

        jToggleButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton43.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton43ActionPerformed(evt);
            }
        });

        jToggleButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton44.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton44ActionPerformed(evt);
            }
        });

        jToggleButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton45.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton45ActionPerformed(evt);
            }
        });

        jToggleButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton46.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton46ActionPerformed(evt);
            }
        });

        jToggleButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado branca.png"))); // NOI18N
        jToggleButton47.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton47ActionPerformed(evt);
            }
        });

        jToggleButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado preta.png"))); // NOI18N
        jToggleButton48.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton48ActionPerformed(evt);
            }
        });

        jToggleButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão preto casa preta.png"))); // NOI18N
        jToggleButton49.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton49ActionPerformed(evt);
            }
        });

        jToggleButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão preto casa branca.png"))); // NOI18N
        jToggleButton50.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton50ActionPerformed(evt);
            }
        });

        jToggleButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão preto casa preta.png"))); // NOI18N
        jToggleButton51.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton51ActionPerformed(evt);
            }
        });

        jToggleButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão preto casa branca.png"))); // NOI18N
        jToggleButton52.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton52ActionPerformed(evt);
            }
        });

        jToggleButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão preto casa preta.png"))); // NOI18N
        jToggleButton53.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton53ActionPerformed(evt);
            }
        });

        jToggleButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão preto casa branca.png"))); // NOI18N
        jToggleButton54.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton54ActionPerformed(evt);
            }
        });

        jToggleButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão preto casa preta.png"))); // NOI18N
        jToggleButton55.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton55ActionPerformed(evt);
            }
        });

        jToggleButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/peão preto casa branca.png"))); // NOI18N
        jToggleButton56.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton56ActionPerformed(evt);
            }
        });

        jToggleButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/torre preto casa branca.png"))); // NOI18N
        jToggleButton57.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton57ActionPerformed(evt);
            }
        });

        jToggleButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/cavalo preto casa preta.png"))); // NOI18N
        jToggleButton58.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton58ActionPerformed(evt);
            }
        });

        jToggleButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/bispo preto casa branca.png"))); // NOI18N
        jToggleButton59.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton59ActionPerformed(evt);
            }
        });

        jToggleButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/rainha preto casa preta.png"))); // NOI18N
        jToggleButton60.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton60ActionPerformed(evt);
            }
        });

        jToggleButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/rei preto casa branca.png"))); // NOI18N
        jToggleButton61.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton61ActionPerformed(evt);
            }
        });

        jToggleButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/bispo preto casa preta.png"))); // NOI18N
        jToggleButton62.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton62ActionPerformed(evt);
            }
        });

        jToggleButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/cavalo preto casa branca.png"))); // NOI18N
        jToggleButton63.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton63ActionPerformed(evt);
            }
        });

        jToggleButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/torre preto casa preta.png"))); // NOI18N
        jToggleButton64.setPreferredSize(new java.awt.Dimension(64, 64));
        jToggleButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton64ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jToggleButton60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jToggleButton52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jToggleButton44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jToggleButton36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jToggleButton28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void instanciandoMatriz()
    {
        int i=0,j=0;
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                casa[i][j] = new Casa();
            }
        }
        casa[0][0].setNomePeca("torre");
        casa[0][0].setCorPeca("branco");
        casa[0][0].setCorCasa("preta");
        casa[0][0].setPeca(new Torre());
        casa[0][1].setNomePeca("cavalo");
        casa[0][1].setCorPeca("branco");
        casa[0][1].setCorCasa("branca");
        casa[0][1].setPeca(new Cavalo());
        casa[0][2].setNomePeca("bispo");
        casa[0][2].setCorPeca("branco");
        casa[0][2].setCorCasa("preta");
        casa[0][2].setPeca(new Bispo());
        casa[0][3].setNomePeca("rainha");
        casa[0][3].setCorPeca("branco");
        casa[0][3].setCorCasa("branca");
        casa[0][3].setPeca(new Rainha());
        casa[0][4].setNomePeca("rei");
        casa[0][4].setCorPeca("branco");
        casa[0][4].setCorCasa("preta");
        casa[0][4].setPeca(new Rei());
        casa[0][5].setNomePeca("bispo");
        casa[0][5].setCorPeca("branco");
        casa[0][5].setCorCasa("branca");
        casa[0][5].setPeca(new Bispo());
        casa[0][6].setNomePeca("cavalo");
        casa[0][6].setCorPeca("branco");
        casa[0][6].setCorCasa("preta");
        casa[0][6].setPeca(new Cavalo());
        casa[0][7].setNomePeca("torre");
        casa[0][7].setCorPeca("branco");
        casa[0][7].setCorCasa("branca");
        casa[0][7].setPeca(new Torre());
        for(j=0;j<8;j++)
        {
            casa[1][j].setNomePeca("peão");
            casa[1][j].setPeca(new Peao());
            casa[1][j].setCorPeca("branco");
            if (j%2==0)
            {
                casa[1][j].setCorCasa("branca");
            }
            else
            {
                casa[1][j].setCorCasa("preta");
            }
        }
        for(j=0;j<8;j++)
        {
            casa[2][j].setNomePeca("0");
            casa[2][j].setCorPeca("0");
            if (j%2==0)
            {
                casa[2][j].setCorCasa("preta");
            }
            else
            {
                casa[2][j].setCorCasa("branca");
            }
        }
        for(j=0;j<8;j++)
        {
            casa[3][j].setNomePeca("0");
            casa[3][j].setCorPeca("0");
            if (j%2==0)
            {
                casa[3][j].setCorCasa("branca");
            }
            else
            {
                casa[3][j].setCorCasa("preta");
            }
        }
        for(j=0;j<8;j++)
        {
            casa[4][j].setNomePeca("0");
            casa[4][j].setCorPeca("0");
            if (j%2==0)
            {
                casa[4][j].setCorCasa("preta");
            }
            else
            {
                casa[4][j].setCorCasa("branca");
            }
        }
        for(j=0;j<8;j++)
        {
            casa[5][j].setNomePeca("0");
            casa[5][j].setCorPeca("0");
            if (j%2==0)
            {
                casa[5][j].setCorCasa("branca");
            }
            else
            {
                casa[5][j].setCorCasa("preta");
            }
        }
        for(j=0;j<8;j++)
        {
            casa[6][j].setNomePeca("peão");
            casa[6][j].setPeca(new Peao());
            casa[6][j].setCorPeca("preto");
            if (j%2==0)
            {
                casa[6][j].setCorCasa("preta");
            }
            else
            {
                casa[6][j].setCorCasa("branca");
            }
        }
        casa[7][0].setNomePeca("torre");
        casa[7][0].setCorPeca("preto");
        casa[7][0].setCorCasa("branca");
        casa[7][0].setPeca(new Torre());
        casa[7][1].setNomePeca("cavalo");
        casa[7][1].setCorPeca("preto");
        casa[7][1].setCorCasa("preta");
        casa[7][1].setPeca(new Cavalo());
        casa[7][2].setNomePeca("bispo");
        casa[7][2].setCorPeca("preto");
        casa[7][2].setCorCasa("branca");
        casa[7][2].setPeca(new Bispo());
        casa[7][3].setNomePeca("rainha");
        casa[7][3].setCorPeca("preto");
        casa[7][3].setCorCasa("preta");
        casa[7][3].setPeca(new Rainha());
        casa[7][4].setNomePeca("rei");
        casa[7][4].setCorPeca("preto");
        casa[7][4].setCorCasa("branca");
        casa[7][4].setPeca(new Rei());
        casa[7][5].setNomePeca("bispo");
        casa[7][5].setCorPeca("preto");
        casa[7][5].setCorCasa("preta");
        casa[7][5].setPeca(new Bispo());
        casa[7][6].setNomePeca("cavalo");
        casa[7][6].setCorPeca("preto");
        casa[7][6].setCorCasa("branca");
        casa[7][6].setPeca(new Cavalo());
        casa[7][7].setNomePeca("torre");
        casa[7][7].setCorPeca("preto");
        casa[7][7].setCorCasa("preta");
        casa[7][7].setPeca(new Torre());
        casa[0][0].setBotao(jToggleButton1);
        casa[0][1].setBotao(jToggleButton2);
        casa[0][2].setBotao(jToggleButton3);
        casa[0][3].setBotao(jToggleButton4);
        casa[0][4].setBotao(jToggleButton5);
        casa[0][5].setBotao(jToggleButton6);
        casa[0][6].setBotao(jToggleButton7);
        casa[0][7].setBotao(jToggleButton8);
        casa[1][0].setBotao(jToggleButton9);
        casa[1][1].setBotao(jToggleButton10);
        casa[1][2].setBotao(jToggleButton11);
        casa[1][3].setBotao(jToggleButton12);
        casa[1][4].setBotao(jToggleButton13);
        casa[1][5].setBotao(jToggleButton14);
        casa[1][6].setBotao(jToggleButton15);
        casa[1][7].setBotao(jToggleButton16);
        casa[2][0].setBotao(jToggleButton17);
        casa[2][1].setBotao(jToggleButton18);
        casa[2][2].setBotao(jToggleButton19);
        casa[2][3].setBotao(jToggleButton20);
        casa[2][4].setBotao(jToggleButton21);
        casa[2][5].setBotao(jToggleButton22);
        casa[2][6].setBotao(jToggleButton23);
        casa[2][7].setBotao(jToggleButton24);
        casa[3][0].setBotao(jToggleButton25);
        casa[3][1].setBotao(jToggleButton26);
        casa[3][2].setBotao(jToggleButton27);
        casa[3][3].setBotao(jToggleButton28);
        casa[3][4].setBotao(jToggleButton29);
        casa[3][5].setBotao(jToggleButton30);
        casa[3][6].setBotao(jToggleButton31);
        casa[3][7].setBotao(jToggleButton32);
        casa[4][0].setBotao(jToggleButton33);
        casa[4][1].setBotao(jToggleButton34);
        casa[4][2].setBotao(jToggleButton35);
        casa[4][3].setBotao(jToggleButton36);
        casa[4][4].setBotao(jToggleButton37);
        casa[4][5].setBotao(jToggleButton38);
        casa[4][6].setBotao(jToggleButton39);
        casa[4][7].setBotao(jToggleButton40);
        casa[5][0].setBotao(jToggleButton41);
        casa[5][1].setBotao(jToggleButton42);
        casa[5][2].setBotao(jToggleButton43);
        casa[5][3].setBotao(jToggleButton44);
        casa[5][4].setBotao(jToggleButton45);
        casa[5][5].setBotao(jToggleButton46);
        casa[5][6].setBotao(jToggleButton47);
        casa[5][7].setBotao(jToggleButton48);
        casa[6][0].setBotao(jToggleButton49);
        casa[6][1].setBotao(jToggleButton50);
        casa[6][2].setBotao(jToggleButton51);
        casa[6][3].setBotao(jToggleButton52);
        casa[6][4].setBotao(jToggleButton53);
        casa[6][5].setBotao(jToggleButton54);
        casa[6][6].setBotao(jToggleButton55);
        casa[6][7].setBotao(jToggleButton56);
        casa[7][0].setBotao(jToggleButton57);
        casa[7][1].setBotao(jToggleButton58);
        casa[7][2].setBotao(jToggleButton59);
        casa[7][3].setBotao(jToggleButton60);
        casa[7][4].setBotao(jToggleButton61);
        casa[7][5].setBotao(jToggleButton62);
        casa[7][6].setBotao(jToggleButton63);
        casa[7][7].setBotao(jToggleButton64);
    }

    public void actionGeral(int lin,int col)
    {
        if(existeBotaoClicado) //para onde a peça vai se movimentar
        {
            if(vezJogadorBranco && !(casa[lin][col].getCorPeca().equals("branco")))//peças brancas
            {
                if(casa[linhaBotaoClicado][colunaBotaoClicado].getPeca().movimentar(linhaBotaoClicado,colunaBotaoClicado,lin,col,casa,reiBrancoLin,reiBrancoCol))//testando se o movimento é válido
                {
                    //pra onde a peça está se movendo
                    casa[lin][col].getBotao().setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/"+casa[linhaBotaoClicado][colunaBotaoClicado].getNomePeca()+" "+casa[linhaBotaoClicado][colunaBotaoClicado].getCorPeca()+" casa "+casa[lin][col].getCorCasa()+".png")));
                    //apagando peça do quadrado origem
                    casa[linhaBotaoClicado][colunaBotaoClicado].getBotao().setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado "+casa[linhaBotaoClicado][colunaBotaoClicado].getCorCasa()+".png")));
                    //atualizando matriz
                    casa[lin][col].setNomePeca(casa[linhaBotaoClicado][colunaBotaoClicado].getNomePeca());
                    casa[linhaBotaoClicado][colunaBotaoClicado].setNomePeca("0");
                    casa[lin][col].setCorPeca(casa[linhaBotaoClicado][colunaBotaoClicado].getCorPeca());
                    casa[linhaBotaoClicado][colunaBotaoClicado].setCorPeca("0");
                    casa[lin][col].setPeca(casa[linhaBotaoClicado][colunaBotaoClicado].getPeca());
                    casa[linhaBotaoClicado][colunaBotaoClicado].setPeca(null);
                    if (casa[lin][col].getNomePeca().equals("rei"))//rei se moveu
                    {
                        reiBrancoLin = lin;
                        reiBrancoCol = col;
                    }
                    vezJogadorBranco = false;
                }
                else
                {
                    //apagar a casa selecionada, pois não foi possível o movimento
                    casa[linhaBotaoClicado][colunaBotaoClicado].getBotao().setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/"+casa[linhaBotaoClicado][colunaBotaoClicado].getNomePeca()+" "+casa[linhaBotaoClicado][colunaBotaoClicado].getCorPeca()+" casa "+casa[linhaBotaoClicado][colunaBotaoClicado].getCorCasa()+".png")));
                }
            }
            else
            {
                if((!vezJogadorBranco) && !(casa[lin][col].getCorPeca().equals("preto")))//peças pretas
                {
                    if(casa[linhaBotaoClicado][colunaBotaoClicado].getPeca().movimentar(linhaBotaoClicado,colunaBotaoClicado,lin,col,casa,reiPretoLin,reiPretoCol))//testando se o movimento é válido
                    {
                        //pra onde a peça está se movendo
                        casa[lin][col].getBotao().setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/"+casa[linhaBotaoClicado][colunaBotaoClicado].getNomePeca()+" "+casa[linhaBotaoClicado][colunaBotaoClicado].getCorPeca()+" casa "+casa[lin][col].getCorCasa()+".png")));
                        //apagando peça do quadrado origem
                        casa[linhaBotaoClicado][colunaBotaoClicado].getBotao().setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/quadrado "+casa[linhaBotaoClicado][colunaBotaoClicado].getCorCasa()+".png")));
                        //atualizando matriz
                        casa[lin][col].setNomePeca(casa[linhaBotaoClicado][colunaBotaoClicado].getNomePeca());
                        casa[linhaBotaoClicado][colunaBotaoClicado].setNomePeca("0");
                        casa[lin][col].setCorPeca(casa[linhaBotaoClicado][colunaBotaoClicado].getCorPeca());
                        casa[linhaBotaoClicado][colunaBotaoClicado].setCorPeca("0");
                        casa[lin][col].setPeca(casa[linhaBotaoClicado][colunaBotaoClicado].getPeca());
                        casa[linhaBotaoClicado][colunaBotaoClicado].setPeca(null);
                        if (casa[lin][col].getNomePeca().equals("rei"))//rei se moveu
                        {
                            reiPretoLin = lin;
                            reiPretoCol = col;
                        }
                        vezJogadorBranco = true;
                    }
                    else
                    {
                        //apagar a casa selecionada, pois não foi possível o movimento
                        casa[linhaBotaoClicado][colunaBotaoClicado].getBotao().setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/"+casa[linhaBotaoClicado][colunaBotaoClicado].getNomePeca()+" "+casa[linhaBotaoClicado][colunaBotaoClicado].getCorPeca()+" casa "+casa[linhaBotaoClicado][colunaBotaoClicado].getCorCasa()+".png")));
                    }
                }
                else
                {
                    //não é permitido comer uma peça da mesma cor
                    //apagar a casa selecionada, pois não foi possível o movimento
                    casa[linhaBotaoClicado][colunaBotaoClicado].getBotao().setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/"+casa[linhaBotaoClicado][colunaBotaoClicado].getNomePeca()+" "+casa[linhaBotaoClicado][colunaBotaoClicado].getCorPeca()+" casa "+casa[linhaBotaoClicado][colunaBotaoClicado].getCorCasa()+".png")));
                }
            }
            existeBotaoClicado = false;
        }
        else //peça que irá se movimentar
        {
            if(vezJogadorBranco && casa[lin][col].getCorPeca().equals("branco"))
            {
                linhaBotaoClicado = lin;
                colunaBotaoClicado = col;
                existeBotaoClicado = true;
                casa[linhaBotaoClicado][colunaBotaoClicado].getBotao().setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/"+casa[lin][col].getNomePeca()+" "+casa[lin][col].getCorPeca()+" casa "+casa[lin][col].getCorCasa()+" selecionado.png")));
            }
            else
            {
                if((!vezJogadorBranco) && casa[lin][col].getCorPeca().equals("preto"))
                {
                    linhaBotaoClicado = lin;
                    colunaBotaoClicado = col;
                    existeBotaoClicado = true;
                    casa[linhaBotaoClicado][colunaBotaoClicado].getBotao().setIcon(new javax.swing.ImageIcon(getClass().getResource("/xadrez/"+casa[lin][col].getNomePeca()+" "+casa[lin][col].getCorPeca()+" casa "+casa[lin][col].getCorCasa()+" selecionado.png")));
                }
                else
                {
                    //não é a vez desse jogador
                }
            }
        }
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       actionGeral(0,0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        actionGeral(0,1);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        actionGeral(0,2);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        actionGeral(0,3);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        actionGeral(0,4);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        actionGeral(0,5);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        actionGeral(0,6);
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        actionGeral(0,7);
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        actionGeral(1,0);
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        actionGeral(1,1);
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        actionGeral(1,2);
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        actionGeral(1,3);
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        actionGeral(1,4);
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        actionGeral(1,5);
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        actionGeral(1,6);
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
        actionGeral(1,7);
    }//GEN-LAST:event_jToggleButton16ActionPerformed

    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton17ActionPerformed
        actionGeral(2,0);
    }//GEN-LAST:event_jToggleButton17ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        actionGeral(2,1);
    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void jToggleButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton19ActionPerformed
        actionGeral(2,2);
    }//GEN-LAST:event_jToggleButton19ActionPerformed

    private void jToggleButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton20ActionPerformed
        actionGeral(2,3);
    }//GEN-LAST:event_jToggleButton20ActionPerformed

    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
        actionGeral(2,4);
    }//GEN-LAST:event_jToggleButton21ActionPerformed

    private void jToggleButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton22ActionPerformed
        actionGeral(2,5);
    }//GEN-LAST:event_jToggleButton22ActionPerformed

    private void jToggleButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton23ActionPerformed
        actionGeral(2,6);
    }//GEN-LAST:event_jToggleButton23ActionPerformed

    private void jToggleButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton24ActionPerformed
        actionGeral(2,7);
    }//GEN-LAST:event_jToggleButton24ActionPerformed

    private void jToggleButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton25ActionPerformed
        actionGeral(3,0);
    }//GEN-LAST:event_jToggleButton25ActionPerformed

    private void jToggleButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton26ActionPerformed
        actionGeral(3,1);
    }//GEN-LAST:event_jToggleButton26ActionPerformed

    private void jToggleButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton27ActionPerformed
        actionGeral(3,2);
    }//GEN-LAST:event_jToggleButton27ActionPerformed

    private void jToggleButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton28ActionPerformed
        actionGeral(3,3);
    }//GEN-LAST:event_jToggleButton28ActionPerformed

    private void jToggleButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton29ActionPerformed
        actionGeral(3,4);
    }//GEN-LAST:event_jToggleButton29ActionPerformed

    private void jToggleButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton30ActionPerformed
        actionGeral(3,5);
    }//GEN-LAST:event_jToggleButton30ActionPerformed

    private void jToggleButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton31ActionPerformed
        actionGeral(3,6);
    }//GEN-LAST:event_jToggleButton31ActionPerformed

    private void jToggleButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton32ActionPerformed
        actionGeral(3,7);
    }//GEN-LAST:event_jToggleButton32ActionPerformed

    private void jToggleButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton33ActionPerformed
        actionGeral(4,0);
    }//GEN-LAST:event_jToggleButton33ActionPerformed

    private void jToggleButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton34ActionPerformed
        actionGeral(4,1);
    }//GEN-LAST:event_jToggleButton34ActionPerformed

    private void jToggleButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton35ActionPerformed
        actionGeral(4,2);
    }//GEN-LAST:event_jToggleButton35ActionPerformed

    private void jToggleButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton36ActionPerformed
        actionGeral(4,3);
    }//GEN-LAST:event_jToggleButton36ActionPerformed

    private void jToggleButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton37ActionPerformed
        actionGeral(4,4);
    }//GEN-LAST:event_jToggleButton37ActionPerformed

    private void jToggleButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton38ActionPerformed
        actionGeral(4,5);
    }//GEN-LAST:event_jToggleButton38ActionPerformed

    private void jToggleButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton39ActionPerformed
        actionGeral(4,6);
    }//GEN-LAST:event_jToggleButton39ActionPerformed

    private void jToggleButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton40ActionPerformed
        actionGeral(4,7);
    }//GEN-LAST:event_jToggleButton40ActionPerformed

    private void jToggleButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton41ActionPerformed
        actionGeral(5,0);
    }//GEN-LAST:event_jToggleButton41ActionPerformed

    private void jToggleButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton42ActionPerformed
        actionGeral(5,1);
    }//GEN-LAST:event_jToggleButton42ActionPerformed

    private void jToggleButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton43ActionPerformed
        actionGeral(5,2);
    }//GEN-LAST:event_jToggleButton43ActionPerformed

    private void jToggleButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton44ActionPerformed
        actionGeral(5,3);
    }//GEN-LAST:event_jToggleButton44ActionPerformed

    private void jToggleButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton45ActionPerformed
        actionGeral(5,4);
    }//GEN-LAST:event_jToggleButton45ActionPerformed

    private void jToggleButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton46ActionPerformed
        actionGeral(5,5);
    }//GEN-LAST:event_jToggleButton46ActionPerformed

    private void jToggleButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton47ActionPerformed
        actionGeral(5,6);
    }//GEN-LAST:event_jToggleButton47ActionPerformed

    private void jToggleButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton48ActionPerformed
        actionGeral(5,7);
    }//GEN-LAST:event_jToggleButton48ActionPerformed

    private void jToggleButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton49ActionPerformed
        actionGeral(6,0);
    }//GEN-LAST:event_jToggleButton49ActionPerformed

    private void jToggleButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton50ActionPerformed
        actionGeral(6,1);
    }//GEN-LAST:event_jToggleButton50ActionPerformed

    private void jToggleButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton51ActionPerformed
        actionGeral(6,2);
    }//GEN-LAST:event_jToggleButton51ActionPerformed

    private void jToggleButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton52ActionPerformed
        actionGeral(6,3);
    }//GEN-LAST:event_jToggleButton52ActionPerformed

    private void jToggleButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton53ActionPerformed
        actionGeral(6,4);
    }//GEN-LAST:event_jToggleButton53ActionPerformed

    private void jToggleButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton54ActionPerformed
        actionGeral(6,5);
    }//GEN-LAST:event_jToggleButton54ActionPerformed

    private void jToggleButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton55ActionPerformed
        actionGeral(6,6);
    }//GEN-LAST:event_jToggleButton55ActionPerformed

    private void jToggleButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton56ActionPerformed
        actionGeral(6,7);
    }//GEN-LAST:event_jToggleButton56ActionPerformed

    private void jToggleButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton57ActionPerformed
        actionGeral(7,0);
    }//GEN-LAST:event_jToggleButton57ActionPerformed

    private void jToggleButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton58ActionPerformed
       actionGeral(7,1);
    }//GEN-LAST:event_jToggleButton58ActionPerformed

    private void jToggleButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton59ActionPerformed
        actionGeral(7,2);
    }//GEN-LAST:event_jToggleButton59ActionPerformed

    private void jToggleButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton60ActionPerformed
        actionGeral(7,3);
    }//GEN-LAST:event_jToggleButton60ActionPerformed

    private void jToggleButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton61ActionPerformed
        actionGeral(7,4);
    }//GEN-LAST:event_jToggleButton61ActionPerformed

    private void jToggleButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton62ActionPerformed
        actionGeral(7,5);
    }//GEN-LAST:event_jToggleButton62ActionPerformed

    private void jToggleButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton63ActionPerformed
        actionGeral(7,6);
    }//GEN-LAST:event_jToggleButton63ActionPerformed

    private void jToggleButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton64ActionPerformed
        actionGeral(7,7);
    }//GEN-LAST:event_jToggleButton64ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton30;
    private javax.swing.JToggleButton jToggleButton31;
    private javax.swing.JToggleButton jToggleButton32;
    private javax.swing.JToggleButton jToggleButton33;
    private javax.swing.JToggleButton jToggleButton34;
    private javax.swing.JToggleButton jToggleButton35;
    private javax.swing.JToggleButton jToggleButton36;
    private javax.swing.JToggleButton jToggleButton37;
    private javax.swing.JToggleButton jToggleButton38;
    private javax.swing.JToggleButton jToggleButton39;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton40;
    private javax.swing.JToggleButton jToggleButton41;
    private javax.swing.JToggleButton jToggleButton42;
    private javax.swing.JToggleButton jToggleButton43;
    private javax.swing.JToggleButton jToggleButton44;
    private javax.swing.JToggleButton jToggleButton45;
    private javax.swing.JToggleButton jToggleButton46;
    private javax.swing.JToggleButton jToggleButton47;
    private javax.swing.JToggleButton jToggleButton48;
    private javax.swing.JToggleButton jToggleButton49;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton50;
    private javax.swing.JToggleButton jToggleButton51;
    private javax.swing.JToggleButton jToggleButton52;
    private javax.swing.JToggleButton jToggleButton53;
    private javax.swing.JToggleButton jToggleButton54;
    private javax.swing.JToggleButton jToggleButton55;
    private javax.swing.JToggleButton jToggleButton56;
    private javax.swing.JToggleButton jToggleButton57;
    private javax.swing.JToggleButton jToggleButton58;
    private javax.swing.JToggleButton jToggleButton59;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton60;
    private javax.swing.JToggleButton jToggleButton61;
    private javax.swing.JToggleButton jToggleButton62;
    private javax.swing.JToggleButton jToggleButton63;
    private javax.swing.JToggleButton jToggleButton64;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables

}
