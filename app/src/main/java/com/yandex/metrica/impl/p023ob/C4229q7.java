package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.q7 */
/* loaded from: classes2.dex */
public final class C4229q7 {
    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final C4203p7 m20571a(@Nullable Throwable th, @Nullable C3917e7 c3917e7, @Nullable List<StackTraceElement> list, @Nullable String str, @Nullable Boolean bool) {
        ArrayList arrayList = null;
        C4151n7 m20502a = th != null ? C4177o7.m20502a(th) : null;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C4099l7((StackTraceElement) it.next()));
            }
        }
        return new C4203p7(m20502a, c3917e7, arrayList, null, null, null, str, bool);
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final C4203p7 m20570a(@Nullable String str, @Nullable String str2, @Nullable List<? extends StackTraceItem> list, @Nullable String str3, @Nullable String str4, @Nullable Map<String, String> map, @Nullable String str5, @Nullable Boolean bool) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
            for (StackTraceItem stackTraceItem : list) {
                arrayList.add(new C4099l7(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new C4203p7(new C4151n7(str, str2, arrayList, null, null), null, null, str3, str4, map, str5, bool);
    }
}
