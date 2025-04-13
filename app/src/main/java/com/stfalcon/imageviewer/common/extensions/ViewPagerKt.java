package com.stfalcon.imageviewer.common.extensions;

import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: ViewPager.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"imageviewer_release"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ViewPagerKt {
    /* renamed from: a */
    public static ViewPager.OnPageChangeListener m14025a(ViewPager viewPager, Function3 function3, final Function1 function1, final Function1 function12, int i2) {
        final Function3 function32 = null;
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            function12 = null;
        }
        ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() { // from class: com.stfalcon.imageviewer.common.extensions.ViewPagerKt$addOnPageChangeListener$1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            /* renamed from: b */
            public void mo4343b(int i3) {
                Function1 function13 = function1;
                if (function13 != null) {
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            /* renamed from: c */
            public void mo4344c(int i3, float f2, int i4) {
                Function3 function33 = Function3.this;
                if (function33 != null) {
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            /* renamed from: d */
            public void mo4345d(int i3) {
                Function1 function13 = function12;
                if (function13 != null) {
                }
            }
        };
        viewPager.m4348b(onPageChangeListener);
        return onPageChangeListener;
    }
}
