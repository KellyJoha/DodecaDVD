/*
 TUIO Java Console Example
 Copyright (c) 2005-2014 Martin Kaltenbrunner <martin@tuio.org>

 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files
 (the "Software"), to deal in the Software without restriction,
 including without limitation the rights to use, copy, modify, merge,
 publish, distribute, sublicense, and/or sell copies of the Software,
 and to permit persons to whom the Software is furnished to do so,
 subject to the following conditions:
 
 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.
 
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR
 ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Modificaciones de los IDs Por Kelly Johana Cordoba
kelly.johana.cordoba@correounivalle.edu.co
*/


import TUIO.*;


public class Dodecaedro implements TuioListener {
    OpenURL openURL;
    String URL;
    	
	public void addTuioObject(TuioObject tobj) {
		System.out.println("add obj "+tobj.getSymbolID()+" ("+tobj.getSessionID()+") "+tobj.getX()+" "+tobj.getY()+" "+tobj.getAngle());
                
                if (tobj.getSymbolID()== 0){
                    //Cancion We Will Rock You - Queen
                    URL ="https://www.youtube.com/watch?v=-tJYN-eG1zk";
                    openURL.openURL(URL);
                  }
                
                if (tobj.getSymbolID()== 1){
                    //Cancion I Was Made For Lovin' You - Kiss
                    URL ="https://www.youtube.com/watch?v=zlSFmotba2I";
                    openURL.openURL(URL);
                  }
                
                if (tobj.getSymbolID()== 2){
                    //Cancion I Want To Break Free - Queen
                    URL ="https://www.youtube.com/watch?v=f4Mc-NYPHaQ";
                    openURL.openURL(URL);
                  }
                
                if (tobj.getSymbolID()== 3){
                    //Cancion Uptown Funk ft. Bruno Mars - Mark Ronson
                    URL ="https://www.youtube.com/watch?v=OPf0YbXqDm0";
                    openURL.openURL(URL);
                  }
                
                if (tobj.getSymbolID()== 4){
                    //Cancion Rudeb -  MAGIC! 
                    URL ="https://www.youtube.com/watch?v=PIh2xe4jnpk";
                    openURL.openURL(URL);
                  }
                
                if (tobj.getSymbolID()== 5){
                    //Cancion Hello - Adele
                    URL ="https://www.youtube.com/watch?v=YQHsXMglC9A";
                    openURL.openURL(URL);
                  }
                
                if (tobj.getSymbolID()== 6){
                    //Cancion Happy - Pharrell Williams
                    URL ="https://www.youtube.com/watch?v=i0A3-wc0rpw&t=16s";
                    openURL.openURL(URL);
                  }
                
                if (tobj.getSymbolID()== 7){
                    //Cancion The Lazy Song - Bruno Mars
                    URL ="https://www.youtube.com/watch?v=fLexgOxsZu0";
                    openURL.openURL(URL);
                  }
                
                if (tobj.getSymbolID()== 8){
                    //Cancion Crazy - Aerosmith
                    URL ="https://www.youtube.com/watch?v=NMNgbISmF4I";
                    openURL.openURL(URL);
                  }
                
                if (tobj.getSymbolID()== 9){
                    //Cancion Rolling in the Deep - Adele
                    URL ="https://www.youtube.com/watch?v=rYEDA3JcQqw";
                    openURL.openURL(URL);
                  }
                
                if (tobj.getSymbolID()== 10){
                    //Cancion Just Give Me A Reason ft. Nate Ruess - Pink
                    URL ="https://www.youtube.com/watch?v=OpQFFLBMEPI";
                    openURL.openURL(URL);
                  }
                 
                if (tobj.getSymbolID()== 11){
                    //Cancion Thinking Out Loud - Ed Sheeran
                    URL ="https://www.youtube.com/watch?v=lp-EO5I60KA";
                    openURL.openURL(URL);
                  }
                
	}

	public void updateTuioObject(TuioObject tobj) {
		System.out.println("set obj "+tobj.getSymbolID()+" ("+tobj.getSessionID()+") "+tobj.getX()+" "+tobj.getY()+" "+tobj.getAngle()+" "+tobj.getMotionSpeed()+" "+tobj.getRotationSpeed()+" "+tobj.getMotionAccel()+" "+tobj.getRotationAccel());
                
        }
	
	public void removeTuioObject(TuioObject tobj) {
		System.out.println("del obj "+tobj.getSymbolID()+" ("+tobj.getSessionID()+")");	
	}

	public void addTuioCursor(TuioCursor tcur) {
		System.out.println("add cur "+tcur.getCursorID()+" ("+tcur.getSessionID()+") "+tcur.getX()+" "+tcur.getY());	
	}

	public void updateTuioCursor(TuioCursor tcur) {
		System.out.println("set cur "+tcur.getCursorID()+" ("+tcur.getSessionID()+") "+tcur.getX()+" "+tcur.getY()+" "+tcur.getMotionSpeed()+" "+tcur.getMotionAccel());
	}
	
	public void removeTuioCursor(TuioCursor tcur) {
		System.out.println("del cur "+tcur.getCursorID()+" ("+tcur.getSessionID()+")");	
	}

	public void addTuioBlob(TuioBlob tblb) {
		System.out.println("add blb "+tblb.getBlobID()+" ("+tblb.getSessionID()+") "+tblb.getX()+" "+tblb.getY()+" "+tblb.getAngle()+" "+tblb.getWidth()+" "+tblb.getHeight()+" "+tblb.getArea());	
	}
	
	public void updateTuioBlob(TuioBlob tblb) {
		System.out.println("set blb "+tblb.getBlobID()+" ("+tblb.getSessionID()+") "+tblb.getX()+" "+tblb.getY()+" "+tblb.getAngle()+" "+tblb.getWidth()+" "+tblb.getHeight()+" "+tblb.getArea()+" "+tblb.getMotionSpeed()+" "+tblb.getRotationSpeed()+" "+tblb.getMotionAccel()+" "+tblb.getRotationAccel());
	}
	
	public void removeTuioBlob(TuioBlob tblb) {
		System.out.println("del blb "+tblb.getBlobID()+" ("+tblb.getSessionID()+")");	
	}
	
	public void refresh(TuioTime frameTime) {
		System.out.println("frame "+frameTime.getFrameID()+" "+frameTime.getTotalMilliseconds());
	}

	public static void main(String argv[]) {
	
		int port = 3333;

		if (argv.length==1) {
			try { port = Integer.parseInt(argv[0]); }
			catch (Exception e) { System.out.println("usage: java TuioDump [port]"); }
		} else if (argv.length>1) System.out.println("usage: java TuioDump [port]");

		Dodecaedro dump = new Dodecaedro();
		TuioClient client = new TuioClient(port);

		System.out.println("listening to TUIO messages at port "+port);
		client.addTuioListener(dump);
		client.connect();
	}
}
