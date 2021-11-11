# expo-noti-client 

**Basic HTTP/2 client to interact with the expo notification service**

```
public void PushAsyncExpoCall() {
        String testToken = "12345678-abcd-efgh-ijkl-0987654321ab";
        ExpoNClient client = new ExpoNClient();

        if (ExpoNClient.isExpoPushToken(testToken)) {
            List<String> tokens = new ArrayList<>();
            tokens.add(testToken);

            ExpoNMessage message = ExpoNMessage.builder()
                .setTo(tokens)
                .setBody("Hello")
                .setTitle("Title")
                .setSubtitle("Subtitle")
            .build();

            try {
                ExpoNTicket resp = client.sendExpoPushAsync(message).join();
                assertEquals("{\"data\":[{\"details\":{\"error\":\"DeviceNotRegistered\"}}]}", resp.toJson());
                return;
            } catch (Exception e) {
                fail();
            }
        }
    }
```