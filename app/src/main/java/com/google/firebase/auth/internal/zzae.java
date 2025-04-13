package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzae extends MultiFactorResolver {
    public static final Parcelable.Creator<zzae> CREATOR = new zzaf();

    /* renamed from: b */
    @SafeParcelable.Field
    public final List f22356b = new ArrayList();

    /* renamed from: c */
    @SafeParcelable.Field
    public final zzag f22357c;

    /* renamed from: d */
    @SafeParcelable.Field
    public final String f22358d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final com.google.firebase.auth.zze f22359e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final zzx f22360f;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param List list, @SafeParcelable.Param zzag zzagVar, @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param com.google.firebase.auth.zze zzeVar, @Nullable @SafeParcelable.Param zzx zzxVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                this.f22356b.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        Objects.requireNonNull(zzagVar, "null reference");
        this.f22357c = zzagVar;
        Preconditions.m8129d(str);
        this.f22358d = str;
        this.f22359e = zzeVar;
        this.f22360f = zzxVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8172k(parcel, 1, this.f22356b, false);
        SafeParcelWriter.m8167f(parcel, 2, this.f22357c, i2, false);
        SafeParcelWriter.m8168g(parcel, 3, this.f22358d, false);
        SafeParcelWriter.m8167f(parcel, 4, this.f22359e, i2, false);
        SafeParcelWriter.m8167f(parcel, 5, this.f22360f, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
