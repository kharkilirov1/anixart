package com.yandex.mobile.ads.exo.scheduler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new C4783a();

    /* renamed from: a */
    private final int f48256a;

    /* renamed from: com.yandex.mobile.ads.exo.scheduler.Requirements$a */
    public class C4783a implements Parcelable.Creator<Requirements> {
        @Override // android.os.Parcelable.Creator
        public final Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Requirements[] newArray(int i2) {
            return new Requirements[i2];
        }
    }

    public Requirements(int i2) {
        this.f48256a = (i2 & 2) != 0 ? i2 | 1 : i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x003b, code lost:
    
        if (r4.hasCapability(16) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m22323a(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.scheduler.Requirements.m22323a(android.content.Context):int");
    }

    /* renamed from: c */
    public final boolean m22324c() {
        return (this.f48256a & 8) != 0;
    }

    /* renamed from: d */
    public final boolean m22325d() {
        return (this.f48256a & 4) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean m22326e() {
        return (this.f48256a & 1) != 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f48256a == ((Requirements) obj).f48256a;
    }

    /* renamed from: f */
    public final boolean m22327f() {
        return (this.f48256a & 16) != 0;
    }

    public final int hashCode() {
        return this.f48256a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f48256a);
    }
}
