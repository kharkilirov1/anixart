package com.google.android.exoplayer2.extractor.flv;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class ScriptTagPayloadReader extends TagPayloadReader {

    /* renamed from: b */
    public long f10960b;

    /* renamed from: c */
    public long[] f10961c;

    /* renamed from: d */
    public long[] f10962d;

    public ScriptTagPayloadReader() {
        super(new DummyTrackOutput());
        this.f10960b = -9223372036854775807L;
        this.f10961c = new long[0];
        this.f10962d = new long[0];
    }

    @Nullable
    /* renamed from: d */
    public static Object m6446d(ParsableByteArray parsableByteArray, int i2) {
        if (i2 == 0) {
            return Double.valueOf(Double.longBitsToDouble(parsableByteArray.m7650n()));
        }
        if (i2 == 1) {
            return Boolean.valueOf(parsableByteArray.m7657u() == 1);
        }
        if (i2 == 2) {
            return m6448f(parsableByteArray);
        }
        if (i2 != 3) {
            if (i2 == 8) {
                return m6447e(parsableByteArray);
            }
            if (i2 != 10) {
                if (i2 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(parsableByteArray.m7650n())).doubleValue());
                parsableByteArray.m7636G(2);
                return date;
            }
            int m7660x = parsableByteArray.m7660x();
            ArrayList arrayList = new ArrayList(m7660x);
            for (int i3 = 0; i3 < m7660x; i3++) {
                Object m6446d = m6446d(parsableByteArray, parsableByteArray.m7657u());
                if (m6446d != null) {
                    arrayList.add(m6446d);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String m6448f = m6448f(parsableByteArray);
            int m7657u = parsableByteArray.m7657u();
            if (m7657u == 9) {
                return hashMap;
            }
            Object m6446d2 = m6446d(parsableByteArray, m7657u);
            if (m6446d2 != null) {
                hashMap.put(m6448f, m6446d2);
            }
        }
    }

    /* renamed from: e */
    public static HashMap<String, Object> m6447e(ParsableByteArray parsableByteArray) {
        int m7660x = parsableByteArray.m7660x();
        HashMap<String, Object> hashMap = new HashMap<>(m7660x);
        for (int i2 = 0; i2 < m7660x; i2++) {
            String m6448f = m6448f(parsableByteArray);
            Object m6446d = m6446d(parsableByteArray, parsableByteArray.m7657u());
            if (m6446d != null) {
                hashMap.put(m6448f, m6446d);
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    public static String m6448f(ParsableByteArray parsableByteArray) {
        int m7662z = parsableByteArray.m7662z();
        int i2 = parsableByteArray.f14699b;
        parsableByteArray.m7636G(m7662z);
        return new String(parsableByteArray.f14698a, i2, m7662z);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: b */
    public boolean mo6442b(ParsableByteArray parsableByteArray) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: c */
    public boolean mo6443c(ParsableByteArray parsableByteArray, long j2) {
        if (parsableByteArray.m7657u() != 2 || !"onMetaData".equals(m6448f(parsableByteArray)) || parsableByteArray.m7657u() != 8) {
            return false;
        }
        HashMap<String, Object> m6447e = m6447e(parsableByteArray);
        Object obj = m6447e.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f10960b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m6447e.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f10961c = new long[size];
                this.f10962d = new long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f10961c = new long[0];
                        this.f10962d = new long[0];
                        break;
                    }
                    this.f10961c[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f10962d[i2] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
