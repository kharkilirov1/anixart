package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* compiled from: Executors.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "Key", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {
    static {
        new Key(null);
    }

    /* compiled from: Executors.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    @ExperimentalStdlibApi
    public static final class Key extends AbstractCoroutineContextKey<CoroutineDispatcher, ExecutorCoroutineDispatcher> {

        /* compiled from: Executors.kt */
        @Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "it", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
        /* renamed from: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1 */
        public static final class C67741 extends Lambda implements Function1<CoroutineContext.Element, ExecutorCoroutineDispatcher> {

            /* renamed from: b */
            public static final C67741 f67008b = new C67741();

            public C67741() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public ExecutorCoroutineDispatcher invoke(CoroutineContext.Element element) {
                CoroutineContext.Element element2 = element;
                if (element2 instanceof ExecutorCoroutineDispatcher) {
                    return (ExecutorCoroutineDispatcher) element2;
                }
                return null;
            }
        }

        public Key() {
            super(CoroutineDispatcher.f66963b, C67741.f67008b);
        }

        public Key(DefaultConstructorMarker defaultConstructorMarker) {
            super(CoroutineDispatcher.f66963b, C67741.f67008b);
        }
    }
}
