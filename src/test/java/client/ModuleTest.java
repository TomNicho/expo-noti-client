package client;

public class ModuleTest 
{
    // @Test
    // public void PushSyncExpoCall()
    // {
    //     String testToken = "12345678-abcd-efgh-ijkl-0987654321ab";
    //     ExpoNClient client = new ExpoNClient();

    //     if (ExpoNClient.isExpoPushToken(testToken)) {
    //         List<String> tokens = new ArrayList<String>();
    //         tokens.add(testToken);

    //         ExpoNMessage message = ExpoNMessage.builder()
    //             .setTo(tokens)
    //             .setBody("Hello")
    //             .setTitle("Title")
    //             .setSubtitle("Subtitle")
    //         .build();

    //         try {
    //             ExpoNTicket resp = client.sendExpoPushSync(message);
    //             assertEquals("{\"data\":[{\"details\":{\"error\":\"DeviceNotRegistered\"}}]}", resp.toJson());
    //             return;
    //         } catch (Exception e) {
    //             fail();
    //         }
    //     }
        
    // }

    // @Test
    // public void PushAsyncExpoCall() {
    //     String testToken = "12345678-abcd-efgh-ijkl-0987654321ab";
    //     ExpoNClient client = new ExpoNClient();

    //     if (ExpoNClient.isExpoPushToken(testToken)) {
    //         List<String> tokens = new ArrayList<String>();
    //         tokens.add(testToken);

    //         ExpoNMessage message = ExpoNMessage.builder()
    //             .setTo(tokens)
    //             .setBody("Hello")
    //             .setTitle("Title")
    //             .setSubtitle("Subtitle")
    //         .build();

    //         try {
    //             ExpoNTicket resp = client.sendExpoPushAsync(message).join();
    //             assertEquals("{\"data\":[{\"details\":{\"error\":\"DeviceNotRegistered\"}}]}", resp.toJson());
    //             return;
    //         } catch (Exception e) {
    //             fail();
    //         }
    //     }
    // }

    // @Test
    // public void ReceiptSyncExpoCall()
    // {
    //     String testToken = "12345678-abcd-efgh-ijkl-0987654321ab";
    //     ExpoNClient client = new ExpoNClient();

    //     if (ExpoNClient.isExpoPushToken(testToken)) {
    //         List<String> tokens = new ArrayList<>();
    //         tokens.add(testToken);

    //         ExpoNPush testPush = ExpoNPush.builder()
    //             .setIds(tokens)
    //         .build();

    //         try {
    //             ExpoNStatus resp = client.sendExpoReceiptSync(testPush);
    //             assertEquals("{\"data\":[{}]}", resp.toJson());
    //             return;
    //         } catch (Exception e) {
    //             System.out.println(e.toString());
    //             fail();
    //         }
    //     }
    // }

    // @Test
    // public void ReceiptAsyncExpoCall() {
    //     String testToken = "12345678-abcd-efgh-ijkl-0987654321ab";
    //     ExpoNClient client = new ExpoNClient();

    //     if (ExpoNClient.isExpoPushToken(testToken)) {
    //         List<String> tokens = new ArrayList<>();
    //         tokens.add(testToken);

    //         ExpoNPush testRec = ExpoNPush.builder()
    //             .setIds(tokens)
    //         .build();

    //         try {
    //             ExpoNStatus resp = client.sendExpoReceiptAsync(testRec).join();
    //             assertEquals("{\"data\":[{}]}", resp.toJson());
    //             return;
    //         } catch (Exception e) {
    //             fail();
    //         }
    //     }
    // }     
}