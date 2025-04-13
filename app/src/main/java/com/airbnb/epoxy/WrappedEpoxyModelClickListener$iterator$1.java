package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

/* compiled from: WrappedEpoxyModelClickListener.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"com/airbnb/epoxy/WrappedEpoxyModelClickListener$iterator$1", "", "Landroid/view/View;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class WrappedEpoxyModelClickListener$iterator$1 implements Iterator<View>, KMutableIterator {

    /* renamed from: b */
    public int f7052b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f7053c;

    public WrappedEpoxyModelClickListener$iterator$1(ViewGroup viewGroup) {
        this.f7053c = viewGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f7052b < this.f7053c.getChildCount();
    }

    @Override // java.util.Iterator
    public View next() {
        ViewGroup viewGroup = this.f7053c;
        int i2 = this.f7052b;
        this.f7052b = i2 + 1;
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public void remove() {
        ViewGroup viewGroup = this.f7053c;
        int i2 = this.f7052b - 1;
        this.f7052b = i2;
        viewGroup.removeViewAt(i2);
    }
}
