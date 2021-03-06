/*
 * TextareaCustomizer.java
 *
 * Created on January 26, 2009, 3:07 PM
 */

package org.netbeans.modules.web.stripes.palette.items;

import org.netbeans.modules.web.stripes.palette.CodeSnippet;
import org.netbeans.modules.web.stripes.palette.CodeSnippetCustomizer;

/**
 *
 * @author  Josef Sustacek
 */
public class TextareaCustomizer extends CodeSnippetCustomizer {

    /** Creates new form TextareaCustomizer */
    public TextareaCustomizer(CodeSnippet codeSnippet) {
        super(codeSnippet);
        
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rows = new javax.swing.JSpinner();
        colls = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        disabledBox = new javax.swing.JCheckBox();
        readonlyBox = new javax.swing.JCheckBox();

        jLabel1.setText(org.openide.util.NbBundle.getMessage(TextareaCustomizer.class, "TextareaCustomizer.jLabel1.text")); // NOI18N

        nameText.setText(org.openide.util.NbBundle.getMessage(TextareaCustomizer.class, "TextareaCustomizer.nameText.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(TextareaCustomizer.class, "TextareaCustomizer.jLabel2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(TextareaCustomizer.class, "TextareaCustomizer.jLabel3.text")); // NOI18N

        rows.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(4), Integer.valueOf(0), null, Integer.valueOf(1)));

        colls.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(20), Integer.valueOf(0), null, Integer.valueOf(1)));

        jLabel4.setText(org.openide.util.NbBundle.getMessage(TextareaCustomizer.class, "TextareaCustomizer.jLabel4.text")); // NOI18N

        disabledBox.setText(org.openide.util.NbBundle.getMessage(TextareaCustomizer.class, "TextareaCustomizer.disabledBox.text")); // NOI18N

        readonlyBox.setText(org.openide.util.NbBundle.getMessage(TextareaCustomizer.class, "TextareaCustomizer.readonlyBox.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disabledBox)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rows, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(readonlyBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(colls)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disabledBox)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(readonlyBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(colls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner colls;
    private javax.swing.JCheckBox disabledBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameText;
    private javax.swing.JCheckBox readonlyBox;
    private javax.swing.JSpinner rows;
    // End of variables declaration//GEN-END:variables

    @Override
    protected void evaluateInput() {
        codeSnippet.setProperty(Textarea.NAME, nameText.getText());
        codeSnippet.setProperty(Textarea.ROWS, rows.getValue().toString());
        codeSnippet.setProperty(Textarea.COLLS, colls.getValue().toString());
        codeSnippet.setProperty(Text.DISABLED, disabledBox.isSelected() ? "disabled" : "");
        codeSnippet.setProperty(Text.READONLY, readonlyBox.isSelected() ? "readonly" : "");
    }

}
