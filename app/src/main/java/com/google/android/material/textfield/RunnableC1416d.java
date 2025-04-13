package com.google.android.material.textfield;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.material.textfield.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1416d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f19160b;

    /* renamed from: c */
    public final /* synthetic */ Object f19161c;

    public /* synthetic */ RunnableC1416d(EndIconDelegate endIconDelegate, int i2) {
        this.f19160b = i2;
        this.f19161c = endIconDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19160b) {
            case 0:
                ((ClearTextEndIconDelegate) this.f19161c).m10438t(true);
                break;
            default:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.f19161c;
                boolean isPopupShowing = dropdownMenuEndIconDelegate.f18973e.isPopupShowing();
                dropdownMenuEndIconDelegate.m10450v(isPopupShowing);
                dropdownMenuEndIconDelegate.f18978j = isPopupShowing;
                break;
        }
    }
}
