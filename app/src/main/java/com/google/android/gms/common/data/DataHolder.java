package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
@KeepName
@SafeParcelable.Class
/* loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15626b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final String[] f15627c;

    /* renamed from: d */
    public Bundle f15628d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final CursorWindow[] f15629e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final int f15630f;

    /* renamed from: g */
    @Nullable
    @SafeParcelable.Field
    public final Bundle f15631g;

    /* renamed from: h */
    public int[] f15632h;

    /* renamed from: i */
    public int f15633i;

    /* renamed from: j */
    public boolean f15634j = false;

    /* renamed from: k */
    public boolean f15635k = true;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    public static class Builder {
        public Builder(String[] strArr) {
            Objects.requireNonNull(strArr, "null reference");
            new ArrayList();
            new HashMap();
        }
    }

    static {
        new zab(new String[0]);
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param int i2, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param CursorWindow[] cursorWindowArr, @SafeParcelable.Param int i3, @Nullable @SafeParcelable.Param Bundle bundle) {
        this.f15626b = i2;
        this.f15627c = strArr;
        this.f15629e = cursorWindowArr;
        this.f15630f = i3;
        this.f15631g = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            if (!this.f15634j) {
                this.f15634j = true;
                int i2 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f15629e;
                    if (i2 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i2].close();
                    i2++;
                }
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        try {
            if (this.f15635k && this.f15629e.length > 0) {
                synchronized (this) {
                    z = this.f15634j;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(obj);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        SafeParcelWriter.m8169h(parcel, 1, this.f15627c, false);
        SafeParcelWriter.m8171j(parcel, 2, this.f15629e, i2, false);
        int i3 = this.f15630f;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        SafeParcelWriter.m8163b(parcel, 4, this.f15631g, false);
        int i4 = this.f15626b;
        parcel.writeInt(263144);
        parcel.writeInt(i4);
        SafeParcelWriter.m8174m(parcel, m8173l);
        if ((i2 & 1) != 0) {
            close();
        }
    }
}
