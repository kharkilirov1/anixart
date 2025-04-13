package com.google.android.exoplayer2.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class TtmlSubtitle implements Subtitle {

    /* renamed from: b */
    public final TtmlNode f13784b;

    /* renamed from: c */
    public final long[] f13785c;

    /* renamed from: d */
    public final Map<String, TtmlStyle> f13786d;

    /* renamed from: e */
    public final Map<String, TtmlRegion> f13787e;

    /* renamed from: f */
    public final Map<String, String> f13788f;

    public TtmlSubtitle(TtmlNode ttmlNode, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, Map<String, String> map3) {
        this.f13784b = ttmlNode;
        this.f13787e = map2;
        this.f13788f = map3;
        this.f13786d = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i2 = 0;
        ttmlNode.m7259e(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        this.f13785c = jArr;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: a */
    public int mo7181a(long j2) {
        int m7730b = Util.m7730b(this.f13785c, j2, false, false);
        if (m7730b < this.f13785c.length) {
            return m7730b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: b */
    public long mo7182b(int i2) {
        return this.f13785c[i2];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: c */
    public List<Cue> mo7183c(long j2) {
        TtmlNode ttmlNode = this.f13784b;
        Map<String, TtmlStyle> map = this.f13786d;
        Map<String, TtmlRegion> map2 = this.f13787e;
        Map<String, String> map3 = this.f13788f;
        Objects.requireNonNull(ttmlNode);
        ArrayList arrayList = new ArrayList();
        ttmlNode.m7261h(j2, ttmlNode.f13749h, arrayList);
        TreeMap treeMap = new TreeMap();
        ttmlNode.m7263j(j2, false, ttmlNode.f13749h, treeMap);
        ttmlNode.m7262i(j2, map, map2, ttmlNode.f13749h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                TtmlRegion ttmlRegion = map2.get(pair.first);
                Objects.requireNonNull(ttmlRegion);
                Cue.Builder builder = new Cue.Builder();
                builder.f13455b = decodeByteArray;
                builder.f13461h = ttmlRegion.f13756b;
                builder.f13462i = 0;
                builder.f13458e = ttmlRegion.f13757c;
                builder.f13459f = 0;
                builder.f13460g = ttmlRegion.f13759e;
                builder.f13465l = ttmlRegion.f13760f;
                builder.f13466m = ttmlRegion.f13761g;
                builder.f13469p = ttmlRegion.f13764j;
                arrayList2.add(builder.m7178a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion2 = map2.get(entry.getKey());
            Objects.requireNonNull(ttmlRegion2);
            Cue.Builder builder2 = (Cue.Builder) entry.getValue();
            CharSequence charSequence = builder2.f13454a;
            Objects.requireNonNull(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (DeleteTextSpan deleteTextSpan : (DeleteTextSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), DeleteTextSpan.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(deleteTextSpan), spannableStringBuilder.getSpanEnd(deleteTextSpan), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f2 = ttmlRegion2.f13757c;
            int i10 = ttmlRegion2.f13758d;
            builder2.f13458e = f2;
            builder2.f13459f = i10;
            builder2.f13460g = ttmlRegion2.f13759e;
            builder2.f13461h = ttmlRegion2.f13756b;
            builder2.f13465l = ttmlRegion2.f13760f;
            float f3 = ttmlRegion2.f13763i;
            int i11 = ttmlRegion2.f13762h;
            builder2.f13464k = f3;
            builder2.f13463j = i11;
            builder2.f13469p = ttmlRegion2.f13764j;
            arrayList2.add(builder2.m7178a());
        }
        return arrayList2;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    /* renamed from: d */
    public int mo7184d() {
        return this.f13785c.length;
    }
}
