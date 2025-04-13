package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p041firebaseauthapi.zzwq;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserInfo;
import com.yandex.metrica.push.common.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzx extends FirebaseUser {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();

    /* renamed from: b */
    @SafeParcelable.Field
    public zzwq f22437b;

    /* renamed from: c */
    @SafeParcelable.Field
    public zzt f22438c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final String f22439d;

    /* renamed from: e */
    @SafeParcelable.Field
    public String f22440e;

    /* renamed from: f */
    @SafeParcelable.Field
    public List f22441f;

    /* renamed from: g */
    @SafeParcelable.Field
    public List f22442g;

    /* renamed from: h */
    @SafeParcelable.Field
    public String f22443h;

    /* renamed from: i */
    @SafeParcelable.Field
    public Boolean f22444i;

    /* renamed from: j */
    @SafeParcelable.Field
    public zzz f22445j;

    /* renamed from: k */
    @SafeParcelable.Field
    public boolean f22446k;

    /* renamed from: l */
    @SafeParcelable.Field
    public com.google.firebase.auth.zze f22447l;

    /* renamed from: m */
    @SafeParcelable.Field
    public zzbb f22448m;

    public zzx(FirebaseApp firebaseApp, List list) {
        firebaseApp.m12217a();
        this.f22439d = firebaseApp.f22260b;
        this.f22440e = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f22443h = "2";
        mo12244R0(list);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    /* renamed from: O0 */
    public final FirebaseUser mo12243O0() {
        this.f22444i = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    /* renamed from: R0 */
    public final synchronized FirebaseUser mo12244R0(List list) {
        Objects.requireNonNull(list, "null reference");
        this.f22441f = new ArrayList(list.size());
        this.f22442g = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            UserInfo userInfo = (UserInfo) list.get(i2);
            if (userInfo.mo12262h().equals(CoreConstants.Transport.FIREBASE)) {
                this.f22438c = (zzt) userInfo;
            } else {
                this.f22442g.add(userInfo.mo12262h());
            }
            this.f22441f.add((zzt) userInfo);
        }
        if (this.f22438c == null) {
            this.f22438c = (zzt) this.f22441f.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    /* renamed from: Z0 */
    public final zzwq mo12245Z0() {
        return this.f22437b;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    /* renamed from: e1 */
    public final String mo12246e1() {
        return this.f22437b.f16970c;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    /* renamed from: f1 */
    public final String mo12247f1() {
        return this.f22437b.m9468n();
    }

    @Override // com.google.firebase.auth.UserInfo
    @NonNull
    /* renamed from: h */
    public final String mo12262h() {
        return this.f22438c.f22430c;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @Nullable
    /* renamed from: j1 */
    public final List mo12248j1() {
        return this.f22442g;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @Nullable
    /* renamed from: m */
    public final String mo12249m() {
        return this.f22438c.f22433f;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    /* renamed from: n */
    public final /* synthetic */ MultiFactor mo12250n() {
        return new zzac(this);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    /* renamed from: n1 */
    public final void mo12251n1(zzwq zzwqVar) {
        this.f22437b = zzwqVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    /* renamed from: o */
    public final List<? extends UserInfo> mo12252o() {
        return this.f22441f;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    /* renamed from: o1 */
    public final void mo12253o1(List list) {
        zzbb zzbbVar;
        if (list == null || list.isEmpty()) {
            zzbbVar = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
                if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                    arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
                }
            }
            zzbbVar = new zzbb(arrayList);
        }
        this.f22448m = zzbbVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @Nullable
    /* renamed from: p */
    public final String mo12254p() {
        String str;
        Map map;
        zzwq zzwqVar = this.f22437b;
        if (zzwqVar == null || (str = zzwqVar.f16970c) == null || (map = (Map) zzay.m12303a(str).f22323b.get(CoreConstants.Transport.FIREBASE)) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    /* renamed from: q */
    public final String mo12255q() {
        return this.f22438c.f22429b;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    /* renamed from: v */
    public final boolean mo12256v() {
        String str;
        Boolean bool = this.f22444i;
        if (bool == null || bool.booleanValue()) {
            zzwq zzwqVar = this.f22437b;
            if (zzwqVar != null) {
                Map map = (Map) zzay.m12303a(zzwqVar.f16970c).f22323b.get(CoreConstants.Transport.FIREBASE);
                str = map != null ? (String) map.get("sign_in_provider") : null;
            } else {
                str = "";
            }
            boolean z = false;
            if (this.f22441f.size() <= 1 && (str == null || !str.equals("custom"))) {
                z = true;
            }
            this.f22444i = Boolean.valueOf(z);
        }
        return this.f22444i.booleanValue();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    /* renamed from: w */
    public final FirebaseApp mo12257w() {
        return FirebaseApp.m12213d(this.f22439d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f22437b, i2, false);
        SafeParcelWriter.m8167f(parcel, 2, this.f22438c, i2, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f22439d, false);
        SafeParcelWriter.m8168g(parcel, 4, this.f22440e, false);
        SafeParcelWriter.m8172k(parcel, 5, this.f22441f, false);
        SafeParcelWriter.m8170i(parcel, 6, this.f22442g, false);
        SafeParcelWriter.m8168g(parcel, 7, this.f22443h, false);
        Boolean valueOf = Boolean.valueOf(mo12256v());
        if (valueOf != null) {
            parcel.writeInt(262152);
            parcel.writeInt(valueOf.booleanValue() ? 1 : 0);
        }
        SafeParcelWriter.m8167f(parcel, 9, this.f22445j, i2, false);
        boolean z = this.f22446k;
        parcel.writeInt(262154);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8167f(parcel, 11, this.f22447l, i2, false);
        SafeParcelWriter.m8167f(parcel, 12, this.f22448m, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param zzwq zzwqVar, @SafeParcelable.Param zzt zztVar, @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param List list, @SafeParcelable.Param List list2, @SafeParcelable.Param String str3, @SafeParcelable.Param Boolean bool, @SafeParcelable.Param zzz zzzVar, @SafeParcelable.Param boolean z, @SafeParcelable.Param com.google.firebase.auth.zze zzeVar, @SafeParcelable.Param zzbb zzbbVar) {
        this.f22437b = zzwqVar;
        this.f22438c = zztVar;
        this.f22439d = str;
        this.f22440e = str2;
        this.f22441f = list;
        this.f22442g = list2;
        this.f22443h = str3;
        this.f22444i = bool;
        this.f22445j = zzzVar;
        this.f22446k = z;
        this.f22447l = zzeVar;
        this.f22448m = zzbbVar;
    }
}
