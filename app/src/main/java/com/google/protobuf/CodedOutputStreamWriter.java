package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class CodedOutputStreamWriter implements Writer {

    /* renamed from: a */
    public final CodedOutputStream f24051a;

    /* renamed from: com.google.protobuf.CodedOutputStreamWriter$1 */
    public static /* synthetic */ class C23541 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24052a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f24052a = iArr;
            try {
                iArr[WireFormat.FieldType.f24408k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24052a[WireFormat.FieldType.f24407j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24052a[WireFormat.FieldType.f24405h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24052a[WireFormat.FieldType.f24415r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24052a[WireFormat.FieldType.f24417t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24052a[WireFormat.FieldType.f24413p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24052a[WireFormat.FieldType.f24406i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24052a[WireFormat.FieldType.f24403f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24052a[WireFormat.FieldType.f24416s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24052a[WireFormat.FieldType.f24418u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24052a[WireFormat.FieldType.f24404g.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24052a[WireFormat.FieldType.f24409l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        Charset charset = Internal.f24210a;
        this.f24051a = codedOutputStream;
        codedOutputStream.f24040a = this;
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: A */
    public void mo13082A(int i2, long j2) throws IOException {
        this.f24051a.mo13299k(i2, j2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: B */
    public void mo13083B(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13298f(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            Logger logger = CodedOutputStream.f24038b;
            i4 += 4;
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13284C0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: C */
    public void mo13084C(int i2, List<Boolean> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13302s(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).booleanValue();
            Logger logger = CodedOutputStream.f24038b;
            i4++;
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13307z0(list.get(i3).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: D */
    public <K, V> void mo13085D(int i2, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException {
        Objects.requireNonNull(this.f24051a);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f24051a.mo13293L0(i2, 2);
            this.f24051a.mo13294M0(MapEntryLite.m13488a(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.m13489b(this.f24051a, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: E */
    public void mo13086E(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13297d(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.m13276r0(list.get(i5).intValue());
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13294M0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: F */
    public void mo13087F(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13301o(i2, CodedOutputStream.m13280v0(list.get(i3).longValue()));
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.m13271m0(list.get(i5).longValue());
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13295N0(CodedOutputStream.m13280v0(list.get(i3).longValue()));
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: G */
    public void mo13120G(int i2, long j2) throws IOException {
        this.f24051a.mo13301o(i2, CodedOutputStream.m13280v0(j2));
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: H */
    public void mo13088H(int i2, float f2) throws IOException {
        CodedOutputStream codedOutputStream = this.f24051a;
        Objects.requireNonNull(codedOutputStream);
        codedOutputStream.mo13298f(i2, Float.floatToRawIntBits(f2));
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: I */
    public void mo13121I(int i2) throws IOException {
        this.f24051a.mo13293L0(i2, 4);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: J */
    public void mo13089J(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13297d(i2, CodedOutputStream.m13279u0(list.get(i3).intValue()));
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.m13269k0(list.get(i5).intValue());
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13294M0(CodedOutputStream.m13279u0(list.get(i3).intValue()));
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: K */
    public void mo13090K(int i2, int i3) throws IOException {
        this.f24051a.mo13305x(i2, i3);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: L */
    public void mo13091L(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13301o(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.m13278t0(list.get(i5).longValue());
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13295N0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: M */
    public void mo13092M(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13305x(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.m13262d0(list.get(i5).intValue());
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13286E0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: N */
    public void mo13093N(int i2, List<Double> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                CodedOutputStream codedOutputStream = this.f24051a;
                double doubleValue = list.get(i3).doubleValue();
                Objects.requireNonNull(codedOutputStream);
                codedOutputStream.mo13299k(i2, Double.doubleToRawLongBits(doubleValue));
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).doubleValue();
            Logger logger = CodedOutputStream.f24038b;
            i4 += 8;
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            CodedOutputStream codedOutputStream2 = this.f24051a;
            double doubleValue2 = list.get(i3).doubleValue();
            Objects.requireNonNull(codedOutputStream2);
            codedOutputStream2.mo13285D0(Double.doubleToRawLongBits(doubleValue2));
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: O */
    public void mo13122O(int i2, int i3) throws IOException {
        this.f24051a.mo13297d(i2, CodedOutputStream.m13279u0(i3));
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: P */
    public void mo13094P(int i2, List<ByteString> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f24051a.mo13303w(i2, list.get(i3));
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: a */
    public void mo13101a(int i2, List<?> list, Schema schema) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f24051a.mo13288G0(i2, (MessageLite) list.get(i3), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: b */
    public void mo13103b(int i2, List<?> list, Schema schema) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mo13136t(i2, list.get(i3), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: c */
    public void mo13105c(int i2, List<Float> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                CodedOutputStream codedOutputStream = this.f24051a;
                float floatValue = list.get(i3).floatValue();
                Objects.requireNonNull(codedOutputStream);
                codedOutputStream.mo13298f(i2, Float.floatToRawIntBits(floatValue));
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).floatValue();
            Logger logger = CodedOutputStream.f24038b;
            i4 += 4;
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            CodedOutputStream codedOutputStream2 = this.f24051a;
            float floatValue2 = list.get(i3).floatValue();
            Objects.requireNonNull(codedOutputStream2);
            codedOutputStream2.mo13284C0(Float.floatToRawIntBits(floatValue2));
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: d */
    public void mo13125d(int i2, int i3) throws IOException {
        this.f24051a.mo13297d(i2, i3);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: e */
    public final void mo13108e(int i2, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f24051a.mo13291J0(i2, (ByteString) obj);
        } else {
            this.f24051a.mo13290I0(i2, (MessageLite) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: f */
    public void mo13126f(int i2, int i3) throws IOException {
        this.f24051a.mo13298f(i2, i3);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: g */
    public void mo13110g(int i2, double d) throws IOException {
        CodedOutputStream codedOutputStream = this.f24051a;
        Objects.requireNonNull(codedOutputStream);
        codedOutputStream.mo13299k(i2, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: h */
    public void mo13111h(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13299k(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            Logger logger = CodedOutputStream.f24038b;
            i4 += 8;
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13285D0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: i */
    public void mo13112i(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13301o(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.m13278t0(list.get(i5).longValue());
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13295N0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: j */
    public void mo13130j(int i2, Object obj, Schema schema) throws IOException {
        this.f24051a.mo13288G0(i2, (MessageLite) obj, schema);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: k */
    public void mo13131k(int i2, long j2) throws IOException {
        this.f24051a.mo13299k(i2, j2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: l */
    public Writer.FieldOrder mo13113l() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: m */
    public void mo13114m(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i3 < list.size()) {
                this.f24051a.mo13300n(i2, list.get(i3));
                i3++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i3 < list.size()) {
            Object mo13473Z0 = lazyStringList.mo13473Z0(i3);
            if (mo13473Z0 instanceof String) {
                this.f24051a.mo13300n(i2, (String) mo13473Z0);
            } else {
                this.f24051a.mo13303w(i2, (ByteString) mo13473Z0);
            }
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: n */
    public void mo13132n(int i2, String str) throws IOException {
        this.f24051a.mo13300n(i2, str);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: o */
    public void mo13133o(int i2, long j2) throws IOException {
        this.f24051a.mo13301o(i2, j2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: p */
    public void mo13134p(int i2, Object obj) throws IOException {
        this.f24051a.mo13287F0(i2, (MessageLite) obj);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: q */
    public void mo13115q(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13305x(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += CodedOutputStream.m13262d0(list.get(i5).intValue());
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13286E0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: r */
    public void mo13116r(int i2, long j2) throws IOException {
        this.f24051a.mo13301o(i2, j2);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: s */
    public void mo13135s(int i2, boolean z) throws IOException {
        this.f24051a.mo13302s(i2, z);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: t */
    public void mo13136t(int i2, Object obj, Schema schema) throws IOException {
        CodedOutputStream codedOutputStream = this.f24051a;
        codedOutputStream.mo13293L0(i2, 3);
        schema.mo13537b((MessageLite) obj, codedOutputStream.f24040a);
        codedOutputStream.mo13293L0(i2, 4);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: u */
    public void mo13117u(int i2, int i3) throws IOException {
        this.f24051a.mo13298f(i2, i3);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: v */
    public void mo13137v(int i2) throws IOException {
        this.f24051a.mo13293L0(i2, 3);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: w */
    public void mo13138w(int i2, ByteString byteString) throws IOException {
        this.f24051a.mo13303w(i2, byteString);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: x */
    public void mo13139x(int i2, int i3) throws IOException {
        this.f24051a.mo13305x(i2, i3);
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: y */
    public void mo13118y(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13299k(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            Logger logger = CodedOutputStream.f24038b;
            i4 += 8;
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13285D0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.protobuf.Writer
    /* renamed from: z */
    public void mo13119z(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f24051a.mo13298f(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f24051a.mo13293L0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            Logger logger = CodedOutputStream.f24038b;
            i4 += 4;
        }
        this.f24051a.mo13294M0(i4);
        while (i3 < list.size()) {
            this.f24051a.mo13284C0(list.get(i3).intValue());
            i3++;
        }
    }
}
