package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p041firebaseauthapi.zznp;
import com.google.android.gms.internal.p041firebaseauthapi.zztq;
import com.google.android.gms.internal.p041firebaseauthapi.zztu;
import com.google.android.gms.internal.p041firebaseauthapi.zzwq;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzam;
import com.google.firebase.auth.internal.zzay;
import com.google.firebase.auth.internal.zzbg;
import com.google.firebase.auth.internal.zzbi;
import com.google.firebase.auth.internal.zzbj;
import com.google.firebase.auth.internal.zzbm;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes2.dex */
public abstract class FirebaseAuth implements InternalAuthProvider {

    /* renamed from: a */
    public FirebaseApp f22306a;

    /* renamed from: b */
    public final List f22307b;

    /* renamed from: c */
    public final List f22308c;

    /* renamed from: d */
    public List f22309d;

    /* renamed from: e */
    public zztq f22310e;

    /* renamed from: f */
    @Nullable
    public FirebaseUser f22311f;

    /* renamed from: g */
    public com.google.firebase.auth.internal.zzw f22312g;

    /* renamed from: h */
    public final Object f22313h;

    /* renamed from: i */
    public final Object f22314i;

    /* renamed from: j */
    public String f22315j;

    /* renamed from: k */
    public final zzbg f22316k;

    /* renamed from: l */
    public final zzbm f22317l;

    /* renamed from: m */
    public final Provider f22318m;

    /* renamed from: n */
    public zzbi f22319n;

    /* renamed from: o */
    public zzbj f22320o;

    /* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
    public interface AuthStateListener {
        /* renamed from: a */
        void m12241a(@NonNull FirebaseAuth firebaseAuth);
    }

    /* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
    public interface IdTokenListener {
        /* renamed from: a */
        void m12242a(@NonNull FirebaseAuth firebaseAuth);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0149, code lost:
    
        if (r6.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FirebaseAuth(@androidx.annotation.NonNull com.google.firebase.FirebaseApp r10, @androidx.annotation.NonNull com.google.firebase.inject.Provider r11) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(com.google.firebase.FirebaseApp, com.google.firebase.inject.Provider):void");
    }

    /* renamed from: d */
    public static void m12231d(@NonNull FirebaseAuth firebaseAuth, @Nullable FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + firebaseUser.mo12255q() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f22320o.f22403b.post(new zzm(firebaseAuth));
    }

    /* renamed from: e */
    public static void m12232e(@NonNull FirebaseAuth firebaseAuth, @Nullable FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + firebaseUser.mo12255q() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.f22320o.f22403b.post(new zzl(firebaseAuth, new InternalTokenResult(firebaseUser != null ? firebaseUser.mo12246e1() : null)));
    }

    @VisibleForTesting
    /* renamed from: f */
    public static void m12233f(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzwq zzwqVar, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        String str;
        Objects.requireNonNull(firebaseUser, "null reference");
        Objects.requireNonNull(zzwqVar, "null reference");
        boolean z5 = firebaseAuth.f22311f != null && firebaseUser.mo12255q().equals(firebaseAuth.f22311f.mo12255q());
        if (z5 || !z2) {
            FirebaseUser firebaseUser2 = firebaseAuth.f22311f;
            if (firebaseUser2 == null) {
                z4 = true;
                z3 = true;
            } else {
                z3 = !z5 || (firebaseUser2.mo12245Z0().f16970c.equals(zzwqVar.f16970c) ^ true);
                z4 = !z5;
            }
            FirebaseUser firebaseUser3 = firebaseAuth.f22311f;
            if (firebaseUser3 == null) {
                firebaseAuth.f22311f = firebaseUser;
            } else {
                firebaseUser3.mo12244R0(firebaseUser.mo12252o());
                if (!firebaseUser.mo12256v()) {
                    firebaseAuth.f22311f.mo12243O0();
                }
                firebaseAuth.f22311f.mo12253o1(firebaseUser.mo12250n().mo12258a());
            }
            if (z) {
                zzbg zzbgVar = firebaseAuth.f22316k;
                FirebaseUser firebaseUser4 = firebaseAuth.f22311f;
                Objects.requireNonNull(zzbgVar);
                Objects.requireNonNull(firebaseUser4, "null reference");
                JSONObject jSONObject = new JSONObject();
                if (com.google.firebase.auth.internal.zzx.class.isAssignableFrom(firebaseUser4.getClass())) {
                    com.google.firebase.auth.internal.zzx zzxVar = (com.google.firebase.auth.internal.zzx) firebaseUser4;
                    try {
                        jSONObject.put("cachedTokenState", zzxVar.mo12247f1());
                        FirebaseApp mo12257w = zzxVar.mo12257w();
                        mo12257w.m12217a();
                        jSONObject.put("applicationName", mo12257w.f22260b);
                        jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                        if (zzxVar.f22441f != null) {
                            JSONArray jSONArray = new JSONArray();
                            List list = zzxVar.f22441f;
                            int size = list.size();
                            if (list.size() > 30) {
                                Logger logger = zzbgVar.f22399b;
                                Log.w(logger.f15834a, logger.m8206c("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(list.size())));
                                size = 30;
                            }
                            for (int i2 = 0; i2 < size; i2++) {
                                jSONArray.put(((com.google.firebase.auth.internal.zzt) list.get(i2)).m12324m());
                            }
                            jSONObject.put("userInfos", jSONArray);
                        }
                        jSONObject.put("anonymous", zzxVar.mo12256v());
                        jSONObject.put("version", "2");
                        com.google.firebase.auth.internal.zzz zzzVar = zzxVar.f22445j;
                        if (zzzVar != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("lastSignInTimestamp", zzzVar.f22449b);
                                jSONObject2.put("creationTimestamp", zzzVar.f22450c);
                            } catch (JSONException unused) {
                            }
                            jSONObject.put("userMetadata", jSONObject2);
                        }
                        List<MultiFactorInfo> mo12258a = new com.google.firebase.auth.internal.zzac(zzxVar).mo12258a();
                        if (!mo12258a.isEmpty()) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i3 = 0; i3 < mo12258a.size(); i3++) {
                                jSONArray2.put(mo12258a.get(i3).mo12259m());
                            }
                            jSONObject.put("userMultiFactorInfo", jSONArray2);
                        }
                        str = jSONObject.toString();
                    } catch (Exception e2) {
                        Logger logger2 = zzbgVar.f22399b;
                        Log.wtf(logger2.f15834a, logger2.m8206c("Failed to turn object into JSON", new Object[0]), e2);
                        throw new zznp(e2);
                    }
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C2052a.m12278m(zzbgVar.f22398a, "com.google.firebase.auth.FIREBASE_USER", str);
                }
            }
            if (z3) {
                FirebaseUser firebaseUser5 = firebaseAuth.f22311f;
                if (firebaseUser5 != null) {
                    firebaseUser5.mo12251n1(zzwqVar);
                }
                m12232e(firebaseAuth, firebaseAuth.f22311f);
            }
            if (z4) {
                m12231d(firebaseAuth, firebaseAuth.f22311f);
            }
            if (z) {
                zzbg zzbgVar2 = firebaseAuth.f22316k;
                Objects.requireNonNull(zzbgVar2);
                zzbgVar2.f22398a.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.mo12255q()), zzwqVar.m9468n()).apply();
            }
            FirebaseUser firebaseUser6 = firebaseAuth.f22311f;
            if (firebaseUser6 != null) {
                if (firebaseAuth.f22319n == null) {
                    FirebaseApp firebaseApp = firebaseAuth.f22306a;
                    Objects.requireNonNull(firebaseApp, "null reference");
                    firebaseAuth.f22319n = new zzbi(firebaseApp);
                }
                zzbi zzbiVar = firebaseAuth.f22319n;
                zzwq mo12245Z0 = firebaseUser6.mo12245Z0();
                Objects.requireNonNull(zzbiVar);
                if (mo12245Z0 == null) {
                    return;
                }
                Long l2 = mo12245Z0.f16971d;
                long longValue = l2 == null ? 0L : l2.longValue();
                if (longValue <= 0) {
                    longValue = 3600;
                }
                long longValue2 = mo12245Z0.f16973f.longValue();
                zzam zzamVar = zzbiVar.f22401a;
                zzamVar.f22369a = (longValue * 1000) + longValue2;
                zzamVar.f22370b = -1L;
            }
        }
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance() {
        FirebaseApp m12212c = FirebaseApp.m12212c();
        m12212c.m12217a();
        return (FirebaseAuth) m12212c.f22262d.get(FirebaseAuth.class);
    }

    @NonNull
    /* renamed from: a */
    public Task<AuthResult> m12234a(@NonNull AuthCredential authCredential) {
        AuthCredential mo12230n = authCredential.mo12230n();
        if (!(mo12230n instanceof EmailAuthCredential)) {
            if (mo12230n instanceof PhoneAuthCredential) {
                return this.f22310e.m9359d(this.f22306a, (PhoneAuthCredential) mo12230n, this.f22315j, new zzs(this));
            }
            return this.f22310e.m9366l(this.f22306a, mo12230n, this.f22315j, new zzs(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) mo12230n;
        if (!TextUtils.isEmpty(emailAuthCredential.f22302d)) {
            String str = emailAuthCredential.f22302d;
            Preconditions.m8129d(str);
            return m12237g(str) ? Tasks.m9722d(zztu.m9397a(new Status(17072, null))) : this.f22310e.m9358c(this.f22306a, emailAuthCredential, new zzs(this));
        }
        zztq zztqVar = this.f22310e;
        FirebaseApp firebaseApp = this.f22306a;
        String str2 = emailAuthCredential.f22300b;
        String str3 = emailAuthCredential.f22301c;
        Preconditions.m8129d(str3);
        return zztqVar.m9357b(firebaseApp, str2, str3, this.f22315j, new zzs(this));
    }

    /* renamed from: b */
    public void m12235b() {
        m12236c();
        zzbi zzbiVar = this.f22319n;
        if (zzbiVar != null) {
            zzam zzamVar = zzbiVar.f22401a;
            zzamVar.f22372d.removeCallbacks(zzamVar.f22373e);
        }
    }

    /* renamed from: c */
    public final void m12236c() {
        Objects.requireNonNull(this.f22316k, "null reference");
        FirebaseUser firebaseUser = this.f22311f;
        if (firebaseUser != null) {
            this.f22316k.f22398a.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.mo12255q())).apply();
            this.f22311f = null;
        }
        this.f22316k.f22398a.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        m12232e(this, null);
        m12231d(this, null);
    }

    /* renamed from: g */
    public final boolean m12237g(String str) {
        ActionCodeUrl actionCodeUrl;
        Map map = ActionCodeUrl.f22297c;
        Preconditions.m8129d(str);
        try {
            actionCodeUrl = new ActionCodeUrl(str);
        } catch (IllegalArgumentException unused) {
            actionCodeUrl = null;
        }
        return (actionCodeUrl == null || TextUtils.equals(this.f22315j, actionCodeUrl.f22299b)) ? false : true;
    }

    @NonNull
    /* renamed from: h */
    public final Task m12238h(@Nullable FirebaseUser firebaseUser, boolean z) {
        if (firebaseUser == null) {
            return Tasks.m9722d(zztu.m9397a(new Status(17495, null)));
        }
        zzwq mo12245Z0 = firebaseUser.mo12245Z0();
        return (!mo12245Z0.m9469o() || z) ? this.f22310e.m9360f(this.f22306a, firebaseUser, mo12245Z0.f16969b, new zzn(this)) : Tasks.m9723e(zzay.m12303a(mo12245Z0.f16970c));
    }

    @NonNull
    /* renamed from: i */
    public final Task m12239i(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        Objects.requireNonNull(firebaseUser, "null reference");
        return this.f22310e.m9361g(this.f22306a, firebaseUser, authCredential.mo12230n(), new zzt(this));
    }

    @NonNull
    /* renamed from: j */
    public final Task m12240j(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        Objects.requireNonNull(firebaseUser, "null reference");
        AuthCredential mo12230n = authCredential.mo12230n();
        if (!(mo12230n instanceof EmailAuthCredential)) {
            return mo12230n instanceof PhoneAuthCredential ? this.f22310e.m9365k(this.f22306a, firebaseUser, (PhoneAuthCredential) mo12230n, this.f22315j, new zzt(this)) : this.f22310e.m9362h(this.f22306a, firebaseUser, mo12230n, firebaseUser.mo12254p(), new zzt(this));
        }
        EmailAuthCredential emailAuthCredential = (EmailAuthCredential) mo12230n;
        if (!"password".equals(!TextUtils.isEmpty(emailAuthCredential.f22301c) ? "password" : "emailLink")) {
            String str = emailAuthCredential.f22302d;
            Preconditions.m8129d(str);
            return m12237g(str) ? Tasks.m9722d(zztu.m9397a(new Status(17072, null))) : this.f22310e.m9363i(this.f22306a, firebaseUser, emailAuthCredential, new zzt(this));
        }
        zztq zztqVar = this.f22310e;
        FirebaseApp firebaseApp = this.f22306a;
        String str2 = emailAuthCredential.f22300b;
        String str3 = emailAuthCredential.f22301c;
        Preconditions.m8129d(str3);
        return zztqVar.m9364j(firebaseApp, firebaseUser, str2, str3, firebaseUser.mo12254p(), new zzt(this));
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance(@NonNull FirebaseApp firebaseApp) {
        firebaseApp.m12217a();
        return (FirebaseAuth) firebaseApp.f22262d.get(FirebaseAuth.class);
    }
}
