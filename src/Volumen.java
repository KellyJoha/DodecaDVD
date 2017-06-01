
/**
 *
 * @author KellyJ
 * 
 */

public class Volumen {
   
 public static void volumen() {
//      int url = 10;
//         String osName = System.getProperty("os.name");
//        try {
//            if (osName.startsWith("Windows")) {
//                Runtime.getRuntime().exec("C:/Windows/System32/SndVol.exe" + url);
//                Process p = Runtime.getRuntime().exec("amixer set Master 70%");;
////                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url + "%");
//            } 
//            else {
//                System.out.println("Failed to strat a Sound");
//            }
//        } catch (IOException e) {
//            //System.out.println("Failed to start a browser to open the url " + SndVolSSO);
//            e.printStackTrace();
//        }

//////Mixer.Info [] mixers = AudioSystem.getMixerInfo();
//////System.out.println("There are " + mixers.length + " mixer info objects");
//////for (Mixer.Info mixerInfo : mixers)
//////{
//////    System.out.println("mixer name: " + mixerInfo.getName());
//////    Mixer mixer = AudioSystem.getMixer(mixerInfo);
//////    Line.Info [] lineInfos = mixer.getSourceLineInfo();
//////    for (Line.Info lineInfo : lineInfos)
//////    {
//////        System.out.println("  Line.Info: " + lineInfo);
//////        try {
//////            Line line = mixer.getLine(lineInfo);
//////            FloatControl volCtrl = 
//////                (FloatControl)line.getControl(FloatControl.Type.MASTER_GAIN);
//////            System.out.println("    volCtrl.getValue() = " + volCtrl.getValue());
//////        } catch (LineUnavailableException e) {
//////            e.printStackTrace();
//////        } catch (IllegalArgumentException iaEx)
//////        {
//////            System.out.println("    " + iaEx);
//////        }
//////    }
//////}
    }
    public static void main(String argv[]) {
	       volumen();
		
	}
    
}
