package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class WebvttSubtitle implements Subtitle {

    /* renamed from: b */
    public final List<WebvttCueInfo> f13850b;

    /* renamed from: c */
    public final long[] f13851c;

    /* renamed from: d */
    public final long[] f13852d;

    public WebvttSubtitle(List<WebvttCueInfo> list) {
        this.f13850b = Collections.unmodifiableList(new ArrayList(list));
        this.f13851c = new long[list.size() * 2];
        for (int i2 = 0; i2 < list.size(); i2++) {
            WebvttCueInfo webvttCueInfo = list.get(i2);
            int i3 = i2 * 2;
            long[] jArr = this.f13851c;
            jArr[i3] = webvttCueInfo.f13822b;
            jArr[i3 + 1] = webvttCueInfo.f13823c;
        }
        long[] jArr2 = this.f13851c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f13852d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: a */
    public int mo7181a(long j2) {
        int m7730b = Util.m7730b(this.f13852d, j2, false, false);
        if (m7730b < this.f13852d.length) {
            return m7730b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: b */
    public long mo7182b(int i2) {
        Assertions.m7513a(i2 >= 0);
        Assertions.m7513a(i2 < this.f13852d.length);
        return this.f13852d[i2];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: c */
    public List<Cue> mo7183c(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f13850b.size(); i2++) {
            long[] jArr = this.f13851c;
            int i3 = i2 * 2;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                WebvttCueInfo webvttCueInfo = this.f13850b.get(i2);
                Cue cue = webvttCueInfo.f13821a;
                if (cue.f13441f == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
        }
        Collections.sort(arrayList2, C1133a.f13854d);
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            Cue.Builder m7177b = ((WebvttCueInfo) arrayList2.get(i4)).f13821a.m7177b();
            m7177b.f13458e = (-1) - i4;
            m7177b.f13459f = 1;
            arrayList.add(m7177b.m7178a());
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: d */
    public int mo7184d() {
        return this.f13852d.length;
    }
}
