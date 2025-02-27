/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projectgui;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class HealthInsuranceGUI extends javax.swing.JFrame {

  Customer customer1;
  Policy policy1;
  String firstName;
  String surName;
  String gender;
  String age;
  String policyType;
  String hospitalCover;
  String dayToDayExpense;
  ArrayList previousHealthConditions;
  String other;
  String smoker;
  
  int id=0;
  float total = 0f;
  String newTotal = "";

  // constants that represent the age
  static final int PLEASE_SELECT_AGE = -1;
  static final int Under_35 = 1;
  static final int Between_35_to_55=2;
  static final int Between_56_to_70=3;
  static final int Over_70 = 4;

  // constants that represent the policy type
  static final int PLEASE_SELECT_POLICY = -1;
  static final int Individual = 1;
  static final int Corporate = 2;

  // constants for hospital cover
  static final int please_select_hospital = -1;
  static final int Public_Hospital = 1;
  static final int Selected_Private_Hospitals = 2;
  static final int Comprehensive_Hospital_cover = 3;

  // constants for Day to day expenses
  static final int please_select_day = -1;
  static final int Standard = 1;
  static final int Enchanced = 2;
  static final int Comprehenive = 3;

  // constants for exsitng health condtions
  static final int None = 1;
  static final int Bone_Marrow = 2;
  static final int Cancer = 3;
  static final int Cardiovascular_Disease = 4;
  static final int Gastrointestinal = 5;
  static final int Infections = 6;
  static final int Kidneys = 7;
  static final int Lungs = 8;
  static final int Musculoskeletal = 9;
  
 Boolean formValidated = false;

  // Method to Validate Form
  public void validateForm() {
    // Check if first name is empty
    // if not selected -> prompt
    // user to select a first name
    if(ageCmb.getSelectedItem().equals("Over 70")){
        JOptionPane.showMessageDialog(this,
        "We do not support people over 70",
            "Message Dialog", JOptionPane.WARNING_MESSAGE);
    }
    else if (firstNameTxt.getText().equals(""))
    {
       JOptionPane.showMessageDialog(this,
          "Please Enter a First Name",
          "Message Dialog", JOptionPane.WARNING_MESSAGE);
    }
              
    else if (surnameTxt.getText().equals(""))
    {
        JOptionPane.showMessageDialog(this,
        "Please Enter a Surname",
            "Message Dialog", JOptionPane.WARNING_MESSAGE);
    }   
    
    else if (!maleRadBtn.isSelected() && !femaleRadBtn.isSelected()){
        JOptionPane.showMessageDialog(this,
        "Please Select a Gender",
            "Message Dialog", JOptionPane.WARNING_MESSAGE);
    }
    else if(ageCmb.getSelectedItem().equals("Please Select")){
        JOptionPane.showMessageDialog(this,
        "Please Select an Age",
            "Message Dialog", JOptionPane.WARNING_MESSAGE);
    }
    else if(policyComboBox.getSelectedItem().equals("Please Select")){
        JOptionPane.showMessageDialog(this,
        "Please Select a Policy Type",
            "Message Dialog", JOptionPane.WARNING_MESSAGE);
    }
    else if(hospitalCoverComboBox.getSelectedItem().equals("Please Select")){
        JOptionPane.showMessageDialog(this,
        "Please Select a Hospital Cover",
            "Message Dialog", JOptionPane.WARNING_MESSAGE);
    }
    else if(dayToDayComboBox.getSelectedItem().equals("Please Select")){
        JOptionPane.showMessageDialog(this,
        "Please Select a Day to Day Expense",
            "Message Dialog", JOptionPane.WARNING_MESSAGE);
    }
    else if(!smkrRadBtn.isSelected() && !nonSmkrRadBtn.isSelected()){
        JOptionPane.showMessageDialog(this,
        "Please Select Smoker or Non-Smoker",
            "Message Dialog", JOptionPane.WARNING_MESSAGE);
    }
    else{      
      // Assume Form is valid
      formValidated = true;
    }
  } // end validated form method

  private void extractForm() {
    firstName = firstNameTxt.getText();
    surName = surnameTxt.getText();
    // gender
    if (maleRadBtn.isSelected()) {
      gender = "Male";
    } else if (femaleRadBtn.isSelected()) {
      gender = "Female";
    }
    // age
    if (ageCmb.getSelectedIndex() == Under_35) {
      age = "Under 35";
    } else if (ageCmb.getSelectedIndex() == Between_35_to_55) {
      age = "35 to 55 Inclusive";
    } else if (ageCmb.getSelectedIndex() == Between_56_to_70) {
      age = "56 to 70 Inclusive";
    } else if (ageCmb.getSelectedIndex() == Over_70) {
      age = "Over 70";
    }

    // policy
    if (policyComboBox.getSelectedIndex() == Individual) {
      policyType = "Individual";
    } else if (policyComboBox.getSelectedIndex() == Corporate) {
      policyType = "Corporate";
    }
    // HOSPITAL COVER
    //"Public Hospital", "Selected Private Hospitals", "Comprehensive Hospital Cover" }));

    if(hospitalCoverComboBox.getSelectedItem().equals("Public Hospital")){
        hospitalCover = "Public Hospital";
    }
    else if(hospitalCoverComboBox.getSelectedItem().equals("Selected Private Hospitals")){
        hospitalCover = "Selected Private Hospitals";
    }
    else if(hospitalCoverComboBox.getSelectedItem().equals("Comprehensive Hospital Cover")){
        hospitalCover = "Comprehensive Hospital Cover";
    }
    
    // day to day expense
    if (dayToDayComboBox.getSelectedItem() == "Standard") {
      dayToDayExpense = "Standard";
    } else if (dayToDayComboBox.getSelectedItem() == "Enhanced") {
      dayToDayExpense = "Enhanced";
    } else if (dayToDayComboBox.getSelectedItem() == "Comprehensive") {
      dayToDayExpense = "Comprehensive";
    }
    // existing health conditions

    // Get the selected values as a List
    previousHealthConditions = (ArrayList) existingHealthConditionsTxtArea.getSelectedValuesList();

    // other box
    if (otherTextArea.getText().isEmpty()) {
      other = "No";
    } else {
      other = "Yes";
    }
    if (smkrRadBtn.isSelected()) {
      smoker = "Yes";
    } else if (nonSmkrRadBtn.isSelected()) {
      smoker = "No";
    }

  }
  //function to clear form
  private void clearForm(){
      // Reset textbox
      firstNameTxt.setText(""); //first name reset
      surnameTxt.setText(""); //surname reset
      genderBtnGrp.clearSelection(); // gender button group reset
      ageCmb.setSelectedIndex(0);
      policyComboBox.setSelectedIndex(0);
      hospitalCoverComboBox.setSelectedIndex(0);
      dayToDayComboBox.setSelectedIndex(0);
      existingHealthConditionsTxtArea.clearSelection();
      otherTextArea.setText("");
      smokerBtnGrp.clearSelection();
      totalLbl.setText("...");
      total = 0f;
      
      
  }
    /**
     * Creates new form HealthInsuranceGUI
     */
    public HealthInsuranceGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        genderBtnGrp = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        smokerBtnGrp = new javax.swing.ButtonGroup();
        summaryWindow = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        Closebtn = new javax.swing.JButton();
        policyDetailsLbl = new javax.swing.JLabel();
        NameSummaryTxt = new javax.swing.JLabel();
        BuyPriceSummaryTxt = new javax.swing.JLabel();
        policyPriceLbl = new javax.swing.JLabel();
        customerNameLbl = new javax.swing.JLabel();
        policyDetailsTxt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fstNameLbl = new javax.swing.JLabel();
        scndNameLbl = new javax.swing.JLabel();
        genderLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        surnameTxt = new javax.swing.JTextField();
        maleRadBtn = new javax.swing.JRadioButton();
        femaleRadBtn = new javax.swing.JRadioButton();
        ageCmb = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        policyComboBox = new javax.swing.JComboBox<>();
        hospitalCoverComboBox = new javax.swing.JComboBox<>();
        dayToDayComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        existingHealthConditionsTxtArea = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        otherTextArea = new javax.swing.JTextArea();
        smkrRadBtn = new javax.swing.JRadioButton();
        nonSmkrRadBtn = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        calculateBtn = new javax.swing.JButton();
        clearFormBtn = new javax.swing.JButton();
        buyPolicyBtn = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        summaryWindow.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Policy Summary");

        Closebtn.setText("Close");
        Closebtn.setMaximumSize(new java.awt.Dimension(400, 400));
        Closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClosebtnActionPerformed(evt);
            }
        });

        policyDetailsLbl.setText("Policy Details");

        NameSummaryTxt.setText("...");

        BuyPriceSummaryTxt.setText("...");

        policyPriceLbl.setText("Policy Price");

        customerNameLbl.setText("Customer Name");

        policyDetailsTxt.setText("...");

        javax.swing.GroupLayout summaryWindowLayout = new javax.swing.GroupLayout(summaryWindow.getContentPane());
        summaryWindow.getContentPane().setLayout(summaryWindowLayout);
        summaryWindowLayout.setHorizontalGroup(
            summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryWindowLayout.createSequentialGroup()
                .addGroup(summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(summaryWindowLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(Closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(summaryWindowLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(policyPriceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addComponent(customerNameLbl))
                            .addComponent(policyDetailsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(179, 179, 179)
                        .addGroup(summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(policyDetailsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NameSummaryTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(BuyPriceSummaryTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        summaryWindowLayout.setVerticalGroup(
            summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(summaryWindowLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLbl)
                    .addComponent(NameSummaryTxt))
                .addGap(44, 44, 44)
                .addGroup(summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(policyDetailsLbl)
                    .addComponent(policyDetailsTxt))
                .addGap(49, 49, 49)
                .addGroup(summaryWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(policyPriceLbl)
                    .addComponent(BuyPriceSummaryTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(Closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Slainte Health Insurance");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        fstNameLbl.setText("Firstname:");

        scndNameLbl.setText("Surname:");

        genderLbl.setText("Gender:");

        ageLbl.setText("Age:");

        genderBtnGrp.add(maleRadBtn);
        maleRadBtn.setText("Male");
        maleRadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // maleRadBtnActionPerformed(evt);
            }
        });

        genderBtnGrp.add(femaleRadBtn);
        femaleRadBtn.setText("Female");
        femaleRadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // femaleRadBtnActionPerformed(evt);
            }
        });

        ageCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Under 35", "35 to 55 inclusive", "56 to 70 inclusive", "Over 70" }));
        ageCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // ageCmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fstNameLbl)
                    .addComponent(scndNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(surnameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(firstNameTxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(maleRadBtn)
                        .addGap(33, 33, 33)
                        .addComponent(femaleRadBtn))
                    .addComponent(ageCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fstNameLbl)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scndNameLbl)
                    .addComponent(surnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLbl)
                    .addComponent(maleRadBtn)
                    .addComponent(femaleRadBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl)
                    .addComponent(ageCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Policy Type:");

        jLabel8.setText("Hospital Cover:");

        jLabel9.setText("Day to Day Expenses:");

        policyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Individual", "Corporate", " " }));
        policyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // policyComboBoxActionPerformed(evt);
            }
        });

        hospitalCoverComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Public Hospital", "Selected Private Hospitals", "Comprehensive Hospital Cover" }));
        hospitalCoverComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // hospitalCoverComboBoxActionPerformed(evt);
            }
        });

        dayToDayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Standard", "Enhanced", "Comprehensive" }));
        dayToDayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // dayToDayComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dayToDayComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hospitalCoverComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(policyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(policyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hospitalCoverComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dayToDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Existing Health Conditions:");

        jLabel12.setText("If other, please specify:");

        jLabel13.setText("Smoker:");

        existingHealthConditionsTxtArea.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "None", "Bone Marrow", "Cancer", "Cardiovascular disease", "Gastrointestinal", "Infections", "Kidneys", "Lungs", "Musculoskeletal" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(existingHealthConditionsTxtArea);

        otherTextArea.setColumns(20);
        otherTextArea.setRows(5);
        jScrollPane2.setViewportView(otherTextArea);

        smokerBtnGrp.add(smkrRadBtn);
        smkrRadBtn.setText("Smoker");
        smkrRadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // smkrRadBtnActionPerformed(evt);
            }
        });

        smokerBtnGrp.add(nonSmkrRadBtn);
        nonSmkrRadBtn.setText("Non-Smoker");
        nonSmkrRadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // nonSmkrRadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(53, 53, 53)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nonSmkrRadBtn)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(smkrRadBtn))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(smkrRadBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nonSmkrRadBtn)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("Quote No.:");

        jLabel17.setText("Total:");

        idLbl.setText("...");

        totalLbl.setText("...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(idLbl)
                .addGap(80, 80, 80)
                .addComponent(jLabel17)
                .addGap(30, 30, 30)
                .addComponent(totalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(idLbl)
                    .addComponent(totalLbl))
                .addGap(29, 29, 29))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Slainte Health Insurance");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Personal Details");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Scheme Details");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Health Details");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Final Quotation");

        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        clearFormBtn.setText("Clear Form");
        clearFormBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFormBtnActionPerformed(evt);
            }
        });

        buyPolicyBtn.setText("Buy Policy");
        buyPolicyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyPolicyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearFormBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buyPolicyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateBtn)
                    .addComponent(clearFormBtn)
                    .addComponent(buyPolicyBtn))
                .addGap(30, 30, 30))
        );

        pack();
    }
    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
       //clear the text 
     // txtArea.setText("");
       
      // validateForm();
      validateForm();
      // checks if form is validated
      if(formValidated == true)
      {
        extractForm();
        customer1 = new Customer(firstName, surName, gender, age, previousHealthConditions, other, smoker);
        if(policyType.equals("Individual")){
            policy1 = new IndividualPolicy(id, policyType, hospitalCover, dayToDayExpense);
        }
        else if(policyType.equals("Corporate")){
            policy1 = new CorporatePolicy(id, policyType, hospitalCover, dayToDayExpense);
        }
        total = policy1.calculate(customer1);
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        newTotal = nf.format(total);
        totalLbl.setText(newTotal);
        System.out.println(total);
        System.out.println(newTotal);
      }
    }

    private void buyPolicyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyPolicyBtnActionPerformed
       summaryWindow.setVisible(true);
          //setting controls 
     BuyPriceSummaryTxt.setText(newTotal);
     NameSummaryTxt.setText(firstName + " " + surName);
     policyDetailsTxt.setText(policyType);
  
    }

    private void clearFormBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFormBtnActionPerformed
        // TODO add your handling code here:
        clearForm();
        id++;
        idLbl.setText(String.valueOf(id));
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        id=1;
        idLbl.setText(String.valueOf(id));
    }

    private void ClosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClosebtnActionPerformed
        summaryWindow.setVisible(false);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HealthInsuranceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthInsuranceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthInsuranceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthInsuranceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthInsuranceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JLabel BuyPriceSummaryTxt;
    private javax.swing.JButton Closebtn;
    private javax.swing.JLabel NameSummaryTxt;
    private javax.swing.JComboBox<String> ageCmb;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JButton buyPolicyBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton clearFormBtn;
    private javax.swing.JLabel customerNameLbl;
    private javax.swing.JComboBox<String> dayToDayComboBox;
    private javax.swing.JList<String> existingHealthConditionsTxtArea;
    private javax.swing.JRadioButton femaleRadBtn;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel fstNameLbl;
    private javax.swing.ButtonGroup genderBtnGrp;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JComboBox<String> hospitalCoverComboBox;
    private javax.swing.JLabel idLbl;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton maleRadBtn;
    private javax.swing.JRadioButton nonSmkrRadBtn;
    private javax.swing.JTextArea otherTextArea;
    private javax.swing.JComboBox<String> policyComboBox;
    private javax.swing.JLabel policyDetailsLbl;
    private javax.swing.JLabel policyDetailsTxt;
    private javax.swing.JLabel policyPriceLbl;
    private javax.swing.JLabel scndNameLbl;
    private javax.swing.JRadioButton smkrRadBtn;
    private javax.swing.ButtonGroup smokerBtnGrp;
    private javax.swing.JFrame summaryWindow;
    private javax.swing.JTextField surnameTxt;
    private javax.swing.JLabel totalLbl;
}
