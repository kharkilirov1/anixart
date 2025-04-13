package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import javax.annotation.Nullable;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@SafeParcelable.Class
@Deprecated
/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {

    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();

    /* renamed from: b */
    @SafeParcelable.VersionField
    public final int f15878b;

    /* renamed from: c */
    @SafeParcelable.Field
    public final long f15879c;

    /* renamed from: d */
    @SafeParcelable.Field
    public int f15880d;

    /* renamed from: e */
    @SafeParcelable.Field
    public final String f15881e;

    /* renamed from: f */
    @SafeParcelable.Field
    public final String f15882f;

    /* renamed from: g */
    @SafeParcelable.Field
    public final String f15883g;

    /* renamed from: h */
    @SafeParcelable.Field
    public final int f15884h;

    /* renamed from: i */
    @Nullable
    @SafeParcelable.Field
    public final List<String> f15885i;

    /* renamed from: j */
    @SafeParcelable.Field
    public final String f15886j;

    /* renamed from: k */
    @SafeParcelable.Field
    public final long f15887k;

    /* renamed from: l */
    @SafeParcelable.Field
    public int f15888l;

    /* renamed from: m */
    @SafeParcelable.Field
    public final String f15889m;

    /* renamed from: n */
    @SafeParcelable.Field
    public final float f15890n;

    /* renamed from: o */
    @SafeParcelable.Field
    public final long f15891o;

    /* renamed from: p */
    @SafeParcelable.Field
    public final boolean f15892p;

    /* renamed from: q */
    public long f15893q = -1;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param int i2, @SafeParcelable.Param long j2, @SafeParcelable.Param int i3, @SafeParcelable.Param String str, @SafeParcelable.Param int i4, @SafeParcelable.Param @Nullable List<String> list, @SafeParcelable.Param String str2, @SafeParcelable.Param long j3, @SafeParcelable.Param int i5, @SafeParcelable.Param String str3, @SafeParcelable.Param String str4, @SafeParcelable.Param float f2, @SafeParcelable.Param long j4, @SafeParcelable.Param String str5, @SafeParcelable.Param boolean z) {
        this.f15878b = i2;
        this.f15879c = j2;
        this.f15880d = i3;
        this.f15881e = str;
        this.f15882f = str3;
        this.f15883g = str5;
        this.f15884h = i4;
        this.f15885i = list;
        this.f15886j = str2;
        this.f15887k = j3;
        this.f15888l = i5;
        this.f15889m = str4;
        this.f15890n = f2;
        this.f15891o = j4;
        this.f15892p = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: m */
    public final int mo8228m() {
        return this.f15880d;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: n */
    public final long mo8229n() {
        return this.f15893q;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    /* renamed from: o */
    public final long mo8230o() {
        return this.f15879c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @NonNull
    /* renamed from: p */
    public final String mo8231p() {
        List<String> list = this.f15885i;
        String str = this.f15881e;
        int i2 = this.f15884h;
        String join = list == null ? "" : TextUtils.join(",", list);
        int i3 = this.f15888l;
        String str2 = this.f15882f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.f15889m;
        if (str3 == null) {
            str3 = "";
        }
        float f2 = this.f15890n;
        String str4 = this.f15883g;
        String str5 = str4 != null ? str4 : "";
        boolean z = this.f15892p;
        StringBuilder sb = new StringBuilder(str5.length() + str3.length() + str2.length() + String.valueOf(str).length() + 51 + String.valueOf(join).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i3);
        C0000a.m2C(sb, "\t", str2, "\t", str3);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int m8173l = SafeParcelWriter.m8173l(parcel, 20293);
        int i3 = this.f15878b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        long j2 = this.f15879c;
        parcel.writeInt(524290);
        parcel.writeLong(j2);
        SafeParcelWriter.m8168g(parcel, 4, this.f15881e, false);
        int i4 = this.f15884h;
        parcel.writeInt(262149);
        parcel.writeInt(i4);
        SafeParcelWriter.m8170i(parcel, 6, this.f15885i, false);
        long j3 = this.f15887k;
        parcel.writeInt(524296);
        parcel.writeLong(j3);
        SafeParcelWriter.m8168g(parcel, 10, this.f15882f, false);
        int i5 = this.f15880d;
        parcel.writeInt(262155);
        parcel.writeInt(i5);
        SafeParcelWriter.m8168g(parcel, 12, this.f15886j, false);
        SafeParcelWriter.m8168g(parcel, 13, this.f15889m, false);
        int i6 = this.f15888l;
        parcel.writeInt(262158);
        parcel.writeInt(i6);
        float f2 = this.f15890n;
        parcel.writeInt(262159);
        parcel.writeFloat(f2);
        long j4 = this.f15891o;
        parcel.writeInt(524304);
        parcel.writeLong(j4);
        SafeParcelWriter.m8168g(parcel, 17, this.f15883g, false);
        boolean z = this.f15892p;
        parcel.writeInt(262162);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m8174m(parcel, m8173l);
    }
}
