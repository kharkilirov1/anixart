package com.airbnb.epoxy;

import android.view.ViewParent;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.airbnb.epoxy.EpoxyHolder;
import java.util.List;

/* loaded from: classes.dex */
public abstract class EpoxyModelWithHolder<T extends EpoxyHolder> extends EpoxyModel<T> {
    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: A2, reason: merged with bridge method [inline-methods] */
    public void mo4504o2(@FloatRange float f2, @FloatRange float f3, @Px int i2, @Px int i3, @NonNull T t) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: B2, reason: merged with bridge method [inline-methods] */
    public void mo4505p2(int i2, @NonNull T t) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: C2, reason: merged with bridge method [inline-methods] */
    public void mo4506s2(@NonNull T t) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k2 */
    public /* bridge */ /* synthetic */ boolean mo4523k2(Object obj) {
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: u2, reason: merged with bridge method [inline-methods] */
    public void mo4496Z1(@NonNull T t) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void mo4497a2(@NonNull T t, @NonNull EpoxyModel<?> epoxyModel) {
        mo4496Z1(t);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void mo4519b2(@NonNull T t, @NonNull List<Object> list) {
        mo4496Z1(t);
    }

    /* renamed from: x2 */
    public abstract T mo4541x2(@NonNull ViewParent viewParent);

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: y2, reason: merged with bridge method [inline-methods] */
    public void mo4525m2(T t) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: z2, reason: merged with bridge method [inline-methods] */
    public void mo4526n2(T t) {
    }
}
