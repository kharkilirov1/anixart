package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.s91;

/* loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C4763a();

    /* renamed from: a */
    public final long f48141a;

    /* renamed from: b */
    public final long f48142b;

    /* renamed from: c */
    public final byte[] f48143c;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.scte35.PrivateCommand$a */
    public class C4763a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public final PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand[] newArray(int i2) {
            return new PrivateCommand[i2];
        }
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, int i2) {
        this(parcel);
    }

    /* renamed from: a */
    public static PrivateCommand m22258a(ap0 ap0Var, int i2, long j2) {
        long m22609v = ap0Var.m22609v();
        int i3 = i2 - 4;
        byte[] bArr = new byte[i3];
        ap0Var.m22583a(bArr, 0, i3);
        return new PrivateCommand(m22609v, bArr, j2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f48141a);
        parcel.writeLong(this.f48142b);
        parcel.writeByteArray(this.f48143c);
    }

    private PrivateCommand(long j2, byte[] bArr, long j3) {
        this.f48141a = j3;
        this.f48142b = j2;
        this.f48143c = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f48141a = parcel.readLong();
        this.f48142b = parcel.readLong();
        this.f48143c = (byte[]) s91.m28101a(parcel.createByteArray());
    }
}
