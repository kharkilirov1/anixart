package com.google.common.p010io;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.Objects;

@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class CharSource {

    public final class AsByteSource extends ByteSource {
        @Override // com.google.common.p010io.ByteSource
        /* renamed from: a */
        public InputStream mo12038a() throws IOException {
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    public static class CharSequenceCharSource extends CharSource {

        /* renamed from: a */
        public final CharSequence f21847a;

        /* renamed from: com.google.common.io.CharSource$CharSequenceCharSource$1 */
        class C18931 extends AbstractIterator<String> {
            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public String mo11332a() {
                throw null;
            }
        }

        static {
            Splitter.m11206c("\r\n|\n|\r");
        }

        public CharSequenceCharSource(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            this.f21847a = charSequence;
        }

        @Override // com.google.common.p010io.CharSource
        /* renamed from: a */
        public Reader mo12043a() {
            return new CharSequenceReader(this.f21847a);
        }

        public String toString() {
            String m11125e = Ascii.m11125e(this.f21847a, 30, "...");
            return C0576a.m4115n(C0576a.m4106e(m11125e, 17), "CharSource.wrap(", m11125e, ")");
        }
    }

    public static final class ConcatenatedCharSource extends CharSource {
        @Override // com.google.common.p010io.CharSource
        /* renamed from: a */
        public Reader mo12043a() throws IOException {
            throw null;
        }

        public String toString() {
            return "CharSource.concat(null)";
        }
    }

    public static final class EmptyCharSource extends StringCharSource {
        static {
            new EmptyCharSource();
        }

        public EmptyCharSource() {
            super("");
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public String toString() {
            return "CharSource.empty()";
        }
    }

    public static class StringCharSource extends CharSequenceCharSource {
        public StringCharSource(String str) {
            super(str);
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource, com.google.common.p010io.CharSource
        /* renamed from: a */
        public Reader mo12043a() {
            return new StringReader((String) this.f21847a);
        }
    }

    /* renamed from: a */
    public abstract Reader mo12043a() throws IOException;
}
