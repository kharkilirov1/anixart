package androidx.lifecycle;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {

    /* renamed from: l */
    public SafeIterableMap<LiveData<?>, Source<?>> f4630l = new SafeIterableMap<>();

    public static class Source<V> implements Observer<V> {

        /* renamed from: a */
        public final LiveData<V> f4631a;

        /* renamed from: b */
        public final Observer<? super V> f4632b;

        /* renamed from: c */
        public int f4633c;

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public void mo2959a(@Nullable V v) {
            int i2 = this.f4633c;
            int i3 = this.f4631a.f4619g;
            if (i2 != i3) {
                this.f4633c = i3;
                this.f4632b.mo2959a(v);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    /* renamed from: h */
    public void mo3179h() {
        Iterator<Map.Entry<LiveData<?>, Source<?>>> it = this.f4630l.iterator();
        while (it.hasNext()) {
            Source<?> value = it.next().getValue();
            value.f4631a.m3212g(value);
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    /* renamed from: i */
    public void mo3213i() {
        Iterator<Map.Entry<LiveData<?>, Source<?>>> it = this.f4630l.iterator();
        while (it.hasNext()) {
            Source<?> value = it.next().getValue();
            value.f4631a.mo3215k(value);
        }
    }
}
