package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Parcelable.Creator<TimeSignalCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.1
        @Override // android.os.Parcelable.Creator
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public TimeSignalCommand[] newArray(int i2) {
            return new TimeSignalCommand[i2];
        }
    };

    /* renamed from: b */
    public final long f12139b;

    /* renamed from: c */
    public final long f12140c;

    public TimeSignalCommand(long j2, long j3) {
        this.f12139b = j2;
        this.f12140c = j3;
    }

    /* renamed from: a */
    public static long m6733a(ParsableByteArray parsableByteArray, long j2) {
        long m7657u = parsableByteArray.m7657u();
        if ((128 & m7657u) != 0) {
            return 8589934591L & ((((m7657u & 1) << 32) | parsableByteArray.m7658v()) + j2);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f12139b);
        parcel.writeLong(this.f12140c);
    }

    public TimeSignalCommand(long j2, long j3, C10671 c10671) {
        this.f12139b = j2;
        this.f12140c = j3;
    }
}
