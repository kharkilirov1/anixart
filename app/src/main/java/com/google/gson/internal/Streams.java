package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class Streams {
    public Streams() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static JsonElement m12891a(JsonReader jsonReader) throws JsonParseException {
        boolean z;
        try {
            try {
                jsonReader.mo12898C();
                z = false;
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
            try {
                return TypeAdapters.f23825A.mo12837b(jsonReader);
            } catch (EOFException e3) {
                e = e3;
                if (z) {
                    return JsonNull.f23667a;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e4) {
            throw new JsonSyntaxException(e4);
        } catch (IOException e5) {
            throw new JsonIOException(e5);
        } catch (NumberFormatException e6) {
            throw new JsonSyntaxException(e6);
        }
    }

    /* renamed from: b */
    public static Writer m12892b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    public static final class AppendableWriter extends Writer {

        /* renamed from: b */
        public final Appendable f23757b;

        /* renamed from: c */
        public final CurrentWrite f23758c = new CurrentWrite();

        public static class CurrentWrite implements CharSequence {

            /* renamed from: b */
            public char[] f23759b;

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                return this.f23759b[i2];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f23759b.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f23759b, i2, i3 - i2);
            }
        }

        public AppendableWriter(Appendable appendable) {
            this.f23757b = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            CurrentWrite currentWrite = this.f23758c;
            currentWrite.f23759b = cArr;
            this.f23757b.append(currentWrite, i2, i3 + i2);
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            this.f23757b.append((char) i2);
        }
    }
}
