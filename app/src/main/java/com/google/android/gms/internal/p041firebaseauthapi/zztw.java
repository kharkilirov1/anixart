package com.google.android.gms.internal.p041firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.zzai;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zztw extends AsyncTask {

    /* renamed from: g */
    public static final Logger f16827g = new Logger("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a */
    public final String f16828a;

    /* renamed from: b */
    public final String f16829b;

    /* renamed from: c */
    public final WeakReference f16830c;

    /* renamed from: d */
    public final Uri.Builder f16831d;

    /* renamed from: e */
    public final String f16832e;

    /* renamed from: f */
    public final FirebaseApp f16833f;

    public zztw(String str, String str2, Intent intent, FirebaseApp firebaseApp, zzty zztyVar) {
        Preconditions.m8129d(str);
        this.f16828a = str;
        this.f16833f = firebaseApp;
        Preconditions.m8129d(str2);
        Objects.requireNonNull(intent, "null reference");
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        Preconditions.m8129d(stringExtra);
        Uri.Builder buildUpon = Uri.parse(zztyVar.mo9405g0(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        Objects.requireNonNull(str2, "null reference");
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f16829b = buildUpon.build().toString();
        this.f16830c = new WeakReference(zztyVar);
        this.f16831d = zztyVar.mo9406i1(intent, str, str2);
        this.f16832e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* renamed from: b */
    public static byte[] m9400b(InputStream inputStream, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zztv zztvVar) {
        String str;
        Uri.Builder builder;
        zzty zztyVar = (zzty) this.f16830c.get();
        String str2 = null;
        if (zztvVar != null) {
            str2 = zztvVar.f16825a;
            str = zztvVar.f16826b;
        } else {
            str = null;
        }
        if (zztyVar == null) {
            Logger logger = f16827g;
            Log.e(logger.f15834a, logger.m8206c("An error has occurred: the handler reference has returned null.", new Object[0]));
        } else if (TextUtils.isEmpty(str2) || (builder = this.f16831d) == null) {
            zztyVar.mo9404c4(this.f16828a, zzai.m12298a(str));
        } else {
            builder.authority(str2);
            zztyVar.mo9402A3(this.f16831d.build(), this.f16828a);
        }
    }

    @Override // android.os.AsyncTask
    @Nullable
    public final Object doInBackground(Object[] objArr) {
        String str;
        if (!TextUtils.isEmpty(this.f16832e)) {
            String str2 = this.f16832e;
            zztv zztvVar = new zztv();
            zztvVar.f16825a = str2;
            return zztvVar;
        }
        try {
            try {
                URL url = new URL(this.f16829b);
                zzty zztyVar = (zzty) this.f16830c.get();
                HttpURLConnection mo9403B1 = zztyVar.mo9403B1(url);
                mo9403B1.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
                mo9403B1.setConnectTimeout(60000);
                new zzui(zztyVar.mo9407u(), this.f16833f, zzug.m9413a().m9414b()).m9430a(mo9403B1);
                int responseCode = mo9403B1.getResponseCode();
                if (responseCode == 200) {
                    zzwp zzwpVar = new zzwp();
                    zzwpVar.m9466b(new String(m9400b(mo9403B1.getInputStream(), 128)));
                    for (String str3 : zzwpVar.f16968b) {
                        if (str3.endsWith("firebaseapp.com") || str3.endsWith("web.app")) {
                            zztv zztvVar2 = new zztv();
                            zztvVar2.f16825a = str3;
                            return zztvVar2;
                        }
                    }
                    return null;
                }
                try {
                } catch (IOException e2) {
                    f16827g.m8208e("Error parsing error message from response body in getErrorMessageFromBody. ".concat(e2.toString()), new Object[0]);
                }
                if (mo9403B1.getResponseCode() >= 400) {
                    InputStream errorStream = mo9403B1.getErrorStream();
                    str = errorStream == null ? "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again." : (String) zzud.m9410a(new String(m9400b(errorStream, 128)), String.class);
                    f16827g.m8205b(String.format("Error getting project config. Failed with %s %s", str, Integer.valueOf(responseCode)), new Object[0]);
                    zztv zztvVar3 = new zztv();
                    zztvVar3.f16826b = str;
                    return zztvVar3;
                }
                str = null;
                f16827g.m8205b(String.format("Error getting project config. Failed with %s %s", str, Integer.valueOf(responseCode)), new Object[0]);
                zztv zztvVar32 = new zztv();
                zztvVar32.f16826b = str;
                return zztvVar32;
            } catch (IOException e3) {
                f16827g.m8205b("IOException occurred: ".concat(String.valueOf(e3.getMessage())), new Object[0]);
                return null;
            }
        } catch (zzry e4) {
            f16827g.m8205b("ConversionException encountered: ".concat(String.valueOf(e4.getMessage())), new Object[0]);
            return null;
        } catch (NullPointerException e5) {
            f16827g.m8205b("Null pointer encountered: ".concat(String.valueOf(e5.getMessage())), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(Object obj) {
        onPostExecute(null);
    }
}
