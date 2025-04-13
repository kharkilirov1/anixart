package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* loaded from: classes3.dex */
public enum pr0 {
    f53634b(InstreamAdBreakType.PREROLL),
    f53635c(InstreamAdBreakType.MIDROLL),
    f53636d(InstreamAdBreakType.POSTROLL),
    f53637e("standalone");


    /* renamed from: a */
    private final String f53639a;

    pr0(String str) {
        this.f53639a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f53639a;
    }
}
