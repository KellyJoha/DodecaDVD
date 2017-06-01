import java.io.IOException;

/**
 *
 * @author Kelly Johana Cordoba
 * kelly.johana.cordoba@correounivalle.edu.co
 */
public class OpenURL {
    
     public static void openURL(String url) {
         
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else if (osName.startsWith("Mac OS X")) {
                Runtime.getRuntime().exec("open " + url);
            } else {
                System.out.println("Abrir el navegador e ir "+ url);
            }
        } catch (IOException e) {
            System.out.println("Problemas en abrir" + url);
            e.printStackTrace();
        }
    }
     
}
