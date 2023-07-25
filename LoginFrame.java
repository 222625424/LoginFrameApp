/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import com.sun.prism.paint.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Student
 */
public class LoginFrame extends JFrame {

    private JPanel headingPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel usernamepasswordPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    
    private JLabel headingLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    
    private JTextField usernametxf;
    
    private JPasswordField passwordfield;
    
    private JButton submitbnt;
    private JButton clearbnt;
    private JButton exitbnt;

    public LoginFrame() {
        
        setTitle("Login Page");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        usernamepasswordPnl = new JPanel(new GridLayout(2,1));
        usernamepasswordPnl.setBorder(new TitledBorder(new LineBorder(java.awt.Color.BLUE, 2),"Login details"));
        
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEADING));
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Login");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        headingLbl.setForeground(java.awt.Color.red);
        
        usernameLbl = new JLabel("Username:    ");
        
        passwordLbl = new JLabel("Password:    ");
        
        usernametxf = new JTextField(10);
        passwordfield = new JPasswordField(10);
        
        submitbnt = new JButton("Submit");
        clearbnt = new JButton("Clear");
        exitbnt = new JButton("Exit");
        
        headingPnl.add(headingLbl);
        
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernametxf);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordfield);
        
        usernamepasswordPnl.add(usernamePnl);
        usernamepasswordPnl.add(passwordPnl);
        
        btnPnl.add(submitbnt);
        btnPnl.add(clearbnt);
        btnPnl.add(exitbnt);
        
        mainPnl.add(headingPnl , BorderLayout.NORTH);
        mainPnl.add(usernamepasswordPnl , BorderLayout.CENTER);
        mainPnl.add(btnPnl , BorderLayout.SOUTH);
        
        add(mainPnl);
        
        
        setVisible(true);

    }

}
