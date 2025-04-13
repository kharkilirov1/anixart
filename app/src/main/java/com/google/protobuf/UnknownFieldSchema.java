package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
abstract class UnknownFieldSchema<T, B> {
    /* renamed from: a */
    public abstract void mo13647a(B b, int i2, int i3);

    /* renamed from: b */
    public abstract void mo13648b(B b, int i2, long j2);

    /* renamed from: c */
    public abstract void mo13649c(B b, int i2, T t);

    /* renamed from: d */
    public abstract void mo13650d(B b, int i2, ByteString byteString);

    /* renamed from: e */
    public abstract void mo13651e(B b, int i2, long j2);

    /* renamed from: f */
    public abstract B mo13652f(Object obj);

    /* renamed from: g */
    public abstract T mo13653g(Object obj);

    /* renamed from: h */
    public abstract int mo13654h(T t);

    /* renamed from: i */
    public abstract int mo13655i(T t);

    /* renamed from: j */
    public abstract void mo13656j(Object obj);

    /* renamed from: k */
    public abstract T mo13657k(T t, T t2);

    /* renamed from: l */
    public final boolean m13658l(B b, Reader reader) throws IOException {
        int mo13052e = reader.mo13052e();
        int i2 = mo13052e >>> 3;
        int i3 = mo13052e & 7;
        if (i3 == 0) {
            mo13651e(b, i2, reader.mo13031N());
            return true;
        }
        if (i3 == 1) {
            mo13648b(b, i2, reader.mo13048c());
            return true;
        }
        if (i3 == 2) {
            mo13650d(b, i2, reader.mo13024G());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.m13459d();
            }
            mo13647a(b, i2, reader.mo13062j());
            return true;
        }
        B mo13659m = mo13659m();
        int i4 = 4 | (i2 << 3);
        while (reader.mo13019B() != Integer.MAX_VALUE && m13658l(mo13659m, reader)) {
        }
        if (i4 != reader.mo13052e()) {
            throw InvalidProtocolBufferException.m13456a();
        }
        mo13649c(b, i2, mo13663q(mo13659m));
        return true;
    }

    /* renamed from: m */
    public abstract B mo13659m();

    /* renamed from: n */
    public abstract void mo13660n(Object obj, B b);

    /* renamed from: o */
    public abstract void mo13661o(Object obj, T t);

    /* renamed from: p */
    public abstract boolean mo13662p(Reader reader);

    /* renamed from: q */
    public abstract T mo13663q(B b);

    /* renamed from: r */
    public abstract void mo13664r(T t, Writer writer) throws IOException;

    /* renamed from: s */
    public abstract void mo13665s(T t, Writer writer) throws IOException;
}
