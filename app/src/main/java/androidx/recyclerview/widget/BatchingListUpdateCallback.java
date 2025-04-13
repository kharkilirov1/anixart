package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class BatchingListUpdateCallback implements ListUpdateCallback {

    /* renamed from: b */
    public final ListUpdateCallback f5181b;

    /* renamed from: c */
    public int f5182c = 0;

    /* renamed from: d */
    public int f5183d = -1;

    /* renamed from: e */
    public int f5184e = -1;

    /* renamed from: f */
    public Object f5185f = null;

    public BatchingListUpdateCallback(@NonNull ListUpdateCallback listUpdateCallback) {
        this.f5181b = listUpdateCallback;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    /* renamed from: a */
    public void mo3488a(int i2, int i3) {
        m3493e();
        this.f5181b.mo3488a(i2, i3);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    /* renamed from: b */
    public void mo3489b(int i2, int i3) {
        int i4;
        if (this.f5182c == 1 && i2 >= (i4 = this.f5183d)) {
            int i5 = this.f5184e;
            if (i2 <= i4 + i5) {
                this.f5184e = i5 + i3;
                this.f5183d = Math.min(i2, i4);
                return;
            }
        }
        m3493e();
        this.f5183d = i2;
        this.f5184e = i3;
        this.f5182c = 1;
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    /* renamed from: c */
    public void mo3490c(int i2, int i3) {
        int i4;
        if (this.f5182c == 2 && (i4 = this.f5183d) >= i2 && i4 <= i2 + i3) {
            this.f5184e += i3;
            this.f5183d = i2;
        } else {
            m3493e();
            this.f5183d = i2;
            this.f5184e = i3;
            this.f5182c = 2;
        }
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    /* renamed from: d */
    public void mo3491d(int i2, int i3, Object obj) {
        int i4;
        if (this.f5182c == 3) {
            int i5 = this.f5183d;
            int i6 = this.f5184e;
            if (i2 <= i5 + i6 && (i4 = i2 + i3) >= i5 && this.f5185f == obj) {
                this.f5183d = Math.min(i2, i5);
                this.f5184e = Math.max(i6 + i5, i4) - this.f5183d;
                return;
            }
        }
        m3493e();
        this.f5183d = i2;
        this.f5184e = i3;
        this.f5185f = obj;
        this.f5182c = 3;
    }

    /* renamed from: e */
    public void m3493e() {
        int i2 = this.f5182c;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            this.f5181b.mo3489b(this.f5183d, this.f5184e);
        } else if (i2 == 2) {
            this.f5181b.mo3490c(this.f5183d, this.f5184e);
        } else if (i2 == 3) {
            this.f5181b.mo3491d(this.f5183d, this.f5184e, this.f5185f);
        }
        this.f5185f = null;
        this.f5182c = 0;
    }
}
