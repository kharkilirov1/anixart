package com.google.protobuf;

import androidx.room.util.C0576a;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {

    /* renamed from: e */
    public static final ProtobufArrayList<Object> f24313e;

    /* renamed from: c */
    public E[] f24314c;

    /* renamed from: d */
    public int f24315d;

    static {
        ProtobufArrayList<Object> protobufArrayList = new ProtobufArrayList<>(new Object[0], 0);
        f24313e = protobufArrayList;
        protobufArrayList.f23951b = false;
    }

    public ProtobufArrayList() {
        this.f24314c = (E[]) new Object[10];
        this.f24315d = 0;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* renamed from: N */
    public Internal.ProtobufList mo13144N(int i2) {
        if (i2 >= this.f24315d) {
            return new ProtobufArrayList(Arrays.copyOf(this.f24314c, i2), this.f24315d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        m12987b();
        int i2 = this.f24315d;
        E[] eArr = this.f24314c;
        if (i2 == eArr.length) {
            this.f24314c = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f24314c;
        int i3 = this.f24315d;
        this.f24315d = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: d */
    public final void m13569d(int i2) {
        if (i2 < 0 || i2 >= this.f24315d) {
            throw new IndexOutOfBoundsException(m13570e(i2));
        }
    }

    /* renamed from: e */
    public final String m13570e(int i2) {
        StringBuilder m25v = C0000a.m25v("Index:", i2, ", Size:");
        m25v.append(this.f24315d);
        return m25v.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        m13569d(i2);
        return this.f24314c[i2];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int i2) {
        m12987b();
        m13569d(i2);
        E[] eArr = this.f24314c;
        E e2 = eArr[i2];
        if (i2 < this.f24315d - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.f24315d--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        m12987b();
        m13569d(i2);
        E[] eArr = this.f24314c;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24315d;
    }

    public ProtobufArrayList(E[] eArr, int i2) {
        this.f24314c = eArr;
        this.f24315d = i2;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        int i3;
        m12987b();
        if (i2 >= 0 && i2 <= (i3 = this.f24315d)) {
            E[] eArr = this.f24314c;
            if (i3 < eArr.length) {
                System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
            } else {
                E[] eArr2 = (E[]) new Object[C0576a.m4105d(i3, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i2);
                System.arraycopy(this.f24314c, i2, eArr2, i2 + 1, this.f24315d - i2);
                this.f24314c = eArr2;
            }
            this.f24314c[i2] = e2;
            this.f24315d++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m13570e(i2));
    }
}
