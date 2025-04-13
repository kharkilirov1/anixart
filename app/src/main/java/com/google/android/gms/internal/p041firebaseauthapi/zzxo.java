package com.google.android.gms.internal.p041firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class zzxo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxo> CREATOR = new zzxp();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f17043b;

    /* renamed from: c */
    @SafeParcelable.Field
    public List f17044c;

    public zzxo() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f17043b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8170i(parcel, 2, this.f17044c, false);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @SafeParcelable.Constructor
    public zzxo(@SafeParcelable.Param int i2, @SafeParcelable.Param List list) {
        this.f17043b = i2;
        if (list == null || list.isEmpty()) {
            this.f17044c = Collections.emptyList();
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            list.set(i3, Strings.m8247a((String) list.get(i3)));
        }
        this.f17044c = Collections.unmodifiableList(list);
    }

    public zzxo(@Nullable List list) {
        this.f17043b = 1;
        this.f17044c = new ArrayList();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f17044c.addAll(list);
    }
}
