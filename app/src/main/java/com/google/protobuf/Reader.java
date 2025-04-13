package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
interface Reader {
    @Deprecated
    /* renamed from: A */
    <T> T mo13018A(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: B */
    int mo13019B() throws IOException;

    /* renamed from: C */
    void mo13020C(List<String> list) throws IOException;

    /* renamed from: D */
    <T> T mo13021D(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: E */
    <K, V> void mo13022E(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: F */
    void mo13023F(List<String> list) throws IOException;

    /* renamed from: G */
    ByteString mo13024G() throws IOException;

    /* renamed from: H */
    void mo13025H(List<Float> list) throws IOException;

    /* renamed from: I */
    int mo13026I() throws IOException;

    /* renamed from: J */
    boolean mo13027J() throws IOException;

    /* renamed from: K */
    int mo13028K() throws IOException;

    /* renamed from: L */
    void mo13029L(List<ByteString> list) throws IOException;

    /* renamed from: M */
    void mo13030M(List<Double> list) throws IOException;

    /* renamed from: N */
    long mo13031N() throws IOException;

    /* renamed from: O */
    String mo13032O() throws IOException;

    /* renamed from: P */
    void mo13033P(List<Long> list) throws IOException;

    /* renamed from: a */
    void mo13044a(List<Integer> list) throws IOException;

    /* renamed from: b */
    long mo13046b() throws IOException;

    /* renamed from: c */
    long mo13048c() throws IOException;

    /* renamed from: d */
    void mo13050d(List<Integer> list) throws IOException;

    /* renamed from: e */
    int mo13052e();

    /* renamed from: f */
    void mo13054f(List<Long> list) throws IOException;

    @Deprecated
    /* renamed from: g */
    <T> void mo13056g(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: h */
    void mo13058h(List<Integer> list) throws IOException;

    /* renamed from: i */
    <T> T mo13060i(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: j */
    int mo13062j() throws IOException;

    /* renamed from: k */
    boolean mo13064k() throws IOException;

    /* renamed from: l */
    <T> void mo13065l(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: m */
    long mo13066m() throws IOException;

    /* renamed from: n */
    void mo13067n(List<Long> list) throws IOException;

    @Deprecated
    /* renamed from: o */
    <T> T mo13068o(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: p */
    int mo13069p() throws IOException;

    /* renamed from: q */
    void mo13070q(List<Long> list) throws IOException;

    /* renamed from: r */
    void mo13071r(List<Long> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    /* renamed from: s */
    void mo13072s(List<Integer> list) throws IOException;

    /* renamed from: t */
    void mo13073t(List<Integer> list) throws IOException;

    /* renamed from: u */
    int mo13074u() throws IOException;

    /* renamed from: v */
    void mo13075v(List<Integer> list) throws IOException;

    /* renamed from: w */
    int mo13076w() throws IOException;

    /* renamed from: x */
    long mo13077x() throws IOException;

    /* renamed from: y */
    void mo13078y(List<Boolean> list) throws IOException;

    /* renamed from: z */
    String mo13079z() throws IOException;
}
