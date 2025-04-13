package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.webvtt.WebvttCueParser;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.text.webvtt.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1133a implements Comparator {

    /* renamed from: c */
    public static final /* synthetic */ C1133a f13853c = new C1133a(0);

    /* renamed from: d */
    public static final /* synthetic */ C1133a f13854d = new C1133a(1);

    /* renamed from: b */
    public final /* synthetic */ int f13855b;

    public /* synthetic */ C1133a(int i2) {
        this.f13855b = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13855b) {
            case 0:
                return Integer.compare(((WebvttCueParser.Element) obj).f13828a.f13831b, ((WebvttCueParser.Element) obj2).f13828a.f13831b);
            default:
                return Long.compare(((WebvttCueInfo) obj).f13822b, ((WebvttCueInfo) obj2).f13822b);
        }
    }
}
