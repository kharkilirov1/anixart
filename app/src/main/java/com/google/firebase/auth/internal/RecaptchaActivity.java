package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p041firebaseauthapi.zztw;
import com.google.android.gms.internal.p041firebaseauthapi.zzty;
import com.google.android.gms.internal.p041firebaseauthapi.zzuj;
import com.google.android.gms.internal.p041firebaseauthapi.zzvr;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public class RecaptchaActivity extends FragmentActivity implements zzty {

    /* renamed from: c */
    public static final ExecutorService f22351c = com.google.android.gms.internal.p041firebaseauthapi.zzf.f16475b.mo8883a(2);

    /* renamed from: d */
    public static long f22352d = 0;

    /* renamed from: e */
    public static final zzbm f22353e = zzbm.f22405b;

    /* renamed from: b */
    public boolean f22354b = false;

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzty
    /* renamed from: A3 */
    public final void mo9402A3(@NonNull Uri uri, @NonNull String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            m12296s4();
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
            Logger logger = zzty.f16834A1;
            Log.e(logger.f15834a, logger.m8206c("Error generating connection", new Object[0]));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzty
    /* renamed from: c4 */
    public final void mo9404c4(@NonNull String str, @Nullable Status status) {
        if (status == null) {
            m12296s4();
        } else {
            m12297t4(status);
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
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        FirebaseApp m12213d = FirebaseApp.m12213d(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(m12213d);
        zzj zzjVar = zzj.f22417a;
        Context applicationContext = getApplicationContext();
        synchronized (zzjVar) {
            Preconditions.m8129d(str);
            Preconditions.m8129d(uuid);
            SharedPreferences m12320b = zzj.m12320b(applicationContext, str);
            zzj.m12319a(m12320b);
            SharedPreferences.Editor edit = m12320b.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", uuid), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", uuid), stringExtra3);
            edit.apply();
        }
        String m12323c = zzk.m12321a(getApplicationContext(), m12213d.m12218e()).m12323c();
        String str3 = null;
        if (TextUtils.isEmpty(m12323c)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            m12297t4(zzai.m12298a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.f22313h) {
        }
        if (TextUtils.isEmpty(null)) {
            str3 = zzuj.m9431a();
        }
        return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", m12323c);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@NonNull Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            m12296s4();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f22352d < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f22352d = currentTimeMillis;
        if (bundle != null) {
            this.f22354b = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NonNull Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        String string;
        boolean isEmpty;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f22354b) {
                m12296s4();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                new zztw(packageName, Hex.m8241a(AndroidUtilsLight.m8232a(this, packageName), false).toLowerCase(Locale.US), intent, FirebaseApp.m12213d(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME")), this).executeOnExecutor(f22351c, new Void[0]);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName + " " + e2.toString());
                mo9404c4(packageName, null);
            }
            this.f22354b = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            m12297t4(zzbl.m12313b(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            m12296s4();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        zzj zzjVar = zzj.f22417a;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent2.getStringExtra("eventId");
        synchronized (zzjVar) {
            Preconditions.m8129d(packageName2);
            Preconditions.m8129d(stringExtra2);
            SharedPreferences m12320b = zzj.m12320b(applicationContext, packageName2);
            String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", stringExtra2);
            String string2 = m12320b.getString(format, null);
            String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", stringExtra2);
            string = m12320b.getString(format2, null);
            SharedPreferences.Editor edit = m12320b.edit();
            edit.remove(format);
            edit.remove(format2);
            edit.apply();
            isEmpty = TextUtils.isEmpty(string2);
        }
        String str = isEmpty ? null : string;
        if (TextUtils.isEmpty(str)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            m12297t4(zzai.m12298a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = zzk.m12321a(getApplicationContext(), FirebaseApp.m12213d(str).m12218e()).m12322b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f22352d = 0L;
        this.f22354b = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (LocalBroadcastManager.m3279a(this).m3280b(intent3)) {
            f22353e.m12314a(this);
        } else {
            SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            edit2.putString("recaptchaToken", queryParameter);
            edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit2.putLong("timestamp", System.currentTimeMillis());
            edit2.commit();
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f22354b);
    }

    /* renamed from: s4 */
    public final void m12296s4() {
        f22352d = 0L;
        this.f22354b = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.m3279a(this).m3280b(intent);
        f22353e.m12314a(this);
        finish();
    }

    /* renamed from: t4 */
    public final void m12297t4(Status status) {
        f22352d = 0L;
        this.f22354b = false;
        Intent intent = new Intent();
        Map map = zzbl.f22404a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.m3279a(this).m3280b(intent);
        f22353e.m12314a(this);
        finish();
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzty
    @NonNull
    /* renamed from: u */
    public final Context mo9407u() {
        return getApplicationContext();
    }
}
