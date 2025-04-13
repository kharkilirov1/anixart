package com.yandex.metrica.impl.p023ob;

import java.util.ArrayList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.o7 */
/* loaded from: classes2.dex */
public final class C4177o7 {

    /* renamed from: a */
    @NotNull
    public static final C4177o7 f46061a = new C4177o7();

    private C4177o7() {
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final C4151n7 m20502a(@NotNull Throwable th) {
        return f46061a.m20503a(th, 1, 0);
    }

    /* renamed from: a */
    private final C4151n7 m20503a(Throwable th, int i2, int i3) {
        StackTraceElement[] stackTraceElementArr;
        C4151n7 c4151n7;
        ArrayList arrayList;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (Throwable unused) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        Intrinsics.m32178g(stackTraceElementArr, "Utils.getStackTraceSafely(throwable)");
        ArrayList arrayList2 = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList2.add(new C4099l7(stackTraceElement));
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            if (!(i3 < i2)) {
                cause = null;
            }
            if (cause != null) {
                c4151n7 = f46061a.m20503a(cause, 30, i3 + 1);
                if (C3658U2.m19211a(19) || i3 >= i2) {
                    arrayList = null;
                } else {
                    Throwable[] suppressed = th.getSuppressed();
                    Intrinsics.m32178g(suppressed, "throwable.suppressed");
                    ArrayList arrayList3 = new ArrayList(suppressed.length);
                    for (Throwable it : suppressed) {
                        C4177o7 c4177o7 = f46061a;
                        Intrinsics.m32178g(it, "it");
                        arrayList3.add(c4177o7.m20503a(it, 1, i3));
                    }
                    arrayList = arrayList3;
                }
                return new C4151n7(name, message, arrayList2, c4151n7, arrayList);
            }
        }
        c4151n7 = null;
        if (C3658U2.m19211a(19)) {
        }
        arrayList = null;
        return new C4151n7(name, message, arrayList2, c4151n7, arrayList);
    }
}
