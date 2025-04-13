package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: g */
    @NonNull
    @VisibleForTesting
    @ShowFirstParty
    @KeepForSdk
    public static final Status f15374g = new Status(0, null);

    /* renamed from: h */
    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status f15375h = new Status(14, null);

    /* renamed from: i */
    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status f15376i = new Status(8, null);

    /* renamed from: j */
    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status f15377j = new Status(15, null);

    /* renamed from: k */
    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static final Status f15378k = new Status(16, null);

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15379b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final int f15380c;

    /* renamed from: d */
    @Nullable
    @SafeParcelable.Field
    public final String f15381d;

    /* renamed from: e */
    @Nullable
    @SafeParcelable.Field
    public final PendingIntent f15382e;

    /* renamed from: f */
    @Nullable
    @SafeParcelable.Field
    public final ConnectionResult f15383f;

    static {
        new Status(17, null);
        new Status(18, null);
        CREATOR = new zzb();
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public Status(@SafeParcelable.Param int i2, @SafeParcelable.Param int i3, @Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param PendingIntent pendingIntent, @Nullable @SafeParcelable.Param ConnectionResult connectionResult) {
        this.f15379b = i2;
        this.f15380c = i3;
        this.f15381d = str;
        this.f15382e = pendingIntent;
        this.f15383f = connectionResult;
    }

    @KeepForSdk
    public Status(int i2, @Nullable String str) {
        this.f15379b = 1;
        this.f15380c = i2;
        this.f15381d = str;
        this.f15382e = null;
        this.f15383f = null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f15379b == status.f15379b && this.f15380c == status.f15380c && Objects.m8123a(this.f15381d, status.f15381d) && Objects.m8123a(this.f15382e, status.f15382e) && Objects.m8123a(this.f15383f, status.f15383f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15379b), Integer.valueOf(this.f15380c), this.f15381d, this.f15382e, this.f15383f});
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    @KeepForSdk
    /* renamed from: k */
    public Status mo7862k() {
        return this;
    }

    @VisibleForTesting
    /* renamed from: m */
    public boolean m7963m() {
        return this.f15382e != null;
    }

    /* renamed from: n */
    public boolean m7964n() {
        return this.f15380c <= 0;
    }

    @NonNull
    public String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.m8124a("statusCode", m7965u());
        toStringHelper.m8124a("resolution", this.f15382e);
        return toStringHelper.toString();
    }

    @NonNull
    /* renamed from: u */
    public final String m7965u() {
        String str = this.f15381d;
        return str != null ? str : CommonStatusCodes.m7947a(this.f15380c);
    }

    @Override // android.os.Parcelable
    @KeepForSdk
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15380c;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        SafeParcelWriter.m8168g(parcel, 2, this.f15381d, false);
        SafeParcelWriter.m8167f(parcel, 3, this.f15382e, i2, false);
        SafeParcelWriter.m8167f(parcel, 4, this.f15383f, i2, false);
        int i4 = this.f15379b;
        parcel.writeInt(263144);
        parcel.writeInt(i4);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }

    @KeepForSdk
    public Status(int i2, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this.f15379b = 1;
        this.f15380c = i2;
        this.f15381d = str;
        this.f15382e = pendingIntent;
        this.f15383f = null;
    }
}
