package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zzb();

    /* renamed from: b */
    public Messenger f15268b;

    public zzd(IBinder iBinder) {
        this.f15268b = new Messenger(iBinder);
    }

    /* renamed from: c */
    public final IBinder m7898c() {
        Messenger messenger = this.f15268b;
        Objects.requireNonNull(messenger);
        return messenger.getBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m7898c().equals(((zzd) obj).m7898c());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m7898c().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.f15268b;
        Objects.requireNonNull(messenger);
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
