package com.google.android.exoplayer2.text;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.exoplayer2.util.BundleableUtil;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CueEncoder {
    /* renamed from: a */
    public byte[] m7179a(List<Cue> list) {
        ArrayList<Bundle> m7525d = BundleableUtil.m7525d(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", m7525d);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
