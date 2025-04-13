package com.fasterxml.jackson.databind.util;

import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class PrimitiveArrayBuilder<T> {
    public static final int INITIAL_CHUNK_SIZE = 12;
    public static final int MAX_CHUNK_SIZE = 262144;
    public static final int SMALL_CHUNK_SIZE = 16384;
    public Node<T> _bufferHead;
    public Node<T> _bufferTail;
    public int _bufferedEntryCount;
    public T _freeBuffer;

    public static final class Node<T> {
        public final T _data;
        public final int _dataLength;
        public Node<T> _next;

        public Node(T t, int i2) {
            this._data = t;
            this._dataLength = i2;
        }

        public int copyData(T t, int i2) {
            System.arraycopy(this._data, 0, t, i2, this._dataLength);
            return i2 + this._dataLength;
        }

        public T getData() {
            return this._data;
        }

        public void linkNext(Node<T> node) {
            if (this._next != null) {
                throw new IllegalStateException();
            }
            this._next = node;
        }

        public Node<T> next() {
            return this._next;
        }
    }

    public abstract T _constructArray(int i2);

    public void _reset() {
        Node<T> node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node.getData();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t, int i2) {
        Node<T> node = new Node<>(t, i2);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            this._bufferTail.linkNext(node);
            this._bufferTail = node;
        }
        this._bufferedEntryCount += i2;
        return _constructArray(i2 < 16384 ? i2 + i2 : i2 + (i2 >> 2));
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t, int i2) {
        int i3 = this._bufferedEntryCount + i2;
        T _constructArray = _constructArray(i3);
        int i4 = 0;
        for (Node<T> node = this._bufferHead; node != null; node = node.next()) {
            i4 = node.copyData(_constructArray, i4);
        }
        System.arraycopy(t, 0, _constructArray, i4, i2);
        int i5 = i4 + i2;
        if (i5 == i3) {
            return _constructArray;
        }
        throw new IllegalStateException(C0000a.m9f("Should have gotten ", i3, " entries, got ", i5));
    }

    public T resetAndStart() {
        _reset();
        T t = this._freeBuffer;
        return t == null ? _constructArray(12) : t;
    }
}
