package com.google.android.play.core.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzm {

    /* renamed from: a */
    public static final /* synthetic */ int f20158a = 0;

    static {
        zzm.class.getClassLoader();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m10914a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
