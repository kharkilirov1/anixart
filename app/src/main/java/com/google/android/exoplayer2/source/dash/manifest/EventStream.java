package com.google.android.exoplayer2.source.dash.manifest;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* loaded from: classes.dex */
public final class EventStream {

    /* renamed from: a */
    public final EventMessage[] f12957a;

    /* renamed from: b */
    public final long[] f12958b;

    /* renamed from: c */
    public final String f12959c;

    /* renamed from: d */
    public final String f12960d;

    public EventStream(String str, String str2, long j2, long[] jArr, EventMessage[] eventMessageArr) {
        this.f12959c = str;
        this.f12960d = str2;
        this.f12958b = jArr;
        this.f12957a = eventMessageArr;
    }

    /* renamed from: a */
    public String m7067a() {
        String str = this.f12959c;
        String str2 = this.f12960d;
        return C0576a.m4115n(C0576a.m4106e(str2, C0576a.m4106e(str, 1)), str, "/", str2);
    }
}
