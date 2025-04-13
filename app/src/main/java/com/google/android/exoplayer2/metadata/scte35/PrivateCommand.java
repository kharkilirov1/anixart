package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new Parcelable.Creator<PrivateCommand>() { // from class: com.google.android.exoplayer2.metadata.scte35.PrivateCommand.1
        @Override // android.os.Parcelable.Creator
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public PrivateCommand[] newArray(int i2) {
            return new PrivateCommand[i2];
        }
    };

    /* renamed from: b */
    public final long f12103b;

    /* renamed from: c */
    public final long f12104c;

    /* renamed from: d */
    public final byte[] f12105d;

    public PrivateCommand(long j2, byte[] bArr, long j3) {
        this.f12103b = j3;
        this.f12104c = j2;
        this.f12105d = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f12103b);
        parcel.writeLong(this.f12104c);
        parcel.writeByteArray(this.f12105d);
    }

    public PrivateCommand(Parcel parcel, C10631 c10631) {
        this.f12103b = parcel.readLong();
        this.f12104c = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i2 = Util.f14736a;
        this.f12105d = createByteArray;
    }
}
