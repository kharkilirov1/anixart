package androidx.activity;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.fragment.app.FragmentActivity;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.activity.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0040a implements OnContextAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ int f231a;

    /* renamed from: b */
    public final /* synthetic */ Object f232b;

    public /* synthetic */ C0040a(ComponentActivity componentActivity, int i2) {
        this.f231a = i2;
        this.f232b = componentActivity;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    /* renamed from: a */
    public final void mo312a(Context context) {
        switch (this.f231a) {
            case 0:
                ((ComponentActivity) this.f232b).lambda$new$1(context);
                break;
            default:
                ((FragmentActivity) this.f232b).lambda$init$3(context);
                break;
        }
    }
}
