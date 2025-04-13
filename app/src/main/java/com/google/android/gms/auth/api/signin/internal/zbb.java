package com.google.android.gms.auth.api.signin.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-auth@@20.2.0 */
/* loaded from: classes.dex */
public final class zbb implements Runnable {

    /* renamed from: d */
    public static final Logger f15235d = new Logger("RevokeAccessOperation", new String[0]);

    /* renamed from: b */
    public final String f15236b;

    /* renamed from: c */
    public final StatusPendingResult f15237c;

    public zbb(String str) {
        Preconditions.m8129d(str);
        this.f15236b = str;
        this.f15237c = new StatusPendingResult(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f15376i;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f15236b).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f15374g;
            } else {
                Logger logger = f15235d;
                Log.e(logger.f15834a, logger.m8206c("Unable to revoke access!", new Object[0]));
            }
            f15235d.m8204a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e2) {
            f15235d.m8205b("IOException when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        } catch (Exception e3) {
            f15235d.m8205b("Exception when revoking access: ".concat(String.valueOf(e3.toString())), new Object[0]);
        }
        this.f15237c.mo7882a(status);
    }
}
