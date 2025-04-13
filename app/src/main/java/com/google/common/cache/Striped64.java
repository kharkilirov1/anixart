package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

@GwtIncompatible
/* loaded from: classes.dex */
abstract class Striped64 extends Number {

    /* renamed from: e */
    public static final ThreadLocal<int[]> f20764e = new ThreadLocal<>();

    /* renamed from: f */
    public static final Random f20765f = new Random();

    /* renamed from: g */
    public static final int f20766g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h */
    public static final Unsafe f20767h;

    /* renamed from: i */
    public static final long f20768i;

    /* renamed from: j */
    public static final long f20769j;

    /* renamed from: b */
    @NullableDecl
    public volatile transient Cell[] f20770b;

    /* renamed from: c */
    public volatile transient long f20771c;

    /* renamed from: d */
    public volatile transient int f20772d;

    public static final class Cell {

        /* renamed from: b */
        public static final Unsafe f20773b;

        /* renamed from: c */
        public static final long f20774c;

        /* renamed from: a */
        public volatile long f20775a;

        static {
            try {
                Unsafe m11321e = Striped64.m11321e();
                f20773b = m11321e;
                f20774c = m11321e.objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }

        public Cell(long j2) {
            this.f20775a = j2;
        }

        /* renamed from: a */
        public final boolean m11325a(long j2, long j3) {
            return f20773b.compareAndSwapLong(this, f20774c, j2, j3);
        }
    }

    static {
        try {
            Unsafe m11321e = m11321e();
            f20767h = m11321e;
            f20768i = m11321e.objectFieldOffset(Striped64.class.getDeclaredField("c"));
            f20769j = m11321e.objectFieldOffset(Striped64.class.getDeclaredField("d"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    /* renamed from: e */
    public static Unsafe m11321e() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.cache.Striped64.1
                @Override // java.security.PrivilegedExceptionAction
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            });
        }
    }

    /* renamed from: c */
    public final boolean m11322c(long j2, long j3) {
        return f20767h.compareAndSwapLong(this, f20768i, j2, j3);
    }

    /* renamed from: d */
    public final boolean m11323d() {
        return f20767h.compareAndSwapInt(this, f20769j, 0, 1);
    }
}
