package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
class DiffHelper {

    /* renamed from: com.airbnb.epoxy.DiffHelper$1 */
    public class C07021 extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo3410a() {
            throw new UnsupportedOperationException("Diffing is enabled. You should use notifyModelsChanged instead of notifyDataSetChanged");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: b */
        public void mo3411b(int i2, int i3) {
            if (i2 >= i3 + i2) {
                return;
            }
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public void mo3413d(int i2, int i3) {
            if (i3 == 0) {
                return;
            }
            if (i3 != 1) {
                Objects.requireNonNull(null);
                throw null;
            }
            if (i2 < i3 + i2) {
                Objects.requireNonNull(null);
                throw null;
            }
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public void mo3414e(int i2, int i3, int i4) {
            if (i2 == i3) {
                return;
            }
            if (i4 != 1) {
                throw new IllegalArgumentException(C0000a.m7d("Moving more than 1 item at a time is not supported. Number of items moved: ", i4));
            }
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public void mo3415f(int i2, int i3) {
            if (i3 == 0) {
                return;
            }
            Objects.requireNonNull(null);
            throw null;
        }
    }
}
