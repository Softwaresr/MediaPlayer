package javaapplication1.proj;

import java.io.File;
import java.net.URL;
import javax.media.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MediaPlayer extends javax.swing.JFrame {
    Player ap = null;
    Time pausedTime = null;

    public MediaPlayer() {
        initComponents();
    }

    private void initMediaPlayer(String path) {
        try {
            URL url = new File(path).toURL();
            ap = Manager.createRealizedPlayer(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initMediaPlayerFromDatabase(int fileId) {
        String dbUrl = "jdbc:mysql://localhost/MediaPlayerDB";
        String dbUser = "root";
        String dbPassword = "tiger1";

        try {
            Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            String query = "SELECT file_path FROM MediaFiles WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, fileId);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String filePath = resultSet.getString("file_path");
                initMediaPlayer(filePath);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        JPanel jPanel1 = new javax.swing.JPanel();
        JButton playButton = new javax.swing.JButton();
        JButton pauseButton = new javax.swing.JButton();
        JButton stopButton = new javax.swing.JButton();
        JLabel jLabel1 = new javax.swing.JLabel();
        JLabel jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        JButton jButton4 = new javax.swing.JButton();
        JButton jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        pauseButton.setText("Pause");
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Currently Playing:");

        jLabel2.setText("MediaPlayer");

        jButton1.setText("Wave Gods ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("T.I. , Rihanna - Live Your Life");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("megenta RIDDIM");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Systum pe Systum");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Travis Scott - Apple Pie");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(playButton)
                        .addGap(18, 18, 18)
                        .addComponent(pauseButton)
                        .addGap(29, 29, 29)
                        .addComponent(stopButton)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(pauseButton)
                    .addComponent(stopButton))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (pausedTime != null) {
            ap.setMediaTime(pausedTime);
            pausedTime = null;
        }
        ap.start();
    }

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        pausedTime = ap.getMediaTime();
        ap.stop();
    }

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ap.stop();
        ap.setMediaTime(new Time(0.0));
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        initMediaPlayerFromDatabase(1);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        initMediaPlayerFromDatabase(2);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        initMediaPlayerFromDatabase(3);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        initMediaPlayerFromDatabase(4);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
       initMediaPlayerFromDatabase(5);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MediaPlayer().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton playButton;
    private javax.swing.JButton stopButton;
}