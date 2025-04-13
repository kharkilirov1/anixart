package com.yandex.metrica.impl.p023ob;

import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.km */
/* loaded from: classes2.dex */
public class C4088km {

    /* renamed from: a */
    @NonNull
    private final C3906dm f45840a;

    public C4088km(@NonNull C3906dm c3906dm) {
        this.f45840a = c3906dm;
    }

    /* renamed from: a */
    public int m20306a(@NonNull TextView textView) {
        int i2 = 0;
        try {
            if (TextUtils.isEmpty(textView.getText()) || textView.getVisibility() != 0) {
                return 0;
            }
            String charSequence = textView.getText().toString();
            Layout layout = textView.getLayout();
            int length = charSequence.length();
            if (layout != null) {
                try {
                    int lineCount = textView.getLineCount() - 1;
                    TextUtils.TruncateAt ellipsize = textView.getEllipsize();
                    if (ellipsize != null && lineCount >= 0 && (lineCount == 0 || ellipsize == TextUtils.TruncateAt.END)) {
                        i2 = 1;
                    }
                    if (i2 != 0) {
                        return length - layout.getEllipsisCount(lineCount);
                    }
                } catch (Throwable th) {
                    th = th;
                    i2 = length;
                    this.f45840a.m19773a("ui_parsing_visibility", th);
                    return i2;
                }
            }
            return length;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
