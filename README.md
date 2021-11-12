# expo-noti-client 
[![Maven Central](https://img.shields.io/maven-central/v/uk.co.tnix.exponoticlient/expo-noti-client.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22uk.co.tnix.exponoticlient%22%20AND%20a:%22expo-noti-client%22)

Basic HTTP/2 client to interact with the expo notification service. Works both asynchronously and synchronously using the Java `HTTPClient` class. Allows sending custom mobile notifications through **Expo's Push API** using a device id gathered from your own mobile device, which works both for IOS and Android devices.

## Current Build 1.0.0 - Notes
Implementation to interact with Expo’s ticket service is not implemented yet. This part of the API can tell you if the notification has been sent, usually used when there is a high load and notifications are taking time to reach the user. This is currently being worked on.

## Installation
This Java module is synced with the central maven repository and can be installed in the following ways.

### Maven
```
<dependency>
  <groupId>uk.co.tnix.exponoticlient</groupId>
  <artifactId>expo-noti-client</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Gradle
```
implementation 'uk.co.tnix.exponoticlient:expo-noti-client:1.0.0'
```

### Other Installations
Visit https://search.maven.org/artifact/uk.co.tnix.exponoticlient/expo-noti-client/1.0.0/jar to see more information about this project and how to install it onto various java projects.

## Example Usage
Function to return a `ExpoNTicket` object which contains the success or failure of sending the notification to an example user, defined in the `String testToken` parameter.
```java
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
```
## Documentation
Full documentation of this module is not currently available but is being developed.
