package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    /* renamed from: A */
    void mo13082A(int i2, long j2) throws IOException;

    /* renamed from: B */
    void mo13083B(int i2, List<Integer> list, boolean z) throws IOException;

    /* renamed from: C */
    void mo13084C(int i2, List<Boolean> list, boolean z) throws IOException;

    /* renamed from: D */
    <K, V> void mo13085D(int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException;

    /* renamed from: E */
    void mo13086E(int i2, List<Integer> list, boolean z) throws IOException;

    /* renamed from: F */
    void mo13087F(int i2, List<Long> list, boolean z) throws IOException;

    /* renamed from: G */
    void mo13120G(int i2, long j2) throws IOException;

    /* renamed from: H */
    void mo13088H(int i2, float f2) throws IOException;

    @Deprecated
    /* renamed from: I */
    void mo13121I(int i2) throws IOException;

    /* renamed from: J */
    void mo13089J(int i2, List<Integer> list, boolean z) throws IOException;

    /* renamed from: K */
    void mo13090K(int i2, int i3) throws IOException;

    /* renamed from: L */
    void mo13091L(int i2, List<Long> list, boolean z) throws IOException;

    /* renamed from: M */
    void mo13092M(int i2, List<Integer> list, boolean z) throws IOException;

    /* renamed from: N */
    void mo13093N(int i2, List<Double> list, boolean z) throws IOException;

    /* renamed from: O */
    void mo13122O(int i2, int i3) throws IOException;

    /* renamed from: P */
    void mo13094P(int i2, List<ByteString> list) throws IOException;

    /* renamed from: a */
    void mo13101a(int i2, List<?> list, Schema schema) throws IOException;

    @Deprecated
    /* renamed from: b */
    void mo13103b(int i2, List<?> list, Schema schema) throws IOException;

    /* renamed from: c */
    void mo13105c(int i2, List<Float> list, boolean z) throws IOException;

    /* renamed from: d */
    void mo13125d(int i2, int i3) throws IOException;

    /* renamed from: e */
    void mo13108e(int i2, Object obj) throws IOException;

    /* renamed from: f */
    void mo13126f(int i2, int i3) throws IOException;

    /* renamed from: g */
    void mo13110g(int i2, double d) throws IOException;

    /* renamed from: h */
    void mo13111h(int i2, List<Long> list, boolean z) throws IOException;

    /* renamed from: i */
    void mo13112i(int i2, List<Long> list, boolean z) throws IOException;

    /* renamed from: j */
    void mo13130j(int i2, Object obj, Schema schema) throws IOException;

    /* renamed from: k */
    void mo13131k(int i2, long j2) throws IOException;

    /* renamed from: l */
    FieldOrder mo13113l();

    /* renamed from: m */
    void mo13114m(int i2, List<String> list) throws IOException;

    /* renamed from: n */
    void mo13132n(int i2, String str) throws IOException;

    /* renamed from: o */
    void mo13133o(int i2, long j2) throws IOException;

    /* renamed from: p */
    void mo13134p(int i2, Object obj) throws IOException;

    /* renamed from: q */
    void mo13115q(int i2, List<Integer> list, boolean z) throws IOException;

    /* renamed from: r */
    void mo13116r(int i2, long j2) throws IOException;

    /* renamed from: s */
    void mo13135s(int i2, boolean z) throws IOException;

    @Deprecated
    /* renamed from: t */
    void mo13136t(int i2, Object obj, Schema schema) throws IOException;

    /* renamed from: u */
    void mo13117u(int i2, int i3) throws IOException;

    @Deprecated
    /* renamed from: v */
    void mo13137v(int i2) throws IOException;

    /* renamed from: w */
    void mo13138w(int i2, ByteString byteString) throws IOException;

    /* renamed from: x */
    void mo13139x(int i2, int i3) throws IOException;

    /* renamed from: y */
    void mo13118y(int i2, List<Long> list, boolean z) throws IOException;

    /* renamed from: z */
    void mo13119z(int i2, List<Integer> list, boolean z) throws IOException;
}
