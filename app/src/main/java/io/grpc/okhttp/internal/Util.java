package io.grpc.okhttp.internal;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class Util {

    /* renamed from: a */
    public static final String[] f59405a = new String[0];

    /* renamed from: b */
    public static final Charset f59406b = StandardCharsets.UTF_8;

    /* renamed from: io.grpc.okhttp.internal.Util$1 */
    class ThreadFactoryC64881 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, (String) null);
            thread.setDaemon(false);
            return thread;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> T[] m31295a(Class<T> cls, T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object[] objArr : tArr) {
            int length = tArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    T t = tArr2[i2];
                    if (objArr.equals(t)) {
                        arrayList.add(t);
                        break;
                    }
                    i2++;
                }
            }
        }
        return (T[]) arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, arrayList.size()));
    }
}
