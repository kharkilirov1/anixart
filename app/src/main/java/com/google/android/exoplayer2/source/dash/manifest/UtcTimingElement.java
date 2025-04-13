package com.google.android.exoplayer2.source.dash.manifest;

import androidx.room.util.C0576a;

/* loaded from: classes.dex */
public final class UtcTimingElement {

    /* renamed from: a */
    public final String f13012a;

    /* renamed from: b */
    public final String f13013b;

    public UtcTimingElement(String str, String str2) {
        this.f13012a = str;
        this.f13013b = str2;
    }

    public String toString() {
        String str = this.f13012a;
        String str2 = this.f13013b;
        return C0576a.m4115n(C0576a.m4106e(str2, C0576a.m4106e(str, 2)), str, ", ", str2);
    }
}
