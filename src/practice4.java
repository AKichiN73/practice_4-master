import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class practice4 extends JFrame
{
    int r1=0, r2=0;
    JButton realMadrid =new JButton("Real Madrid");
    JButton acMilan =new JButton("AC Milan");
    JLabel score =new JLabel("Result: 0 X 0");
    JLabel lastSc=new JLabel("Last Scorer: N/A");
    JLabel winner=new JLabel("Winner: ");
    Font fnt=new Font("Times new roman", Font.BOLD,15);
    Font fnt2=new Font("Times new roman",Font.BOLD,20);
    public practice4(){
        setLayout(null);
        score.setFont(fnt2);
        realMadrid.setFont(fnt);
        acMilan.setFont(fnt);
        winner.setFont(fnt);
        lastSc.setFont(fnt);
        score.setBounds(350,0,200,20);
        winner.setBounds(350,50,200,20);
        lastSc.setBounds(350,100,200,20);
        realMadrid.setBounds(100,400,200,20);
        acMilan.setBounds(500,400,200,20);
        add(score);
        add(realMadrid);
        add(acMilan);
        add(winner);
        add(lastSc);
        setSize(800,500);
        realMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                r1++;
                if(r1==5) {
                    winner.setText("Winner: Real Madrid");
                    realMadrid.setEnabled(false);
                    acMilan.setEnabled(false);
                }
                score.setText("Result: " + r1 + " X " + r2);
                lastSc.setText("Last Scorer: Real Madrid");
            }
        });
        acMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                r2++;
                if(r2==5) {
                    winner.setText("Winner: Milan");
                    realMadrid.setEnabled(false);
                    acMilan.setEnabled(false);
                }
                score.setText("Result: " + r1 + " X " + r2);
                lastSc.setText("Last Scorer: Milan");
            }
        });
    }

    public static void main(String[]args)
    {
        new practice4().setVisible(true);
    }
}