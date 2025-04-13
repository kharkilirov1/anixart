package com.fasterxml.jackson.core.util;

import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public class BufferRecycler {
    public static final int BYTE_BASE64_CODEC_BUFFER = 3;
    public static final int BYTE_READ_IO_BUFFER = 0;
    public static final int BYTE_WRITE_CONCAT_BUFFER = 2;
    public static final int BYTE_WRITE_ENCODING_BUFFER = 1;
    public static final int CHAR_CONCAT_BUFFER = 1;
    public static final int CHAR_NAME_COPY_BUFFER = 3;
    public static final int CHAR_TEXT_BUFFER = 2;
    public static final int CHAR_TOKEN_BUFFER = 0;
    public final AtomicReferenceArray<byte[]> _byteBuffers;
    public final AtomicReferenceArray<char[]> _charBuffers;
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, 2000, 2000};
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER};

    public BufferRecycler() {
        this(4, 4);
    }

    public final byte[] allocByteBuffer(int i2) {
        return allocByteBuffer(i2, 0);
    }

    public final char[] allocCharBuffer(int i2) {
        return allocCharBuffer(i2, 0);
    }

    public byte[] balloc(int i2) {
        return new byte[i2];
    }

    public int byteBufferLength(int i2) {
        return BYTE_BUFFER_LENGTHS[i2];
    }

    public char[] calloc(int i2) {
        return new char[i2];
    }

    public int charBufferLength(int i2) {
        return CHAR_BUFFER_LENGTHS[i2];
    }

    public void releaseByteBuffer(int i2, byte[] bArr) {
        this._byteBuffers.set(i2, bArr);
    }

    public void releaseCharBuffer(int i2, char[] cArr) {
        this._charBuffers.set(i2, cArr);
    }

    public BufferRecycler(int i2, int i3) {
        this._byteBuffers = new AtomicReferenceArray<>(i2);
        this._charBuffers = new AtomicReferenceArray<>(i3);
    }

    public byte[] allocByteBuffer(int i2, int i3) {
        int byteBufferLength = byteBufferLength(i2);
        if (i3 < byteBufferLength) {
            i3 = byteBufferLength;
        }
        byte[] andSet = this._byteBuffers.getAndSet(i2, null);
        return (andSet == null || andSet.length < i3) ? balloc(i3) : andSet;
    }

    public char[] allocCharBuffer(int i2, int i3) {
        int charBufferLength = charBufferLength(i2);
        if (i3 < charBufferLength) {
            i3 = charBufferLength;
        }
        char[] andSet = this._charBuffers.getAndSet(i2, null);
        return (andSet == null || andSet.length < i3) ? calloc(i3) : andSet;
    }
}
