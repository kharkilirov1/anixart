package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5751sl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class l81 {

    /* renamed from: a */
    @Nullable
    public final String f52300a;

    /* renamed from: b */
    @Nullable
    public final String f52301b;

    /* renamed from: c */
    public final boolean f52302c;

    /* renamed from: d */
    public final long f52303d;

    /* renamed from: e */
    public final long f52304e;

    /* renamed from: f */
    @Nullable
    public final o81 f52305f;

    /* renamed from: g */
    @Nullable
    private final String[] f52306g;

    /* renamed from: h */
    public final String f52307h;

    /* renamed from: i */
    @Nullable
    public final String f52308i;

    /* renamed from: j */
    @Nullable
    public final l81 f52309j;

    /* renamed from: k */
    private final HashMap<String, Integer> f52310k;

    /* renamed from: l */
    private final HashMap<String, Integer> f52311l;

    /* renamed from: m */
    private ArrayList f52312m;

    private l81(@Nullable String str, @Nullable String str2, long j2, long j3, @Nullable o81 o81Var, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable l81 l81Var) {
        this.f52300a = str;
        this.f52301b = str2;
        this.f52308i = str4;
        this.f52305f = o81Var;
        this.f52306g = strArr;
        this.f52302c = str2 != null;
        this.f52303d = j2;
        this.f52304e = j3;
        this.f52307h = (String) C5220ia.m25469a(str3);
        this.f52309j = l81Var;
        this.f52310k = new HashMap<>();
        this.f52311l = new HashMap<>();
    }

    /* renamed from: a */
    public static l81 m26384a(String str) {
        return new l81(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: b */
    public final long[] m26395b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i2 = 0;
        m26389a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        return jArr;
    }

    @Nullable
    /* renamed from: c */
    public final String[] m26396c() {
        return this.f52306g;
    }

    /* renamed from: a */
    public static l81 m26385a(@Nullable String str, long j2, long j3, @Nullable o81 o81Var, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable l81 l81Var) {
        return new l81(str, null, j2, j3, o81Var, strArr, str2, str3, l81Var);
    }

    /* renamed from: a */
    public final boolean m26394a(long j2) {
        long j3 = this.f52303d;
        return (j3 == -9223372036854775807L && this.f52304e == -9223372036854775807L) || (j3 <= j2 && this.f52304e == -9223372036854775807L) || ((j3 == -9223372036854775807L && j2 < this.f52304e) || (j3 <= j2 && j2 < this.f52304e));
    }

    /* renamed from: a */
    public final void m26393a(l81 l81Var) {
        if (this.f52312m == null) {
            this.f52312m = new ArrayList();
        }
        this.f52312m.add(l81Var);
    }

    /* renamed from: a */
    public final l81 m26391a(int i2) {
        ArrayList arrayList = this.f52312m;
        if (arrayList != null) {
            return (l81) arrayList.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public final int m26390a() {
        ArrayList arrayList = this.f52312m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: a */
    private void m26389a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f52300a);
        boolean equals2 = "div".equals(this.f52300a);
        if (z || equals || (equals2 && this.f52308i != null)) {
            long j2 = this.f52303d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.f52304e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f52312m == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f52312m.size(); i2++) {
            ((l81) this.f52312m.get(i2)).m26389a(treeSet, z || equals);
        }
    }

    /* renamed from: a */
    public final ArrayList m26392a(long j2, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        m26386a(j2, this.f52307h, arrayList);
        TreeMap treeMap = new TreeMap();
        m26388a(j2, false, this.f52307h, treeMap);
        m26387a(j2, map, map2, this.f52307h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                m81 m81Var = (m81) map2.get(pair.first);
                Objects.requireNonNull(m81Var);
                arrayList2.add(new C5751sl.a().m28303a(decodeByteArray).m28307b(m81Var.f52597b).m28308b(0).m28302a(0, m81Var.f52598c).m28301a(m81Var.f52600e).m28316d(m81Var.f52601f).m28300a(m81Var.f52602g).m28313c(m81Var.f52605j).m28305a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            m81 m81Var2 = (m81) map2.get(entry.getKey());
            Objects.requireNonNull(m81Var2);
            C5751sl.a aVar = (C5751sl.a) entry.getValue();
            CharSequence m28318e = aVar.m28318e();
            Objects.requireNonNull(m28318e);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m28318e;
            for (C5545oo c5545oo : (C5545oo[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C5545oo.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c5545oo), spannableStringBuilder.getSpanEnd(c5545oo), (CharSequence) "");
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
            aVar.m28302a(m81Var2.f52599d, m81Var2.f52598c);
            aVar.m28301a(m81Var2.f52600e);
            aVar.m28307b(m81Var2.f52597b);
            aVar.m28316d(m81Var2.f52601f);
            aVar.m28311b(m81Var2.f52603h, m81Var2.f52604i);
            aVar.m28313c(m81Var2.f52605j);
            arrayList2.add(aVar.m28305a());
        }
        return arrayList2;
    }

    /* renamed from: a */
    private void m26386a(long j2, String str, ArrayList arrayList) {
        if (!"".equals(this.f52307h)) {
            str = this.f52307h;
        }
        if (m26394a(j2) && "div".equals(this.f52300a) && this.f52308i != null) {
            arrayList.add(new Pair(str, this.f52308i));
            return;
        }
        for (int i2 = 0; i2 < m26390a(); i2++) {
            m26391a(i2).m26386a(j2, str, arrayList);
        }
    }

    /* renamed from: a */
    private void m26388a(long j2, boolean z, String str, TreeMap treeMap) {
        this.f52310k.clear();
        this.f52311l.clear();
        if ("metadata".equals(this.f52300a)) {
            return;
        }
        if (!"".equals(this.f52307h)) {
            str = this.f52307h;
        }
        if (this.f52302c && z) {
            if (!treeMap.containsKey(str)) {
                C5751sl.a aVar = new C5751sl.a();
                aVar.m28304a(new SpannableStringBuilder());
                treeMap.put(str, aVar);
            }
            CharSequence m28318e = ((C5751sl.a) treeMap.get(str)).m28318e();
            Objects.requireNonNull(m28318e);
            String str2 = this.f52301b;
            Objects.requireNonNull(str2);
            ((SpannableStringBuilder) m28318e).append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.f52300a) && z) {
            if (!treeMap.containsKey(str)) {
                C5751sl.a aVar2 = new C5751sl.a();
                aVar2.m28304a(new SpannableStringBuilder());
                treeMap.put(str, aVar2);
            }
            CharSequence m28318e2 = ((C5751sl.a) treeMap.get(str)).m28318e();
            Objects.requireNonNull(m28318e2);
            ((SpannableStringBuilder) m28318e2).append('\n');
            return;
        }
        if (m26394a(j2)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap<String, Integer> hashMap = this.f52310k;
                String str3 = (String) entry.getKey();
                CharSequence m28318e3 = ((C5751sl.a) entry.getValue()).m28318e();
                Objects.requireNonNull(m28318e3);
                hashMap.put(str3, Integer.valueOf(m28318e3.length()));
            }
            boolean equals = "p".equals(this.f52300a);
            for (int i2 = 0; i2 < m26390a(); i2++) {
                m26391a(i2).m26388a(j2, z || equals, str, treeMap);
            }
            if (equals) {
                if (!treeMap.containsKey(str)) {
                    C5751sl.a aVar3 = new C5751sl.a();
                    aVar3.m28304a(new SpannableStringBuilder());
                    treeMap.put(str, aVar3);
                }
                CharSequence m28318e4 = ((C5751sl.a) treeMap.get(str)).m28318e();
                Objects.requireNonNull(m28318e4);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m28318e4;
                int length = spannableStringBuilder.length() - 1;
                while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
                    spannableStringBuilder.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                HashMap<String, Integer> hashMap2 = this.f52311l;
                String str4 = (String) entry2.getKey();
                CharSequence m28318e5 = ((C5751sl.a) entry2.getValue()).m28318e();
                Objects.requireNonNull(m28318e5);
                hashMap2.put(str4, Integer.valueOf(m28318e5.length()));
            }
        }
    }

    /* renamed from: a */
    private void m26387a(long j2, Map map, Map map2, String str, TreeMap treeMap) {
        if (m26394a(j2)) {
            String str2 = "".equals(this.f52307h) ? str : this.f52307h;
            for (Map.Entry<String, Integer> entry : this.f52311l.entrySet()) {
                String key = entry.getKey();
                int intValue = this.f52310k.containsKey(key) ? this.f52310k.get(key).intValue() : 0;
                int intValue2 = entry.getValue().intValue();
                if (intValue != intValue2) {
                    C5751sl.a aVar = (C5751sl.a) treeMap.get(key);
                    Objects.requireNonNull(aVar);
                    m81 m81Var = (m81) map2.get(str2);
                    Objects.requireNonNull(m81Var);
                    int i2 = m81Var.f52605j;
                    o81 m26818a = n81.m26818a(this.f52305f, this.f52306g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.m28318e();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.m28304a(spannableStringBuilder);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    if (m26818a != null) {
                        n81.m26819a(spannableStringBuilder2, intValue, intValue2, m26818a, this.f52309j, map, i2);
                        if ("p".equals(this.f52300a)) {
                            if (m26818a.m27047j() != Float.MAX_VALUE) {
                                aVar.m28314c((m26818a.m27047j() * (-90.0f)) / 100.0f);
                            }
                            if (m26818a.m27049l() != null) {
                                aVar.m28309b(m26818a.m27049l());
                            }
                            if (m26818a.m27044g() != null) {
                                aVar.m28306a(m26818a.m27044g());
                            }
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < m26390a(); i3++) {
                m26391a(i3).m26387a(j2, map, map2, str2, treeMap);
            }
        }
    }
}
