package com.google.firebase.firestore.util;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class CustomClassMapper {

    public static class BeanMapper<T> {
    }

    public static class DeserializeContext {
    }

    public static class ErrorPath {

        /* renamed from: a */
        public final int f23015a;

        /* renamed from: b */
        public final ErrorPath f23016b;

        /* renamed from: c */
        public final String f23017c;

        public String toString() {
            int i2 = this.f23015a;
            if (i2 == 0) {
                return "";
            }
            if (i2 == 1) {
                return this.f23017c;
            }
            return this.f23016b.toString() + "." + this.f23017c;
        }
    }

    static {
        new ConcurrentHashMap();
    }
}
