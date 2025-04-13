package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.savedstate.SavedStateRegistry;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0041b implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    public final /* synthetic */ int f233a;

    /* renamed from: b */
    public final /* synthetic */ Object f234b;

    public /* synthetic */ C0041b(Object obj, int i2) {
        this.f233a = i2;
        this.f234b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    /* renamed from: a */
    public final Bundle mo313a() {
        Bundle lambda$new$0;
        Bundle lambda$init$0;
        switch (this.f233a) {
            case 0:
                lambda$new$0 = ((ComponentActivity) this.f234b).lambda$new$0();
                return lambda$new$0;
            case 1:
                lambda$init$0 = ((FragmentActivity) this.f234b).lambda$init$0();
                return lambda$init$0;
            default:
                return ((FragmentManager) this.f234b).m3033h0();
        }
    }
}
