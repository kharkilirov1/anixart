package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class Storage {

    /* renamed from: c */
    public static final Lock f15231c = new ReentrantLock();

    /* renamed from: d */
    @Nullable
    @GuardedBy
    public static Storage f15232d;

    /* renamed from: a */
    public final Lock f15233a = new ReentrantLock();

    /* renamed from: b */
    @GuardedBy
    public final SharedPreferences f15234b;

    @VisibleForTesting
    public Storage(Context context) {
        this.f15234b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static Storage m7866a(@NonNull Context context) {
        Objects.requireNonNull(context, "null reference");
        Lock lock = f15231c;
        ((ReentrantLock) lock).lock();
        try {
            if (f15232d == null) {
                f15232d = new Storage(context.getApplicationContext());
            }
            Storage storage = f15232d;
            ((ReentrantLock) lock).unlock();
            return storage;
        } catch (Throwable th) {
            ((ReentrantLock) f15231c).unlock();
            throw th;
        }
    }

    /* renamed from: g */
    public static final String m7867g(String str, String str2) {
        return C0000a.m21r(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    @Nullable
    @KeepForSdk
    /* renamed from: b */
    public GoogleSignInAccount m7868b() {
        String m7871e;
        String m7871e2 = m7871e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m7871e2) || (m7871e = m7871e(m7867g("googleSignInAccount", m7871e2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m7853n(m7871e);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    @KeepForSdk
    /* renamed from: c */
    public GoogleSignInOptions m7869c() {
        String m7871e;
        String m7871e2 = m7871e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m7871e2) || (m7871e = m7871e(m7867g("googleSignInOptions", m7871e2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m7857n(m7871e);
        } catch (JSONException unused) {
            return null;
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public void m7870d(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        Objects.requireNonNull(googleSignInAccount, "null reference");
        Objects.requireNonNull(googleSignInOptions, "null reference");
        m7872f("defaultGoogleSignInAccount", googleSignInAccount.f15181j);
        String str = googleSignInAccount.f15181j;
        String m7867g = m7867g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f15174c;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f15175d;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f15176e;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f15177f;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f15183l;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f15184m;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f15178g;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f15179h;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f15180i);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.f15181j);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = googleSignInAccount.f15182k;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).f15373c.compareTo(((Scope) obj2).f15373c);
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f15373c);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            m7872f(m7867g, jSONObject.toString());
            String m7867g2 = m7867g("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(googleSignInOptions.f15195c, GoogleSignInOptions.f15193s);
                Iterator<Scope> it = googleSignInOptions.f15195c.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().f15373c);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f15196d;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f15197e);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f15199g);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f15198f);
                if (!TextUtils.isEmpty(googleSignInOptions.f15200h)) {
                    jSONObject2.put("serverClientId", googleSignInOptions.f15200h);
                }
                if (!TextUtils.isEmpty(googleSignInOptions.f15201i)) {
                    jSONObject2.put("hostedDomain", googleSignInOptions.f15201i);
                }
                m7872f(m7867g2, jSONObject2.toString());
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Nullable
    /* renamed from: e */
    public final String m7871e(@NonNull String str) {
        this.f15233a.lock();
        try {
            return this.f15234b.getString(str, null);
        } finally {
            this.f15233a.unlock();
        }
    }

    /* renamed from: f */
    public final void m7872f(@NonNull String str, @NonNull String str2) {
        this.f15233a.lock();
        try {
            this.f15234b.edit().putString(str, str2).apply();
        } finally {
            this.f15233a.unlock();
        }
    }
}
