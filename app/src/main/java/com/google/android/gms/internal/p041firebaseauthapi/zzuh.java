package com.google.android.gms.internal.p041firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.FirebaseApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzuh extends zzuz implements zzvq {

    /* renamed from: a */
    public zzub f16838a;

    /* renamed from: b */
    public zzuc f16839b;

    /* renamed from: c */
    public zzve f16840c;

    /* renamed from: d */
    public final zzug f16841d;

    /* renamed from: e */
    public final FirebaseApp f16842e;

    /* renamed from: f */
    public final String f16843f;

    /* renamed from: g */
    @VisibleForTesting
    public zzui f16844g;

    @VisibleForTesting
    public zzuh(FirebaseApp firebaseApp, zzug zzugVar) {
        zzvp zzvpVar;
        zzvp zzvpVar2;
        this.f16842e = firebaseApp;
        firebaseApp.m12217a();
        String str = firebaseApp.f22261c.f22273a;
        this.f16843f = str;
        this.f16841d = zzugVar;
        this.f16840c = null;
        this.f16838a = null;
        this.f16839b = null;
        String m9461a = zzvo.m9461a("firebear.secureToken");
        if (TextUtils.isEmpty(m9461a)) {
            Object obj = zzvr.f16907a;
            synchronized (obj) {
                zzvpVar2 = (zzvp) ((SimpleArrayMap) obj).get(str);
            }
            if (zzvpVar2 != null) {
                throw null;
            }
            m9461a = "https://".concat("securetoken.googleapis.com/v1");
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(m9461a)));
        }
        if (this.f16840c == null) {
            this.f16840c = new zzve(m9461a, m9429o());
        }
        String m9461a2 = zzvo.m9461a("firebear.identityToolkit");
        if (TextUtils.isEmpty(m9461a2)) {
            m9461a2 = zzvr.m9463b(str);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(m9461a2)));
        }
        if (this.f16838a == null) {
            this.f16838a = new zzub(m9461a2, m9429o());
        }
        String m9461a3 = zzvo.m9461a("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(m9461a3)) {
            Object obj2 = zzvr.f16907a;
            synchronized (obj2) {
                zzvpVar = (zzvp) ((SimpleArrayMap) obj2).get(str);
            }
            if (zzvpVar != null) {
                throw null;
            }
            m9461a3 = "https://".concat("identitytoolkit.googleapis.com/v2/accounts");
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(m9461a3)));
        }
        if (this.f16839b == null) {
            this.f16839b = new zzuc(m9461a3, m9429o());
        }
        Object obj3 = zzvr.f16908b;
        synchronized (obj3) {
            if (((SimpleArrayMap) obj3).containsKey(str)) {
                ((List) ((SimpleArrayMap) obj3).get(str)).add(new WeakReference(this));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(this));
                ((SimpleArrayMap) obj3).put(str, arrayList);
            }
        }
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: a */
    public final void mo9415a(zzvx zzvxVar, zzuy zzuyVar) {
        zzub zzubVar = this.f16838a;
        zzvb.m9443a(zzubVar.m9409a("/deleteAccount", this.f16843f), zzvxVar, zzuyVar, Void.class, zzubVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: b */
    public final void mo9416b(zzvy zzvyVar, zzuy zzuyVar) {
        zzub zzubVar = this.f16838a;
        zzvb.m9443a(zzubVar.m9409a("/emailLinkSignin", this.f16843f), zzvyVar, zzuyVar, zzvz.class, zzubVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: c */
    public final void mo9417c(zzwa zzwaVar, zzuy zzuyVar) {
        Objects.requireNonNull(zzwaVar, "null reference");
        zzuc zzucVar = this.f16839b;
        zzvb.m9443a(zzucVar.m9409a("/mfaEnrollment:finalize", this.f16843f), zzwaVar, zzuyVar, zzwb.class, zzucVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: d */
    public final void mo9418d(zzwf zzwfVar, zzuy zzuyVar) {
        zzve zzveVar = this.f16840c;
        zzvb.m9443a(zzveVar.m9409a("/token", this.f16843f), zzwfVar, zzuyVar, zzwq.class, zzveVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: e */
    public final void mo9419e(zzwg zzwgVar, zzuy zzuyVar) {
        zzub zzubVar = this.f16838a;
        zzvb.m9443a(zzubVar.m9409a("/getAccountInfo", this.f16843f), zzwgVar, zzuyVar, zzwh.class, zzubVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: f */
    public final void mo9420f(zzwn zzwnVar, zzuy zzuyVar) {
        if (zzwnVar.f16966f != null) {
            m9429o().f16850f = zzwnVar.f16966f.f22294i;
        }
        zzub zzubVar = this.f16838a;
        zzvb.m9443a(zzubVar.m9409a("/getOobConfirmationCode", this.f16843f), zzwnVar, zzuyVar, zzwo.class, zzubVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: g */
    public final void mo9421g(zzxd zzxdVar, zzuy zzuyVar) {
        if (!TextUtils.isEmpty(zzxdVar.f16999e)) {
            m9429o().f16850f = zzxdVar.f16999e;
        }
        zzub zzubVar = this.f16838a;
        zzvb.m9443a(zzubVar.m9409a("/sendVerificationCode", this.f16843f), zzxdVar, zzuyVar, zzxf.class, zzubVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: h */
    public final void mo9422h(zzxg zzxgVar, zzuy zzuyVar) {
        zzub zzubVar = this.f16838a;
        zzvb.m9443a(zzubVar.m9409a("/setAccountInfo", this.f16843f), zzxgVar, zzuyVar, zzxh.class, zzubVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: i */
    public final void mo9423i(zzxk zzxkVar, zzuy zzuyVar) {
        if (!TextUtils.isEmpty(zzxkVar.f17029e)) {
            m9429o().f16850f = zzxkVar.f17029e;
        }
        zzuc zzucVar = this.f16839b;
        zzvb.m9443a(zzucVar.m9409a("/mfaEnrollment:start", this.f16843f), zzxkVar, zzuyVar, zzxl.class, zzucVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: j */
    public final void mo9424j(zzxm zzxmVar, zzuy zzuyVar) {
        if (!TextUtils.isEmpty(zzxmVar.f17037e)) {
            m9429o().f16850f = zzxmVar.f17037e;
        }
        zzuc zzucVar = this.f16839b;
        zzvb.m9443a(zzucVar.m9409a("/mfaSignIn:start", this.f16843f), zzxmVar, zzuyVar, zzxn.class, zzucVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: k */
    public final void mo9425k(zzxq zzxqVar, zzuy zzuyVar) {
        Objects.requireNonNull(zzxqVar, "null reference");
        zzub zzubVar = this.f16838a;
        zzvb.m9443a(zzubVar.m9409a("/verifyAssertion", this.f16843f), zzxqVar, zzuyVar, zzxs.class, zzubVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: l */
    public final void mo9426l(zzxw zzxwVar, zzuy zzuyVar) {
        zzub zzubVar = this.f16838a;
        zzvb.m9443a(zzubVar.m9409a("/verifyPassword", this.f16843f), zzxwVar, zzuyVar, zzxx.class, zzubVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: m */
    public final void mo9427m(zzxy zzxyVar, zzuy zzuyVar) {
        Objects.requireNonNull(zzxyVar, "null reference");
        zzub zzubVar = this.f16838a;
        zzvb.m9443a(zzubVar.m9409a("/verifyPhoneNumber", this.f16843f), zzxyVar, zzuyVar, zzxz.class, zzubVar.f16836b);
    }

    @Override // com.google.android.gms.internal.p041firebaseauthapi.zzuz
    /* renamed from: n */
    public final void mo9428n(zzya zzyaVar, zzuy zzuyVar) {
        zzuc zzucVar = this.f16839b;
        zzvb.m9443a(zzucVar.m9409a("/mfaEnrollment:withdraw", this.f16843f), zzyaVar, zzuyVar, zzyb.class, zzucVar.f16836b);
    }

    @NonNull
    /* renamed from: o */
    public final zzui m9429o() {
        if (this.f16844g == null) {
            FirebaseApp firebaseApp = this.f16842e;
            String m9414b = this.f16841d.m9414b();
            firebaseApp.m12217a();
            this.f16844g = new zzui(firebaseApp.f22259a, firebaseApp, m9414b);
        }
        return this.f16844g;
    }
}
