package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.airbnb.epoxy.EpoxyController;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class EpoxyModel<T> {

    /* renamed from: j */
    public static long f6924j = -1;

    /* renamed from: b */
    public long f6925b;

    /* renamed from: c */
    public boolean f6926c;

    /* renamed from: d */
    public EpoxyController f6927d;

    /* renamed from: e */
    public EpoxyController f6928e;

    /* renamed from: f */
    public boolean f6929f;

    /* renamed from: g */
    public int f6930g;

    /* renamed from: h */
    public boolean f6931h;

    /* renamed from: i */
    @Nullable
    public SpanSizeOverrideCallback f6932i;

    public interface AddPredicate {
    }

    public interface SpanSizeOverrideCallback {
        /* renamed from: d */
        int mo4530d(int i2, int i3, int i4);
    }

    public EpoxyModel() {
        long j2 = f6924j;
        f6924j = j2 - 1;
        this.f6926c = true;
        mo4503g2(j2);
        this.f6931h = true;
    }

    /* renamed from: X1 */
    public void mo4495X1(@NonNull EpoxyController epoxyController) {
        epoxyController.addInternal(this);
    }

    /* renamed from: Y1 */
    public final void m4518Y1(@NonNull EpoxyController epoxyController) {
        if (epoxyController.isModelAddedMultipleTimes(this)) {
            StringBuilder m24u = C0000a.m24u("This model was already added to the controller at position ");
            m24u.append(epoxyController.getFirstIndexOfModelInBuildingList(this));
            throw new IllegalEpoxyUsage(m24u.toString());
        }
        if (this.f6927d == null) {
            this.f6927d = epoxyController;
            this.f6930g = hashCode();
            epoxyController.addAfterInterceptorCallback(new EpoxyController.ModelInterceptorCallback() { // from class: com.airbnb.epoxy.EpoxyModel.1
                @Override // com.airbnb.epoxy.EpoxyController.ModelInterceptorCallback
                /* renamed from: a */
                public void mo4515a(EpoxyController epoxyController2) {
                    EpoxyModel.this.f6929f = true;
                }

                @Override // com.airbnb.epoxy.EpoxyController.ModelInterceptorCallback
                /* renamed from: b */
                public void mo4516b(EpoxyController epoxyController2) {
                    EpoxyModel epoxyModel = EpoxyModel.this;
                    epoxyModel.f6930g = epoxyModel.hashCode();
                    EpoxyModel.this.f6929f = false;
                }
            });
        }
    }

    /* renamed from: Z1 */
    public void mo4496Z1(@NonNull T t) {
    }

    /* renamed from: a2 */
    public void mo4497a2(@NonNull T t, @NonNull EpoxyModel<?> epoxyModel) {
        mo4496Z1(t);
    }

    /* renamed from: b2 */
    public void mo4519b2(@NonNull T t, @NonNull List<Object> list) {
        mo4496Z1(t);
    }

    /* renamed from: c2 */
    public View mo4498c2(@NonNull ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(mo4499d2(), viewGroup, false);
    }

    @LayoutRes
    /* renamed from: d2 */
    public abstract int mo4499d2();

    /* renamed from: e2 */
    public int mo4500e2(int i2, int i3, int i4) {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpoxyModel)) {
            return false;
        }
        EpoxyModel epoxyModel = (EpoxyModel) obj;
        return this.f6925b == epoxyModel.f6925b && mo4502f2() == epoxyModel.mo4502f2() && this.f6926c == epoxyModel.f6926c;
    }

    /* renamed from: f2 */
    public int mo4502f2() {
        return mo4499d2();
    }

    /* renamed from: g2 */
    public EpoxyModel<T> mo4503g2(long j2) {
        if (this.f6927d != null && j2 != this.f6925b) {
            throw new IllegalEpoxyUsage("Cannot change a model's id after it has been added to the adapter.");
        }
        this.f6931h = false;
        this.f6925b = j2;
        return this;
    }

    /* renamed from: h2 */
    public EpoxyModel<T> m4520h2(@Nullable CharSequence charSequence) {
        long j2;
        if (charSequence == null) {
            j2 = 0;
        } else {
            j2 = -3750763034362895579L;
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                j2 = (j2 ^ charSequence.charAt(i2)) * 1099511628211L;
            }
        }
        mo4503g2(j2);
        return this;
    }

    public int hashCode() {
        long j2 = this.f6925b;
        return ((mo4502f2() + (((int) (j2 ^ (j2 >>> 32))) * 31)) * 31) + (this.f6926c ? 1 : 0);
    }

    /* renamed from: i2 */
    public EpoxyModel<T> m4521i2(@Nullable Number... numberArr) {
        long j2 = 0;
        if (numberArr != null) {
            long j3 = 0;
            for (Number number : numberArr) {
                long j4 = j3 * 31;
                long hashCode = number == null ? 0L : r6.hashCode();
                long j5 = hashCode ^ (hashCode << 21);
                long j6 = j5 ^ (j5 >>> 35);
                j3 = j4 + (j6 ^ (j6 << 4));
            }
            j2 = j3;
        }
        return mo4503g2(j2);
    }

    /* renamed from: j2 */
    public boolean m4522j2() {
        return this.f6927d != null;
    }

    /* renamed from: k2 */
    public boolean mo4523k2(@NonNull T t) {
        return false;
    }

    /* renamed from: l2 */
    public final void m4524l2() {
        int firstIndexOfModelInBuildingList;
        if (!m4522j2() || this.f6929f) {
            EpoxyController epoxyController = this.f6928e;
            if (epoxyController != null) {
                epoxyController.setStagedModel(this);
                return;
            }
            return;
        }
        EpoxyController epoxyController2 = this.f6927d;
        if (!epoxyController2.isBuildingModels()) {
            EpoxyControllerAdapter adapter = epoxyController2.getAdapter();
            int size = adapter.f6909h.f6848f.size();
            firstIndexOfModelInBuildingList = 0;
            while (true) {
                if (firstIndexOfModelInBuildingList >= size) {
                    firstIndexOfModelInBuildingList = -1;
                    break;
                } else if (adapter.f6909h.f6848f.get(firstIndexOfModelInBuildingList).f6925b == this.f6925b) {
                    break;
                } else {
                    firstIndexOfModelInBuildingList++;
                }
            }
        } else {
            firstIndexOfModelInBuildingList = epoxyController2.getFirstIndexOfModelInBuildingList(this);
        }
        throw new ImmutableModelException(this, "", firstIndexOfModelInBuildingList);
    }

    /* renamed from: m2 */
    public void mo4525m2(@NonNull T t) {
    }

    /* renamed from: n2 */
    public void mo4526n2(@NonNull T t) {
    }

    /* renamed from: o2 */
    public void mo4504o2(@FloatRange float f2, @FloatRange float f3, @Px int i2, @Px int i3, @NonNull T t) {
    }

    /* renamed from: p2 */
    public void mo4505p2(int i2, @NonNull T t) {
    }

    /* renamed from: q2 */
    public boolean mo4527q2() {
        return this instanceof CarouselModel_;
    }

    /* renamed from: r2 */
    public final int m4528r2(int i2, int i3, int i4) {
        SpanSizeOverrideCallback spanSizeOverrideCallback = this.f6932i;
        return spanSizeOverrideCallback != null ? spanSizeOverrideCallback.mo4530d(i2, i3, i4) : mo4500e2(i2, i3, i4);
    }

    /* renamed from: s2 */
    public void mo4506s2(@NonNull T t) {
    }

    /* renamed from: t2 */
    public final void m4529t2(String str, int i2) {
        if (m4522j2() && !this.f6929f && this.f6930g != hashCode()) {
            throw new ImmutableModelException(this, str, i2);
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "{id=" + this.f6925b + ", viewType=" + mo4502f2() + ", shown=" + this.f6926c + ", addedToAdapter=false}";
    }
}
