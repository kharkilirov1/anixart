package com.google.android.gms.internal.p041firebaseauthapi;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzvb {
    /* renamed from: a */
    public static void m9443a(String str, zzue zzueVar, zzuy zzuyVar, Type type, zzui zzuiVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzueVar.mo9411u().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzuiVar.m9430a(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            try {
                bufferedOutputStream.write(bytes, 0, length);
                bufferedOutputStream.close();
                m9444b(httpURLConnection, zzuyVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            zzuyVar.mo9345a("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzuyVar.mo9345a("<<Network Error>>");
        } catch (IOException e2) {
            e = e2;
            zzuyVar.mo9345a(e.getMessage());
        } catch (NullPointerException e3) {
            e = e3;
            zzuyVar.mo9345a(e.getMessage());
        } catch (JSONException e4) {
            e = e4;
            zzuyVar.mo9345a(e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m9444b(HttpURLConnection httpURLConnection, zzuy zzuyVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                boolean z = false;
                InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb.append(readLine);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (responseCode >= 200 && responseCode < 300) {
                    z = true;
                }
                if (z) {
                    zzuyVar.mo9346b((zzuf) zzud.m9410a(sb2, type));
                } else {
                    zzuyVar.mo9345a((String) zzud.m9410a(sb2, String.class));
                }
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                httpURLConnection.disconnect();
                throw th3;
            }
        } catch (zzry e2) {
            e = e2;
            zzuyVar.mo9345a(e.getMessage());
            httpURLConnection.disconnect();
        } catch (SocketTimeoutException unused) {
            zzuyVar.mo9345a("TIMEOUT");
            httpURLConnection.disconnect();
        } catch (IOException e3) {
            e = e3;
            zzuyVar.mo9345a(e.getMessage());
            httpURLConnection.disconnect();
        }
    }
}
