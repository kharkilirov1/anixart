package androidx.room;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.InvalidationTracker;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.MaybeSource;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.single.SingleCreate;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class RxRoom {

    /* renamed from: a */
    public static final Object f5872a = new Object();

    /* renamed from: androidx.room.RxRoom$1 */
    class C05591 implements FlowableOnSubscribe<Object> {

        /* renamed from: androidx.room.RxRoom$1$1, reason: invalid class name */
        class AnonymousClass1 extends InvalidationTracker.Observer {

            /* renamed from: b */
            public final /* synthetic */ FlowableEmitter f5873b;

            @Override // androidx.room.InvalidationTracker.Observer
            /* renamed from: a */
            public void mo4069a(@NonNull Set<String> set) {
                if (this.f5873b.isCancelled()) {
                    return;
                }
                this.f5873b.onNext(RxRoom.f5872a);
            }
        }

        /* renamed from: androidx.room.RxRoom$1$2, reason: invalid class name */
        class AnonymousClass2 implements Action {

            /* renamed from: b */
            public final /* synthetic */ C05591 f5874b;

            @Override // io.reactivex.functions.Action
            public void run() throws Exception {
                Objects.requireNonNull(this.f5874b);
                throw null;
            }
        }
    }

    /* renamed from: androidx.room.RxRoom$2 */
    class C05602 implements Function<Object, MaybeSource<Object>> {
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ MaybeSource<Object> apply(Object obj) throws Exception {
            return null;
        }
    }

    /* renamed from: androidx.room.RxRoom$3 */
    class C05613 implements ObservableOnSubscribe<Object> {

        /* renamed from: androidx.room.RxRoom$3$1, reason: invalid class name */
        class AnonymousClass1 extends InvalidationTracker.Observer {

            /* renamed from: b */
            public final /* synthetic */ ObservableEmitter f5875b;

            @Override // androidx.room.InvalidationTracker.Observer
            /* renamed from: a */
            public void mo4069a(@NonNull Set<String> set) {
                this.f5875b.onNext(RxRoom.f5872a);
            }
        }

        /* renamed from: androidx.room.RxRoom$3$2, reason: invalid class name */
        class AnonymousClass2 implements Action {

            /* renamed from: b */
            public final /* synthetic */ C05613 f5876b;

            @Override // io.reactivex.functions.Action
            public void run() throws Exception {
                Objects.requireNonNull(this.f5876b);
                throw null;
            }
        }
    }

    /* renamed from: androidx.room.RxRoom$4 */
    class C05624 implements Function<Object, MaybeSource<Object>> {
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ MaybeSource<Object> apply(Object obj) throws Exception {
            return null;
        }
    }

    @Deprecated
    public RxRoom() {
    }

    @RestrictTo
    /* renamed from: a */
    public static <T> Single<T> m4087a(final Callable<T> callable) {
        return new SingleCreate(new SingleOnSubscribe<T>() { // from class: androidx.room.RxRoom.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.SingleOnSubscribe
            /* renamed from: a */
            public void mo4088a(SingleEmitter<T> singleEmitter) throws Exception {
                try {
                    singleEmitter.onSuccess(callable.call());
                } catch (EmptyResultSetException e2) {
                    singleEmitter.mo31387a(e2);
                }
            }
        });
    }
}
