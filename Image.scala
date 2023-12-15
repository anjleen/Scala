import javax.swing.{ImageIcon, JFrame, JLabel, WindowConstants}

object DisplayImage {
  def main(args: Array[String]): Unit = {
    val imagePath = "C:/Users/ANJLEEN TIRKEY/Downloads/buildings.jpg"
    val frame = new JFrame("Image Display")
    val icon = new ImageIcon(imagePath)
    val label = new JLabel(icon)
    frame.getContentPane.add(label)
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
    frame.setSize(300, 300)
    frame.setVisible(true)
  }
}