package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: MainDispatchers.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/MainDispatcherLoader;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class MainDispatcherLoader {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final MainCoroutineDispatcher f68292a;

    static {
        Object next;
        SystemPropsKt.m34333e("kotlinx.coroutines.fast.service.loader", true);
        List<? extends MainDispatcherFactory> m33831A = SequencesKt.m33831A(SequencesKt.m33836d(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator()));
        Iterator it = m33831A.iterator();
        MainCoroutineDispatcher mainCoroutineDispatcher = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
        if (mainDispatcherFactory != null) {
            try {
                mainCoroutineDispatcher = mainDispatcherFactory.createDispatcher(m33831A);
            } catch (Throwable th) {
                mainDispatcherFactory.hintOnError();
                throw th;
            }
        }
        if (mainCoroutineDispatcher == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        f68292a = mainCoroutineDispatcher;
    }
}
