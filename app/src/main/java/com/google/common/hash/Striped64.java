package com.google.common.hash;

import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

@GwtIncompatible
/* loaded from: classes.dex */
abstract class Striped64 extends Number {

    /* renamed from: b */
    public volatile transient long f21804b;

    /* renamed from: c */
    public volatile transient int f21805c;

    public static final class Cell {

        /* renamed from: a */
        public volatile long f21806a;

        static {
            try {
                Striped64.m12025a().objectFieldOffset(Cell.class.getDeclaredField("a"));
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }
    }

    static {
        new ThreadLocal();
        new Random();
        Runtime.getRuntime().availableProcessors();
        try {
            Unsafe m12025a = m12025a();
            m12025a.objectFieldOffset(Striped64.class.getDeclaredField("b"));
            m12025a.objectFieldOffset(Striped64.class.getDeclaredField("c"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    /* renamed from: a */
    public static Unsafe m12025a() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.hash.Striped64.1
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
}
