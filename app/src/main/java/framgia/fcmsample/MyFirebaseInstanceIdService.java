package framgia.fcmsample;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by MyPC on 11/07/2017.
 */
public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        sendRegistrantionToServer(refreshedToken);
    }

    private void sendRegistrantionToServer(String refreshedToken) {
        //send Token to Server and save Database
    }
}
