package com.google.android.gms.internal.p041firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public interface zzty {

    /* renamed from: A1 */
    public static final Logger f16834A1 = new Logger("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    /* renamed from: A3 */
    void mo9402A3(Uri uri, String str);

    /* renamed from: B1 */
    HttpURLConnection mo9403B1(URL url);

    /* renamed from: c4 */
    void mo9404c4(String str, Status status);

    /* renamed from: g0 */
    String mo9405g0(String str);

    /* renamed from: i1 */
    Uri.Builder mo9406i1(Intent intent, String str, String str2);

    /* renamed from: u */
    Context mo9407u();
}
