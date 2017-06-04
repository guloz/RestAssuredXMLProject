package realm.common;

/**
 * Created by Ozeli on 04/06/2017.
 */
public class ToDoList {
    // TODO realmid 9,999 bug

//    java.lang.AssertionError:
//    Expected :createdRealmID not equalto getRealmId: 389
//    Actual   :389
    // TODO there seems tobe problem with logging
//    HTTP/1.1 201 Created
//    Server: Apache-Coyote/1.1
//    Content-Type: application/xml;charset=utf-8
//    Transfer-Encoding: chunked
//    Date: Sun, 04 Jun 2017 18:56:14 GMT
//
//            <realm id="461" name="74ebc98d-c2cc-4689-aac4-6a103177c49e">
//  <key>433E67E784B043439CDCF80805439A38</key>
//</realm>
//    HTTP/1.1 201 Created
//    Server: Apache-Coyote/1.1
//    Content-Type: application/xml;charset=utf-8
//    Transfer-Encoding: chunked
//    Date: Sun, 04 Jun 2017 18:56:14 GMT
//
//            <realm id="461" name="74ebc98d-c2cc-4689-aac4-6a103177c49e">
//  <key>433E67E784B043439CDCF80805439A38</key>
//</realm>
//    HTTP/1.1 200 OK
//    Server: Apache-Coyote/1.1
//    Content-Type: application/xml
//    Transfer-Encoding: chunked
//    Date: Sun, 04 Jun 2017 18:56:14 GMT
//
//            <realm id="461" name="74ebc98d-c2cc-4689-aac4-6a103177c49e">
//  <key>433E67E784B043439CDCF80805439A38</key>
//</realm>
//    HTTP/1.1 200 OK
//    Server: Apache-Coyote/1.1
//    Content-Type: application/xml
//    Transfer-Encoding: chunked
//    Date: Sun, 04 Jun 2017 18:56:14 GMT
//
//            <realm id="461" name="74ebc98d-c2cc-4689-aac4-6a103177c49e">
//  <key>433E67E784B043439CDCF80805439A38</key>
//</realm>
//    HTTP/1.1 204 No Content
//    Server: Apache-Coyote/1.1
//    Date: Sun, 04 Jun 2017 18:56:14 GMT
//    HTTP/1.1 204 No Content
//    Server: Apache-Coyote/1.1
//    Date: Sun, 04 Jun 2017 18:56:14 GMT
}
