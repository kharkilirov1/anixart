package com.google.common.hash;

import com.google.common.annotations.Beta;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: classes.dex */
public final class Funnels {

    public enum ByteArrayFunnel implements Funnel<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    public enum IntegerFunnel implements Funnel<Integer> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    public enum LongFunnel implements Funnel<Long> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }
    }

    public static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof SequentialFunnel)) {
                return false;
            }
            Objects.requireNonNull((SequentialFunnel) obj);
            throw null;
        }

        public int hashCode() {
            SequentialFunnel.class.hashCode();
            throw null;
        }

        public String toString() {
            return "Funnels.sequentialFunnel(null)";
        }
    }

    public static class SinkAsStream extends OutputStream {
        public String toString() {
            return "Funnels.asOutputStream(null)";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            throw null;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }

    public static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {

        public static class SerializedForm implements Serializable {
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof StringCharsetFunnel)) {
                return false;
            }
            Objects.requireNonNull((StringCharsetFunnel) obj);
            throw null;
        }

        public int hashCode() {
            StringCharsetFunnel.class.hashCode();
            throw null;
        }

        public String toString() {
            throw null;
        }
    }

    public enum UnencodedCharsFunnel implements Funnel<CharSequence> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }
}
