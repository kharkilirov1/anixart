package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AuthResult;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzr implements AuthResult {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* renamed from: b */
    @NonNull
    @SafeParcelable.Field
    public zzx f22426b;

    /* renamed from: c */
    @Nullable
    @SafeParcelable.Field
    public zzp f22427c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public com.google.firebase.auth.zze f22428d;

    public zzr(zzx zzxVar) {
        this.f22426b = zzxVar;
        List list = zzxVar.f22441f;
        this.f22427c = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!TextUtils.isEmpty(((zzt) list.get(i2)).f22436i)) {
                this.f22427c = new zzp(((zzt) list.get(i2)).f22430c, ((zzt) list.get(i2)).f22436i, zzxVar.f22446k);
            }
        }
        if (this.f22427c == null) {
            this.f22427c = new zzp(zzxVar.f22446k);
        }
        this.f22428d = zzxVar.f22447l;
    }

    @SafeParcelable.Constructor
    public zzr(@NonNull @SafeParcelable.Param zzx zzxVar, @Nullable @SafeParcelable.Param zzp zzpVar, @Nullable @SafeParcelable.Param com.google.firebase.auth.zze zzeVar) {
        this.f22426b = zzxVar;
        this.f22427c = zzpVar;
        this.f22428d = zzeVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8167f(parcel, 1, this.f22426b, i2, false);
        SafeParcelWriter.m8167f(parcel, 2, this.f22427c, i2, false);
        SafeParcelWriter.m8167f(parcel, 3, this.f22428d, i2, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
