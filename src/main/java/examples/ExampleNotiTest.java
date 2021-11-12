package examples;

import java.util.ArrayList;
import java.util.List;

import client.ExpoNClient;
import client.types.ExpoNMessage;
import client.types.ExpoNTicket;

public class ExampleNotiTest {
    public ExpoNTicket PushExampleAsync(String testToken) {

        //Creating new client object to send the information to Expo's push API
        ExpoNClient client = new ExpoNClient();

        //Check if this is a valid token, this token is found from your device expo notification token, see the expo docs
        if (ExpoNClient.isExpoPushToken(testToken)) {
            List<String> tokens = new ArrayList<>();
            tokens.add(testToken);

            //Create a message objects which will send the notifcation information to the API
            ExpoNMessage message = ExpoNMessage.builder()
                .setTo(tokens)
                .setBody("Hello")
                .setTitle("Title")
                .setSubtitle("Subtitle")
            .build();

            try {
            
                //Send the message data, this is using async but joined straight away
                ExpoNTicket resp = client.sendExpoPushAsync(message).join();
                return resp;   
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return null;
    }

}
