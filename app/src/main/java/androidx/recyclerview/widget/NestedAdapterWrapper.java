package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
class NestedAdapterWrapper {

    /* renamed from: androidx.recyclerview.widget.NestedAdapterWrapper$1 */
    public class C05231 extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo3410a() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: b */
        public void mo3411b(int i2, int i3) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public void mo3412c(int i2, int i3, @Nullable Object obj) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public void mo3413d(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public void mo3414e(int i2, int i3, int i4) {
            Preconditions.m2028a(i4 == 1, "moving more than 1 item is not supported in RecyclerView");
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public void mo3415f(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: g */
        public void mo3734g() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public interface Callback {
    }
}
