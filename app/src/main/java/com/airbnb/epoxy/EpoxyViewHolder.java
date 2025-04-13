package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.C0576a;
import com.airbnb.epoxy.ViewHolderState;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class EpoxyViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public EpoxyModel f6963a;

    /* renamed from: b */
    public List<Object> f6964b;

    /* renamed from: c */
    public EpoxyHolder f6965c;

    /* renamed from: d */
    @Nullable
    public ViewHolderState.ViewState f6966d;

    /* renamed from: e */
    public ViewParent f6967e;

    public EpoxyViewHolder(ViewParent viewParent, View view, boolean z) {
        super(view);
        this.f6967e = viewParent;
        if (z) {
            ViewHolderState.ViewState viewState = new ViewHolderState.ViewState();
            this.f6966d = viewState;
            viewState.m4625c(this.itemView);
        }
    }

    /* renamed from: a */
    public final void m4576a() {
        if (this.f6963a == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m4577b(EpoxyModel epoxyModel, @Nullable EpoxyModel<?> epoxyModel2, List<Object> list, int i2) {
        this.f6964b = list;
        if (this.f6965c == null && (epoxyModel instanceof EpoxyModelWithHolder)) {
            EpoxyHolder mo4541x2 = ((EpoxyModelWithHolder) epoxyModel).mo4541x2(this.f6967e);
            this.f6965c = mo4541x2;
            mo4541x2.mo4517a(this.itemView);
        }
        this.f6967e = null;
        if (epoxyModel instanceof GeneratedModel) {
            ((GeneratedModel) epoxyModel).mo4494N1(this, m4578c(), i2);
        }
        Objects.requireNonNull(epoxyModel);
        if (epoxyModel2 != null) {
            epoxyModel.mo4497a2(m4578c(), epoxyModel2);
        } else if (list.isEmpty()) {
            epoxyModel.mo4496Z1(m4578c());
        } else {
            epoxyModel.mo4519b2(m4578c(), list);
        }
        if (epoxyModel instanceof GeneratedModel) {
            ((GeneratedModel) epoxyModel).mo4501f0(m4578c(), i2);
        }
        this.f6963a = epoxyModel;
    }

    @NonNull
    /* renamed from: c */
    public Object m4578c() {
        EpoxyHolder epoxyHolder = this.f6965c;
        return epoxyHolder != null ? epoxyHolder : this.itemView;
    }

    /* renamed from: d */
    public void m4579d(int i2) {
        m4576a();
        this.f6963a.mo4505p2(i2, m4578c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
    public String toString() {
        StringBuilder m24u = C0000a.m24u("EpoxyViewHolder{epoxyModel=");
        m24u.append(this.f6963a);
        m24u.append(", view=");
        m24u.append(this.itemView);
        m24u.append(", super=");
        return C0576a.m4118q(m24u, super.toString(), '}');
    }
}
