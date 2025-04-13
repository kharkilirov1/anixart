package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class SubripSubtitle implements Subtitle {

    /* renamed from: b */
    public final Cue[] f13716b;

    /* renamed from: c */
    public final long[] f13717c;

    public SubripSubtitle(Cue[] cueArr, long[] jArr) {
        this.f13716b = cueArr;
        this.f13717c = jArr;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: a */
    public int mo7181a(long j2) {
        int m7730b = Util.m7730b(this.f13717c, j2, false, false);
        if (m7730b < this.f13717c.length) {
            return m7730b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: b */
    public long mo7182b(int i2) {
        Assertions.m7513a(i2 >= 0);
        Assertions.m7513a(i2 < this.f13717c.length);
        return this.f13717c[i2];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: c */
    public List<Cue> mo7183c(long j2) {
        int m7737f = Util.m7737f(this.f13717c, j2, true, false);
        if (m7737f != -1) {
            Cue[] cueArr = this.f13716b;
            if (cueArr[m7737f] != Cue.f13435s) {
                return Collections.singletonList(cueArr[m7737f]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: d */
    public int mo7184d() {
        return this.f13717c.length;
    }
}
