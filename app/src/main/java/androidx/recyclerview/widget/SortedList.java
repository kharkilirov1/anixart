package androidx.recyclerview.widget;

import java.util.Comparator;

/* loaded from: classes.dex */
public class SortedList<T> {

    public static class BatchedCallback<T2> extends Callback<T2> {
        @Override // androidx.recyclerview.widget.ListUpdateCallback
        /* renamed from: a */
        public void mo3488a(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        /* renamed from: b */
        public void mo3489b(int i2, int i3) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        /* renamed from: c */
        public void mo3490c(int i2, int i3) {
            throw null;
        }

        @Override // java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        /* renamed from: d */
        public void mo3491d(int i2, int i3, Object obj) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        /* renamed from: e */
        public void mo3954e(int i2, int i3) {
            throw null;
        }
    }

    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        /* renamed from: d */
        public void mo3491d(int i2, int i3, Object obj) {
            mo3954e(i2, i3);
        }

        /* renamed from: e */
        public abstract void mo3954e(int i2, int i3);
    }
}
