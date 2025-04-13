package com.bumptech.glide;

import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.target.BaseTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;

/* loaded from: classes.dex */
public class ListPreloader<T> implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public int f7913a;

    /* renamed from: b */
    public int f7914b;

    /* renamed from: c */
    public int f7915c;

    /* renamed from: d */
    public int f7916d;

    /* renamed from: e */
    public boolean f7917e;

    public interface PreloadModelProvider<U> {
    }

    public interface PreloadSizeProvider<T> {
    }

    public static final class PreloadTarget extends BaseTarget<Object> {
        @Override // com.bumptech.glide.request.target.Target
        /* renamed from: a */
        public void mo4876a(@NonNull SizeReadyCallback sizeReadyCallback) {
        }

        @Override // com.bumptech.glide.request.target.Target
        /* renamed from: c */
        public void mo4877c(@NonNull Object obj, @Nullable Transition<? super Object> transition) {
        }

        @Override // com.bumptech.glide.request.target.Target
        /* renamed from: l */
        public void mo4878l(@NonNull SizeReadyCallback sizeReadyCallback) {
            ((SingleRequest) sizeReadyCallback).mo5302e(0, 0);
        }
    }

    public static final class PreloadTargetQueue {
    }

    /* renamed from: a */
    public final void m4875a(int i2, boolean z) {
        int min;
        int i3;
        if (this.f7917e != z) {
            this.f7917e = z;
        }
        int i4 = i2 + 0;
        if (i2 < i4) {
            i3 = Math.max(this.f7913a, i2);
            min = i4;
        } else {
            min = Math.min(this.f7914b, i2);
            i3 = i4;
        }
        int min2 = Math.min(this.f7916d, min);
        int min3 = Math.min(this.f7916d, Math.max(0, i3));
        if (i2 < i4) {
            if (min3 < min2) {
                throw null;
            }
        } else if (min2 - 1 >= min3) {
            throw null;
        }
        this.f7914b = min3;
        this.f7913a = min2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        this.f7916d = i4;
        int i5 = this.f7915c;
        if (i2 > i5) {
            m4875a(i3 + i2, true);
        } else if (i2 < i5) {
            m4875a(i2, false);
        }
        this.f7915c = i2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
