package com.google.android.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

/* loaded from: classes.dex */
final class TtmlNode {

    /* renamed from: a */
    @Nullable
    public final String f13742a;

    /* renamed from: b */
    @Nullable
    public final String f13743b;

    /* renamed from: c */
    public final boolean f13744c;

    /* renamed from: d */
    public final long f13745d;

    /* renamed from: e */
    public final long f13746e;

    /* renamed from: f */
    @Nullable
    public final TtmlStyle f13747f;

    /* renamed from: g */
    @Nullable
    public final String[] f13748g;

    /* renamed from: h */
    public final String f13749h;

    /* renamed from: i */
    @Nullable
    public final String f13750i;

    /* renamed from: j */
    @Nullable
    public final TtmlNode f13751j;

    /* renamed from: k */
    public final HashMap<String, Integer> f13752k;

    /* renamed from: l */
    public final HashMap<String, Integer> f13753l;

    /* renamed from: m */
    public List<TtmlNode> f13754m;

    public TtmlNode(@Nullable String str, @Nullable String str2, long j2, long j3, @Nullable TtmlStyle ttmlStyle, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable TtmlNode ttmlNode) {
        this.f13742a = str;
        this.f13743b = str2;
        this.f13750i = str4;
        this.f13747f = ttmlStyle;
        this.f13748g = strArr;
        this.f13744c = str2 != null;
        this.f13745d = j2;
        this.f13746e = j3;
        Objects.requireNonNull(str3);
        this.f13749h = str3;
        this.f13751j = ttmlNode;
        this.f13752k = new HashMap<>();
        this.f13753l = new HashMap<>();
    }

    /* renamed from: b */
    public static TtmlNode m7254b(String str) {
        return new TtmlNode(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: f */
    public static SpannableStringBuilder m7255f(String str, Map<String, Cue.Builder> map) {
        if (!map.containsKey(str)) {
            Cue.Builder builder = new Cue.Builder();
            builder.f13454a = new SpannableStringBuilder();
            map.put(str, builder);
        }
        CharSequence charSequence = map.get(str).f13454a;
        Objects.requireNonNull(charSequence);
        return (SpannableStringBuilder) charSequence;
    }

    /* renamed from: a */
    public void m7256a(TtmlNode ttmlNode) {
        if (this.f13754m == null) {
            this.f13754m = new ArrayList();
        }
        this.f13754m.add(ttmlNode);
    }

    /* renamed from: c */
    public TtmlNode m7257c(int i2) {
        List<TtmlNode> list = this.f13754m;
        if (list != null) {
            return list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: d */
    public int m7258d() {
        List<TtmlNode> list = this.f13754m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: e */
    public final void m7259e(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f13742a);
        boolean equals2 = "div".equals(this.f13742a);
        if (z || equals || (equals2 && this.f13750i != null)) {
            long j2 = this.f13745d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.f13746e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f13754m == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f13754m.size(); i2++) {
            this.f13754m.get(i2).m7259e(treeSet, z || equals);
        }
    }

    /* renamed from: g */
    public boolean m7260g(long j2) {
        long j3 = this.f13745d;
        return (j3 == -9223372036854775807L && this.f13746e == -9223372036854775807L) || (j3 <= j2 && this.f13746e == -9223372036854775807L) || ((j3 == -9223372036854775807L && j2 < this.f13746e) || (j3 <= j2 && j2 < this.f13746e));
    }

    /* renamed from: h */
    public final void m7261h(long j2, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f13749h)) {
            str = this.f13749h;
        }
        if (m7260g(j2) && "div".equals(this.f13742a) && this.f13750i != null) {
            list.add(new Pair<>(str, this.f13750i));
            return;
        }
        for (int i2 = 0; i2 < m7258d(); i2++) {
            m7257c(i2).m7261h(j2, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021f  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7262i(long r18, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> r20, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> r21, java.lang.String r22, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.Cue.Builder> r23) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TtmlNode.m7262i(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    /* renamed from: j */
    public final void m7263j(long j2, boolean z, String str, Map<String, Cue.Builder> map) {
        this.f13752k.clear();
        this.f13753l.clear();
        if ("metadata".equals(this.f13742a)) {
            return;
        }
        if (!"".equals(this.f13749h)) {
            str = this.f13749h;
        }
        if (this.f13744c && z) {
            SpannableStringBuilder m7255f = m7255f(str, map);
            String str2 = this.f13743b;
            Objects.requireNonNull(str2);
            m7255f.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.f13742a) && z) {
            m7255f(str, map).append('\n');
            return;
        }
        if (m7260g(j2)) {
            for (Map.Entry<String, Cue.Builder> entry : map.entrySet()) {
                HashMap<String, Integer> hashMap = this.f13752k;
                String key = entry.getKey();
                CharSequence charSequence = entry.getValue().f13454a;
                Objects.requireNonNull(charSequence);
                hashMap.put(key, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(this.f13742a);
            for (int i2 = 0; i2 < m7258d(); i2++) {
                m7257c(i2).m7263j(j2, z || equals, str, map);
            }
            if (equals) {
                SpannableStringBuilder m7255f2 = m7255f(str, map);
                int length = m7255f2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (m7255f2.charAt(length) == ' ');
                if (length >= 0 && m7255f2.charAt(length) != '\n') {
                    m7255f2.append('\n');
                }
            }
            for (Map.Entry<String, Cue.Builder> entry2 : map.entrySet()) {
                HashMap<String, Integer> hashMap2 = this.f13753l;
                String key2 = entry2.getKey();
                CharSequence charSequence2 = entry2.getValue().f13454a;
                Objects.requireNonNull(charSequence2);
                hashMap2.put(key2, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
