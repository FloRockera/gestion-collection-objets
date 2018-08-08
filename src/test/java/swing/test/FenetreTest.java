package swing.test;

import javax.persistence.Table;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.Test;

@Test
public void FenetreTest extends JFrame {

	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");

	@Test
	public void FenetreTest() {
		this.setTitle("Animation");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		pan.add(bouton);
		this.setContentPane(pan);
		this.setVisible(true);
	}
}
