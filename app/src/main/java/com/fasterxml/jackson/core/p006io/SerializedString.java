package com.fasterxml.jackson.core.p006io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class SerializedString implements SerializableString, Serializable {
    private static final JsonStringEncoder JSON_ENCODER = JsonStringEncoder.getInstance();
    private static final long serialVersionUID = 1;
    public transient String _jdkSerializeValue;
    public char[] _quotedChars;
    public byte[] _quotedUTF8Ref;
    public byte[] _unquotedUTF8Ref;
    public final String _value;

    public SerializedString(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this._value = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this._jdkSerializeValue = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendQuoted(char[] cArr, int i2) {
        char[] cArr2 = this._quotedChars;
        if (cArr2 == null) {
            cArr2 = JSON_ENCODER.quoteAsString(this._value);
            this._quotedChars = cArr2;
        }
        int length = cArr2.length;
        if (i2 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArr2, 0, cArr, i2, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendQuotedUTF8(byte[] bArr, int i2) {
        byte[] bArr2 = this._quotedUTF8Ref;
        if (bArr2 == null) {
            bArr2 = JSON_ENCODER.quoteAsUTF8(this._value);
            this._quotedUTF8Ref = bArr2;
        }
        int length = bArr2.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i2, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendUnquoted(char[] cArr, int i2) {
        String str = this._value;
        int length = str.length();
        if (i2 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i2);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int appendUnquotedUTF8(byte[] bArr, int i2) {
        byte[] bArr2 = this._unquotedUTF8Ref;
        if (bArr2 == null) {
            bArr2 = JSON_ENCODER.encodeAsUTF8(this._value);
            this._unquotedUTF8Ref = bArr2;
        }
        int length = bArr2.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i2, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final char[] asQuotedChars() {
        char[] cArr = this._quotedChars;
        if (cArr != null) {
            return cArr;
        }
        char[] quoteAsString = JSON_ENCODER.quoteAsString(this._value);
        this._quotedChars = quoteAsString;
        return quoteAsString;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final byte[] asQuotedUTF8() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] quoteAsUTF8 = JSON_ENCODER.quoteAsUTF8(this._value);
        this._quotedUTF8Ref = quoteAsUTF8;
        return quoteAsUTF8;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] encodeAsUTF8 = JSON_ENCODER.encodeAsUTF8(this._value);
        this._unquotedUTF8Ref = encodeAsUTF8;
        return encodeAsUTF8;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final int charLength() {
        return this._value.length();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public final String getValue() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int putQuotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr == null) {
            bArr = JSON_ENCODER.quoteAsUTF8(this._value);
            this._quotedUTF8Ref = bArr;
        }
        int length = bArr.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArr, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int putUnquotedUTF8(ByteBuffer byteBuffer) {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr == null) {
            bArr = JSON_ENCODER.encodeAsUTF8(this._value);
            this._unquotedUTF8Ref = bArr;
        }
        int length = bArr.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArr, 0, length);
        return length;
    }

    public Object readResolve() {
        return new SerializedString(this._jdkSerializeValue);
    }

    public final String toString() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int writeQuotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr == null) {
            bArr = JSON_ENCODER.quoteAsUTF8(this._value);
            this._quotedUTF8Ref = bArr;
        }
        int length = bArr.length;
        outputStream.write(bArr, 0, length);
        return length;
    }

    @Override // com.fasterxml.jackson.core.SerializableString
    public int writeUnquotedUTF8(OutputStream outputStream) throws IOException {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr == null) {
            bArr = JSON_ENCODER.encodeAsUTF8(this._value);
            this._unquotedUTF8Ref = bArr;
        }
        int length = bArr.length;
        outputStream.write(bArr, 0, length);
        return length;
    }
}
