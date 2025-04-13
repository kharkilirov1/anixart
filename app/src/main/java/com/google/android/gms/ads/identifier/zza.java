package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes.dex */
final class zza extends Thread {

    /* renamed from: b */
    public final /* synthetic */ Map f15005b;

    public zza(Map map) {
        this.f15005b = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f15005b;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(uri);
                    Log.w("HttpUrlPinger", sb.toString());
                }
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(uri);
            sb2.append(". ");
            sb2.append(message);
            Log.w("HttpUrlPinger", sb2.toString(), e);
        } catch (IndexOutOfBoundsException e3) {
            String message2 = e3.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message2).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(uri);
            sb3.append(". ");
            sb3.append(message2);
            Log.w("HttpUrlPinger", sb3.toString(), e3);
        } catch (RuntimeException e4) {
            e = e4;
            String message3 = e.getMessage();
            StringBuilder sb22 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message3).length());
            sb22.append("Error while pinging URL: ");
            sb22.append(uri);
            sb22.append(". ");
            sb22.append(message3);
            Log.w("HttpUrlPinger", sb22.toString(), e);
        }
    }
}
