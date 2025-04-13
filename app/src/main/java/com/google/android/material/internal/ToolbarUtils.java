package com.google.android.material.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestrictTo
/* loaded from: classes.dex */
public class ToolbarUtils {

    /* renamed from: a */
    public static final Comparator<View> f18361a = new Comparator<View>() { // from class: com.google.android.material.internal.ToolbarUtils.1
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    };

    /* renamed from: a */
    public static List<TextView> m10161a(@NonNull Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
