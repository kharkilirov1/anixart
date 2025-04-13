package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes.dex */
public final class BundleListRetriever extends Binder {

    /* renamed from: b */
    public static final int f9454b;

    /* renamed from: a */
    public final ImmutableList<Bundle> f9455a;

    static {
        f9454b = Util.f14736a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : TextBuffer.MAX_SEGMENT_LEN;
    }

    public BundleListRetriever(List<Bundle> list) {
        this.f9455a = ImmutableList.m11634y(list);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, @Nullable Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f9455a.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < f9454b) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f9455a.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }
}
