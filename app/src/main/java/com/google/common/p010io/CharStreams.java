package com.google.common.p010io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes2.dex */
public final class CharStreams {

    public static final class NullWriter extends Writer {
        static {
            new NullWriter();
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c2) {
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@NullableDecl CharSequence charSequence) {
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Appendable append(@NullableDecl CharSequence charSequence) throws IOException {
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(@NullableDecl CharSequence charSequence, int i2, int i3) throws IOException {
            append(charSequence, i2, i3);
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int i2) {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            Preconditions.m11190n(i2, i3 + i2, cArr.length);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(@NullableDecl CharSequence charSequence, int i2, int i3) {
            Preconditions.m11190n(i2, i3, charSequence == null ? 4 : charSequence.length());
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i2, int i3) {
            Preconditions.m11190n(i2, i3 + i2, str.length());
        }

        @Override // java.io.Writer
        public void write(String str) {
            Objects.requireNonNull(str);
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            Objects.requireNonNull(cArr);
        }
    }
}
