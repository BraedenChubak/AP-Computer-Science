package Q4.VirtualPetLab;
import javax.swing.*;
import java.awt.*;
import java.util.Base64;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JButton feedButton;
    private JButton playButton;
    private JButton catButton;
    private JButton dogButton;
    private JButton sleepButton;
    private JLabel statusLabel;
    private JLabel imageLabel;
    private JComboBox<String> petSelectorComboBox;
    private JButton foxButton;
    // TODO: add adoption buttons
    // Pet list
    private PetManager petManager = new PetManager();

    public MainForm() {
        super("Virtual Pet Simulator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(800, 600));
        this.setMinimumSize(new Dimension(800, 600));
        this.setMaximumSize(new Dimension(800, 600));
        this.setResizable(false);
        this.pack();

        // Initialize starting pets
        petManager.addPet(new Dog("Buddy"));
        petManager.addPet(new Cat("Whiskers"));
        this.updatePetList();
        petSelectorComboBox.setSelectedItem(null);  // Clear selection after populating

        // Feed button action
        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getSelectedPet().feed();
                updateStatusLabel(getSelectedPet().getStatus());
                waitButtons(1);
            }
        });

        // Play button action
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getSelectedPet().play();
                updateStatusLabel(getSelectedPet().getStatus());
                waitButtons(1);
            }
        });

        // Sleep button action
        sleepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getSelectedPet().sleep();
                updateStatusLabel(getSelectedPet().getStatus());
                waitButtons(1);
            }
        });

        // Pet selector action
        petSelectorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Make sure the action event isn't triggered by the removeAllItems() call
                if (petSelectorComboBox.getSelectedIndex() == -1) return;
                updateStatusLabel(getSelectedPet().getStatus());
                setPetImage(getSelectedPet().getImage());
            }
        });

        // TODO: Implement adoption button actions
        catButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String catName = JOptionPane.showInputDialog("Enter new cat name: ");
                if (!catName.trim().isEmpty()) {
                    petManager.addPet(new Cat(catName));
                }
                updatePetList();
            }
        });

        dogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dogName = JOptionPane.showInputDialog("Enter new dog name: ");
                if (!dogName.trim().isEmpty()) {
                    petManager.addPet(new Dog(dogName));
                }
                updatePetList();
            }
        });

        foxButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String foxName = JOptionPane.showInputDialog("Enter new fox name: ");
                if (!foxName.trim().isEmpty()) {
                    petManager.addPet(new Fox(foxName));
                }
                updatePetList();
            }
        });


    }

    public void updateStatusLabel(String status) {
        statusLabel.setText("Pet Status: " + status);
    }

    public void updatePetList() {
        petSelectorComboBox.removeAllItems();  // Clear existing items
        // TODO: Update petSelectorComboBox with pet names from petManager
        // After adding the pet, set the selected index to the last item (petManager.getPets().size() - 1)
        for (Pet bob : petManager.getPets()) {
            petSelectorComboBox.addItem(bob.getName());
        }
        petSelectorComboBox.setSelectedIndex(petManager.getPets().size() - 1);
    }

    public Pet getSelectedPet() {
        return petManager.getPets().get(petSelectorComboBox.getSelectedIndex());
    }



    /* ========== DO NOT MODIFY BELOW ========== */
    public void waitButtons(int seconds) {
        // Disable buttons
        feedButton.setEnabled(false);
        playButton.setEnabled(false);
        sleepButton.setEnabled(false);

        // Set a timer to re-enable the buttons after N seconds (1000 ms = 1 second)
        Timer timer = new Timer(seconds * 1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedButton.setEnabled(true);
                playButton.setEnabled(true);
                sleepButton.setEnabled(true);
            }
        });
        timer.setRepeats(false); // Ensure the timer only runs once
        timer.start();
    }

    public void setPetImage(String base64Image) {
        try {
            byte[] imageBytes = Base64.getDecoder().decode(base64Image);
            ImageIcon icon = new ImageIcon(imageBytes);
            Image image = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            icon = new ImageIcon(image);

            imageLabel.setIcon(icon);
            imageLabel.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            imageLabel.setIcon(null);
            imageLabel.setText('❌' + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
}
