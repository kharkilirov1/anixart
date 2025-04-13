package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.internal.ViewUtils;

/* compiled from: DateSelector.java */
/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1295d<S> {
    /* renamed from: a */
    public static void m10039a(@NonNull final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                for (EditText editText : editTextArr) {
                    if (editText.hasFocus()) {
                        return;
                    }
                }
                ViewUtils.m10170g(view);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        ViewUtils.m10173j(editTextArr[0]);
    }
}
