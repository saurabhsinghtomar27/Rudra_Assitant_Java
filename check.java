import java.awt.Desktop;
import java.io.File;
import java.net.URI;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;


 class check {

     check() {
         Configuration config = new Configuration();
         config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us"); //To get the language
         config.setDictionaryPath("src\\dic1.dic"); //setting dic path
         config.setLanguageModelPath("src\\lm1.lm"); //setting language model path

         try {
             LiveSpeechRecognizer rec = new LiveSpeechRecognizer(config);
             rec.startRecognition(true);
             Desktop desk = Desktop.getDesktop();

             while (rec.getResult() != null) {
                 String result = rec.getResult().getHypothesis();
                 System.out.println(result);
                 if (result.toLowerCase().equals("google")) {

                     URI uri = new URI("https://www.google.com");
                     System.out.println("Opening: " + result);
                     desk.browse(uri);

                 } else if (result.toLowerCase().equals("youtube")) {

                     URI uri = new URI("https://www.youtube.com");
                     System.out.println("Opening: " + result);
                     desk.browse(uri);
                 } else if (result.toLowerCase().equals("facebook")) {

                     URI uri = new URI("https://www.facebook.com");
                     System.out.println("Opening: " + result);
                     desk.browse(uri);
                 } else if (result.toLowerCase().equals("github")) {

                     URI uri = new URI("https://www.github.com");
                     System.out.println("Opening: " + result);
                     desk.browse(uri);
                 } else if (result.toLowerCase().equals("gmail")) {

                     URI uri = new URI("https://www.gmail.com");
                     System.out.println("Opening: " + result);
                     desk.browse(uri);
                 } else if (result.toLowerCase().equals("hackerrank")) {

                     URI uri = new URI("https://www.hackerrank.com");
                     System.out.println("Opening: " + result);
                     desk.browse(uri);
                 } else if (result.toLowerCase().equals("whatsapp")) {

                     URI uri = new URI("https://web.whatsapp.com/");
                     System.out.println("Opening: " + result);
                     desk.browse(uri);
                 } else if (result.toLowerCase().equals("chatgpt")) {
                     URI uri = new URI("https://chat.openai.com/");
                     System.out.println("Opening: " + result);
                     desk.browse(uri);
                 } else if (result.toLowerCase().equals("gemini")) {
                     URI uri = new URI("https://gemini.google.com/");
                     System.out.println("Opening: " + result);
                     desk.browse(uri);
                 } else if (result.toLowerCase().equals("vscode")) {
                     File f1 = new File("C://Users//Saura//AppData//Roaming//Microsoft//Windows//Start Menu//Programs//Visual Studio Code//Visual Studio Code.lnk");
                     desk.open(f1);
                 } else if (result.toLowerCase().equals("postman")) {
                     File f2 = new File("C:/Users/Saura/AppData/Local/Postman/Postman.exe");
                     desk.open(f2);
                 }
             }
         } catch (Exception e) {
             System.out.println("error");
             System.err.println(e);
         }


     }
 }


