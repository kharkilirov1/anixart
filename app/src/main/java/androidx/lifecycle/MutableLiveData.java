package androidx.lifecycle;

/* loaded from: classes.dex */
public class MutableLiveData<T> extends LiveData<T> {
    @Override // androidx.lifecycle.LiveData
    /* renamed from: j */
    public void mo3214j(T t) {
        super.mo3214j(t);
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: l */
    public void mo3216l(T t) {
        LiveData.m3207b("setValue");
        this.f4619g++;
        this.f4617e = t;
        m3209d(null);
    }
}
