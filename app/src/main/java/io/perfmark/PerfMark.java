package io.perfmark;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class PerfMark {

    /* renamed from: a */
    public static final Impl f59566a;

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    static {
        /*
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            r1 = 0
            java.lang.String r2 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> Lb java.lang.ClassNotFoundException -> Le
            r3 = r1
            goto L14
        Lb:
            r2 = move-exception
            r3 = r2
            goto L13
        Le:
            r0 = move-exception
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            r3 = r0
            r0 = r2
        L13:
            r2 = r1
        L14:
            if (r2 == 0) goto L38
            java.lang.Class<io.perfmark.Impl> r4 = io.perfmark.Impl.class
            java.lang.Class r2 = r2.asSubclass(r4)     // Catch: java.lang.Throwable -> L36
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.Class<io.perfmark.Tag> r6 = io.perfmark.Tag.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Constructor r2 = r2.getConstructor(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            io.perfmark.Tag r5 = io.perfmark.Impl.f59564a     // Catch: java.lang.Throwable -> L36
            r4[r7] = r5     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Throwable -> L36
            io.perfmark.Impl r2 = (io.perfmark.Impl) r2     // Catch: java.lang.Throwable -> L36
            r1 = r2
            goto L38
        L36:
            r2 = move-exception
            r3 = r2
        L38:
            if (r1 == 0) goto L3d
            io.perfmark.PerfMark.f59566a = r1
            goto L46
        L3d:
            io.perfmark.Impl r1 = new io.perfmark.Impl
            io.perfmark.Tag r2 = io.perfmark.Impl.f59564a
            r1.<init>(r2)
            io.perfmark.PerfMark.f59566a = r1
        L46:
            if (r3 == 0) goto L57
            java.lang.Class<io.perfmark.PerfMark> r1 = io.perfmark.PerfMark.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.lang.String r2 = "Error during PerfMark.<clinit>"
            r1.log(r0, r2, r3)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.perfmark.PerfMark.<clinit>():void");
    }

    /* renamed from: a */
    public static Link m31344a() {
        Objects.requireNonNull(f59566a);
        return Impl.f59565b;
    }
}
