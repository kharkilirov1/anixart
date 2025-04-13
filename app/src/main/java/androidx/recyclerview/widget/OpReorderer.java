package androidx.recyclerview.widget;

import androidx.recyclerview.widget.AdapterHelper;

/* loaded from: classes.dex */
class OpReorderer {

    /* renamed from: a */
    public final Callback f5456a;

    public interface Callback {
        /* renamed from: a */
        void mo3467a(AdapterHelper.UpdateOp updateOp);

        /* renamed from: b */
        AdapterHelper.UpdateOp mo3468b(int i2, int i3, int i4, Object obj);
    }

    public OpReorderer(Callback callback) {
        this.f5456a = callback;
    }
}
