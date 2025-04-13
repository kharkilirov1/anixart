package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:core@@1.10.2 */
@SuppressLint
/* loaded from: classes.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new zzb();

    /* renamed from: c */
    public abstract PendingIntent mo10933c();

    /* renamed from: d */
    public abstract boolean mo10934d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(mo10933c(), 0);
        parcel.writeInt(mo10934d() ? 1 : 0);
    }
}
