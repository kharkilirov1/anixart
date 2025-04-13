package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p041firebaseauthapi.zztw;
import com.google.android.gms.internal.p041firebaseauthapi.zzty;
import com.google.android.gms.internal.p041firebaseauthapi.zzvr;
import com.google.android.gms.internal.p041firebaseauthapi.zzxq;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@KeepName
/* loaded from: classes2.dex */
public class GenericIdpActivity extends FragmentActivity implements zzty {

    /* renamed from: d */
    public static long f22347d;

    /* renamed from: e */
    public static final zzbm f22348e = zzbm.f22405b;

    /* renamed from: b */
    public final Executor f22349b = com.google.android.gms.internal.p041firebaseauthapi.zzf.f16475b.mo8883a(1);

    /* renamed from: c */
    public boolean f22350c = false;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzty
    /* renamed from: A3 */
    public final void mo9402A3(@NonNull Uri uri, @NonNull String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            m12293t4();
            return;
        }
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            startActivity(intent);
            return;
        }
        CustomTabsIntent m1024a = new CustomTabsIntent.Builder().m1024a();
        m1024a.f1733a.addFlags(1073741824);
        m1024a.f1733a.addFlags(268435456);
        m1024a.f1733a.setData(uri);
        ContextCompat.m1676i(this, m1024a.f1733a, m1024a.f1734b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzty
    @Nullable
    /* renamed from: B1 */
    public final HttpURLConnection mo9403B1(@NonNull URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzty
    /* renamed from: c4 */
    public final void mo9404c4(@NonNull String str, @Nullable Status status) {
        if (status == null) {
            m12293t4();
        } else {
            m12294u4(status);
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzty
    @NonNull
    /* renamed from: g0 */
    public final String mo9405g0(@NonNull String str) {
        return zzvr.m9463b(str);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzty
    @Nullable
    /* renamed from: i1 */
    public final Uri.Builder mo9406i1(@NonNull Intent intent, @NonNull String str, @NonNull String str2) {
        return m12292s4(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@NonNull Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            m12293t4();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f22347d < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f22347d = currentTimeMillis;
        if (bundle != null) {
            this.f22350c = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NonNull Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        String lowerCase;
        FirebaseApp m12213d;
        Object obj;
        super.onResume();
        zzi zziVar = null;
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f22350c) {
                m12293t4();
                return;
            }
            String packageName = getPackageName();
            try {
                lowerCase = Hex.m8241a(AndroidUtilsLight.m8232a(this, packageName), false).toLowerCase(Locale.US);
                m12213d = FirebaseApp.m12213d(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                obj = zzvr.f16907a;
                m12213d.m12217a();
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + e2.toString());
                mo9404c4(packageName, null);
            }
            if (((SimpleArrayMap) obj).containsKey(m12213d.f22261c.f22273a)) {
                m12213d.m12217a();
                zzvr.m9462a(m12213d.f22261c.f22273a);
                throw null;
            }
            new zztw(packageName, lowerCase, getIntent(), m12213d, this).executeOnExecutor(this.f22349b, new Void[0]);
            this.f22350c = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            m12294u4(zzbl.m12313b(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            m12293t4();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        synchronized (zzj.f22417a) {
            Preconditions.m8129d(packageName2);
            Preconditions.m8129d(stringExtra2);
            SharedPreferences m12320b = zzj.m12320b(this, packageName2);
            String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", stringExtra2);
            String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", stringExtra2);
            String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", stringExtra2);
            String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", stringExtra2);
            String string = m12320b.getString(format, null);
            String string2 = m12320b.getString(format2, null);
            String string3 = m12320b.getString(format3, null);
            String string4 = m12320b.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = m12320b.getString(format4, null);
            SharedPreferences.Editor edit = m12320b.edit();
            edit.remove(format);
            edit.remove(format2);
            edit.remove(format3);
            edit.remove(format4);
            edit.apply();
            if (string != null && string2 != null && string3 != null) {
                zziVar = new zzi(string, string2, string3, string4, string5);
            }
        }
        if (zziVar == null) {
            m12293t4();
        }
        if (booleanExtra) {
            stringExtra = zzk.m12321a(getApplicationContext(), FirebaseApp.m12213d(zziVar.f22416e).m12218e()).m12322b(stringExtra);
        }
        zzxq zzxqVar = new zzxq(zziVar, stringExtra);
        String str = zziVar.f22415d;
        String str2 = zziVar.f22413b;
        zzxqVar.f17058o = str;
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str2) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str2) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str2)) {
            Log.e("GenericIdpActivity", "unsupported operation: ".concat(str2));
            m12293t4();
            return;
        }
        f22347d = 0L;
        this.f22350c = false;
        Intent intent2 = new Intent();
        Parcel obtain = Parcel.obtain();
        zzxqVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str2);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (LocalBroadcastManager.m3279a(this).m3280b(intent2)) {
            f22348e.m12314a(this);
        } else {
            SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            Parcel obtain2 = Parcel.obtain();
            zzxqVar.writeToParcel(obtain2, 0);
            byte[] marshall2 = obtain2.marshall();
            obtain2.recycle();
            edit2.putString("verifyAssertionRequest", Base64Utils.m8237b(marshall2));
            edit2.putString("operation", str2);
            edit2.putString("tenantId", str);
            edit2.putLong("timestamp", System.currentTimeMillis());
            edit2.commit();
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f22350c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r8 = r14.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:
    
        if (r15 >= r11) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
    
        r14 = r8[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        if (r14 < 'A') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        if (r14 > 'Z') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r17 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        r8[r15] = (char) (r14 ^ ' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        r14 = java.lang.String.valueOf(r8);
     */
    @androidx.annotation.Nullable
    /* renamed from: s4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri.Builder m12292s4(@androidx.annotation.NonNull android.net.Uri.Builder r19, @androidx.annotation.NonNull android.content.Intent r20, @androidx.annotation.NonNull java.lang.String r21, @androidx.annotation.NonNull java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.internal.GenericIdpActivity.m12292s4(android.net.Uri$Builder, android.content.Intent, java.lang.String, java.lang.String):android.net.Uri$Builder");
    }

    /* renamed from: t4 */
    public final void m12293t4() {
        f22347d = 0L;
        this.f22350c = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (LocalBroadcastManager.m3279a(this).m3280b(intent)) {
            f22348e.m12314a(this);
        } else {
            f22348e.m12315b(this, zzai.m12298a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzty
    @NonNull
    /* renamed from: u */
    public final Context mo9407u() {
        return getApplicationContext();
    }

    /* renamed from: u4 */
    public final void m12294u4(Status status) {
        f22347d = 0L;
        this.f22350c = false;
        Intent intent = new Intent();
        Map map = zzbl.f22404a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (LocalBroadcastManager.m3279a(this).m3280b(intent)) {
            f22348e.m12314a(this);
        } else {
            f22348e.m12315b(getApplicationContext(), status);
        }
        finish();
    }
}
