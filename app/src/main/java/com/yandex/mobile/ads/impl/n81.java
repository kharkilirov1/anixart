package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
final class n81 {
    @Nullable
    /* renamed from: a */
    public static o81 m26818a(@Nullable o81 o81Var, @Nullable String[] strArr, Map<String, o81> map) {
        int i2 = 0;
        if (o81Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                o81 o81Var2 = new o81();
                int length = strArr.length;
                while (i2 < length) {
                    o81Var2.m27022a(map.get(strArr[i2]));
                    i2++;
                }
                return o81Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return o81Var.m27022a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    o81Var.m27022a(map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return o81Var;
    }

    /* renamed from: a */
    public static void m26819a(SpannableStringBuilder spannableStringBuilder, int i2, int i3, o81 o81Var, @Nullable l81 l81Var, Map map, int i4) {
        l81 l81Var2;
        if (o81Var.m27048k() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(o81Var.m27048k()), i2, i3, 33);
        }
        if (o81Var.m27054q()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (o81Var.m27055r()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (o81Var.m27053p()) {
            j31.m25768a(spannableStringBuilder, new ForegroundColorSpan(o81Var.m27028b()), i2, i3);
        }
        if (o81Var.m27052o()) {
            j31.m25768a(spannableStringBuilder, new BackgroundColorSpan(o81Var.m27020a()), i2, i3);
        }
        if (o81Var.m27035c() != null) {
            j31.m25768a(spannableStringBuilder, new TypefaceSpan(o81Var.m27035c()), i2, i3);
        }
        if (o81Var.m27051n() != null) {
            w51 m27051n = o81Var.m27051n();
            Objects.requireNonNull(m27051n);
            int i5 = m27051n.f56019a;
            j31.m25768a(spannableStringBuilder, new x51(), i2, i3);
        }
        int m27046i = o81Var.m27046i();
        if (m27046i == 2) {
            while (true) {
                l81Var2 = null;
                if (l81Var == null) {
                    l81Var = null;
                    break;
                }
                o81 m26818a = m26818a(l81Var.f52305f, l81Var.m26396c(), map);
                if (m26818a != null && m26818a.m27046i() == 1) {
                    break;
                } else {
                    l81Var = l81Var.f52309j;
                }
            }
            if (l81Var != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(l81Var);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    l81 l81Var3 = (l81) arrayDeque.pop();
                    o81 m26818a2 = m26818a(l81Var3.f52305f, l81Var3.m26396c(), map);
                    if (m26818a2 != null && m26818a2.m27046i() == 3) {
                        l81Var2 = l81Var3;
                        break;
                    }
                    for (int m26390a = l81Var3.m26390a() - 1; m26390a >= 0; m26390a--) {
                        arrayDeque.push(l81Var3.m26391a(m26390a));
                    }
                }
                if (l81Var2 != null) {
                    if (l81Var2.m26390a() == 1 && l81Var2.m26391a(0).f52301b != null) {
                        String str = l81Var2.m26391a(0).f52301b;
                        int i6 = s91.f54530a;
                        o81 m26818a3 = m26818a(l81Var2.f52305f, l81Var2.m26396c(), map);
                        if ((m26818a3 != null ? m26818a3.m27045h() : -1) == -1) {
                            m26818a(l81Var.f52305f, l81Var.m26396c(), map);
                        }
                        spannableStringBuilder.setSpan(new hy0(), i2, i3, 33);
                    } else {
                        d90.m23841c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    }
                }
            }
        } else if (m27046i == 3 || m27046i == 4) {
            spannableStringBuilder.setSpan(new C5545oo(), i2, i3, 33);
        }
        if (o81Var.m27050m()) {
            j31.m25768a(spannableStringBuilder, new C5464my(), i2, i3);
        }
        int m27040e = o81Var.m27040e();
        if (m27040e == 1) {
            j31.m25768a(spannableStringBuilder, new AbsoluteSizeSpan((int) o81Var.m27037d(), true), i2, i3);
        } else if (m27040e != 2) {
            if (m27040e != 3) {
                return;
            }
            j31.m25768a(spannableStringBuilder, new RelativeSizeSpan(o81Var.m27037d() / 100.0f), i2, i3);
        } else {
            j31.m25768a(spannableStringBuilder, new RelativeSizeSpan(o81Var.m27037d()), i2, i3);
        }
    }
}
