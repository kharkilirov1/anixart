package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzb implements Parcelable.Creator<ReviewInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReviewInfo createFromParcel(Parcel parcel) {
        return new zza((PendingIntent) parcel.readParcelable(ReviewInfo.class.getClassLoader()), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReviewInfo[] newArray(int i2) {
        return new ReviewInfo[i2];
    }
}
