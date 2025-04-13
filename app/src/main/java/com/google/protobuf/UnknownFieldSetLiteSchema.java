package com.google.protobuf;

import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: a */
    public void mo13647a(UnknownFieldSetLite unknownFieldSetLite, int i2, int i3) {
        unknownFieldSetLite.m13669c((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: b */
    public void mo13648b(UnknownFieldSetLite unknownFieldSetLite, int i2, long j2) {
        unknownFieldSetLite.m13669c((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: c */
    public void mo13649c(UnknownFieldSetLite unknownFieldSetLite, int i2, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.m13669c((i2 << 3) | 3, unknownFieldSetLite2);
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: d */
    public void mo13650d(UnknownFieldSetLite unknownFieldSetLite, int i2, ByteString byteString) {
        unknownFieldSetLite.m13669c((i2 << 3) | 2, byteString);
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: e */
    public void mo13651e(UnknownFieldSetLite unknownFieldSetLite, int i2, long j2) {
        unknownFieldSetLite.m13669c((i2 << 3) | 0, Long.valueOf(j2));
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: f */
    public UnknownFieldSetLite mo13652f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.f24377f) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite m13666b = UnknownFieldSetLite.m13666b();
        generatedMessageLite.unknownFields = m13666b;
        return m13666b;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: g */
    public UnknownFieldSetLite mo13653g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: h */
    public int mo13654h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.m13668a();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: i */
    public int mo13655i(UnknownFieldSetLite unknownFieldSetLite) {
        UnknownFieldSetLite unknownFieldSetLite2 = unknownFieldSetLite;
        int i2 = unknownFieldSetLite2.f24381d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < unknownFieldSetLite2.f24378a; i4++) {
            int i5 = unknownFieldSetLite2.f24379b[i4] >>> 3;
            ByteString byteString = (ByteString) unknownFieldSetLite2.f24380c[i4];
            i3 += CodedOutputStream.m13253U(3, byteString) + CodedOutputStream.m13275q0(2, i5) + (CodedOutputStream.m13274p0(1) * 2);
        }
        unknownFieldSetLite2.f24381d = i3;
        return i3;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: j */
    public void mo13656j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f24382e = false;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: k */
    public UnknownFieldSetLite mo13657k(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        UnknownFieldSetLite unknownFieldSetLite3 = unknownFieldSetLite;
        UnknownFieldSetLite unknownFieldSetLite4 = unknownFieldSetLite2;
        if (unknownFieldSetLite4.equals(UnknownFieldSetLite.f24377f)) {
            return unknownFieldSetLite3;
        }
        int i2 = unknownFieldSetLite3.f24378a + unknownFieldSetLite4.f24378a;
        int[] copyOf = Arrays.copyOf(unknownFieldSetLite3.f24379b, i2);
        System.arraycopy(unknownFieldSetLite4.f24379b, 0, copyOf, unknownFieldSetLite3.f24378a, unknownFieldSetLite4.f24378a);
        Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite3.f24380c, i2);
        System.arraycopy(unknownFieldSetLite4.f24380c, 0, copyOf2, unknownFieldSetLite3.f24378a, unknownFieldSetLite4.f24378a);
        return new UnknownFieldSetLite(i2, copyOf, copyOf2, true);
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: m */
    public UnknownFieldSetLite mo13659m() {
        return UnknownFieldSetLite.m13666b();
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: n */
    public void mo13660n(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: o */
    public void mo13661o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: p */
    public boolean mo13662p(Reader reader) {
        return false;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: q */
    public UnknownFieldSetLite mo13663q(UnknownFieldSetLite unknownFieldSetLite) {
        UnknownFieldSetLite unknownFieldSetLite2 = unknownFieldSetLite;
        unknownFieldSetLite2.f24382e = false;
        return unknownFieldSetLite2;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: r */
    public void mo13664r(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        UnknownFieldSetLite unknownFieldSetLite2 = unknownFieldSetLite;
        Objects.requireNonNull(unknownFieldSetLite2);
        if (writer.mo13113l() != Writer.FieldOrder.DESCENDING) {
            for (int i2 = 0; i2 < unknownFieldSetLite2.f24378a; i2++) {
                writer.mo13108e(unknownFieldSetLite2.f24379b[i2] >>> 3, unknownFieldSetLite2.f24380c[i2]);
            }
            return;
        }
        int i3 = unknownFieldSetLite2.f24378a;
        while (true) {
            i3--;
            if (i3 < 0) {
                return;
            } else {
                writer.mo13108e(unknownFieldSetLite2.f24379b[i3] >>> 3, unknownFieldSetLite2.f24380c[i3]);
            }
        }
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    /* renamed from: s */
    public void mo13665s(UnknownFieldSetLite unknownFieldSetLite, Writer writer) throws IOException {
        unknownFieldSetLite.m13670e(writer);
    }
}
