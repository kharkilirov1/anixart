package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.n1 */
/* loaded from: classes2.dex */
public class C4145n1 {

    /* renamed from: a */
    private static final Pattern f45967a = Pattern.compile("com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: b */
    private static final Pattern f45968b = Pattern.compile("com\\.yandex\\.metrica\\.push\\..*");

    /* renamed from: a */
    public boolean m20408a(@NonNull List<StackTraceElement> list) {
        return m20407a(list, f45967a);
    }

    /* renamed from: b */
    public boolean m20409b(@NonNull List<StackTraceElement> list) {
        return m20407a(list, f45968b);
    }

    /* renamed from: a */
    private boolean m20407a(@NonNull List<StackTraceElement> list, @NonNull Pattern pattern) {
        Iterator<StackTraceElement> it = list.iterator();
        while (it.hasNext()) {
            if (pattern.matcher(it.next().getClassName()).find()) {
                return true;
            }
        }
        return false;
    }
}
