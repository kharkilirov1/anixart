package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.p61;

/* loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C4770a();

    /* renamed from: a */
    public final long f48174a;

    /* renamed from: b */
    public final long f48175b;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.TimeSignalCommand$a */
    public class C4770a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand[] newArray(int i2) {
            return new TimeSignalCommand[i2];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j2, long j3, int i2) {
        this(j2, j3);
    }

    /* renamed from: a */
    public static TimeSignalCommand m22266a(ap0 ap0Var, long j2, p61 p61Var) {
        long m22265a = m22265a(j2, ap0Var);
        return new TimeSignalCommand(m22265a, p61Var.m27173b(m22265a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f48174a);
        parcel.writeLong(this.f48175b);
    }

    private TimeSignalCommand(long j2, long j3) {
        this.f48174a = j2;
        this.f48175b = j3;
    }

    /* renamed from: a */
    public static long m22265a(long j2, ap0 ap0Var) {
        long m22607t = ap0Var.m22607t();
        if ((128 & m22607t) != 0) {
            return 8589934591L & ((((m22607t & 1) << 32) | ap0Var.m22609v()) + j2);
        }
        return -9223372036854775807L;
    }
}
