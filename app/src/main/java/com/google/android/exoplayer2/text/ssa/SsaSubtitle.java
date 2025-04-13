package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class SsaSubtitle implements Subtitle {

    /* renamed from: b */
    public final List<List<Cue>> f13710b;

    /* renamed from: c */
    public final List<Long> f13711c;

    public SsaSubtitle(List<List<Cue>> list, List<Long> list2) {
        this.f13710b = list;
        this.f13711c = list2;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: a */
    public int mo7181a(long j2) {
        int i2;
        List<Long> list = this.f13711c;
        Long valueOf = Long.valueOf(j2);
        int i3 = Util.f14736a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i2 = binarySearch;
        }
        if (i2 < this.f13711c.size()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: b */
    public long mo7182b(int i2) {
        Assertions.m7513a(i2 >= 0);
        Assertions.m7513a(i2 < this.f13711c.size());
        return this.f13711c.get(i2).longValue();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: c */
    public List<Cue> mo7183c(long j2) {
        int m7734d = Util.m7734d(this.f13711c, Long.valueOf(j2), true, false);
        return m7734d == -1 ? Collections.emptyList() : this.f13710b.get(m7734d);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: d */
    public int mo7184d() {
        return this.f13711c.size();
    }
}
