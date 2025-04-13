package androidx.appcompat.widget;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0142a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f1684b;

    /* renamed from: c */
    public final /* synthetic */ Object f1685c;

    public /* synthetic */ RunnableC0142a(Object obj, int i2) {
        this.f1684b = i2;
        this.f1685c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1684b) {
            case 0:
                ((TooltipCompatHandler) this.f1685c).m1002c(false);
                break;
            case 1:
                ((TooltipCompatHandler) this.f1685c).m1001a();
                break;
            default:
                ((Toolbar) this.f1685c).m984o();
                break;
        }
    }
}
