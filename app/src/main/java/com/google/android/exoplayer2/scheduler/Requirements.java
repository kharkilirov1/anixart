package com.google.android.exoplayer2.scheduler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new Parcelable.Creator<Requirements>() { // from class: com.google.android.exoplayer2.scheduler.Requirements.1
        @Override // android.os.Parcelable.Creator
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public Requirements[] newArray(int i2) {
            return new Requirements[i2];
        }
    };

    /* renamed from: b */
    public final int f12215b;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequirementFlags {
    }

    public Requirements(int i2) {
        this.f12215b = (i2 & 2) != 0 ? i2 | 1 : i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x003c, code lost:
    
        if (r4.hasCapability(16) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0062  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m6758a(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.scheduler.Requirements.m6758a(android.content.Context):int");
    }

    /* renamed from: c */
    public boolean m6759c() {
        return (this.f12215b & 8) != 0;
    }

    /* renamed from: d */
    public boolean m6760d() {
        return (this.f12215b & 4) != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f12215b == ((Requirements) obj).f12215b;
    }

    /* renamed from: f */
    public boolean m6761f() {
        return (this.f12215b & 1) != 0;
    }

    /* renamed from: g */
    public boolean m6762g() {
        return (this.f12215b & 16) != 0;
    }

    public int hashCode() {
        return this.f12215b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f12215b);
    }
}
