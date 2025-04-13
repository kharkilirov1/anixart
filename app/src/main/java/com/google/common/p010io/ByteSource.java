package com.google.common.p010io;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class ByteSource {

    public class AsCharSource extends CharSource {
        @Override // com.google.common.p010io.CharSource
        /* renamed from: a */
        public Reader mo12043a() throws IOException {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    public static class ByteArrayByteSource extends ByteSource {

        /* renamed from: a */
        public final byte[] f21838a;

        /* renamed from: b */
        public final int f21839b;

        /* renamed from: c */
        public final int f21840c;

        public ByteArrayByteSource(byte[] bArr) {
            int length = bArr.length;
            this.f21838a = bArr;
            this.f21839b = 0;
            this.f21840c = length;
        }

        @Override // com.google.common.p010io.ByteSource
        /* renamed from: a */
        public InputStream mo12038a() {
            return new ByteArrayInputStream(this.f21838a, this.f21839b, this.f21840c);
        }

        public String toString() {
            String m11125e = Ascii.m11125e(BaseEncoding.f21809b.m12031d(this.f21838a, this.f21839b, this.f21840c), 30, "...");
            return C0576a.m4115n(C0576a.m4106e(m11125e, 17), "ByteSource.wrap(", m11125e, ")");
        }
    }

    public static final class ConcatenatedByteSource extends ByteSource {
        @Override // com.google.common.p010io.ByteSource
        /* renamed from: a */
        public InputStream mo12038a() throws IOException {
            throw null;
        }

        public String toString() {
            return "ByteSource.concat(null)";
        }
    }

    public static final class EmptyByteSource extends ByteArrayByteSource {
        static {
            new EmptyByteSource();
        }

        public EmptyByteSource() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.ByteSource.ByteArrayByteSource
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    public final class SlicedByteSource extends ByteSource {
        @Override // com.google.common.p010io.ByteSource
        /* renamed from: a */
        public InputStream mo12038a() throws IOException {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    /* renamed from: a */
    public abstract InputStream mo12038a() throws IOException;
}
