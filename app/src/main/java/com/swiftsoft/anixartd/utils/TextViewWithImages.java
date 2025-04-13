package com.swiftsoft.anixartd.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.swiftsoft.anixartd.C2507R;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextViewWithImages.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/TextViewWithImages;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TextViewWithImages extends AppCompatTextView {

    /* renamed from: h */
    public static final Spannable.Factory f30246h = Spannable.Factory.getInstance();

    /* compiled from: TextViewWithImages.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/TextViewWithImages$Companion;", "", "Landroid/text/Spannable$Factory;", "kotlin.jvm.PlatformType", "spannableFactory", "Landroid/text/Spannable$Factory;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewWithImages(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m32179h(context, "context");
        new LinkedHashMap();
    }

    @Override // android.widget.TextView
    public void setText(@NotNull CharSequence text, @NotNull TextView.BufferType type) {
        boolean z;
        Intrinsics.m32179h(text, "text");
        Intrinsics.m32179h(type, "type");
        Context context = getContext();
        Intrinsics.m32178g(context, "context");
        float lineHeight = getLineHeight();
        Spannable spannable = f30246h.newSpannable(text);
        Intrinsics.m32178g(spannable, "spannable");
        Pattern compile = Pattern.compile("\\Q[src=\\E([a-zA-Z0-9_]+?)\\Q/]\\E");
        Intrinsics.m32178g(compile, "compile(\"\\\\Q[src=\\\\E([a-zA-Z0-9_]+?)\\\\Q/]\\\\E\")");
        Matcher matcher = compile.matcher(spannable);
        Intrinsics.m32178g(matcher, "refImg.matcher(spannable)");
        while (matcher.find()) {
            Object[] spans = spannable.getSpans(matcher.start(), matcher.end(), ImageSpan.class);
            Intrinsics.m32178g(spans, "spannable.getSpans(\n    …ss.java\n                )");
            for (ImageSpan imageSpan : (ImageSpan[]) spans) {
                if (spannable.getSpanStart(imageSpan) < matcher.start() || spannable.getSpanEnd(imageSpan) > matcher.end()) {
                    z = false;
                    break;
                }
                spannable.removeSpan(imageSpan);
            }
            z = true;
            String obj = spannable.subSequence(matcher.start(1), matcher.end(1)).toString();
            int length = obj.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.m32181j(obj.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            Drawable drawable = context.getResources().getDrawable(context.getResources().getIdentifier(obj.subSequence(i2, length + 1).toString(), "drawable", context.getPackageName()));
            Intrinsics.m32178g(drawable, "context.resources.getDrawable(id)");
            Drawable m1845q = DrawableCompat.m1845q(drawable);
            Intrinsics.m32178g(m1845q, "wrap(mDrawable)");
            DrawableCompat.m1841m(m1845q, ViewsKt.m16369b(context, C2507R.attr.iconTintColor));
            int i3 = (int) lineHeight;
            m1845q.setBounds(0, 0, i3, i3);
            if (z) {
                spannable.setSpan(new CenteredImageSpan(m1845q), matcher.start(), matcher.end(), 33);
            }
        }
        super.setText(spannable, TextView.BufferType.SPANNABLE);
    }
}
