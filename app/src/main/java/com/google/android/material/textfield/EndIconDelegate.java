package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
abstract class EndIconDelegate {

    /* renamed from: a */
    public final TextInputLayout f19016a;

    /* renamed from: b */
    public final EndCompoundLayout f19017b;

    /* renamed from: c */
    public final Context f19018c;

    /* renamed from: d */
    public final CheckableImageButton f19019d;

    public EndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        this.f19016a = endCompoundLayout.f18986b;
        this.f19017b = endCompoundLayout;
        this.f19018c = endCompoundLayout.getContext();
        this.f19019d = endCompoundLayout.f18992h;
    }

    /* renamed from: a */
    public void mo10428a(Editable editable) {
    }

    /* renamed from: b */
    public void mo10476b(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @StringRes
    /* renamed from: c */
    public int mo10429c() {
        return 0;
    }

    @DrawableRes
    /* renamed from: d */
    public int mo10430d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo10431e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo10432f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo10433g() {
        return null;
    }

    /* renamed from: h */
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener mo10442h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo10443i(int i2) {
        return true;
    }

    /* renamed from: j */
    public boolean mo10444j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo10477k() {
        return this instanceof DropdownMenuEndIconDelegate;
    }

    /* renamed from: l */
    public boolean mo10445l() {
        return false;
    }

    /* renamed from: m */
    public void mo10434m(@Nullable EditText editText) {
    }

    /* renamed from: n */
    public void mo10446n(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    /* renamed from: o */
    public void mo10447o(View view, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: p */
    public void mo10435p(boolean z) {
    }

    /* renamed from: q */
    public final void m10478q() {
        this.f19017b.m10462i(false);
    }

    /* renamed from: r */
    public void mo10436r() {
    }

    /* renamed from: s */
    public void mo10437s() {
    }
}
